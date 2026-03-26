package com.wireguard.android.model;

/**
 * Encapsulates the volatile and nonvolatile state of a WireGuard tunnel.
 */
@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 ,2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004:\u0001,B+\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0004\b\f\u0010\rJ\b\u0010\u0011\u001a\u00020\u0003H\u0017J\u0016\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0086@\u00a2\u0006\u0002\u0010\u0013J\u000e\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000bH\u0016J\u000e\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000bH\u0086@\u00a2\u0006\u0002\u0010\u001dJ\u000e\u0010 \u001a\u00020\tH\u0086@\u00a2\u0006\u0002\u0010!J\u0016\u0010\"\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\tH\u0086@\u00a2\u0006\u0002\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u000e\u0010)\u001a\u00020%H\u0086@\u00a2\u0006\u0002\u0010!J\u0012\u0010*\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010%J\u000e\u0010+\u001a\u00020\u0019H\u0086@\u00a2\u0006\u0002\u0010!R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R \u0010\n\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000b8G@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R$\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\t8G@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR$\u0010&\u001a\u0004\u0018\u00010%2\b\u0010\u0015\u001a\u0004\u0018\u00010%8G@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(\u00a8\u0006-"}, d2 = {"Lcom/wireguard/android/model/ObservableTunnel;", "Landroidx/databinding/BaseObservable;", "Lcom/wireguard/android/databinding/Keyed;", "", "Lcom/wireguard/android/backend/Tunnel;", "manager", "Lcom/wireguard/android/model/TunnelManager;", "name", "config", "Lcom/wireguard/config/Config;", "state", "Lcom/wireguard/android/backend/Tunnel$State;", "<init>", "(Lcom/wireguard/android/model/TunnelManager;Ljava/lang/String;Lcom/wireguard/config/Config;Lcom/wireguard/android/backend/Tunnel$State;)V", "key", "getKey", "()Ljava/lang/String;", "getName", "setNameAsync", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onNameChanged", "value", "getState", "()Lcom/wireguard/android/backend/Tunnel$State;", "onStateChange", "", "newState", "onStateChanged", "setStateAsync", "(Lcom/wireguard/android/backend/Tunnel$State;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getConfig", "()Lcom/wireguard/config/Config;", "getConfigAsync", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setConfigAsync", "(Lcom/wireguard/config/Config;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onConfigChanged", "Lcom/wireguard/android/backend/Statistics;", "statistics", "getStatistics", "()Lcom/wireguard/android/backend/Statistics;", "getStatisticsAsync", "onStatisticsChanged", "deleteAsync", "Companion", "ui_release"})
public final class ObservableTunnel extends androidx.databinding.BaseObservable implements com.wireguard.android.databinding.Keyed<java.lang.String>, com.wireguard.android.backend.Tunnel {
    @org.jetbrains.annotations.NotNull()
    private final com.wireguard.android.model.TunnelManager manager = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String name;
    @org.jetbrains.annotations.NotNull()
    private com.wireguard.android.backend.Tunnel.State state;
    @org.jetbrains.annotations.Nullable()
    private com.wireguard.config.Config config;
    @org.jetbrains.annotations.Nullable()
    private com.wireguard.android.backend.Statistics statistics;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = "WireGuard/ObservableTunnel";
    @org.jetbrains.annotations.NotNull()
    public static final com.wireguard.android.model.ObservableTunnel.Companion Companion = null;
    
    public ObservableTunnel(@org.jetbrains.annotations.NotNull()
    com.wireguard.android.model.TunnelManager manager, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    com.wireguard.config.Config config, @org.jetbrains.annotations.NotNull()
    com.wireguard.android.backend.Tunnel.State state) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getKey() {
        return null;
    }
    
    @androidx.databinding.Bindable()
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object setNameAsync(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String onNameChanged(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    @androidx.databinding.Bindable()
    @org.jetbrains.annotations.NotNull()
    public final com.wireguard.android.backend.Tunnel.State getState() {
        return null;
    }
    
    @java.lang.Override()
    public void onStateChange(@org.jetbrains.annotations.NotNull()
    com.wireguard.android.backend.Tunnel.State newState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.wireguard.android.backend.Tunnel.State onStateChanged(@org.jetbrains.annotations.NotNull()
    com.wireguard.android.backend.Tunnel.State state) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object setStateAsync(@org.jetbrains.annotations.NotNull()
    com.wireguard.android.backend.Tunnel.State state, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.wireguard.android.backend.Tunnel.State> $completion) {
        return null;
    }
    
    @androidx.databinding.Bindable()
    @org.jetbrains.annotations.Nullable()
    public final com.wireguard.config.Config getConfig() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getConfigAsync(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.wireguard.config.Config> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object setConfigAsync(@org.jetbrains.annotations.NotNull()
    com.wireguard.config.Config config, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.wireguard.config.Config> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.wireguard.config.Config onConfigChanged(@org.jetbrains.annotations.Nullable()
    com.wireguard.config.Config config) {
        return null;
    }
    
    @androidx.databinding.Bindable()
    @org.jetbrains.annotations.Nullable()
    public final com.wireguard.android.backend.Statistics getStatistics() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getStatisticsAsync(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.wireguard.android.backend.Statistics> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.wireguard.android.backend.Statistics onStatisticsChanged(@org.jetbrains.annotations.Nullable()
    com.wireguard.android.backend.Statistics statistics) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteAsync(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/wireguard/android/model/ObservableTunnel$Companion;", "", "<init>", "()V", "TAG", "", "ui_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}