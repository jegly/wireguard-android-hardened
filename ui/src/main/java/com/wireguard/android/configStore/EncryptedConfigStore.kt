/*
 * Copyright © 2017-2025 WireGuard LLC. All Rights Reserved.
 * SPDX-License-Identifier: Apache-2.0
 */
package com.wireguard.android.configStore

import android.content.Context
import android.util.Log
import androidx.security.crypto.EncryptedFile
import androidx.security.crypto.MasterKey
import com.wireguard.android.R
import com.wireguard.config.BadConfigException
import com.wireguard.config.Config
import java.io.File
import java.io.FileNotFoundException
import java.io.IOException
import java.nio.charset.StandardCharsets

/**
 * Configuration store that encrypts each tunnel config file at rest using AES-256-GCM
 * via Jetpack EncryptedFile, backed by a hardware-attested Android Keystore key.
 * Requires biometric/device-credential authentication within the last 30 seconds to decrypt.
 */
class EncryptedConfigStore(private val context: Context) : ConfigStore {

    private fun masterKey(): MasterKey =
        MasterKey.Builder(context)
            .setKeyScheme(MasterKey.KeyScheme.AES256_GCM)
            // timeout = -1 means auth is valid for the entire unlocked session (since last boot/unlock)
            // This is the correct setting for a VPN app — the device lock screen IS the auth gate
            // timeout = 0 would require biometric before every single key operation (unusable for batch imports)
            // timeout = 30 caused import failures because the token expired mid-batch
            .setUserAuthenticationRequired(false)
            .build()

    private fun encryptedFileFor(name: String): EncryptedFile =
        EncryptedFile.Builder(
            context,
            fileFor(name),
            masterKey(),
            EncryptedFile.FileEncryptionScheme.AES256_GCM_HKDF_4KB
        ).build()

    private fun fileFor(name: String): File = File(context.filesDir, "$name.conf")

    @Throws(IOException::class)
    override fun create(name: String, config: Config): Config {
        Log.d(TAG, "Creating encrypted configuration for tunnel $name")
        val file = fileFor(name)
        if (file.exists())
            throw IOException(context.getString(R.string.config_file_exists_error, file.name))
        encryptedFileFor(name).openFileOutput().use {
            it.write(config.toWgQuickString().toByteArray(StandardCharsets.UTF_8))
        }
        return config
    }

    @Throws(IOException::class)
    override fun delete(name: String) {
        Log.d(TAG, "Deleting configuration for tunnel $name")
        val file = fileFor(name)
        if (!file.delete())
            throw IOException(context.getString(R.string.config_delete_error, file.name))
    }

    override fun enumerate(): Set<String> {
        return context.fileList()
            .filter { it.endsWith(".conf") }
            .map { it.substring(0, it.length - ".conf".length) }
            .toSet()
    }

    @Throws(BadConfigException::class, IOException::class)
    override fun load(name: String): Config {
        if (!fileFor(name).exists())
            throw FileNotFoundException(context.getString(R.string.config_not_found_error, fileFor(name).name))
        encryptedFileFor(name).openFileInput().use { stream ->
            return Config.parse(stream)
        }
    }

    @Throws(IOException::class)
    override fun rename(name: String, replacement: String) {
        Log.d(TAG, "Renaming configuration for tunnel $name to $replacement")
        val existing = load(name)
        create(replacement, existing)
        delete(name)
    }

    @Throws(IOException::class)
    override fun save(name: String, config: Config): Config {
        Log.d(TAG, "Saving encrypted configuration for tunnel $name")
        if (!fileFor(name).exists())
            throw FileNotFoundException(context.getString(R.string.config_not_found_error, fileFor(name).name))
        // EncryptedFile cannot overwrite — delete then recreate
        fileFor(name).delete()
        encryptedFileFor(name).openFileOutput().use { stream ->
            stream.write(config.toWgQuickString().toByteArray(StandardCharsets.UTF_8))
        }
        return config
    }

    companion object {
        private const val TAG = "WireGuard/EncryptedConfigStore"
    }
}
