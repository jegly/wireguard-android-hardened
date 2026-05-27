# v1.0.8 — App lock, themes, tamper detection, Android 17

This release adds an opt-in biometric gate on the whole app, two new dark themes (Catppuccin Mocha and Dracula), runtime APK signature verification, and bumps `targetSdk` to 37 (Android 17) for the latest platform security gates. `FLAG_SECURE` is now hardcoded on every activity in the app rather than just the sensitive ones.

---

## NEW FEATURES

### Biometric app lock (opt-in)
- New toggle in Settings: **Biometric app lock**.
- When on, the app shows the biometric / device-credential prompt on first launch and any time it returns from background.
- Backed by the existing hardware-attested `CryptoObject` flow — same `BIOMETRIC_STRONG` + Keystore binding used for the private-key reveal and zip export.
- Session is held in memory only; killed when all activities stop.

### Idle auto-lock
- Companion setting: **Auto-lock when idle** → *Off / 1 min / 5 min / 15 min*.
- Only shown / active when the biometric lock is enabled.
- Tracks `onUserInteraction` across MainActivity, SettingsActivity, LogViewerActivity, TunnelCreatorActivity. After the configured idle period, the session is dropped and the user is bounced back to MainActivity for re-authentication.

### Themes
- New Settings ListPreference: **Theme** → *System default / Catppuccin Mocha / Dracula*.
- Catppuccin and Dracula are always-dark Material 3 palettes with full color schemes (primary / secondary / tertiary / container variants, surface tones, error/warning tags, navigation/status bar tints).
- Selecting a static palette disables Material You dynamic colors so the chosen accent stays consistent.
- Theme changes apply immediately via `recreate()`; pre-sets `currentThemeMode` synchronously to avoid double-recreate flicker.

### APK tamper detection
- `SignatureVerifier` pins the SHA-256 of the trusted signing cert: `98d324d4106a368c62729a0a24d9ac9a6b47f8ac4c6585348531f0ee4eb6a04c`.
- Checked on every `MainActivity.onCreate`. If the cert hash doesn't match, the app shows a blocking dialog and exits.
- Skipped in `BuildConfig.DEBUG` builds — and `DEBUG` is a compile-time constant, so a repackager can't flip it back.
- Uses `PackageManager.GET_SIGNING_CERTIFICATES` on API ≥ 28, falls back to legacy `GET_SIGNATURES` on older devices.

### About section
- New collapsible **About** entry in Settings:
  - **GitHub** → github.com/jegly
  - **Website** → jegly.xyz
  - **Version** → `v1.0.8`
- Tap to expand/collapse; expanded state persists across theme-change recreates via `onSaveInstanceState`.

---

## HARDENING

### `FLAG_SECURE` is now app-wide
- Previously applied only to the sensitive screens (editor, detail, log viewer, TV).
- Now hardcoded on `BaseActivity` (covers MainActivity + TunnelCreatorActivity) and `SettingsActivity` as well.
- Result: screenshots, screen recording, recents-thumbnail leaks, and accessibility-tool screen reads are blocked **everywhere** in the app.

### `targetSdk` 36 → 37 (Android 17)
- Picks up the new Android 17 security gates and removes the install warning on Android 17 devices.
- `compileSdk` bumped to match.
- **Build requirement:** Android SDK Platform 37 must be installed via SDK Manager.

---

## UX / POLISH

- Settings preferences no longer use `initialExpandedChildrenCount` — it conflicted with dynamic `isVisible` toggles on the About section and caused items to "expand and close quickly".
- Disabled the RecyclerView item animator on the preferences list to stop visible jumps when async backend detection changes layout.
- `kernel_module_enabler` now starts hidden and only becomes visible if the async root-shell check succeeds — prevents the About section from jumping up on unrooted devices when the toggle gets removed after the first frame.
- Pre-setting `Application.currentThemeMode` synchronously in the theme change listener prevents a double-recreate race condition that caused theme changes to flicker.

---

## ALREADY IN PLACE (no change, called out for clarity)

- `android:allowBackup="false"` — prevents `adb backup` extraction of tunnel configs.
- `network_security_config.xml` — cleartext forbidden, only system CAs trusted.
- VpnService status notification is system-controlled and not under app control, so no app-side notification privacy work was needed.

---

## FILES ADDED

- `ui/src/main/java/com/wireguard/android/util/SignatureVerifier.kt`
- `RELEASE_NOTES.md` (this file)

## FILES MODIFIED

```
gradle.properties                                        version 1.0.8
ui/build.gradle.kts                                      compileSdk + targetSdk → 37
tunnel/build.gradle.kts                                  compileSdk → 37
ui/src/main/java/com/wireguard/android/Application.kt    theme observer, app lock state,
                                                          idle-timeout watcher,
                                                          activity lifecycle tracking
ui/src/main/java/com/wireguard/android/activity/
  BaseActivity.kt                                        FLAG_SECURE, theme, onUserInteraction
  MainActivity.kt                                        tamper check, app-lock onResume gate
  SettingsActivity.kt                                    theme handling, app lock toggle,
                                                          idle timeout setting, expandable
                                                          About, item-animator disabled,
                                                          kernel_module_enabler hidden by
                                                          default to prevent jump,
                                                          FLAG_SECURE, onUserInteraction
  LogViewerActivity.kt                                   theme handling, onUserInteraction
ui/src/main/java/com/wireguard/android/util/
  UserKnobs.kt                                           themeMode, appLockEnabled,
                                                          appLockTimeout flows
  BiometricAuthenticator.kt                              FragmentActivity overload for
                                                          activity-level biometric prompts
ui/src/main/res/values/colors.xml                        Catppuccin + Dracula palettes
ui/src/main/res/values/styles.xml                        AppTheme_Catppuccin, AppTheme_Dracula
ui/src/main/res/values/themes.xml                        WireGuardTheme variants
ui/src/main/res/values/strings.xml                       theme + app lock + about + tamper +
                                                          idle timeout strings
ui/src/main/res/xml/preferences.xml                      theme, app_lock, app_lock_timeout,
                                                          expandable About section
```

---

## INSTALLING

Sideload the APK from the [Releases page](https://github.com/jegly/wireguard-android-hardened/releases).

Requires Android 8.0 (API 24) or higher.

Android will warn about installing from an unknown source — that's expected. The app is not distributed through the Play Store.

---

## VERIFYING YOUR INSTALL

After installing, check the signing certificate matches the pinned hash:

```
SHA-256: 98d324d4106a368c62729a0a24d9ac9a6b47f8ac4c6585348531f0ee4eb6a04c
```

The app does this check itself on launch — if you see the **"Unverified App"** dialog, the APK has been tampered with or re-signed.
