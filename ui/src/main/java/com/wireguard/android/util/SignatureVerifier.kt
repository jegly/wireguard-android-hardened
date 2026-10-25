/*
 * Copyright © 2025 WireGuard LLC. All Rights Reserved.
 * SPDX-License-Identifier: Apache-2.0
 */

package com.wireguard.android.util

import android.content.Context
import android.content.pm.PackageManager
import android.os.Build
import java.security.MessageDigest

object SignatureVerifier {
    // Expected signing-cert SHA-256 digests, stored XOR-masked (never as greppable hex — string
    // literals survive R8) and compared as raw bytes. M = JEGLY key0 (98d324d4…),
    // P = ML-DSA-87 PQC key (5f99de5b…).
    // API 37+ verifies the APK Signature Scheme v3.2 hybrid block, so the current signer is the PQC
    // key there. key0 is deliberately NOT accepted on API 37+: an APK re-signed with only key0 would
    // otherwise pass. Older releases ignore v3.2 and still see key0.
    private val K = intArrayOf(0xD8, 0x9E, 0xD7, 0x3B, 0xA5, 0xF6, 0x4B, 0x7A, 0xED)
    private val M = intArrayOf(
        0x40, 0x4D, 0xF3, 0xEF, 0xB5, 0x9C, 0x7D, 0xF6, 0x8F, 0xAA, 0x04, 0xDD, 0x1F, 0x7C, 0x5A, 0xD1,
        0x11, 0xAA, 0x20, 0x32, 0x9B, 0x5E, 0x20, 0xC2, 0xCE, 0x4B, 0x1D, 0x36, 0xD0, 0x61, 0x9B, 0xE9,
    )
    private val P = intArrayOf(
        0x87, 0x07, 0x09, 0x60, 0x94, 0x63, 0x3E, 0x47, 0xA2, 0x30, 0x43, 0x7C, 0xD0, 0x77, 0x0D, 0x6C,
        0x4F, 0x86, 0xF9, 0x97, 0x01, 0xC0, 0x17, 0xB1, 0x54, 0xB1, 0x50, 0x2A, 0x84, 0x49, 0x4D, 0x03,
    )

    /** Reconstruct the expected 32-byte cert digest from the masked form (never materialized as hex). */
    private fun expected(): ByteArray {
        val masked = if (Build.VERSION.SDK_INT >= 37) P else M
        return ByteArray(masked.size) { (masked[it] xor K[it % K.size]).toByte() }
    }

    fun isSignedByTrustedCert(context: Context): Boolean {
        return try {
            val signatures = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
                val info = context.packageManager.getPackageInfo(
                    context.packageName,
                    PackageManager.GET_SIGNING_CERTIFICATES
                )
                // Current signer only — never signingCertificateHistory, which still contains key0.
                info.signingInfo?.apkContentsSigners ?: return false
            } else {
                // Pre-P has no key rotation; the only signer is key0.
                @Suppress("DEPRECATION")
                val info = context.packageManager.getPackageInfo(
                    context.packageName,
                    PackageManager.GET_SIGNATURES
                )
                @Suppress("DEPRECATION")
                info.signatures ?: return false
            }
            val md = MessageDigest.getInstance("SHA-256")
            val want = expected()
            signatures.any { sig -> md.digest(sig.toByteArray()).contentEquals(want) }
        } catch (_: Exception) {
            false
        }
    }
}
