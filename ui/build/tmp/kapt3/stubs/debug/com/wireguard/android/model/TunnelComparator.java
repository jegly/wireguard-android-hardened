package com.wireguard.android.model;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001\nB\t\b\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0016\u00a8\u0006\u000b"}, d2 = {"Lcom/wireguard/android/model/TunnelComparator;", "Ljava/util/Comparator;", "", "Lkotlin/Comparator;", "<init>", "()V", "compare", "", "a", "b", "NaturalSortString", "ui_debug"})
public final class TunnelComparator implements java.util.Comparator<java.lang.String> {
    @org.jetbrains.annotations.NotNull()
    public static final com.wireguard.android.model.TunnelComparator INSTANCE = null;
    
    private TunnelComparator() {
        super();
    }
    
    @java.lang.Override()
    public int compare(@org.jetbrains.annotations.NotNull()
    java.lang.String a, @org.jetbrains.annotations.NotNull()
    java.lang.String b) {
        return 0;
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000 \f2\u00020\u0001:\u0002\u000b\fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\r"}, d2 = {"Lcom/wireguard/android/model/TunnelComparator$NaturalSortString;", "", "originalString", "", "<init>", "(Ljava/lang/String;)V", "tokens", "", "Lcom/wireguard/android/model/TunnelComparator$NaturalSortString$NaturalSortToken;", "getTokens", "()Ljava/util/List;", "NaturalSortToken", "Companion", "ui_debug"})
    static final class NaturalSortString {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.wireguard.android.model.TunnelComparator.NaturalSortString.NaturalSortToken> tokens = null;
        @org.jetbrains.annotations.NotNull()
        private static final kotlin.text.Regex NATURAL_SORT_DIGIT_FINDER = null;
        @org.jetbrains.annotations.NotNull()
        private static final kotlin.text.Regex WHITESPACE_FINDER = null;
        @org.jetbrains.annotations.NotNull()
        private static final com.wireguard.android.model.TunnelComparator.NaturalSortString.Companion Companion = null;
        
        public NaturalSortString(@org.jetbrains.annotations.NotNull()
        java.lang.String originalString) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.wireguard.android.model.TunnelComparator.NaturalSortString.NaturalSortToken> getTokens() {
            return null;
        }
        
        @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/wireguard/android/model/TunnelComparator$NaturalSortString$Companion;", "", "<init>", "()V", "NATURAL_SORT_DIGIT_FINDER", "Lkotlin/text/Regex;", "WHITESPACE_FINDER", "ui_debug"})
        static final class Companion {
            
            private Companion() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0000H\u0096\u0002R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u000f"}, d2 = {"Lcom/wireguard/android/model/TunnelComparator$NaturalSortString$NaturalSortToken;", "", "maybeString", "", "maybeNumber", "", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "getMaybeString", "()Ljava/lang/String;", "getMaybeNumber", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "compareTo", "other", "ui_debug"})
        public static final class NaturalSortToken implements java.lang.Comparable<com.wireguard.android.model.TunnelComparator.NaturalSortString.NaturalSortToken> {
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String maybeString = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Integer maybeNumber = null;
            
            public NaturalSortToken(@org.jetbrains.annotations.Nullable()
            java.lang.String maybeString, @org.jetbrains.annotations.Nullable()
            java.lang.Integer maybeNumber) {
                super();
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getMaybeString() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getMaybeNumber() {
                return null;
            }
            
            @java.lang.Override()
            public int compareTo(@org.jetbrains.annotations.NotNull()
            com.wireguard.android.model.TunnelComparator.NaturalSortString.NaturalSortToken other) {
                return 0;
            }
        }
    }
}