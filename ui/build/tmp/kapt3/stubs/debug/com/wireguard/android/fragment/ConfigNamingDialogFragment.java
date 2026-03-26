package com.wireguard.android.fragment;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0002J\u0012\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/wireguard/android/fragment/ConfigNamingDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "<init>", "()V", "binding", "Lcom/wireguard/android/databinding/ConfigNamingDialogFragmentBinding;", "config", "Lcom/wireguard/config/Config;", "createTunnelAndDismiss", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateDialog", "Landroid/app/Dialog;", "Companion", "ui_debug"})
public final class ConfigNamingDialogFragment extends androidx.fragment.app.DialogFragment {
    @org.jetbrains.annotations.Nullable()
    private com.wireguard.android.databinding.ConfigNamingDialogFragmentBinding binding;
    @org.jetbrains.annotations.Nullable()
    private com.wireguard.config.Config config;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String KEY_CONFIG_TEXT = "config_text";
    @org.jetbrains.annotations.NotNull()
    public static final com.wireguard.android.fragment.ConfigNamingDialogFragment.Companion Companion = null;
    
    public ConfigNamingDialogFragment() {
        super();
    }
    
    private final void createTunnelAndDismiss() {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/wireguard/android/fragment/ConfigNamingDialogFragment$Companion;", "", "<init>", "()V", "KEY_CONFIG_TEXT", "", "newInstance", "Lcom/wireguard/android/fragment/ConfigNamingDialogFragment;", "configText", "ui_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.wireguard.android.fragment.ConfigNamingDialogFragment newInstance(@org.jetbrains.annotations.Nullable()
        java.lang.String configText) {
            return null;
        }
    }
}