# WireGuard Android Hardened

<p align="center">
    <img src="wg_banner.png" alt="WireGuard Android Hardened"/>
</p>

A privacy-focused, hardened fork of the official WireGuard Android client. This project prioritizes security and data sovereignty by removing telemetry, encrypting local storage, and tightening the overall security posture.

**Base Upstream:** v1.0.20260315

---

## At a Glance

| Feature | Upstream (Official) | This Fork |
| :--- | :--- | :--- |
| **Config Storage** | Plaintext `.conf` files | **AES-256-GCM** (Android Keystore) |
| **Biometric Auth** | `BIOMETRIC_WEAK` | **`BIOMETRIC_STRONG`** + CryptoObject |
| **Self-Updater** | Present (phones home) | **Completely stripped** |
| **Network Privacy** | Leaks SDK/Model/FP/Pkg | **None** (Identifiers removed) |
| **Screen Protection**| Private key only | **App-wide** (`FLAG_SECURE`) |
| **App-wide Lock** | None | Biometric/PIN gate on launch + return |
| **Idle Auto-lock** | None | Off / 1 / 5 / 15 min foreground idle |
| **APK Tamper Check** | None | **Signer pin** on launch: ML-DSA-87 key on Android 17+, original key below |
| **Themes** | Light / Dark | + **Catppuccin Mocha** & **Dracula** |
| **Target SDK** | 35 | **37** (Android 17) |
| **Dependencies** | `golang.org/x/crypto` 0.38.0 | **0.58.0** (Patched/Current), built with Go 1.26.10 |
| **Obfuscation** | Disabled | **R8/ProGuard Enabled** |

---

## Security Hardening Details

###  Configuration Encryption
The upstream app writes private keys to plaintext `.conf` files readable by any root-capable tool. This fork uses **AES-256-GCM** encryption via the Android Keystore. Configurations are unreadable at rest without device credentials—even on rooted devices.

###  Zero Telemetry & Fingerprinting
The self-updater was the primary privacy risk in the original app. We have completely removed the updater logic, preventing the transmission of device IDs (Manufacturer, Model, Board, and Build Fingerprint).
*   **Deleted Components:** `Updater.kt`, `Ed25519.java`, and `SnackbarUpdateShower.kt`.

###  Hardened Authentication
The biometric gate is hardware-attested and bound to a Keystore operation (`CryptoObject`).
*   **Gate points:** App launch, return from background, viewing private keys, exporting tunnels, and log access.
*   **Idle Timeout:** Optionally re-locks the app after 1, 5, or 15 minutes of foreground inactivity.

###  Screen & Clipboard Protection
*   **FLAG_SECURE:** Applied to all activities to prevent screenshots, screen recording, and exposure in the "Recent Apps" preview.
*   **Sensitive Clipboard:** Implements `EXTRA_IS_SENSITIVE` (API 33+) to prevent clipboard managers from capturing and logging sensitive keys.

###  Manifest & Network Lockdown
*   **Permission Reduction:** Removed `REQUEST_INSTALL_PACKAGES`, `SYSTEM_ALERT_WINDOW`, and `CONTROL_TUNNELS`.
*   **Intent Security:** Removed `TunnelManager$IntentReceiver`. Third-party apps cannot control your tunnels.
*   **Network Security:** Cleartext traffic is forbidden; user-installed CA certificates are rejected to prevent MITM attacks.

---

## Security Model Summary

| Threat | Protection |
| :--- | :--- |
| **Rooted device data theft** | Keystore-backed AES-256-GCM encryption |
| **ADB Backup extraction** | Keystore keys are non-exportable/excluded from backup |
| **Screen capture/logging** | App-wide `FLAG_SECURE` hardcoded |
| **Unauthorized physical access** | `BIOMETRIC_STRONG` gate + Idle auto-lock |
| **Malicious APK replacement** | Current-signer SHA-256 pin on launch (ML-DSA-87 key on Android 17+) |
| **Telemetry/Fingerprinting** | Updater stripped — zero outbound ID leaks |
| **Unpatched Crypto** | Updated `golang.org/x/crypto` to 0.58.0 and the Go toolchain to 1.26.10 |

---

## Installation

1. Download the latest APK from the [Releases](#) page.
2. **Verify SHA-256** of `WireGuard-Hardened-PQC-1.0.10-signed.apk`: `23f39c8102d4b1b6b12b37288117ab30e9287897673ce7e0b0cc7b69c2bc2925` (see Release signing below)
3. Enable "Install Unknown Apps" for your browser/file manager.
4. *Requires Android 8.0 (API 24) or higher.*

---

## Release signing

Release APKs use hybrid signing (APK Signature Scheme v3.2): the original app key plus an EC P-384 key and an ML-DSA-87 post-quantum key. Android 17 and newer verify the hybrid block, where the ML-DSA-87 key is the signer; earlier Android versions verify the original key as before.

| File | SHA-256 |
| --- | --- |
| `WireGuard-Hardened-PQC-1.0.10-signed.apk` | `23f39c8102d4b1b6b12b37288117ab30e9287897673ce7e0b0cc7b69c2bc2925` |

Verify a download:

```bash
sha256sum WireGuard-Hardened-PQC-1.0.10-signed.apk
apksigner verify -v --print-certs WireGuard-Hardened-PQC-1.0.10-signed.apk   # build-tools 37.0.0 on JDK 25 shows all three keys
```

Signing certificate SHA-256:

- ML-DSA-87 (post-quantum): `5f99de5b3195753d4fe8ddabebd2fb27356b2109d6fbb2471fcbbdf21a9e76a6`
- EC P-384 (hybrid classical): `fa8f4a07e6a4f2b7dc6e5ab31fc05592b1414ab9436d1e2e39b35ce3bb2e33a2`
- Original key: `98d324d4106a368c62729a0a24d9ac9a6b47f8ac4c6585348531f0ee4eb6a04c`

---

## Building from Source

```bash
# Clone with submodules
git clone --recurse-submodules https://github.com/jegly/wireguard-android-hardened.git
cd wireguard-android-hardened

# Build debug APK
./gradlew assembleDebug
```
Requirements:
JDK 21
Android SDK API 37
NDK 26.x or 27.x
CMake 3.22+

Credits
Built on WireGuard Android by WireGuard LLC.
Licensed under the Apache License 2.0.
This project is not affiliated with or endorsed by WireGuard LLC.
