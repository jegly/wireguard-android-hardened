package com.wireguard.android.util;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u000bH\u0086@\u00a2\u0006\u0002\u0010\rJ*\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u000bJ8\u0010\u0012\u001a\u00020\u00052\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u000bH\u0002R\u000e\u0010\u0019\u001a\u00020\u0011X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/wireguard/android/util/TunnelImporter;", "", "<init>", "()V", "importTunnel", "", "contentResolver", "Landroid/content/ContentResolver;", "uri", "Landroid/net/Uri;", "messageCallback", "Lkotlin/Function1;", "", "(Landroid/content/ContentResolver;Landroid/net/Uri;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "parentFragmentManager", "Landroidx/fragment/app/FragmentManager;", "configText", "", "onTunnelImportFinished", "tunnels", "", "Lcom/wireguard/android/model/ObservableTunnel;", "throwables", "", "", "TAG", "ui_release"})
public final class TunnelImporter {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = "WireGuard/TunnelImporter";
    @org.jetbrains.annotations.NotNull()
    public static final com.wireguard.android.util.TunnelImporter INSTANCE = null;
    
    private TunnelImporter() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object importTunnel(@org.jetbrains.annotations.NotNull()
    android.content.ContentResolver contentResolver, @org.jetbrains.annotations.NotNull()
    android.net.Uri uri, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.CharSequence, kotlin.Unit> messageCallback, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    public final void importTunnel(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager parentFragmentManager, @org.jetbrains.annotations.NotNull()
    java.lang.String configText, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.CharSequence, kotlin.Unit> messageCallback) {
    }
    
    private final void onTunnelImportFinished(java.util.List<com.wireguard.android.model.ObservableTunnel> tunnels, java.util.Collection<? extends java.lang.Throwable> throwables, kotlin.jvm.functions.Function1<? super java.lang.CharSequence, kotlin.Unit> messageCallback) {
    }
}