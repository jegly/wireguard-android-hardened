package com.wireguard.android.preference;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J$\u0010\u000e\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0010\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u0010H\u0016J\u001a\u0010\u0011\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u0012H\u0016J\u001a\u0010\u0013\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u0014H\u0016J\u001a\u0010\u0015\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u0016H\u0016J\u001a\u0010\u0017\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u0018H\u0016J\u001e\u0010\u0019\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\fH\u0016J.\u0010\u001b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u00102\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0010\u0010\u001c\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u0010H\u0016J\u001a\u0010\u001d\u001a\u00020\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\u001a\u001a\u00020\u0012H\u0016J\u001a\u0010\u001e\u001a\u00020\u00142\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\u001a\u001a\u00020\u0014H\u0016J\u001a\u0010\u001f\u001a\u00020\u00162\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\u001a\u001a\u00020\u0016H\u0016J\u001a\u0010 \u001a\u00020\u00182\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\u001a\u001a\u00020\u0018H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/wireguard/android/preference/PreferencesPreferenceDataStore;", "Landroidx/preference/PreferenceDataStore;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "dataStore", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Landroidx/datastore/core/DataStore;)V", "putString", "", "key", "", "value", "putStringSet", "values", "", "putInt", "", "putLong", "", "putFloat", "", "putBoolean", "", "getString", "defValue", "getStringSet", "defValues", "getInt", "getLong", "getFloat", "getBoolean", "ui_release"})
public final class PreferencesPreferenceDataStore extends androidx.preference.PreferenceDataStore {
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineScope coroutineScope = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> dataStore = null;
    
    public PreferencesPreferenceDataStore(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope coroutineScope, @org.jetbrains.annotations.NotNull()
    androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> dataStore) {
        super();
    }
    
    @java.lang.Override()
    public void putString(@org.jetbrains.annotations.Nullable()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    @java.lang.Override()
    public void putStringSet(@org.jetbrains.annotations.Nullable()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    java.util.Set<java.lang.String> values) {
    }
    
    @java.lang.Override()
    public void putInt(@org.jetbrains.annotations.Nullable()
    java.lang.String key, int value) {
    }
    
    @java.lang.Override()
    public void putLong(@org.jetbrains.annotations.Nullable()
    java.lang.String key, long value) {
    }
    
    @java.lang.Override()
    public void putFloat(@org.jetbrains.annotations.Nullable()
    java.lang.String key, float value) {
    }
    
    @java.lang.Override()
    public void putBoolean(@org.jetbrains.annotations.Nullable()
    java.lang.String key, boolean value) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.String getString(@org.jetbrains.annotations.Nullable()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    java.lang.String defValue) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.util.Set<java.lang.String> getStringSet(@org.jetbrains.annotations.Nullable()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    java.util.Set<java.lang.String> defValues) {
        return null;
    }
    
    @java.lang.Override()
    public int getInt(@org.jetbrains.annotations.Nullable()
    java.lang.String key, int defValue) {
        return 0;
    }
    
    @java.lang.Override()
    public long getLong(@org.jetbrains.annotations.Nullable()
    java.lang.String key, long defValue) {
        return 0L;
    }
    
    @java.lang.Override()
    public float getFloat(@org.jetbrains.annotations.Nullable()
    java.lang.String key, float defValue) {
        return 0.0F;
    }
    
    @java.lang.Override()
    public boolean getBoolean(@org.jetbrains.annotations.Nullable()
    java.lang.String key, boolean defValue) {
        return false;
    }
}