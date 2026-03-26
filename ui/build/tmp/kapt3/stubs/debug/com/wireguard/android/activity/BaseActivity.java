package com.wireguard.android.activity;

/**
 * Base class for activities that need to remember the currently-selected tunnel.
 */
@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b&\u0018\u0000 \u001f2\u00020\u0001:\u0004\u001c\u001d\u001e\u001fB\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0012\u0010\u0013\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\u0010\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0015H\u0014J\u001c\u0010\u0018\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\tH$J\u000e\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R(\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\t@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006 "}, d2 = {"Lcom/wireguard/android/activity/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "selectionChangeRegistry", "Lcom/wireguard/android/activity/BaseActivity$SelectionChangeRegistry;", "created", "", "value", "Lcom/wireguard/android/model/ObservableTunnel;", "selectedTunnel", "getSelectedTunnel", "()Lcom/wireguard/android/model/ObservableTunnel;", "setSelectedTunnel", "(Lcom/wireguard/android/model/ObservableTunnel;)V", "addOnSelectedTunnelChangedListener", "", "listener", "Lcom/wireguard/android/activity/BaseActivity$OnSelectedTunnelChangedListener;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onSaveInstanceState", "outState", "onSelectedTunnelChanged", "oldTunnel", "newTunnel", "removeOnSelectedTunnelChangedListener", "OnSelectedTunnelChangedListener", "SelectionChangeNotifier", "SelectionChangeRegistry", "Companion", "ui_debug"})
public abstract class BaseActivity extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    private final com.wireguard.android.activity.BaseActivity.SelectionChangeRegistry selectionChangeRegistry = null;
    private boolean created = false;
    @org.jetbrains.annotations.Nullable()
    private com.wireguard.android.model.ObservableTunnel selectedTunnel;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String KEY_SELECTED_TUNNEL = "selected_tunnel";
    @org.jetbrains.annotations.NotNull()
    public static final com.wireguard.android.activity.BaseActivity.Companion Companion = null;
    
    public BaseActivity() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.wireguard.android.model.ObservableTunnel getSelectedTunnel() {
        return null;
    }
    
    public final void setSelectedTunnel(@org.jetbrains.annotations.Nullable()
    com.wireguard.android.model.ObservableTunnel value) {
    }
    
    public final void addOnSelectedTunnelChangedListener(@org.jetbrains.annotations.NotNull()
    com.wireguard.android.activity.BaseActivity.OnSelectedTunnelChangedListener listener) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    protected abstract boolean onSelectedTunnelChanged(@org.jetbrains.annotations.Nullable()
    com.wireguard.android.model.ObservableTunnel oldTunnel, @org.jetbrains.annotations.Nullable()
    com.wireguard.android.model.ObservableTunnel newTunnel);
    
    public final void removeOnSelectedTunnelChangedListener(@org.jetbrains.annotations.NotNull()
    com.wireguard.android.activity.BaseActivity.OnSelectedTunnelChangedListener listener) {
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/wireguard/android/activity/BaseActivity$Companion;", "", "<init>", "()V", "KEY_SELECTED_TUNNEL", "", "ui_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&\u00a8\u0006\u0007\u00c0\u0006\u0003"}, d2 = {"Lcom/wireguard/android/activity/BaseActivity$OnSelectedTunnelChangedListener;", "", "onSelectedTunnelChanged", "", "oldTunnel", "Lcom/wireguard/android/model/ObservableTunnel;", "newTunnel", "ui_debug"})
    public static abstract interface OnSelectedTunnelChangedListener {
        
        public abstract void onSelectedTunnelChanged(@org.jetbrains.annotations.Nullable()
        com.wireguard.android.model.ObservableTunnel oldTunnel, @org.jetbrains.annotations.Nullable()
        com.wireguard.android.model.ObservableTunnel newTunnel);
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\u00a2\u0006\u0004\b\u0004\u0010\u0005J,\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0003H\u0016\u00a8\u0006\r"}, d2 = {"Lcom/wireguard/android/activity/BaseActivity$SelectionChangeNotifier;", "Landroidx/databinding/CallbackRegistry$NotifierCallback;", "Lcom/wireguard/android/activity/BaseActivity$OnSelectedTunnelChangedListener;", "Lcom/wireguard/android/model/ObservableTunnel;", "<init>", "()V", "onNotifyCallback", "", "listener", "oldTunnel", "ignored", "", "newTunnel", "ui_debug"})
    static final class SelectionChangeNotifier extends androidx.databinding.CallbackRegistry.NotifierCallback<com.wireguard.android.activity.BaseActivity.OnSelectedTunnelChangedListener, com.wireguard.android.model.ObservableTunnel, com.wireguard.android.model.ObservableTunnel> {
        
        public SelectionChangeNotifier() {
            super();
        }
        
        @java.lang.Override()
        public void onNotifyCallback(@org.jetbrains.annotations.NotNull()
        com.wireguard.android.activity.BaseActivity.OnSelectedTunnelChangedListener listener, @org.jetbrains.annotations.Nullable()
        com.wireguard.android.model.ObservableTunnel oldTunnel, int ignored, @org.jetbrains.annotations.Nullable()
        com.wireguard.android.model.ObservableTunnel newTunnel) {
        }
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\u00a2\u0006\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/wireguard/android/activity/BaseActivity$SelectionChangeRegistry;", "Landroidx/databinding/CallbackRegistry;", "Lcom/wireguard/android/activity/BaseActivity$OnSelectedTunnelChangedListener;", "Lcom/wireguard/android/model/ObservableTunnel;", "<init>", "()V", "ui_debug"})
    static final class SelectionChangeRegistry extends androidx.databinding.CallbackRegistry<com.wireguard.android.activity.BaseActivity.OnSelectedTunnelChangedListener, com.wireguard.android.model.ObservableTunnel, com.wireguard.android.model.ObservableTunnel> {
        
        public SelectionChangeRegistry() {
            super(null);
        }
    }
}