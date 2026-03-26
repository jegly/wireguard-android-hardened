package com.wireguard.android.util;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J*\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0086@\u00a2\u0006\u0002\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/wireguard/android/util/DownloadsFileSaver;", "", "context", "Landroidx/activity/ComponentActivity;", "<init>", "(Landroidx/activity/ComponentActivity;)V", "activityResult", "Landroidx/activity/result/ActivityResultLauncher;", "", "futureGrant", "Lkotlinx/coroutines/CompletableDeferred;", "", "save", "Lcom/wireguard/android/util/DownloadsFileSaver$DownloadsFile;", "name", "mimeType", "overwriteExisting", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "DownloadsFile", "ui_debug"})
public final class DownloadsFileSaver {
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.ComponentActivity context = null;
    private androidx.activity.result.ActivityResultLauncher<java.lang.String> activityResult;
    private kotlinx.coroutines.CompletableDeferred<java.lang.Boolean> futureGrant;
    
    public DownloadsFileSaver(@org.jetbrains.annotations.NotNull()
    androidx.activity.ComponentActivity context) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object save(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String mimeType, boolean overwriteExisting, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.wireguard.android.util.DownloadsFileSaver.DownloadsFile> $completion) {
        return null;
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0010\u001a\u00020\u0001H\u0086@\u00a2\u0006\u0002\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/wireguard/android/util/DownloadsFileSaver$DownloadsFile;", "", "context", "Landroid/content/Context;", "outputStream", "Ljava/io/OutputStream;", "fileName", "", "uri", "Landroid/net/Uri;", "<init>", "(Landroid/content/Context;Ljava/io/OutputStream;Ljava/lang/String;Landroid/net/Uri;)V", "getOutputStream", "()Ljava/io/OutputStream;", "getFileName", "()Ljava/lang/String;", "delete", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ui_debug"})
    public static final class DownloadsFile {
        @org.jetbrains.annotations.NotNull()
        private final android.content.Context context = null;
        @org.jetbrains.annotations.NotNull()
        private final java.io.OutputStream outputStream = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String fileName = null;
        @org.jetbrains.annotations.Nullable()
        private final android.net.Uri uri = null;
        
        public DownloadsFile(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.io.OutputStream outputStream, @org.jetbrains.annotations.NotNull()
        java.lang.String fileName, @org.jetbrains.annotations.Nullable()
        android.net.Uri uri) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.io.OutputStream getOutputStream() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFileName() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object delete(@org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<java.lang.Object> $completion) {
            return null;
        }
    }
}