package com.wireguard.android.model;

/**
 * Maintains and mediates changes to the set of available WireGuard tunnels,
 */
@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\u001e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 92\u00020\u0001:\u00019B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u001a\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0086@\u00a2\u0006\u0002\u0010\u0017J \u0010\u0018\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0086@\u00a2\u0006\u0002\u0010\u0019J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\nH\u0086@\u00a2\u0006\u0002\u0010\u001dJ\u0016\u0010$\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\nH\u0086@\u00a2\u0006\u0002\u0010\u001dJ\u0006\u0010%\u001a\u00020\u001bJ$\u0010&\u001a\u00020\u001b2\f\u0010\'\u001a\b\u0012\u0004\u0012\u00020\t0(2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\t0*H\u0002J\b\u0010+\u001a\u00020\u001bH\u0002J\u0016\u0010,\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020\u000fH\u0086@\u00a2\u0006\u0002\u0010.J\u000e\u0010/\u001a\u00020\u001bH\u0086@\u00a2\u0006\u0002\u0010\u0017J\u001e\u00100\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0013H\u0086@\u00a2\u0006\u0002\u00101J\u001e\u00102\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\tH\u0086@\u00a2\u0006\u0002\u00103J\u001e\u00104\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0015H\u0086@\u00a2\u0006\u0002\u00105J\u0016\u00106\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\nH\u0086@\u00a2\u0006\u0002\u0010\u001dJ\u0016\u00107\u001a\u0002082\u0006\u0010\u001c\u001a\u00020\nH\u0086@\u00a2\u0006\u0002\u0010\u001dR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R*\u0010\u001f\u001a\u0004\u0018\u00010\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\n8G@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#\u00a8\u0006:"}, d2 = {"Lcom/wireguard/android/model/TunnelManager;", "Landroidx/databinding/BaseObservable;", "configStore", "Lcom/wireguard/android/configStore/ConfigStore;", "<init>", "(Lcom/wireguard/android/configStore/ConfigStore;)V", "tunnels", "Lkotlinx/coroutines/CompletableDeferred;", "Lcom/wireguard/android/databinding/ObservableSortedKeyedArrayList;", "", "Lcom/wireguard/android/model/ObservableTunnel;", "context", "Landroid/content/Context;", "tunnelMap", "haveLoaded", "", "addToList", "name", "config", "Lcom/wireguard/config/Config;", "state", "Lcom/wireguard/android/backend/Tunnel$State;", "getTunnels", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "create", "(Ljava/lang/String;Lcom/wireguard/config/Config;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delete", "", "tunnel", "(Lcom/wireguard/android/model/ObservableTunnel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "value", "lastUsedTunnel", "getLastUsedTunnel", "()Lcom/wireguard/android/model/ObservableTunnel;", "setLastUsedTunnel", "(Lcom/wireguard/android/model/ObservableTunnel;)V", "getTunnelConfig", "onCreate", "onTunnelsLoaded", "present", "", "running", "", "refreshTunnelStates", "restoreState", "force", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveState", "setTunnelConfig", "(Lcom/wireguard/android/model/ObservableTunnel;Lcom/wireguard/config/Config;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setTunnelName", "(Lcom/wireguard/android/model/ObservableTunnel;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setTunnelState", "(Lcom/wireguard/android/model/ObservableTunnel;Lcom/wireguard/android/backend/Tunnel$State;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTunnelState", "getTunnelStatistics", "Lcom/wireguard/android/backend/Statistics;", "Companion", "ui_release"})
public final class TunnelManager extends androidx.databinding.BaseObservable {
    @org.jetbrains.annotations.NotNull()
    private final com.wireguard.android.configStore.ConfigStore configStore = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CompletableDeferred<com.wireguard.android.databinding.ObservableSortedKeyedArrayList<java.lang.String, com.wireguard.android.model.ObservableTunnel>> tunnels = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final com.wireguard.android.databinding.ObservableSortedKeyedArrayList<java.lang.String, com.wireguard.android.model.ObservableTunnel> tunnelMap = null;
    private boolean haveLoaded = false;
    @org.jetbrains.annotations.Nullable()
    private com.wireguard.android.model.ObservableTunnel lastUsedTunnel;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = "WireGuard/TunnelManager";
    @org.jetbrains.annotations.NotNull()
    public static final com.wireguard.android.model.TunnelManager.Companion Companion = null;
    
    public TunnelManager(@org.jetbrains.annotations.NotNull()
    com.wireguard.android.configStore.ConfigStore configStore) {
        super();
    }
    
    private final com.wireguard.android.model.ObservableTunnel addToList(java.lang.String name, com.wireguard.config.Config config, com.wireguard.android.backend.Tunnel.State state) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getTunnels(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.wireguard.android.databinding.ObservableSortedKeyedArrayList<java.lang.String, com.wireguard.android.model.ObservableTunnel>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object create(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    com.wireguard.config.Config config, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.wireguard.android.model.ObservableTunnel> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object delete(@org.jetbrains.annotations.NotNull()
    com.wireguard.android.model.ObservableTunnel tunnel, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @androidx.databinding.Bindable()
    @org.jetbrains.annotations.Nullable()
    public final com.wireguard.android.model.ObservableTunnel getLastUsedTunnel() {
        return null;
    }
    
    private final void setLastUsedTunnel(com.wireguard.android.model.ObservableTunnel value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getTunnelConfig(@org.jetbrains.annotations.NotNull()
    com.wireguard.android.model.ObservableTunnel tunnel, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.wireguard.config.Config> $completion) {
        return null;
    }
    
    public final void onCreate() {
    }
    
    private final void onTunnelsLoaded(java.lang.Iterable<java.lang.String> present, java.util.Collection<java.lang.String> running) {
    }
    
    private final void refreshTunnelStates() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object restoreState(boolean force, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object saveState(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object setTunnelConfig(@org.jetbrains.annotations.NotNull()
    com.wireguard.android.model.ObservableTunnel tunnel, @org.jetbrains.annotations.NotNull()
    com.wireguard.config.Config config, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.wireguard.config.Config> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object setTunnelName(@org.jetbrains.annotations.NotNull()
    com.wireguard.android.model.ObservableTunnel tunnel, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object setTunnelState(@org.jetbrains.annotations.NotNull()
    com.wireguard.android.model.ObservableTunnel tunnel, @org.jetbrains.annotations.NotNull()
    com.wireguard.android.backend.Tunnel.State state, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.wireguard.android.backend.Tunnel.State> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getTunnelState(@org.jetbrains.annotations.NotNull()
    com.wireguard.android.model.ObservableTunnel tunnel, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.wireguard.android.backend.Tunnel.State> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getTunnelStatistics(@org.jetbrains.annotations.NotNull()
    com.wireguard.android.model.ObservableTunnel tunnel, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.wireguard.android.backend.Statistics> $completion) {
        return null;
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/wireguard/android/model/TunnelManager$Companion;", "", "<init>", "()V", "TAG", "", "ui_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}