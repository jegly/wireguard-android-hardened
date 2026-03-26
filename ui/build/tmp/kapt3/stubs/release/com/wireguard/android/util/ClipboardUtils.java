package com.wireguard.android.util;

/**
 * Standalone utilities for interacting with the system clipboard.
 * All clips are marked as sensitive so Android 13+ excludes them from clipboard history
 * and third-party apps cannot read them via getPrimaryClip() notifications.
 */
@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007\u00a8\u0006\b"}, d2 = {"Lcom/wireguard/android/util/ClipboardUtils;", "", "<init>", "()V", "copyTextView", "", "view", "Landroid/view/View;", "ui_release"})
public final class ClipboardUtils {
    @org.jetbrains.annotations.NotNull()
    public static final com.wireguard.android.util.ClipboardUtils INSTANCE = null;
    
    private ClipboardUtils() {
        super();
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void copyTextView(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
}