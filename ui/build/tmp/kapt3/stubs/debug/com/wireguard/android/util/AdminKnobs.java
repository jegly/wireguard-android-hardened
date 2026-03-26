package com.wireguard.android.util;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/wireguard/android/util/AdminKnobs;", "", "<init>", "()V", "restrictions", "Landroid/content/RestrictionsManager;", "disableConfigExport", "", "getDisableConfigExport", "()Z", "ui_debug"})
public final class AdminKnobs {
    @org.jetbrains.annotations.Nullable()
    private static final android.content.RestrictionsManager restrictions = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.wireguard.android.util.AdminKnobs INSTANCE = null;
    
    private AdminKnobs() {
        super();
    }
    
    public final boolean getDisableConfigExport() {
        return false;
    }
}