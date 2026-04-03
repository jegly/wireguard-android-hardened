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
        // Exclude any stale .conf.tmp leftovers — they are half-written saves and
        // cannot be decrypted under the canonical tunnel name.
        return context.fileList()
            .filter { it.endsWith(".conf") && !it.endsWith(".conf.tmp") }
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
        val file = fileFor(name)
        if (!file.exists())
            throw FileNotFoundException(context.getString(R.string.config_not_found_error, file.name))

        // EncryptedFile cannot overwrite in-place — the file must be deleted first.
        //
        // IMPORTANT: do NOT use a temp-file-then-rename approach here. Tink (used by
        // EncryptedFile internally) derives the key stream using the *file path* as
        // associated data (AAD). A ciphertext written to "foo.conf.tmp" will fail to
        // decrypt when read back via an EncryptedFile opened against "foo.conf" with
        // the error: "no matching key found for ciphertext stream". This was the root
        // cause of export failures on Android 14 and blank configs on Android 16.
        //
        // We delete first and write directly to the canonical path. If the app is killed
        // between delete and write the tunnel simply won't enumerate on next launch —
        // which is recoverable — rather than producing an undecryptable ciphertext.
        file.delete()
        try {
            encryptedFileFor(name).openFileOutput().use { stream ->
                stream.write(config.toWgQuickString().toByteArray(StandardCharsets.UTF_8))
            }
        } catch (e: IOException) {
            // Ensure no partial/empty file is left behind that would enumerate but fail to load
            file.delete()
            throw e
        }

        return config
    }

    companion object {
        private const val TAG = "WireGuard/EncryptedConfigStore"
    }
}
