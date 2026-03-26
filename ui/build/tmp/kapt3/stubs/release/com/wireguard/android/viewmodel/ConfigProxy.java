package com.wireguard.android.viewmodel;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001b\u001cB\u0011\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\b\u0004\u0010\bB\t\b\u0016\u00a2\u0006\u0004\b\u0004\u0010\tJ\u0006\u0010\u0013\u001a\u00020\u0010J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0006\u0010\u0016\u001a\u00020\u0007J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0015H\u0016R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001d"}, d2 = {"Lcom/wireguard/android/viewmodel/ConfigProxy;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "<init>", "(Landroid/os/Parcel;)V", "other", "Lcom/wireguard/config/Config;", "(Lcom/wireguard/config/Config;)V", "()V", "interface", "Lcom/wireguard/android/viewmodel/InterfaceProxy;", "getInterface", "()Lcom/wireguard/android/viewmodel/InterfaceProxy;", "peers", "Landroidx/databinding/ObservableList;", "Lcom/wireguard/android/viewmodel/PeerProxy;", "getPeers", "()Landroidx/databinding/ObservableList;", "addPeer", "describeContents", "", "resolve", "writeToParcel", "", "dest", "flags", "ConfigProxyCreator", "Companion", "ui_release"})
public final class ConfigProxy implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableList<com.wireguard.android.viewmodel.PeerProxy> peers = null;
    @kotlin.jvm.JvmField()
    @org.jetbrains.annotations.NotNull()
    public static final android.os.Parcelable.Creator<com.wireguard.android.viewmodel.ConfigProxy> CREATOR = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.wireguard.android.viewmodel.ConfigProxy.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.wireguard.android.viewmodel.InterfaceProxy getInterface() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableList<com.wireguard.android.viewmodel.PeerProxy> getPeers() {
        return null;
    }
    
    private ConfigProxy(android.os.Parcel parcel) {
        super();
    }
    
    public ConfigProxy(@org.jetbrains.annotations.NotNull()
    com.wireguard.config.Config other) {
        super();
    }
    
    public ConfigProxy() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.wireguard.android.viewmodel.PeerProxy addPeer() {
        return null;
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {com.wireguard.config.BadConfigException.class})
    @org.jetbrains.annotations.NotNull()
    public final com.wireguard.config.Config resolve() throws com.wireguard.config.BadConfigException {
        return null;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel dest, int flags) {
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/wireguard/android/viewmodel/ConfigProxy$Companion;", "", "<init>", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/wireguard/android/viewmodel/ConfigProxy;", "ui_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016\u00a2\u0006\u0002\u0010\f\u00a8\u0006\r"}, d2 = {"Lcom/wireguard/android/viewmodel/ConfigProxy$ConfigProxyCreator;", "Landroid/os/Parcelable$Creator;", "Lcom/wireguard/android/viewmodel/ConfigProxy;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/wireguard/android/viewmodel/ConfigProxy;", "ui_release"})
    static final class ConfigProxyCreator implements android.os.Parcelable.Creator<com.wireguard.android.viewmodel.ConfigProxy> {
        
        public ConfigProxyCreator() {
            super();
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public com.wireguard.android.viewmodel.ConfigProxy createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel) {
            return null;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public com.wireguard.android.viewmodel.ConfigProxy[] newArray(int size) {
            return null;
        }
    }
}