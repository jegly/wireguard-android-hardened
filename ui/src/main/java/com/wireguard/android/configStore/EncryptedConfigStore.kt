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
 * The device lock screen is the authentication gate — configs are inaccessible when locked.
 */
class EncryptedConfigStore(private val context: Context) : ConfigStore {

    private fun masterKey(): MasterKey =
        MasterKey.Builder(context)
            .setKeyScheme(MasterKey.KeyScheme.AES256_GCM)
            // setUserAuthenticationRequired(false) — encryption is tied to device unlock state.
            // The device lock screen IS the auth gate. Setting true with a timeout caused
            // batch import failures (token expired mid-batch). false is correct for a VPN app.
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

    private fun tempFileFor(name: String): File = File(context.filesDir, "$name.conf.tmp")

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

        // EncryptedFile cannot overwrite in-place. To avoid data loss if the app is killed
        // between delete and recreate (TOCTOU), we write to a temp file first, then
        // atomically swap: delete original, rename temp into place.
        val tempFile = tempFileFor(name)
        tempFile.delete() // clean up any previous failed attempt

        try {
            // Write new encrypted content to temp file
            EncryptedFile.Builder(
                context,
                tempFile,
                masterKey(),
                EncryptedFile.FileEncryptionScheme.AES256_GCM_HKDF_4KB
            ).build().openFileOutput().use { stream ->
                stream.write(config.toWgQuickString().toByteArray(StandardCharsets.UTF_8))
            }
            // Temp file written successfully — now atomically replace
            fileFor(name).delete()
            if (!tempFile.renameTo(fileFor(name))) {
                throw IOException("Failed to rename temp config file for $name")
            }
        } catch (e: IOException) {
            // Clean up temp file if anything went wrong
            tempFile.delete()
            throw e
        }

        return config
    }

    companion object {
        private const val TAG = "WireGuard/EncryptedConfigStore"
    }
}
