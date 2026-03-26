package com.wireguard.android;

/**
 * Service that maintains the application's custom Quick Settings tile. This service is bound by the
 * system framework as necessary to update the appearance of the tile in the system UI, and to
 * forward click events to the application.
 */
@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u0000 \u001c2\u00020\u0001:\u0003\u001a\u001b\u001cB\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0014\u001a\u00020\u0012H\u0016J\b\u0010\u0015\u001a\u00020\u0012H\u0016J\b\u0010\u0016\u001a\u00020\u0012H\u0016J\b\u0010\u0017\u001a\u00020\u0012H\u0016J\b\u0010\u0018\u001a\u00020\u0012H\u0016J\b\u0010\u0019\u001a\u00020\u0012H\u0002R\u0012\u0010\u0004\u001a\u00060\u0005R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u00060\u0007R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/wireguard/android/QuickTileService;", "Landroid/service/quicksettings/TileService;", "<init>", "()V", "onStateChangedCallback", "Lcom/wireguard/android/QuickTileService$OnStateChangedCallback;", "onTunnelChangedCallback", "Lcom/wireguard/android/QuickTileService$OnTunnelChangedCallback;", "iconOff", "Landroid/graphics/drawable/Icon;", "iconOn", "tunnel", "Lcom/wireguard/android/model/ObservableTunnel;", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onClick", "", "onCreate", "onDestroy", "onStartListening", "onStopListening", "onTileAdded", "onTileRemoved", "updateTile", "OnStateChangedCallback", "OnTunnelChangedCallback", "Companion", "ui_release"})
public final class QuickTileService extends android.service.quicksettings.TileService {
    @org.jetbrains.annotations.NotNull()
    private final com.wireguard.android.QuickTileService.OnStateChangedCallback onStateChangedCallback = null;
    @org.jetbrains.annotations.NotNull()
    private final com.wireguard.android.QuickTileService.OnTunnelChangedCallback onTunnelChangedCallback = null;
    @org.jetbrains.annotations.Nullable()
    private android.graphics.drawable.Icon iconOff;
    @org.jetbrains.annotations.Nullable()
    private android.graphics.drawable.Icon iconOn;
    @org.jetbrains.annotations.Nullable()
    private com.wireguard.android.model.ObservableTunnel tunnel;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = "WireGuard/QuickTileService";
    private static boolean isAdded = false;
    @org.jetbrains.annotations.NotNull()
    public static final com.wireguard.android.QuickTileService.Companion Companion = null;
    
    public QuickTileService() {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public android.os.IBinder onBind(@org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
        return null;
    }
    
    @java.lang.Override()
    public void onClick() {
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @java.lang.Override()
    public void onStartListening() {
    }
    
    @java.lang.Override()
    public void onStopListening() {
    }
    
    @java.lang.Override()
    public void onTileAdded() {
    }
    
    @java.lang.Override()
    public void onTileRemoved() {
    }
    
    private final void updateTile() {
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/wireguard/android/QuickTileService$Companion;", "", "<init>", "()V", "TAG", "", "value", "", "isAdded", "()Z", "ui_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final boolean isAdded() {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016\u00a8\u0006\n"}, d2 = {"Lcom/wireguard/android/QuickTileService$OnStateChangedCallback;", "Landroidx/databinding/Observable$OnPropertyChangedCallback;", "<init>", "(Lcom/wireguard/android/QuickTileService;)V", "onPropertyChanged", "", "sender", "Landroidx/databinding/Observable;", "propertyId", "", "ui_release"})
    final class OnStateChangedCallback extends androidx.databinding.Observable.OnPropertyChangedCallback {
        
        public OnStateChangedCallback() {
            super();
        }
        
        @java.lang.Override()
        public void onPropertyChanged(@org.jetbrains.annotations.NotNull()
        androidx.databinding.Observable sender, int propertyId) {
        }
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016\u00a8\u0006\n"}, d2 = {"Lcom/wireguard/android/QuickTileService$OnTunnelChangedCallback;", "Landroidx/databinding/Observable$OnPropertyChangedCallback;", "<init>", "(Lcom/wireguard/android/QuickTileService;)V", "onPropertyChanged", "", "sender", "Landroidx/databinding/Observable;", "propertyId", "", "ui_release"})
    final class OnTunnelChangedCallback extends androidx.databinding.Observable.OnPropertyChangedCallback {
        
        public OnTunnelChangedCallback() {
            super();
        }
        
        @java.lang.Override()
        public void onPropertyChanged(@org.jetbrains.annotations.NotNull()
        androidx.databinding.Observable sender, int propertyId) {
        }
    }
}