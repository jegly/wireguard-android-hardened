/*
 * Copyright © 2017-2025 WireGuard LLC. All Rights Reserved.
 * SPDX-License-Identifier: Apache-2.0
 */
package com.wireguard.android

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.os.StrictMode
import android.os.StrictMode.ThreadPolicy
import android.os.StrictMode.VmPolicy
import android.util.Log
import androidx.appcompat.app.AppCompatDelegate
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.PreferenceDataStoreFactory
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.preferencesDataStoreFile
import com.google.android.material.color.DynamicColors
import com.google.android.material.color.DynamicColorsOptions
import com.wireguard.android.activity.MainActivity
import com.wireguard.android.backend.Backend
import com.wireguard.android.backend.GoBackend
import com.wireguard.android.backend.WgQuickBackend
import com.wireguard.android.configStore.EncryptedConfigStore
import com.wireguard.android.model.TunnelManager
import com.wireguard.android.util.RootShell
import com.wireguard.android.util.ToolsInstaller
import com.wireguard.android.util.UserKnobs
import com.wireguard.android.util.applicationScope
import kotlinx.coroutines.CompletableDeferred
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.cancel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.lang.ref.WeakReference

class Application : android.app.Application() {
    private val futureBackend = CompletableDeferred<Backend>()
    private val coroutineScope = CoroutineScope(Job() + Dispatchers.Main.immediate)
    private var backend: Backend? = null
    private lateinit var rootShell: RootShell
    private lateinit var preferencesDataStore: DataStore<Preferences>
    private lateinit var toolsInstaller: ToolsInstaller
    private lateinit var tunnelManager: TunnelManager

    override fun attachBaseContext(context: Context) {
        super.attachBaseContext(context)
        if (BuildConfig.MIN_SDK_VERSION > Build.VERSION.SDK_INT) {
            val intent = Intent(Intent.ACTION_MAIN)
            intent.addCategory(Intent.CATEGORY_HOME)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
            System.exit(0)
        }
    }

    private suspend fun determineBackend(): Backend {
        var backend: Backend? = null
        if (UserKnobs.enableKernelModule.first() && WgQuickBackend.hasKernelSupport()) {
            try {
                rootShell.start()
                val wgQuickBackend = WgQuickBackend(applicationContext, rootShell, toolsInstaller)
                wgQuickBackend.setMultipleTunnels(UserKnobs.multipleTunnels.first())
                backend = wgQuickBackend
                UserKnobs.multipleTunnels.onEach {
                    wgQuickBackend.setMultipleTunnels(it)
                }.launchIn(coroutineScope)
            } catch (ignored: Exception) {
            }
        }
        if (backend == null) {
            backend = GoBackend(applicationContext)
            GoBackend.setAlwaysOnCallback { get().applicationScope.launch { get().tunnelManager.restoreState(true) } }
        }
        return backend
    }

    override fun onCreate() {
        Log.i(TAG, "Application starting")
        super.onCreate()
        rootShell = RootShell(applicationContext)
        toolsInstaller = ToolsInstaller(applicationContext, rootShell)
        preferencesDataStore = PreferenceDataStoreFactory.create { applicationContext.preferencesDataStoreFile("settings") }

        // Read initial theme synchronously so the first activity gets the right palette and night mode.
        runBlocking { currentThemeMode = UserKnobs.themeMode.first() }
        applyNightModeForTheme(currentThemeMode)

        // Skip Material You dynamic colors when a static palette (catppuccin / dracula) is active.
        DynamicColors.applyToActivitiesIfAvailable(
            this,
            DynamicColorsOptions.Builder()
                .setPrecondition { _, _ -> currentThemeMode == "system" }
                .build()
        )

        UserKnobs.themeMode.onEach { mode ->
            currentThemeMode = mode
            applyNightModeForTheme(mode)
        }.launchIn(coroutineScope)

        UserKnobs.appLockEnabled.onEach { enabled ->
            isAppLockEnabled = enabled
        }.launchIn(coroutineScope)

        UserKnobs.appLockTimeout.onEach { mode ->
            appLockTimeoutMs = when (mode) {
                "1" -> 60_000L
                "5" -> 5 * 60_000L
                "15" -> 15 * 60_000L
                else -> 0L
            }
        }.launchIn(coroutineScope)

        registerActivityLifecycleCallbacks(object : ActivityLifecycleCallbacks {
            override fun onActivityCreated(a: Activity, b: Bundle?) {}
            override fun onActivityStarted(a: Activity) {
                if (startedActivityCount++ == 0) {
                    // App returned to foreground — reset idle clock so the timer doesn't
                    // immediately fire on stale background time.
                    lastUserInteractionTime = System.currentTimeMillis()
                }
            }
            override fun onActivityResumed(a: Activity) {}
            override fun onActivityPaused(a: Activity) {}
            override fun onActivityStopped(a: Activity) {
                if (--startedActivityCount == 0) isSessionAuthenticated = false
            }
            override fun onActivitySaveInstanceState(a: Activity, b: Bundle) {}
            override fun onActivityDestroyed(a: Activity) {}
        })

        // Idle-timeout watcher: when foreground and authenticated, if no interaction for
        // `appLockTimeoutMs`, drop the session and bounce back to MainActivity to re-prompt.
        coroutineScope.launch {
            while (true) {
                delay(15_000)
                if (isAppLockEnabled
                    && isSessionAuthenticated
                    && appLockTimeoutMs > 0L
                    && startedActivityCount > 0
                    && System.currentTimeMillis() - lastUserInteractionTime >= appLockTimeoutMs
                ) {
                    isSessionAuthenticated = false
                    val intent = Intent(applicationContext, MainActivity::class.java).apply {
                        addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
                    }
                    startActivity(intent)
                }
            }
        }

        tunnelManager = TunnelManager(EncryptedConfigStore(applicationContext))
        tunnelManager.onCreate()
        coroutineScope.launch(Dispatchers.IO) {
            try {
                backend = determineBackend()
                futureBackend.complete(backend!!)
            } catch (e: Throwable) {
                Log.e(TAG, Log.getStackTraceString(e))
            }
        }

        if (BuildConfig.DEBUG) {
            StrictMode.setVmPolicy(VmPolicy.Builder().detectAll().penaltyLog().build())
            StrictMode.setThreadPolicy(ThreadPolicy.Builder().detectAll().penaltyLog().build())
        }
    }

    override fun onTerminate() {
        coroutineScope.cancel()
        super.onTerminate()
    }

    private fun applyNightModeForTheme(mode: String) {
        val nightMode = if (mode == "system") {
            AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM
        } else {
            AppCompatDelegate.MODE_NIGHT_YES
        }
        if (AppCompatDelegate.getDefaultNightMode() != nightMode) {
            AppCompatDelegate.setDefaultNightMode(nightMode)
        }
    }

    companion object {
        private const val TAG = "WireGuard/Application"
        private lateinit var weakSelf: WeakReference<Application>

        // Updated by the themeMode observer before any Activity onCreate fires.
        @Volatile
        var currentThemeMode: String = "system"

        @Volatile
        var isAppLockEnabled: Boolean = false

        @Volatile
        var isSessionAuthenticated: Boolean = false

        @Volatile
        var appLockTimeoutMs: Long = 0L

        @Volatile
        var lastUserInteractionTime: Long = System.currentTimeMillis()

        @Volatile
        var startedActivityCount: Int = 0

        fun touchUserInteraction() {
            lastUserInteractionTime = System.currentTimeMillis()
        }

        fun get(): Application {
            return weakSelf.get()!!
        }

        suspend fun getBackend() = get().futureBackend.await()

        fun getRootShell() = get().rootShell

        fun getPreferencesDataStore() = get().preferencesDataStore

        fun getToolsInstaller() = get().toolsInstaller

        fun getTunnelManager() = get().tunnelManager

        fun getCoroutineScope() = get().coroutineScope
    }

    init {
        weakSelf = WeakReference(this)
    }
}
