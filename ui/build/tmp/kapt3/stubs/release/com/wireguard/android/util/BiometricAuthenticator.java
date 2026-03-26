package com.wireguard.android.util;

/**
 * Biometric authentication using BIOMETRIC_STRONG with a hardware-attested CryptoObject.
 * The biometric check is cryptographically bound to a Keystore key operation — not just a UI gate.
 * Falls back to DEVICE_CREDENTIAL when strong biometrics are unavailable.
 */
@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0016B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0002J\n\u0010\f\u001a\u0004\u0018\u00010\rH\u0002J,\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00122\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000f0\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/wireguard/android/util/BiometricAuthenticator;", "", "<init>", "()V", "TAG", "", "KEYSTORE_KEY_ALIAS", "ANDROID_KEYSTORE", "allowedAuthenticators", "", "getOrCreateKey", "Ljavax/crypto/SecretKey;", "buildCryptoObject", "Landroidx/biometric/BiometricPrompt$CryptoObject;", "authenticate", "", "dialogTitleRes", "fragment", "Landroidx/fragment/app/Fragment;", "callback", "Lkotlin/Function1;", "Lcom/wireguard/android/util/BiometricAuthenticator$Result;", "Result", "ui_release"})
public final class BiometricAuthenticator {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = "WireGuard/BiometricAuthenticator";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String KEYSTORE_KEY_ALIAS = "wireguard_biometric_gate_key";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String ANDROID_KEYSTORE = "AndroidKeyStore";
    private static final int allowedAuthenticators = 32783;
    @org.jetbrains.annotations.NotNull()
    public static final com.wireguard.android.util.BiometricAuthenticator INSTANCE = null;
    
    private BiometricAuthenticator() {
        super();
    }
    
    /**
     * Ensure the Keystore key exists. Creates it if absent.
     * The key requires user authentication and is invalidated if new biometrics are enrolled.
     */
    private final javax.crypto.SecretKey getOrCreateKey() {
        return null;
    }
    
    /**
     * Build a CryptoObject backed by a Keystore Cipher.
     * Passing this to BiometricPrompt means the OS will only release the cipher
     * after a successful hardware-attested biometric check.
     */
    private final androidx.biometric.BiometricPrompt.CryptoObject buildCryptoObject() {
        return null;
    }
    
    public final void authenticate(@androidx.annotation.StringRes()
    int dialogTitleRes, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.wireguard.android.util.BiometricAuthenticator.Result, kotlin.Unit> callback) {
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004\u00a2\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b\u00a8\u0006\f"}, d2 = {"Lcom/wireguard/android/util/BiometricAuthenticator$Result;", "", "<init>", "()V", "Success", "Failure", "HardwareUnavailableOrDisabled", "Cancelled", "Lcom/wireguard/android/util/BiometricAuthenticator$Result$Cancelled;", "Lcom/wireguard/android/util/BiometricAuthenticator$Result$Failure;", "Lcom/wireguard/android/util/BiometricAuthenticator$Result$HardwareUnavailableOrDisabled;", "Lcom/wireguard/android/util/BiometricAuthenticator$Result$Success;", "ui_release"})
    public static abstract class Result {
        
        private Result() {
            super();
        }
        
        @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/wireguard/android/util/BiometricAuthenticator$Result$Cancelled;", "Lcom/wireguard/android/util/BiometricAuthenticator$Result;", "<init>", "()V", "ui_release"})
        public static final class Cancelled extends com.wireguard.android.util.BiometricAuthenticator.Result {
            @org.jetbrains.annotations.NotNull()
            public static final com.wireguard.android.util.BiometricAuthenticator.Result.Cancelled INSTANCE = null;
            
            private Cancelled() {
            }
        }
        
        @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\tJ\t\u0010\u000e\u001a\u00020\u0005H\u00c6\u0003J$\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0018"}, d2 = {"Lcom/wireguard/android/util/BiometricAuthenticator$Result$Failure;", "Lcom/wireguard/android/util/BiometricAuthenticator$Result;", "code", "", "message", "", "<init>", "(Ljava/lang/Integer;Ljava/lang/CharSequence;)V", "getCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMessage", "()Ljava/lang/CharSequence;", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/CharSequence;)Lcom/wireguard/android/util/BiometricAuthenticator$Result$Failure;", "equals", "", "other", "", "hashCode", "toString", "", "ui_release"})
        public static final class Failure extends com.wireguard.android.util.BiometricAuthenticator.Result {
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Integer code = null;
            @org.jetbrains.annotations.NotNull()
            private final java.lang.CharSequence message = null;
            
            public Failure(@org.jetbrains.annotations.Nullable()
            java.lang.Integer code, @org.jetbrains.annotations.NotNull()
            java.lang.CharSequence message) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getCode() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.CharSequence getMessage() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.CharSequence component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.wireguard.android.util.BiometricAuthenticator.Result.Failure copy(@org.jetbrains.annotations.Nullable()
            java.lang.Integer code, @org.jetbrains.annotations.NotNull()
            java.lang.CharSequence message) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override()
            @org.jetbrains.annotations.NotNull()
            public java.lang.String toString() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/wireguard/android/util/BiometricAuthenticator$Result$HardwareUnavailableOrDisabled;", "Lcom/wireguard/android/util/BiometricAuthenticator$Result;", "<init>", "()V", "ui_release"})
        public static final class HardwareUnavailableOrDisabled extends com.wireguard.android.util.BiometricAuthenticator.Result {
            @org.jetbrains.annotations.NotNull()
            public static final com.wireguard.android.util.BiometricAuthenticator.Result.HardwareUnavailableOrDisabled INSTANCE = null;
            
            private HardwareUnavailableOrDisabled() {
            }
        }
        
        @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/wireguard/android/util/BiometricAuthenticator$Result$Success;", "Lcom/wireguard/android/util/BiometricAuthenticator$Result;", "cryptoObject", "Landroidx/biometric/BiometricPrompt$CryptoObject;", "<init>", "(Landroidx/biometric/BiometricPrompt$CryptoObject;)V", "getCryptoObject", "()Landroidx/biometric/BiometricPrompt$CryptoObject;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ui_release"})
        public static final class Success extends com.wireguard.android.util.BiometricAuthenticator.Result {
            @org.jetbrains.annotations.Nullable()
            private final androidx.biometric.BiometricPrompt.CryptoObject cryptoObject = null;
            
            public Success(@org.jetbrains.annotations.Nullable()
            androidx.biometric.BiometricPrompt.CryptoObject cryptoObject) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final androidx.biometric.BiometricPrompt.CryptoObject getCryptoObject() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final androidx.biometric.BiometricPrompt.CryptoObject component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.wireguard.android.util.BiometricAuthenticator.Result.Success copy(@org.jetbrains.annotations.Nullable()
            androidx.biometric.BiometricPrompt.CryptoObject cryptoObject) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override()
            @org.jetbrains.annotations.NotNull()
            public java.lang.String toString() {
                return null;
            }
        }
    }
}