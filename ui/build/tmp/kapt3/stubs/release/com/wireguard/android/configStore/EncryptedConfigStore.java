package com.wireguard.android.configStore;

/**
 * Configuration store that encrypts each tunnel config file at rest using AES-256-GCM
 * via Jetpack EncryptedFile, backed by a hardware-attested Android Keystore key.
 * Requires biometric/device-credential authentication within the last 30 seconds to decrypt.
 */
@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0006\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\u0016\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000bH\u0016J\u0018\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/wireguard/android/configStore/EncryptedConfigStore;", "Lcom/wireguard/android/configStore/ConfigStore;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "masterKey", "Landroidx/security/crypto/MasterKey;", "encryptedFileFor", "Landroidx/security/crypto/EncryptedFile;", "name", "", "fileFor", "Ljava/io/File;", "create", "Lcom/wireguard/config/Config;", "config", "delete", "", "enumerate", "", "load", "rename", "replacement", "save", "Companion", "ui_release"})
public final class EncryptedConfigStore implements com.wireguard.android.configStore.ConfigStore {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = "WireGuard/EncryptedConfigStore";
    @org.jetbrains.annotations.NotNull()
    public static final com.wireguard.android.configStore.EncryptedConfigStore.Companion Companion = null;
    
    public EncryptedConfigStore(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    private final androidx.security.crypto.MasterKey masterKey() {
        return null;
    }
    
    private final androidx.security.crypto.EncryptedFile encryptedFileFor(java.lang.String name) {
        return null;
    }
    
    private final java.io.File fileFor(java.lang.String name) {
        return null;
    }
    
    @java.lang.Override()
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
    @org.jetbrains.annotations.NotNull()
    public com.wireguard.config.Config create(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    com.wireguard.config.Config config) throws java.io.IOException {
        return null;
    }
    
    @java.lang.Override()
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
    public void delete(@org.jetbrains.annotations.NotNull()
    java.lang.String name) throws java.io.IOException {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.util.Set<java.lang.String> enumerate() {
        return null;
    }
    
    @java.lang.Override()
    @kotlin.jvm.Throws(exceptionClasses = {com.wireguard.config.BadConfigException.class, java.io.IOException.class})
    @org.jetbrains.annotations.NotNull()
    public com.wireguard.config.Config load(@org.jetbrains.annotations.NotNull()
    java.lang.String name) throws com.wireguard.config.BadConfigException, java.io.IOException {
        return null;
    }
    
    @java.lang.Override()
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
    public void rename(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String replacement) throws java.io.IOException {
    }
    
    @java.lang.Override()
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
    @org.jetbrains.annotations.NotNull()
    public com.wireguard.config.Config save(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    com.wireguard.config.Config config) throws java.io.IOException {
        return null;
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/wireguard/android/configStore/EncryptedConfigStore$Companion;", "", "<init>", "()V", "TAG", "", "ui_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}