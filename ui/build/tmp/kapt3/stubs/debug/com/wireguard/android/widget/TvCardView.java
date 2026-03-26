package com.wireguard.android.widget;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0014R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u000e\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\r\u00a8\u0006\u0015"}, d2 = {"Lcom/wireguard/android/widget/TvCardView;", "Lcom/google/android/material/card/MaterialCardView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "value", "", "isUp", "()Z", "setUp", "(Z)V", "isDeleting", "setDeleting", "onCreateDrawableState", "", "extraSpace", "", "Companion", "ui_debug"})
public final class TvCardView extends com.google.android.material.card.MaterialCardView {
    private boolean isUp = false;
    private boolean isDeleting = false;
    @org.jetbrains.annotations.NotNull()
    private static final int[] STATE_IS_UP = {2130969757};
    @org.jetbrains.annotations.NotNull()
    private static final int[] STATE_IS_DELETING = {2130969756};
    @org.jetbrains.annotations.NotNull()
    public static final com.wireguard.android.widget.TvCardView.Companion Companion = null;
    
    public TvCardView(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public final boolean isUp() {
        return false;
    }
    
    public final void setUp(boolean value) {
    }
    
    public final boolean isDeleting() {
        return false;
    }
    
    public final void setDeleting(boolean value) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    protected int[] onCreateDrawableState(int extraSpace) {
        return null;
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/wireguard/android/widget/TvCardView$Companion;", "", "<init>", "()V", "STATE_IS_UP", "", "STATE_IS_DELETING", "ui_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}