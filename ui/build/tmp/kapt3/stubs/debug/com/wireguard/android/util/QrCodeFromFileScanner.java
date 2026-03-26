package com.wireguard.android.util;

/**
 * Encapsulates the logic of scanning a barcode from a file,
 * @property contentResolver - Resolver to read the incoming data
 * @property reader - An instance of zxing's [Reader] class to parse the image
 */
@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0016\u0010\u000f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0086@\u00a2\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/wireguard/android/util/QrCodeFromFileScanner;", "", "contentResolver", "Landroid/content/ContentResolver;", "reader", "Lcom/google/zxing/Reader;", "<init>", "(Landroid/content/ContentResolver;Lcom/google/zxing/Reader;)V", "scanBitmapForResult", "Lcom/google/zxing/Result;", "source", "Landroid/graphics/Bitmap;", "doScan", "data", "Landroid/net/Uri;", "scan", "(Landroid/net/Uri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "ui_debug"})
public final class QrCodeFromFileScanner {
    @org.jetbrains.annotations.NotNull()
    private final android.content.ContentResolver contentResolver = null;
    @org.jetbrains.annotations.NotNull()
    private final com.google.zxing.Reader reader = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = "QrCodeFromFileScanner";
    @org.jetbrains.annotations.NotNull()
    public static final com.wireguard.android.util.QrCodeFromFileScanner.Companion Companion = null;
    
    public QrCodeFromFileScanner(@org.jetbrains.annotations.NotNull()
    android.content.ContentResolver contentResolver, @org.jetbrains.annotations.NotNull()
    com.google.zxing.Reader reader) {
        super();
    }
    
    private final com.google.zxing.Result scanBitmapForResult(android.graphics.Bitmap source) {
        return null;
    }
    
    private final com.google.zxing.Result doScan(android.net.Uri data) {
        return null;
    }
    
    /**
     * Attempts to parse incoming data
     * @return result of the decoding operation
     * @throws NotFoundException when parser didn't find QR code in the image
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object scan(@org.jetbrains.annotations.NotNull()
    android.net.Uri data, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.google.zxing.Result> $completion) {
        return null;
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/wireguard/android/util/QrCodeFromFileScanner$Companion;", "", "<init>", "()V", "TAG", "", "validContentType", "", "contentResolver", "Landroid/content/ContentResolver;", "data", "Landroid/net/Uri;", "ui_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Given a reference to a file, check if this file could be parsed by this class
         * @return true if the file can be parsed, false if not
         */
        public final boolean validContentType(@org.jetbrains.annotations.NotNull()
        android.content.ContentResolver contentResolver, @org.jetbrains.annotations.NotNull()
        android.net.Uri data) {
            return false;
        }
    }
}