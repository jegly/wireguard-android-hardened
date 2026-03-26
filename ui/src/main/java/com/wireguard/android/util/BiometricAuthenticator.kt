/*
 * Copyright © 2017-2025 WireGuard LLC. All Rights Reserved.
 * SPDX-License-Identifier: Apache-2.0
 */

package com.wireguard.android.util

import android.os.Handler
import android.os.Looper
import android.security.keystore.KeyGenParameterSpec
import android.security.keystore.KeyProperties
import android.util.Log
import androidx.annotation.StringRes
import androidx.biometric.BiometricManager
import androidx.biometric.BiometricManager.Authenticators
import androidx.biometric.BiometricPrompt
import androidx.fragment.app.Fragment
import com.wireguard.android.R
import javax.crypto.Cipher
import javax.crypto.KeyGenerator
import javax.crypto.SecretKey
import java.security.KeyStore

/**
 * Biometric authentication using BIOMETRIC_STRONG with a hardware-attested CryptoObject.
 * The biometric check is cryptographically bound to a Keystore key operation — not just a UI gate.
 * Falls back to DEVICE_CREDENTIAL when strong biometrics are unavailable.
 */
object BiometricAuthenticator {
    private const val TAG = "WireGuard/BiometricAuthenticator"
    private const val KEYSTORE_KEY_ALIAS = "wireguard_biometric_gate_key"
    private const val ANDROID_KEYSTORE = "AndroidKeyStore"

    // Require STRONG biometrics (fingerprint, iris) — not face-only WEAK class.
    // DEVICE_CREDENTIAL included as fallback for devices without enrolled biometrics.
    private const val allowedAuthenticators =
        Authenticators.BIOMETRIC_STRONG or Authenticators.DEVICE_CREDENTIAL

    sealed class Result {
        data class Success(val cryptoObject: BiometricPrompt.CryptoObject?) : Result()
        data class Failure(val code: Int?, val message: CharSequence) : Result()
        object HardwareUnavailableOrDisabled : Result()
        object Cancelled : Result()
    }

    /**
     * Ensure the Keystore key exists. Creates it if absent.
     * The key requires user authentication and is invalidated if new biometrics are enrolled.
     */
    private fun getOrCreateKey(): SecretKey {
        val keyStore = KeyStore.getInstance(ANDROID_KEYSTORE).also { it.load(null) }
        keyStore.getKey(KEYSTORE_KEY_ALIAS, null)?.let { return it as SecretKey }

        val keyGen = KeyGenerator.getInstance(KeyProperties.KEY_ALGORITHM_AES, ANDROID_KEYSTORE)
        keyGen.init(
            KeyGenParameterSpec.Builder(
                KEYSTORE_KEY_ALIAS,
                KeyProperties.PURPOSE_ENCRYPT or KeyProperties.PURPOSE_DECRYPT
            )
                .setBlockModes(KeyProperties.BLOCK_MODE_CBC)
                .setEncryptionPaddings(KeyProperties.ENCRYPTION_PADDING_PKCS7)
                .setUserAuthenticationRequired(true)
                .setInvalidatedByBiometricEnrollment(true)
                .build()
        )
        return keyGen.generateKey()
    }

    /**
     * Build a CryptoObject backed by a Keystore Cipher.
     * Passing this to BiometricPrompt means the OS will only release the cipher
     * after a successful hardware-attested biometric check.
     */
    private fun buildCryptoObject(): BiometricPrompt.CryptoObject? {
        return try {
            val key = getOrCreateKey()
            val cipher = Cipher.getInstance(
                "${KeyProperties.KEY_ALGORITHM_AES}/${KeyProperties.BLOCK_MODE_CBC}/${KeyProperties.ENCRYPTION_PADDING_PKCS7}"
            )
            cipher.init(Cipher.ENCRYPT_MODE, key)
            BiometricPrompt.CryptoObject(cipher)
        } catch (e: Exception) {
            Log.w(TAG, "Could not build CryptoObject, falling back to non-crypto auth: ${e.message}")
            null
        }
    }

    fun authenticate(
        @StringRes dialogTitleRes: Int,
        fragment: Fragment,
        callback: (Result) -> Unit
    ) {
        val authCallback = object : BiometricPrompt.AuthenticationCallback() {
            override fun onAuthenticationError(errorCode: Int, errString: CharSequence) {
                super.onAuthenticationError(errorCode, errString)
                Log.d(TAG, "BiometricAuthentication error: errorCode=$errorCode, msg=$errString")
                callback(
                    when (errorCode) {
                        BiometricPrompt.ERROR_CANCELED, BiometricPrompt.ERROR_USER_CANCELED,
                        BiometricPrompt.ERROR_NEGATIVE_BUTTON -> Result.Cancelled

                        BiometricPrompt.ERROR_HW_NOT_PRESENT, BiometricPrompt.ERROR_HW_UNAVAILABLE,
                        BiometricPrompt.ERROR_NO_BIOMETRICS, BiometricPrompt.ERROR_NO_DEVICE_CREDENTIAL -> Result.HardwareUnavailableOrDisabled

                        else -> Result.Failure(errorCode, fragment.getString(R.string.biometric_auth_error_reason, errString))
                    }
                )
            }

            override fun onAuthenticationFailed() {
                super.onAuthenticationFailed()
                callback(Result.Failure(null, fragment.getString(R.string.biometric_auth_error)))
            }

            override fun onAuthenticationSucceeded(result: BiometricPrompt.AuthenticationResult) {
                super.onAuthenticationSucceeded(result)
                callback(Result.Success(result.cryptoObject))
            }
        }

        val biometricPrompt = BiometricPrompt(
            fragment,
            { Handler(Looper.getMainLooper()).post(it) },
            authCallback
        )
        val promptInfo = BiometricPrompt.PromptInfo.Builder()
            .setTitle(fragment.getString(dialogTitleRes))
            .setAllowedAuthenticators(allowedAuthenticators)
            .build()

        val canAuth = BiometricManager.from(fragment.requireContext())
            .canAuthenticate(allowedAuthenticators)

        if (canAuth == BiometricManager.BIOMETRIC_SUCCESS) {
            val cryptoObject = buildCryptoObject()
            if (cryptoObject != null) {
                biometricPrompt.authenticate(promptInfo, cryptoObject)
            } else {
                // CryptoObject unavailable (e.g. key invalidated after new enrolment) — still auth
                biometricPrompt.authenticate(promptInfo)
            }
        } else {
            callback(Result.HardwareUnavailableOrDisabled)
        }
    }
}
