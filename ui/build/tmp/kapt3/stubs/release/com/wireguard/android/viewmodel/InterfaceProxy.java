package com.wireguard.android.viewmodel;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 /2\u00020\u00012\u00020\u0002:\u0002./B\u0011\b\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0004\b\u0005\u0010\tB\t\b\u0016\u00a2\u0006\u0004\b\u0005\u0010\nJ\b\u0010&\u001a\u00020\'H\u0016J\u0006\u0010(\u001a\u00020)J\u0006\u0010*\u001a\u00020\bJ\u0018\u0010+\u001a\u00020)2\u0006\u0010,\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\'H\u0016R\u0019\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8G\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f8G\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR&\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\r8G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R&\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\r8G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R&\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\r8G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R&\u0010\u001e\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\r8G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0015\"\u0004\b \u0010\u0017R&\u0010!\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\r8G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u0017R\u0011\u0010$\u001a\u00020\r8G\u00a2\u0006\u0006\u001a\u0004\b%\u0010\u0015\u00a8\u00060"}, d2 = {"Lcom/wireguard/android/viewmodel/InterfaceProxy;", "Landroidx/databinding/BaseObservable;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "<init>", "(Landroid/os/Parcel;)V", "other", "Lcom/wireguard/config/Interface;", "(Lcom/wireguard/config/Interface;)V", "()V", "excludedApplications", "Landroidx/databinding/ObservableList;", "", "getExcludedApplications", "()Landroidx/databinding/ObservableList;", "includedApplications", "getIncludedApplications", "value", "addresses", "getAddresses", "()Ljava/lang/String;", "setAddresses", "(Ljava/lang/String;)V", "dnsServers", "getDnsServers", "setDnsServers", "listenPort", "getListenPort", "setListenPort", "mtu", "getMtu", "setMtu", "privateKey", "getPrivateKey", "setPrivateKey", "publicKey", "getPublicKey", "describeContents", "", "generateKeyPair", "", "resolve", "writeToParcel", "dest", "flags", "InterfaceProxyCreator", "Companion", "ui_release"})
public final class InterfaceProxy extends androidx.databinding.BaseObservable implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableList<java.lang.String> excludedApplications = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableList<java.lang.String> includedApplications = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String addresses = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String dnsServers = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String listenPort = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String mtu = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String privateKey = "";
    @kotlin.jvm.JvmField()
    @org.jetbrains.annotations.NotNull()
    public static final android.os.Parcelable.Creator<com.wireguard.android.viewmodel.InterfaceProxy> CREATOR = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.wireguard.android.viewmodel.InterfaceProxy.Companion Companion = null;
    
    @androidx.databinding.Bindable()
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableList<java.lang.String> getExcludedApplications() {
        return null;
    }
    
    @androidx.databinding.Bindable()
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableList<java.lang.String> getIncludedApplications() {
        return null;
    }
    
    @androidx.databinding.Bindable()
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAddresses() {
        return null;
    }
    
    public final void setAddresses(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @androidx.databinding.Bindable()
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDnsServers() {
        return null;
    }
    
    public final void setDnsServers(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @androidx.databinding.Bindable()
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getListenPort() {
        return null;
    }
    
    public final void setListenPort(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @androidx.databinding.Bindable()
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMtu() {
        return null;
    }
    
    public final void setMtu(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @androidx.databinding.Bindable()
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPrivateKey() {
        return null;
    }
    
    public final void setPrivateKey(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @androidx.databinding.Bindable()
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPublicKey() {
        return null;
    }
    
    private InterfaceProxy(android.os.Parcel parcel) {
        super();
    }
    
    public InterfaceProxy(@org.jetbrains.annotations.NotNull()
    com.wireguard.config.Interface other) {
        super();
    }
    
    public InterfaceProxy() {
        super();
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    public final void generateKeyPair() {
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {com.wireguard.config.BadConfigException.class})
    @org.jetbrains.annotations.NotNull()
    public final com.wireguard.config.Interface resolve() throws com.wireguard.config.BadConfigException {
        return null;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel dest, int flags) {
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/wireguard/android/viewmodel/InterfaceProxy$Companion;", "", "<init>", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/wireguard/android/viewmodel/InterfaceProxy;", "ui_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016\u00a2\u0006\u0002\u0010\f\u00a8\u0006\r"}, d2 = {"Lcom/wireguard/android/viewmodel/InterfaceProxy$InterfaceProxyCreator;", "Landroid/os/Parcelable$Creator;", "Lcom/wireguard/android/viewmodel/InterfaceProxy;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/wireguard/android/viewmodel/InterfaceProxy;", "ui_release"})
    static final class InterfaceProxyCreator implements android.os.Parcelable.Creator<com.wireguard.android.viewmodel.InterfaceProxy> {
        
        public InterfaceProxyCreator() {
            super();
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public com.wireguard.android.viewmodel.InterfaceProxy createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel) {
            return null;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public com.wireguard.android.viewmodel.InterfaceProxy[] newArray(int size) {
            return null;
        }
    }
}