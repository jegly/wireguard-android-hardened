# WireGuard Android — Hardened

A privacy-focused, hardened fork of the official [WireGuard Android](https://git.zx2c4.com/wireguard-android) client. Built for personal use — no telemetry, no updater, encrypted config storage, and a tightened security posture throughout.

> Based on upstream WireGuard Android v1.0.20260315

---

## What makes this different

The upstream WireGuard Android app is well-written but makes deliberate usability tradeoffs that reduce security. This fork addresses every one of them.

### Config encryption
Tunnel configurations — including private keys — are stored encrypted at rest using **AES-256-GCM** via the Android Keystore. The upstream app writes them as plaintext `.conf` files that are trivially readable on a rooted device or via ADB backup. Here, a rooted device cannot extract your keys without your device credentials.

### Updater stripped entirely
The self-updater has been completely removed. It was the single largest privacy risk in the upstream app — on every update check it sent a `User-Agent` string containing your:
- Android SDK version
- CPU ABI
- Board identifier
- Device manufacturer and model
- Build fingerprint
- Package name

None of that leaves this app. Ever. The following files are deleted:
`Updater.kt` · `Ed25519.java` · `SnackbarUpdateShower.kt`

### Biometric authentication hardened
Upgraded from `BIOMETRIC_WEAK` (face unlock counts, no hardware attestation) to `BIOMETRIC_STRONG` with a hardware-attested `CryptoObject`. The biometric check is now cryptographically bound to a Keystore key operation — not just a UI gate that can be bypassed with a photo.

Biometric is required to:
- View a tunnel's private key
- Export tunnels to a zip file

### Screen protection
`FLAG_SECURE` now covers the **entire tunnel editor screen** from the moment it opens — not just after the private key field is tapped. This prevents your configs from appearing in the Android recents thumbnail or being screenshotted.

### Clipboard privacy
All clipboard writes are marked `EXTRA_IS_SENSITIVE` on Android 13+. Copied keys and config values are excluded from clipboard history and cannot be read by other apps via clipboard notifications.

### Manifest lockdown
Compared to upstream, the following has been removed or tightened:

| Change | Detail |
|---|---|
| `REQUEST_INSTALL_PACKAGES` removed | Was used only by the updater |
| `SYSTEM_ALERT_WINDOW` removed | Was used only by the updater overlay |
| Remote control intents removed | `TunnelManager$IntentReceiver`, `CONTROL_TUNNELS` permission, and the Settings toggle all gone |
| `BootShutdownReceiver` permission added | Only the OS can trigger it — other apps cannot send crafted intents |
| Network security config added | Cleartext traffic forbidden, user-installed CAs not trusted |

### Obfuscation re-enabled
The upstream ProGuard config explicitly disables obfuscation with `-dontobfuscate`. This flag has been removed. Release builds are now fully minified and obfuscated, raising the bar for reverse engineering.

### Settings cleaned up
Removed from the Settings UI:
- **Allow remote control intents** — feature removed entirely
- **Version preference** — was leaking the package name and version
- **Donate preference** — called into the updater code

### Zip export bypass blocked
The upstream zip exporter silently proceeded when biometric hardware was unavailable, exporting all private keys as plaintext with no warning. This fork shows an explicit confirmation dialog in that case.

### Log export token fixed
The upstream app used a freshly generated WireGuard `KeyPair().privateKey.toHex()` as a content URI access token — a confusing abuse of the crypto API. Replaced with `UUID.randomUUID()`.

---

## Permissions

This app requests only what it needs:

| Permission | Why |
|---|---|
| `CAMERA` | QR code scanning for tunnel import |
| `INTERNET` | VPN tunnel traffic |
| `RECEIVE_BOOT_COMPLETED` | Restore tunnels on boot (if enabled) |
| `WRITE_EXTERNAL_STORAGE` | Zip export on Android ≤ 8 only |

---

## Installing

Download the latest APK from the [Releases](https://github.com/jegly/wireguard-android-hardened/releases) page.
sha256:98aee2823e4a5e08f4b285ac72e0a02f8c48e102dcb7721bfd8819a0709e792a

1. On your Android device go to **Settings → Apps → Special app access → Install unknown apps**
2. Enable installs for your browser or file manager
3. Open the downloaded APK and install

Requires **Android 8.0 (API 24) or higher**.

> **Note:** Because this is not distributed through the Play Store, Android will warn you about installing from an unknown source. This is expected.

---

## Building from source

```bash
# Clone with submodules
git clone --recurse-submodules https://github.com/jegly/wireguard-android-hardened.git
cd wireguard-android-hardened

# If you cloned without --recurse-submodules
git submodule update --init --recursive

# Build debug APK
./gradlew assembleDebug
```

**Requirements:**
- JDK 21
- Android SDK with API 36
- NDK 26.x or 27.x
- CMake 3.22+

APK output: `ui/build/outputs/apk/debug/ui-debug.apk`

---

## Security model

| Threat | Protection |
|---|---|
| Rooted device reading config files | AES-256-GCM encryption via Android Keystore |
| ADB backup extracting configs | Keystore key not included in backup |
| Screenshot / recents thumbnail leaking keys | FLAG_SECURE on entire editor screen |
| Clipboard history exposing copied keys | EXTRA_IS_SENSITIVE on all clipboard writes |
| Other apps controlling tunnels via intents | Receiver and permission removed entirely |
| Reverse engineering the APK | R8 obfuscation enabled on release builds |
| Updater phoning home with device info | Updater stripped — no network calls except tunnel traffic |
| MITM via user-installed CA certificates | Network security config rejects user CAs |

---

## What this fork does NOT change

- The WireGuard protocol itself — cryptography is unchanged
- The Go tunnel implementation (`libwg-go.so`)
- Core tunnel management logic
- Any functional behaviour of the VPN

---

## Credits

Built on top of [WireGuard Android](https://git.zx2c4.com/wireguard-android) by [WireGuard LLC](https://www.wireguard.com/).  
Licensed under [Apache 2.0](COPYING).

This project is not affiliated with or endorsed by WireGuard LLC.
