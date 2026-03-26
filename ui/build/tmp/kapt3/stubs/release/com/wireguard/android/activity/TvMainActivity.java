package com.wireguard.android.activity;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 ,2\u00020\u0001:\u0003*+,B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tH\u0002J\u0012\u0010\u0019\u001a\u00020\r2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014J\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00150 H\u0082@\u00a2\u0006\u0002\u0010\"J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001dH\u0002J\u0010\u0010&\u001a\u00020\r2\u0006\u0010\'\u001a\u00020\u001dH\u0002J\b\u0010(\u001a\u00020\rH\u0002J\u000e\u0010)\u001a\u00020\rH\u0082@\u00a2\u0006\u0002\u0010\"R\u001a\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0016\u001a\u0010\u0012\f\u0012\n \u0018*\u0004\u0018\u00010\u00070\u00070\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010 X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lcom/wireguard/android/activity/TvMainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "tunnelFileImportResultLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "", "", "pendingTunnel", "Lcom/wireguard/android/model/ObservableTunnel;", "permissionActivityResultLauncher", "Landroid/content/Intent;", "setTunnelStateWithPermissionsResult", "", "tunnel", "binding", "Lcom/wireguard/android/databinding/TvActivityBinding;", "isDeleting", "Landroidx/databinding/ObservableBoolean;", "files", "Lcom/wireguard/android/databinding/ObservableKeyedArrayList;", "Lcom/wireguard/android/activity/TvMainActivity$KeyedFile;", "filesRoot", "Landroidx/databinding/ObservableField;", "kotlin.jvm.PlatformType", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "pendingNavigation", "Ljava/io/File;", "permissionRequestPermissionLauncher", "cachedRoots", "", "makeStorageRoots", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isBelowCachedRoots", "", "maybeChild", "navigateTo", "directory", "handleBackPressed", "updateStats", "KeyedFile", "SlatedSpanSizeLookup", "Companion", "ui_release"})
public final class TvMainActivity extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<java.lang.String[]> tunnelFileImportResultLauncher = null;
    @org.jetbrains.annotations.Nullable()
    private com.wireguard.android.model.ObservableTunnel pendingTunnel;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> permissionActivityResultLauncher = null;
    private com.wireguard.android.databinding.TvActivityBinding binding;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableBoolean isDeleting = null;
    @org.jetbrains.annotations.NotNull()
    private final com.wireguard.android.databinding.ObservableKeyedArrayList<java.lang.String, com.wireguard.android.activity.TvMainActivity.KeyedFile> files = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableField<java.lang.String> filesRoot = null;
    @org.jetbrains.annotations.Nullable()
    private java.io.File pendingNavigation;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<java.lang.String> permissionRequestPermissionLauncher = null;
    @org.jetbrains.annotations.Nullable()
    private java.util.Collection<com.wireguard.android.activity.TvMainActivity.KeyedFile> cachedRoots;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = "WireGuard/TvMainActivity";
    @org.jetbrains.annotations.NotNull()
    public static final com.wireguard.android.activity.TvMainActivity.Companion Companion = null;
    
    public TvMainActivity() {
        super();
    }
    
    private final void setTunnelStateWithPermissionsResult(com.wireguard.android.model.ObservableTunnel tunnel) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final java.lang.Object makeStorageRoots(kotlin.coroutines.Continuation<? super java.util.Collection<com.wireguard.android.activity.TvMainActivity.KeyedFile>> $completion) {
        return null;
    }
    
    private final boolean isBelowCachedRoots(java.io.File maybeChild) {
        return false;
    }
    
    private final void navigateTo(java.io.File directory) {
    }
    
    private final void handleBackPressed() {
    }
    
    private final java.lang.Object updateStats(kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/wireguard/android/activity/TvMainActivity$Companion;", "", "<init>", "()V", "TAG", "", "ui_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0002X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u00028VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\r"}, d2 = {"Lcom/wireguard/android/activity/TvMainActivity$KeyedFile;", "Lcom/wireguard/android/databinding/Keyed;", "", "file", "Ljava/io/File;", "forcedKey", "<init>", "(Ljava/io/File;Ljava/lang/String;)V", "getFile", "()Ljava/io/File;", "key", "getKey", "()Ljava/lang/String;", "ui_release"})
    public static final class KeyedFile implements com.wireguard.android.databinding.Keyed<java.lang.String> {
        @org.jetbrains.annotations.NotNull()
        private final java.io.File file = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String forcedKey = null;
        
        public KeyedFile(@org.jetbrains.annotations.NotNull()
        java.io.File file, @org.jetbrains.annotations.Nullable()
        java.lang.String forcedKey) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.io.File getFile() {
            return null;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String getKey() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0015\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007H\u0002J\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0018\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nX\u0082.\u00a2\u0006\u0004\n\u0002\u0010\f\u00a8\u0006\u0012"}, d2 = {"Lcom/wireguard/android/activity/TvMainActivity$SlatedSpanSizeLookup;", "Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;", "gridManager", "Landroidx/recyclerview/widget/GridLayoutManager;", "<init>", "(Landroidx/recyclerview/widget/GridLayoutManager;)V", "originalHeight", "", "newWidth", "sizeMap", "", "", "[[I", "emptyUnderIndex", "index", "size", "getSpanSize", "position", "ui_release"})
    static final class SlatedSpanSizeLookup extends androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup {
        @org.jetbrains.annotations.NotNull()
        private final androidx.recyclerview.widget.GridLayoutManager gridManager = null;
        private final int originalHeight = 0;
        private int newWidth = 0;
        private int[][] sizeMap;
        
        public SlatedSpanSizeLookup(@org.jetbrains.annotations.NotNull()
        androidx.recyclerview.widget.GridLayoutManager gridManager) {
            super();
        }
        
        private final int emptyUnderIndex(int index, int size) {
            return 0;
        }
        
        @java.lang.Override()
        public int getSpanSize(int position) {
            return 0;
        }
    }
}