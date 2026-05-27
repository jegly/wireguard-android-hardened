<p align="center">
    <img src="wg_banner.png" alt="WireGuard Android Hardened"/>
  </p>
                                                                                                               


```
┌─────────────────────────────────────────────────────────────────────────┐
│  A privacy-focused, hardened fork of the official WireGuard Android     │
│  client. No telemetry. No updater. Encrypted config storage.            │
│  Tightened security posture throughout.                                 │
│                                                                         │
│  Based on upstream WireGuard Android v1.0.20260315                      │
└─────────────────────────────────────────────────────────────────────────┘
```

---

## AT A GLANCE

```
┌──────────────────────────────────┬─────────────────────────┬────────────────────────────────────────┐
│  FEATURE                         │  UPSTREAM               │  THIS FORK                             │
├──────────────────────────────────┼─────────────────────────┼────────────────────────────────────────┤
│  Config storage                  │  Plaintext .conf files  │  AES-256-GCM via Android Keystore      │
│  Biometric auth                  │  BIOMETRIC_WEAK         │  BIOMETRIC_STRONG + CryptoObject       │
│  Self-updater                    │  Present, phones home   │  Completely stripped                   │
│  Device identifiers on network   │  SDK/ABI/model/fp/pkg   │  None                                  │
│  Screen protection               │  Private key only       │  All activities (app-wide FLAG_SECURE) │
│  App-wide lock                   │  None                   │  Biometric/PIN gate on launch + return │
│  Idle auto-lock                  │  None                   │  Off / 1 / 5 / 15 min foreground idle  │
│  APK tamper detection            │  None                   │  SHA-256 signature pin on every launch │
│  Themes                          │  Light / dark only      │  + Catppuccin Mocha + Dracula          │
│  Log viewer access               │  No auth required       │  Biometric/PIN gate + FLAG_SECURE      │
│  Tunnel detail view              │  No protection          │  FLAG_SECURE                           │
│  Clipboard                       │  No sensitivity flag    │  EXTRA_IS_SENSITIVE on API 33+         │
│  Remote control intents          │  Exported + dangerous   │  Completely removed                    │
│  ProGuard obfuscation            │  Disabled               │  Enabled                               │
│  Network security config         │  None                   │  Cleartext forbidden, user CAs out     │
│  golang.org/x/crypto             │  0.38.0 (2 CVEs)        │  0.45.0 (patched, ahead of upstream)  │
│  Target SDK                      │  35                     │  37 (Android 17, latest security gates)│
│  Config save safety              │  TOCTOU race condition  │  Delete-then-rewrite to canonical path │
│  Settings                        │  Version/Donate/Remote  │  Cleaned — identifier leaks removed   │
│  App icon                        │  Red                    │  Dark charcoal                         │
└──────────────────────────────────┴─────────────────────────┴────────────────────────────────────────┘
```

---

## WHAT MAKES THIS DIFFERENT

### Config Encryption

```
┌─────────────────────────────────────────────────────────────────────────┐
│  Upstream: /data/data/com.wireguard.android/files/tunnel.conf           │
│  [Interface]                                                            │
│  PrivateKey = <YOUR PRIVATE KEY IN PLAINTEXT>                           │
│                                                                         │
│  This fork: AES-256-GCM encrypted via Android Keystore                 │
│  Unreadable without device credentials — even on a rooted device       │
└─────────────────────────────────────────────────────────────────────────┘
```

Tunnel configurations — including private keys — are stored encrypted at rest. The upstream app writes them as plaintext `.conf` files readable by any root-capable tool. Here, a rooted device cannot extract your keys without your device credentials.

### Updater Stripped Entirely

```
┌─────────────────────────────────────────────────────────────────────────┐
│  UPSTREAM USER-AGENT (sent on every update check):                      │
│                                                                         │
│  WireGuard/<version> (Android <sdk>; <abi>; <board>;                   │
│  <manufacturer> <model>; <fingerprint>; <packageId>)                   │
│                                                                         │
│  FILES DELETED IN THIS FORK:                                            │
│    Updater.kt  Ed25519.java  SnackbarUpdateShower.kt                   │
└─────────────────────────────────────────────────────────────────────────┘
```

The self-updater was the single largest privacy risk in the upstream app. None of that device fingerprint data leaves this app. Ever.

### Biometric Authentication

```
┌─────────────────────────────────────────────────────────────────────────┐
│  UPSTREAM    BIOMETRIC_WEAK  ──  face unlock accepted, no attestation  │
│  THIS FORK   BIOMETRIC_STRONG ── hardware-attested CryptoObject        │
│                                                                         │
│  Biometric / PIN / pattern / password required for:                    │
│    - View private key                                                   │
│    - Export tunnels to zip                                              │
│    - Open log viewer                                                    │
│    - Unlock the app itself (opt-in toggle in Settings)                  │
│    - Re-unlock after foreground idle timeout (1 / 5 / 15 min)          │
└─────────────────────────────────────────────────────────────────────────┘
```

The biometric check is cryptographically bound to a Keystore key operation — not just a UI gate bypassable with a photo. When the app-wide lock is enabled, the gate fires on first launch and any return from background. With the idle-timeout setting, it also fires after N minutes of foreground idle so a phone left on a desk relocks.

### Screen Protection

```
┌─────────────────────────────────────────────────────────────────────────┐
│  FLAG_SECURE hardcoded on every activity in the app:                    │
│    - MainActivity (tunnel list)                                         │
│    - Tunnel editor / detail                                             │
│    - Tunnel creator                                                     │
│    - Settings                                                           │
│    - Log viewer                                                         │
│    - TV interface (Android TV / foldables)                              │
│                                                                         │
│  Prevents: screenshots, screen recording, recents thumbnails,          │
│            accessibility-tool screen reads, casted-display capture     │
└─────────────────────────────────────────────────────────────────────────┘
```

### APK Tamper Detection

```
┌─────────────────────────────────────────────────────────────────────────┐
│  Trusted SHA-256 signing certificate pinned into the binary.            │
│  On every launch, the app verifies its own signing cert against         │
│  the pinned hash. Repackaged or re-signed builds refuse to start.       │
│                                                                         │
│  Skipped in debug builds (BuildConfig.DEBUG is a compiled constant —    │
│  a repackager cannot flip it).                                          │
└─────────────────────────────────────────────────────────────────────────┘
```

### Themes

```
┌─────────────────────────────────────────────────────────────────────────┐
│  System default   Material You / dynamic colors when available          │
│  Catppuccin Mocha Always-dark, Mauve accent                             │
│  Dracula          Always-dark, Purple accent                            │
│                                                                         │
│  Static palettes skip Material You so the accent stays consistent.     │
└─────────────────────────────────────────────────────────────────────────┘
```

### Manifest Lockdown

```
┌─────────────────────────────────────────────────────────────────────────┐
│  REMOVED                                                                │
│    REQUEST_INSTALL_PACKAGES     was used only by the updater            │
│    SYSTEM_ALERT_WINDOW          was used only by the updater overlay    │
│    TunnelManager$IntentReceiver remote control receiver deleted         │
│    CONTROL_TUNNELS permission   deleted entirely                        │
│                                                                         │
│  ADDED / TIGHTENED                                                      │
│    BootShutdownReceiver         OS-only trigger, no spoofing            │
│    Network security config      cleartext forbidden, user CAs rejected  │
└─────────────────────────────────────────────────────────────────────────┘
```


### Additional Hardening

```
┌─────────────────────────────────────────────────────────────────────────┐
│  Clipboard       EXTRA_IS_SENSITIVE on all copies (API 33+)            │
│  Obfuscation     -dontobfuscate removed, R8 fully enabled               │
│  Tink keep rules R8 keep rules added for Tink + security-crypto        │
│  Log token       UUID.randomUUID() replaces KeyPair().privateKey.toHex()│
│  Dead code       FileConfigStore.kt + VersionPreference.kt deleted      │
│  Zip export      Biometric bypass blocked, explicit warning shown       │
│  Crypto          golang.org/x/crypto 0.45.0, ahead of upstream         │
└─────────────────────────────────────────────────────────────────────────┘
```

---

## PERMISSIONS

```
┌───────────────────────────────────┬────────────────────────────────────┐
│  PERMISSION                       │  REASON                            │
├───────────────────────────────────┼────────────────────────────────────┤
│  CAMERA                           │  QR code scanning for import       │
│  INTERNET                         │  VPN tunnel traffic                │
│  RECEIVE_BOOT_COMPLETED           │  Restore tunnels on boot           │
│  WRITE_EXTERNAL_STORAGE           │  Zip export on Android <= 8 only   │
└───────────────────────────────────┴────────────────────────────────────┘
```

---

## INSTALLING

```
┌─────────────────────────────────────────────────────────────────────────┐
│  Download the latest APK from the Releases page                         │
│                                                                         │
│ sha256:d6ce72c17e4ff0a7c427c1be35a198a4a5701804d40c65e665e1d30acda79fbd │
│                                                                         │
│  1. Settings -> Apps -> Special app access -> Install unknown apps      │
│  2. Enable installs for your browser or file manager                    │
│  3. Open the APK and install                                            │
│                                                                         │
│  Requires Android 8.0 (API 24) or higher                               │
│                                                                         │
│  Note: Android will warn about installing from an unknown source.       │
│  This is expected — the app is not distributed through the Play Store.  │
└─────────────────────────────────────────────────────────────────────────┘
```

---

## BUILDING FROM SOURCE

```bash
# Clone with submodules
git clone --recurse-submodules https://github.com/jegly/wireguard-android-hardened.git
cd wireguard-android-hardened

# Without --recurse-submodules
git submodule update --init --recursive

# Build debug APK
./gradlew assembleDebug
```

```
┌─────────────────────────────────────────────────────────────────────────┐
│  REQUIREMENTS                                                           │
│    JDK 21                                                               │
│    Android SDK with API 37 (Android 17)                                 │
│    NDK 26.x or 27.x                                                     │
│    CMake 3.22+                                                          │
│                                                                         │
│  OUTPUT                                                                 │
│    ui/build/outputs/apk/debug/ui-debug.apk                             │
└─────────────────────────────────────────────────────────────────────────┘
```

---

## SECURITY MODEL

```
┌─────────────────────────────────────────────────────┬───────────────────────────────────────────────┐
│  THREAT                                             │  PROTECTION                                   │
├─────────────────────────────────────────────────────┼───────────────────────────────────────────────┤
│  Rooted device reading config files                 │  AES-256-GCM via Android Keystore             │
│  ADB backup extracting configs                      │  Keystore key excluded from backup            │
│  Screenshot leaking keys or metadata                │  FLAG_SECURE on editor/detail/TV/log          │
│  Log viewer exposing tunnel metadata                │  Biometric/PIN gate + FLAG_SECURE             │
│  Clipboard history exposing copied keys             │  EXTRA_IS_SENSITIVE on all clipboard writes   │
│  Other apps controlling tunnels via intents         │  Receiver and permission removed entirely     │
│  Reverse engineering the APK                        │  R8 obfuscation enabled on release builds     │
│  Updater phoning home with device fingerprint       │  Updater stripped — zero outbound calls       │
│  MITM via user-installed CA certificates            │  Network security config rejects user CAs     │
│  Unpatched crypto CVEs                              │  golang.org/x/crypto 0.45.0, ahead of upstream│
│  Config data loss or corruption on save             │  Delete-then-rewrite to canonical path        │
│  Repackaged or re-signed APK                        │  Pinned SHA-256 signature check on launch     │
│  Phone left unattended in foreground                │  Idle-timeout re-lock + biometric gate        │
└─────────────────────────────────────────────────────┴───────────────────────────────────────────────┘
```

---

## WHAT THIS FORK DOES NOT CHANGE

```
┌─────────────────────────────────────────────────────────────────────────┐
│  The WireGuard protocol itself — cryptography is unchanged              │
│  The Go tunnel implementation (libwg-go.so)                            │
│  Core tunnel management logic                                           │
│  Any functional behaviour of the VPN                                   │
└─────────────────────────────────────────────────────────────────────────┘
```

---

## CREDITS

```
┌─────────────────────────────────────────────────────────────────────────┐
│  Built on top of WireGuard Android by WireGuard LLC                    │
│  https://git.zx2c4.com/wireguard-android                               │
│                                                                         │
│  Licensed under Apache 2.0 — see COPYING                               │
│                                                                         │
│  This project is not affiliated with or endorsed by WireGuard LLC      │
└─────────────────────────────────────────────────────────────────────────┘
```
