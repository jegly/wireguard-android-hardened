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
    // SHA-256 of the JEGLY release signing certificate (key0 keystore).
    // Obtain via: apksigner verify --print-certs <release.apk>
    private const val TRUSTED_CERT_SHA256 =
        "98d324d4106a368c62729a0a24d9ac9a6b47f8ac4c6585348531f0ee4eb6a04c"

    fun isSignedByTrustedCert(context: Context): Boolean {
        return try {
            val signatures = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
                val info = context.packageManager.getPackageInfo(
                    context.packageName,
                    PackageManager.GET_SIGNING_CERTIFICATES
                )
                info.signingInfo?.apkContentsSigners ?: return false
            } else {
                @Suppress("DEPRECATION")
                val info = context.packageManager.getPackageInfo(
                    context.packageName,
                    PackageManager.GET_SIGNATURES
                )
                @Suppress("DEPRECATION")
                info.signatures ?: return false
            }
            val md = MessageDigest.getInstance("SHA-256")
            signatures.any { sig ->
                val digest = md.digest(sig.toByteArray())
                digest.joinToString("") { "%02x".format(it) } == TRUSTED_CERT_SHA256
            }
        } catch (_: Exception) {
            false
        }
    }
}
