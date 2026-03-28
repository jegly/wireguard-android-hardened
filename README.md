```
██╗    ██╗██╗██████╗ ███████╗ ██████╗ ██╗   ██╗ █████╗ ██████╗ ██████╗
██║    ██║██║██╔══██╗██╔════╝██╔════╝ ██║   ██║██╔══██╗██╔══██╗██╔══██╗
██║ █╗ ██║██║██████╔╝█████╗  ██║  ███╗██║   ██║███████║██████╔╝██║  ██║
██║███╗██║██║██╔══██╗██╔══╝  ██║   ██║██║   ██║██╔══██║██╔══██╗██║  ██║
╚███╔███╔╝██║██║  ██║███████╗╚██████╔╝╚██████╔╝██║  ██║██║  ██║██████╔╝
 ╚══╝╚══╝ ╚═╝╚═╝  ╚═╝╚══════╝ ╚═════╝  ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝╚═════╝
                        ANDROID  //  HARDENED
```

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
│  Screen protection               │  Private key only       │  Editor + Detail + TV + Log viewer     │
│  Log viewer access               │  No auth required       │  Biometric/PIN gate + FLAG_SECURE      │
│  Tunnel detail view              │  No protection          │  FLAG_SECURE                           │
│  Clipboard                       │  No sensitivity flag    │  EXTRA_IS_SENSITIVE on API 33+         │
│  Remote control intents          │  Exported + dangerous   │  Completely removed                    │
│  ProGuard obfuscation            │  Disabled               │  Enabled                               │
│  Network security config         │  None                   │  Cleartext forbidden, user CAs out     │
│  golang.org/x/crypto             │  0.38.0 (2 CVEs)        │  0.45.0 (patched, ahead of upstream)  │
│  Target SDK                      │  35                     │  36 (no install warning on Android 16) │
│  Config save safety              │  TOCTOU race condition  │  Atomic write via temp file            │
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
└─────────────────────────────────────────────────────────────────────────┘
```

The biometric check is cryptographically bound to a Keystore key operation — not just a UI gate bypassable with a photo.

### Screen Protection

```
┌─────────────────────────────────────────────────────────────────────────┐
│  FLAG_SECURE active on:                                                 │
│    - Tunnel editor     (entire screen from moment it opens)             │
│    - Tunnel detail     (addresses, endpoints, DNS, public key)          │
│    - Log viewer        (tunnel event metadata)                          │
│    - TV interface      (tunnel list on Android TV / foldables)          │
│                                                                         │
│  Prevents: screenshots, screen recording, recents thumbnails           │
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

### Atomic Config Save

```
┌─────────────────────────────────────────────────────────────────────────┐
│  UPSTREAM (TOCTOU race):                                                │
│    1. delete(tunnel.conf)           <- app killed here = DATA LOSS      │
│    2. write(tunnel.conf)                                                │
│                                                                         │
│  THIS FORK (atomic):                                                    │
│    1. write(tunnel.conf.tmp)        <- crash safe                       │
│    2. delete(tunnel.conf)                                               │
│    3. rename(tmp -> tunnel.conf)    <- atomic swap                      │
└─────────────────────────────────────────────────────────────────────────┘
```

### Additional Hardening

```
┌─────────────────────────────────────────────────────────────────────────┐
│  Clipboard       EXTRA_IS_SENSITIVE on all copies (API 33+)            │
│  Obfuscation     -dontobfuscate removed, R8 fully enabled               │
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
│  sha256: 3e0e2298378b2b73e48adb4486019334ec06974de8767f844b3b58d542fb61f9│
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
│    Android SDK with API 36                                              │
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
│  Config data loss on crash during save              │  Atomic write via temp file + rename          │
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
