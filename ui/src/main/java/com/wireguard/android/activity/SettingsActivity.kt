/*
 * Copyright © 2017-2025 WireGuard LLC. All Rights Reserved.
 * SPDX-License-Identifier: Apache-2.0
 */
package com.wireguard.android.activity

import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import androidx.lifecycle.lifecycleScope
import androidx.preference.ListPreference
import androidx.preference.Preference
import androidx.preference.PreferenceFragmentCompat
import com.wireguard.android.Application
import com.wireguard.android.BuildConfig
import com.wireguard.android.QuickTileService
import com.wireguard.android.R
import com.wireguard.android.backend.WgQuickBackend
import com.wireguard.android.preference.PreferencesPreferenceDataStore
import com.wireguard.android.util.AdminKnobs
import com.wireguard.android.util.BiometricAuthenticator
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

/**
 * Interface for changing application-global persistent settings.
 */
class SettingsActivity : AppCompatActivity() {
    private var createdWithTheme = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        createdWithTheme = Application.currentThemeMode
        when (createdWithTheme) {
            "catppuccin" -> setTheme(R.style.AppTheme_Catppuccin)
            "dracula" -> setTheme(R.style.AppTheme_Dracula)
        }
        super.onCreate(savedInstanceState)
        // Block screenshots, screen recording, and recents-thumbnail leaks.
        window.addFlags(WindowManager.LayoutParams.FLAG_SECURE)
        if (supportFragmentManager.findFragmentById(android.R.id.content) == null) {
            supportFragmentManager.commit {
                add(android.R.id.content, SettingsFragment())
            }
        }
    }

    override fun onResume() {
        super.onResume()
        if (Application.currentThemeMode != createdWithTheme) recreate()
    }

    override fun onUserInteraction() {
        super.onUserInteraction()
        Application.touchUserInteraction()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            finish()
            return true
        }
        return super.onOptionsItemSelected(item)
    }

    class SettingsFragment : PreferenceFragmentCompat() {
        private var aboutExpanded = false

        override fun onSaveInstanceState(outState: Bundle) {
            super.onSaveInstanceState(outState)
            outState.putBoolean("about_expanded", aboutExpanded)
        }

        // Since this is pretty much abandoned by androidx, it never got updated for proper EdgeToEdge support,
        // which is enabled everywhere for API 35. So handle the insets manually here.
        override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
            val view = super.onCreateView(inflater, container, savedInstanceState)
            view.fitsSystemWindows = true
            return view
        }

        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)
            // Kill RecyclerView item animations — async backend detection and theme recreates
            // cause preferences to shift positions, which animator fades/slides look like jumps.
            listView.itemAnimator = null
        }

        override fun onCreatePreferences(savedInstanceState: Bundle?, key: String?) {
            preferenceManager.preferenceDataStore = PreferencesPreferenceDataStore(lifecycleScope, Application.getPreferencesDataStore())
            addPreferencesFromResource(R.xml.preferences)

            if (Build.VERSION.SDK_INT < Build.VERSION_CODES.TIRAMISU || QuickTileService.isAdded) {
                val quickTile = preferenceManager.findPreference<Preference>("quick_tile")
                quickTile?.parent?.removePreference(quickTile)
            }
            if (AdminKnobs.disableConfigExport) {
                val zipExporter = preferenceManager.findPreference<Preference>("zip_exporter")
                zipExporter?.parent?.removePreference(zipExporter)
            }
            val wgQuickOnlyPrefs = arrayOf(
                preferenceManager.findPreference("tools_installer"),
                preferenceManager.findPreference("restore_on_boot"),
                preferenceManager.findPreference<Preference>("multiple_tunnels")
            ).filterNotNull()
            wgQuickOnlyPrefs.forEach { it.isVisible = false }
            lifecycleScope.launch {
                if (Application.getBackend() is WgQuickBackend) {
                    wgQuickOnlyPrefs.forEach { it.isVisible = true }
                } else {
                    wgQuickOnlyPrefs.forEach { it.parent?.removePreference(it) }
                }
            }
            preferenceManager.findPreference<ListPreference>("theme")?.setOnPreferenceChangeListener { _, newValue ->
                // Pre-set currentThemeMode so the recreated activity reads the right value
                // immediately, preventing a second recreate from onResume's theme-change check.
                Application.currentThemeMode = newValue as String
                view?.post { requireActivity().recreate() }
                true
            }

            preferenceManager.findPreference<Preference>("log_viewer")?.setOnPreferenceClickListener {
                BiometricAuthenticator.authenticate(R.string.biometric_prompt_log_viewer_title, this) {
                    when (it) {
                        is BiometricAuthenticator.Result.Success,
                        is BiometricAuthenticator.Result.HardwareUnavailableOrDisabled -> {
                            startActivity(Intent(requireContext(), LogViewerActivity::class.java))
                        }
                        is BiometricAuthenticator.Result.Failure -> {}
                        is BiometricAuthenticator.Result.Cancelled -> {}
                    }
                }
                true
            }
            val aboutChildren = listOfNotNull(
                preferenceManager.findPreference<Preference>("about_app"),
                preferenceManager.findPreference<Preference>("about_website"),
                preferenceManager.findPreference<Preference>("about_version")
            )
            aboutExpanded = savedInstanceState?.getBoolean("about_expanded", false) ?: false
            aboutChildren.forEach { it.isVisible = aboutExpanded }
            preferenceManager.findPreference<Preference>("about_version")?.summary =
                "v${BuildConfig.VERSION_NAME}"
            preferenceManager.findPreference<Preference>("about_header")?.setOnPreferenceClickListener {
                aboutExpanded = !aboutExpanded
                aboutChildren.forEach { it.isVisible = aboutExpanded }
                true
            }
            preferenceManager.findPreference<Preference>("about_app")?.setOnPreferenceClickListener {
                startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.about_github_url))))
                true
            }
            preferenceManager.findPreference<Preference>("about_website")?.setOnPreferenceClickListener {
                startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.about_website_url))))
                true
            }

            val kernelModuleEnabler = preferenceManager.findPreference<Preference>("kernel_module_enabler")
            if (WgQuickBackend.hasKernelSupport()) {
                // Hide first — async root-shell check below will either re-show it or remove it.
                // Without this, hidden→removed transition happens AFTER first frame and shifts
                // every preference below (including About), which looks like a jump.
                kernelModuleEnabler?.isVisible = false
                lifecycleScope.launch {
                    if (Application.getBackend() is WgQuickBackend) {
                        kernelModuleEnabler?.isVisible = true
                    } else {
                        try {
                            withContext(Dispatchers.IO) { Application.getRootShell().start() }
                            kernelModuleEnabler?.isVisible = true
                        } catch (_: Throwable) {
                            kernelModuleEnabler?.parent?.removePreference(kernelModuleEnabler)
                        }
                    }
                }
            } else {
                kernelModuleEnabler?.parent?.removePreference(kernelModuleEnabler)
            }
        }
    }
}
