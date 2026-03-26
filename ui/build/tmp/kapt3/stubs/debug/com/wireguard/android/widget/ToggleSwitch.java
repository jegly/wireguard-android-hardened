package com.wireguard.android.widget;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0014B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\tH\u0016J\u000e\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\tJ\u0010\u0010\u0013\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\u000bR\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/wireguard/android/widget/ToggleSwitch;", "Lcom/google/android/material/materialswitch/MaterialSwitch;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "isRestoringState", "", "listener", "Lcom/wireguard/android/widget/ToggleSwitch$OnBeforeCheckedChangeListener;", "onRestoreInstanceState", "", "state", "Landroid/os/Parcelable;", "setChecked", "checked", "setCheckedInternal", "setOnBeforeCheckedChangeListener", "OnBeforeCheckedChangeListener", "ui_debug"})
public final class ToggleSwitch extends com.google.android.material.materialswitch.MaterialSwitch {
    private boolean isRestoringState = false;
    @org.jetbrains.annotations.Nullable()
    private com.wireguard.android.widget.ToggleSwitch.OnBeforeCheckedChangeListener listener;
    
    @kotlin.jvm.JvmOverloads()
    public ToggleSwitch(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public ToggleSwitch(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @java.lang.Override()
    public void onRestoreInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Parcelable state) {
    }
    
    @java.lang.Override()
    public void setChecked(boolean checked) {
    }
    
    public final void setCheckedInternal(boolean checked) {
    }
    
    public final void setOnBeforeCheckedChangeListener(@org.jetbrains.annotations.Nullable()
    com.wireguard.android.widget.ToggleSwitch.OnBeforeCheckedChangeListener listener) {
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b\u00c0\u0006\u0003"}, d2 = {"Lcom/wireguard/android/widget/ToggleSwitch$OnBeforeCheckedChangeListener;", "", "onBeforeCheckedChanged", "", "toggleSwitch", "Lcom/wireguard/android/widget/ToggleSwitch;", "checked", "", "ui_debug"})
    public static abstract interface OnBeforeCheckedChangeListener {
        
        public abstract void onBeforeCheckedChanged(@org.jetbrains.annotations.Nullable()
        com.wireguard.android.widget.ToggleSwitch toggleSwitch, boolean checked);
    }
}