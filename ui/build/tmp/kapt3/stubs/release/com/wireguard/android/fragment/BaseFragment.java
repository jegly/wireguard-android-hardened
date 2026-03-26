package com.wireguard.android.fragment;

/**
 * Base class for fragments that need to know the currently-selected tunnel. Only does anything when
 * attached to a `BaseActivity`.
 */
@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 \u001e2\u00020\u00012\u00020\u0002:\u0001\u001eB\u0007\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0015H\u0016J\u0016\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\bJ\u0018\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\bH\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\tR\u001c\u0010\n\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\u000f\u001a\u0004\u0018\u00010\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u00068D@DX\u0084\u000e\u00a2\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\u001f"}, d2 = {"Lcom/wireguard/android/fragment/BaseFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/wireguard/android/activity/BaseActivity$OnSelectedTunnelChangedListener;", "<init>", "()V", "pendingTunnel", "Lcom/wireguard/android/model/ObservableTunnel;", "pendingTunnelUp", "", "Ljava/lang/Boolean;", "permissionActivityResultLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "tunnel", "selectedTunnel", "getSelectedTunnel", "()Lcom/wireguard/android/model/ObservableTunnel;", "setSelectedTunnel", "(Lcom/wireguard/android/model/ObservableTunnel;)V", "onAttach", "", "context", "Landroid/content/Context;", "onDetach", "setTunnelState", "view", "Landroid/view/View;", "checked", "setTunnelStateWithPermissionsResult", "Companion", "ui_release"})
public abstract class BaseFragment extends androidx.fragment.app.Fragment implements com.wireguard.android.activity.BaseActivity.OnSelectedTunnelChangedListener {
    @org.jetbrains.annotations.Nullable()
    private com.wireguard.android.model.ObservableTunnel pendingTunnel;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean pendingTunnelUp;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> permissionActivityResultLauncher = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = "WireGuard/BaseFragment";
    @org.jetbrains.annotations.NotNull()
    public static final com.wireguard.android.fragment.BaseFragment.Companion Companion = null;
    
    public BaseFragment() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final com.wireguard.android.model.ObservableTunnel getSelectedTunnel() {
        return null;
    }
    
    protected final void setSelectedTunnel(@org.jetbrains.annotations.Nullable()
    com.wireguard.android.model.ObservableTunnel tunnel) {
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @java.lang.Override()
    public void onDetach() {
    }
    
    public final void setTunnelState(@org.jetbrains.annotations.NotNull()
    android.view.View view, boolean checked) {
    }
    
    private final void setTunnelStateWithPermissionsResult(com.wireguard.android.model.ObservableTunnel tunnel, boolean checked) {
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/wireguard/android/fragment/BaseFragment$Companion;", "", "<init>", "()V", "TAG", "", "ui_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}