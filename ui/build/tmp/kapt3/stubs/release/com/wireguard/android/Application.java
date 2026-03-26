package com.wireguard.android;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0014J\u000e\u0010\u0017\u001a\u00020\u0006H\u0082@\u00a2\u0006\u0002\u0010\u0018J\b\u0010\u0019\u001a\u00020\u0014H\u0016J\b\u0010\u001a\u001a\u00020\u0014H\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/wireguard/android/Application;", "Landroid/app/Application;", "<init>", "()V", "futureBackend", "Lkotlinx/coroutines/CompletableDeferred;", "Lcom/wireguard/android/backend/Backend;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "backend", "rootShell", "Lcom/wireguard/android/util/RootShell;", "preferencesDataStore", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "toolsInstaller", "Lcom/wireguard/android/util/ToolsInstaller;", "tunnelManager", "Lcom/wireguard/android/model/TunnelManager;", "attachBaseContext", "", "context", "Landroid/content/Context;", "determineBackend", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onCreate", "onTerminate", "Companion", "ui_release"})
public final class Application extends android.app.Application {
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CompletableDeferred<com.wireguard.android.backend.Backend> futureBackend = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineScope coroutineScope = null;
    @org.jetbrains.annotations.Nullable()
    private com.wireguard.android.backend.Backend backend;
    private com.wireguard.android.util.RootShell rootShell;
    private androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> preferencesDataStore;
    private com.wireguard.android.util.ToolsInstaller toolsInstaller;
    private com.wireguard.android.model.TunnelManager tunnelManager;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = "WireGuard/Application";
    private static java.lang.ref.WeakReference<com.wireguard.android.Application> weakSelf;
    @org.jetbrains.annotations.NotNull()
    public static final com.wireguard.android.Application.Companion Companion = null;
    
    public Application() {
        super();
    }
    
    @java.lang.Override()
    protected void attachBaseContext(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    private final java.lang.Object determineBackend(kotlin.coroutines.Continuation<? super com.wireguard.android.backend.Backend> $completion) {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @java.lang.Override()
    public void onTerminate() {
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\n\u001a\u00020\u000bH\u0086@\u00a2\u0006\u0002\u0010\fJ\u0006\u0010\r\u001a\u00020\u000eJ\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010J\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/wireguard/android/Application$Companion;", "", "<init>", "()V", "TAG", "", "weakSelf", "Ljava/lang/ref/WeakReference;", "Lcom/wireguard/android/Application;", "get", "getBackend", "Lcom/wireguard/android/backend/Backend;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRootShell", "Lcom/wireguard/android/util/RootShell;", "getPreferencesDataStore", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "getToolsInstaller", "Lcom/wireguard/android/util/ToolsInstaller;", "getTunnelManager", "Lcom/wireguard/android/model/TunnelManager;", "getCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "ui_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.wireguard.android.Application get() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getBackend(@org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super com.wireguard.android.backend.Backend> $completion) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.wireguard.android.util.RootShell getRootShell() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> getPreferencesDataStore() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.wireguard.android.util.ToolsInstaller getToolsInstaller() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.wireguard.android.model.TunnelManager getTunnelManager() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlinx.coroutines.CoroutineScope getCoroutineScope() {
            return null;
        }
    }
}