package com.wireguard.android.fragment;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000  2\u00020\u0001:\u0001 B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u0012\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J)\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\t2\u0006\u0010\u0017\u001a\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u001aH\u0002\u00a2\u0006\u0002\u0010\u001bJ\b\u0010\u001c\u001a\u00020\u0011H\u0002J\u0012\u0010\u001d\u001a\u00020\u001e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u001f\u001a\u00020\u0011H\u0002R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/wireguard/android/fragment/AppListDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "<init>", "()V", "appData", "Lcom/wireguard/android/databinding/ObservableKeyedArrayList;", "", "Lcom/wireguard/android/model/ApplicationData;", "currentlySelectedApps", "", "initiallyExcluded", "", "button", "Landroid/widget/Button;", "tabs", "Lcom/google/android/material/tabs/TabLayout;", "loadData", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "getPackagesHoldingPermissions", "Landroid/content/pm/PackageInfo;", "pm", "Landroid/content/pm/PackageManager;", "permissions", "", "(Landroid/content/pm/PackageManager;[Ljava/lang/String;)Ljava/util/List;", "setButtonText", "onCreateDialog", "Landroid/app/Dialog;", "setSelectionAndDismiss", "Companion", "ui_release"})
public final class AppListDialogFragment extends androidx.fragment.app.DialogFragment {
    @org.jetbrains.annotations.NotNull()
    private final com.wireguard.android.databinding.ObservableKeyedArrayList<java.lang.String, com.wireguard.android.model.ApplicationData> appData = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<java.lang.String> currentlySelectedApps;
    private boolean initiallyExcluded = false;
    @org.jetbrains.annotations.Nullable()
    private android.widget.Button button;
    @org.jetbrains.annotations.Nullable()
    private com.google.android.material.tabs.TabLayout tabs;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_SELECTED_APPS = "selected_apps";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_IS_EXCLUDED = "is_excluded";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String REQUEST_SELECTION = "request_selection";
    @org.jetbrains.annotations.NotNull()
    public static final com.wireguard.android.fragment.AppListDialogFragment.Companion Companion = null;
    
    public AppListDialogFragment() {
        super();
    }
    
    private final void loadData() {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final java.util.List<android.content.pm.PackageInfo> getPackagesHoldingPermissions(android.content.pm.PackageManager pm, java.lang.String[] permissions) {
        return null;
    }
    
    private final void setButtonText() {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void setSelectionAndDismiss() {
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J.\u0010\b\u001a\u00020\t2\u001e\u0010\n\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u000bj\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u0001`\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/wireguard/android/fragment/AppListDialogFragment$Companion;", "", "<init>", "()V", "KEY_SELECTED_APPS", "", "KEY_IS_EXCLUDED", "REQUEST_SELECTION", "newInstance", "Lcom/wireguard/android/fragment/AppListDialogFragment;", "selectedApps", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "isExcluded", "", "ui_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.wireguard.android.fragment.AppListDialogFragment newInstance(@org.jetbrains.annotations.Nullable()
        java.util.ArrayList<java.lang.String> selectedApps, boolean isExcluded) {
            return null;
        }
    }
}