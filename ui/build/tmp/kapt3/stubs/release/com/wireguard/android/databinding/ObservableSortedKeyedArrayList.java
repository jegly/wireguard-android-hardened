package com.wireguard.android.databinding;

/**
 * KeyedArrayList that enforces uniqueness and sorted order across the set of keys. This class uses
 * binary search to improve lookup and replacement times to O(log(n)). However, due to the
 * array-based nature of this class, insertion and removal of elements with anything but the largest
 * key still require O(n) time.
 */
@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\n\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0010\b\u0001\u0010\u0002*\n\u0012\u0006\b\u0001\u0012\u0002H\u00010\u00032\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0004:\u0001\u001eB\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0006\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u0001H\u0016\u00a2\u0006\u0002\u0010\u000eJ\u001d\u0010\u000b\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\r\u001a\u00028\u0001H\u0016\u00a2\u0006\u0002\u0010\u0012J\u0016\u0010\u0013\u001a\u00020\f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00010\u0015H\u0016J\u001e\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00010\u0015H\u0016J\u0015\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00028\u0001H\u0002\u00a2\u0006\u0002\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u001bJ\u001e\u0010\u001c\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\r\u001a\u00028\u0001H\u0096\u0002\u00a2\u0006\u0002\u0010\u001dR\u0016\u0010\u0005\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/wireguard/android/databinding/ObservableSortedKeyedArrayList;", "K", "E", "Lcom/wireguard/android/databinding/Keyed;", "Lcom/wireguard/android/databinding/ObservableKeyedArrayList;", "comparator", "Ljava/util/Comparator;", "<init>", "(Ljava/util/Comparator;)V", "keyList", "Lcom/wireguard/android/databinding/ObservableSortedKeyedArrayList$KeyList;", "add", "", "element", "(Lcom/wireguard/android/databinding/Keyed;)Z", "", "index", "", "(ILcom/wireguard/android/databinding/Keyed;)V", "addAll", "elements", "", "getInsertionPoint", "e", "(Lcom/wireguard/android/databinding/Keyed;)I", "indexOfKey", "key", "(Ljava/lang/Object;)I", "set", "(ILcom/wireguard/android/databinding/Keyed;)Lcom/wireguard/android/databinding/Keyed;", "KeyList", "ui_release"})
public final class ObservableSortedKeyedArrayList<K extends java.lang.Object, E extends com.wireguard.android.databinding.Keyed<? extends K>> extends com.wireguard.android.databinding.ObservableKeyedArrayList<K, E> {
    @org.jetbrains.annotations.NotNull()
    private final java.util.Comparator<? super K> comparator = null;
    @kotlin.jvm.Transient()
    @org.jetbrains.annotations.NotNull()
    private final transient com.wireguard.android.databinding.ObservableSortedKeyedArrayList.KeyList<K, E> keyList = null;
    
    public ObservableSortedKeyedArrayList(@org.jetbrains.annotations.NotNull()
    java.util.Comparator<? super K> comparator) {
        super();
    }
    
    @java.lang.Override()
    public boolean add(@org.jetbrains.annotations.NotNull()
    E element) {
        return false;
    }
    
    @java.lang.Override()
    public void add(int index, @org.jetbrains.annotations.NotNull()
    E element) {
    }
    
    @java.lang.Override()
    public boolean addAll(@org.jetbrains.annotations.NotNull()
    java.util.Collection<? extends E> elements) {
        return false;
    }
    
    @java.lang.Override()
    public boolean addAll(int index, @org.jetbrains.annotations.NotNull()
    java.util.Collection<? extends E> elements) {
        return false;
    }
    
    private final int getInsertionPoint(E e) {
        return 0;
    }
    
    @java.lang.Override()
    public int indexOfKey(K key) {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public E set(int index, @org.jetbrains.annotations.NotNull()
    E element) {
        return null;
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0010\b\u0003\u0010\u0002*\n\u0012\u0006\b\u0001\u0012\u0002H\u00010\u00032\b\u0012\u0004\u0012\u0002H\u00010\u00042\b\u0012\u0004\u0012\u0002H\u00010\u0005B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0007\u00a2\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\u00028\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0096\u0002\u00a2\u0006\u0002\u0010\rJ\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00020\u0012H\u0016R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0013"}, d2 = {"Lcom/wireguard/android/databinding/ObservableSortedKeyedArrayList$KeyList;", "K", "E", "Lcom/wireguard/android/databinding/Keyed;", "Ljava/util/AbstractList;", "", "list", "Lcom/wireguard/android/databinding/ObservableSortedKeyedArrayList;", "<init>", "(Lcom/wireguard/android/databinding/ObservableSortedKeyedArrayList;)V", "get", "index", "", "(I)Ljava/lang/Object;", "size", "getSize", "()I", "spliterator", "Ljava/util/Spliterator;", "ui_release"})
    static final class KeyList<K extends java.lang.Object, E extends com.wireguard.android.databinding.Keyed<? extends K>> extends java.util.AbstractList<K> implements java.util.Set<K>, kotlin.jvm.internal.markers.KMappedMarker {
        @org.jetbrains.annotations.NotNull()
        private final com.wireguard.android.databinding.ObservableSortedKeyedArrayList<K, E> list = null;
        
        public final K remove(int index) {
            return null;
        }
        
        @java.lang.Override()
        public java.lang.Object removeAt(int p0) {
            return null;
        }
        
        @java.lang.Override()
        public final int size() {
            return 0;
        }
        
        public KeyList(@org.jetbrains.annotations.NotNull()
        com.wireguard.android.databinding.ObservableSortedKeyedArrayList<K, E> list) {
            super();
        }
        
        @java.lang.Override()
        public K get(int index) {
            return null;
        }
        
        @java.lang.Override()
        public int getSize() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.util.Spliterator<K> spliterator() {
            return null;
        }
    }
}