package com.wireguard.android.databinding;
import com.wireguard.android.R;
import com.wireguard.android.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class TunnelEditorPeerBindingImpl extends TunnelEditorPeerBinding implements com.wireguard.android.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.peer_title, 9);
        sViewsWithIds.put(R.id.public_key_label_layout, 10);
        sViewsWithIds.put(R.id.pre_shared_key_label_layout, 11);
        sViewsWithIds.put(R.id.endpoint_label_layout, 12);
        sViewsWithIds.put(R.id.allowed_ips_label_layout, 13);
    }
    // views
    @NonNull
    private final com.google.android.material.card.MaterialCardView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    // values
    // listeners
    private OnClickListenerImpl mFragmentOnKeyClickAndroidViewViewOnClickListener;
    private OnFocusChangeListenerImpl mFragmentOnKeyFocusChangeAndroidViewViewOnFocusChangeListener;
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener allowedIpsTextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of item.allowedIps
            //         is item.setAllowedIps((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(allowedIpsText);
            // localize variables for thread safety
            // item
            com.wireguard.android.viewmodel.PeerProxy item = mItem;
            // item != null
            boolean itemJavaLangObjectNull = false;
            // item.allowedIps
            java.lang.String itemAllowedIps = null;



            itemJavaLangObjectNull = (item) != (null);
            if (itemJavaLangObjectNull) {




                item.setAllowedIps(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener endpointTextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of item.endpoint
            //         is item.setEndpoint((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(endpointText);
            // localize variables for thread safety
            // item.endpoint
            java.lang.String itemEndpoint = null;
            // item
            com.wireguard.android.viewmodel.PeerProxy item = mItem;
            // item != null
            boolean itemJavaLangObjectNull = false;



            itemJavaLangObjectNull = (item) != (null);
            if (itemJavaLangObjectNull) {




                item.setEndpoint(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener persistentKeepaliveTextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of item.persistentKeepalive
            //         is item.setPersistentKeepalive((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(persistentKeepaliveText);
            // localize variables for thread safety
            // item
            com.wireguard.android.viewmodel.PeerProxy item = mItem;
            // item.persistentKeepalive
            java.lang.String itemPersistentKeepalive = null;
            // item != null
            boolean itemJavaLangObjectNull = false;



            itemJavaLangObjectNull = (item) != (null);
            if (itemJavaLangObjectNull) {




                item.setPersistentKeepalive(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener preSharedKeyTextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of item.preSharedKey
            //         is item.setPreSharedKey((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(preSharedKeyText);
            // localize variables for thread safety
            // item
            com.wireguard.android.viewmodel.PeerProxy item = mItem;
            // item != null
            boolean itemJavaLangObjectNull = false;
            // item.preSharedKey
            java.lang.String itemPreSharedKey = null;



            itemJavaLangObjectNull = (item) != (null);
            if (itemJavaLangObjectNull) {




                item.setPreSharedKey(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener publicKeyTextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of item.publicKey
            //         is item.setPublicKey((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(publicKeyText);
            // localize variables for thread safety
            // item.publicKey
            java.lang.String itemPublicKey = null;
            // item
            com.wireguard.android.viewmodel.PeerProxy item = mItem;
            // item != null
            boolean itemJavaLangObjectNull = false;



            itemJavaLangObjectNull = (item) != (null);
            if (itemJavaLangObjectNull) {




                item.setPublicKey(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener selectedCheckboxandroidCheckedAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of item.excludingPrivateIps
            //         is item.setExcludingPrivateIps((boolean) callbackArg_0)
            boolean callbackArg_0 = selectedCheckbox.isChecked();
            // localize variables for thread safety
            // item.excludingPrivateIps
            boolean itemExcludingPrivateIps = false;
            // item
            com.wireguard.android.viewmodel.PeerProxy item = mItem;
            // item != null
            boolean itemJavaLangObjectNull = false;



            itemJavaLangObjectNull = (item) != (null);
            if (itemJavaLangObjectNull) {




                item.setExcludingPrivateIps(((boolean) (callbackArg_0)));
            }
        }
    };

    public TunnelEditorPeerBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private TunnelEditorPeerBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (com.google.android.material.textfield.TextInputLayout) bindings[13]
            , (com.google.android.material.textfield.TextInputEditText) bindings[7]
            , (androidx.appcompat.widget.AppCompatImageButton) bindings[1]
            , (com.google.android.material.textfield.TextInputLayout) bindings[12]
            , (com.google.android.material.textfield.TextInputEditText) bindings[6]
            , (com.google.android.material.textview.MaterialTextView) bindings[9]
            , (com.google.android.material.textfield.TextInputLayout) bindings[4]
            , (com.google.android.material.textfield.TextInputEditText) bindings[5]
            , (com.google.android.material.textfield.TextInputLayout) bindings[11]
            , (com.google.android.material.textfield.TextInputEditText) bindings[3]
            , (com.google.android.material.textfield.TextInputLayout) bindings[10]
            , (com.google.android.material.textfield.TextInputEditText) bindings[2]
            , (android.widget.CheckBox) bindings[8]
            );
        this.allowedIpsText.setTag(null);
        this.delete.setTag(null);
        this.endpointText.setTag(null);
        this.mboundView0 = (com.google.android.material.card.MaterialCardView) bindings[0];
        this.mboundView0.setTag(null);
        this.persistentKeepaliveLabelLayout.setTag(null);
        this.persistentKeepaliveText.setTag(null);
        this.preSharedKeyText.setTag(null);
        this.publicKeyText.setTag(null);
        this.selectedCheckbox.setTag(null);
        setRootTag(root);
        // listeners
        mCallback3 = new com.wireguard.android.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x400L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.item == variableId) {
            setItem((com.wireguard.android.viewmodel.PeerProxy) variable);
        }
        else if (BR.fragment == variableId) {
            setFragment((com.wireguard.android.fragment.TunnelEditorFragment) variable);
        }
        else if (BR.collection == variableId) {
            setCollection((androidx.databinding.ObservableList<com.wireguard.android.viewmodel.PeerProxy>) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItem(@Nullable com.wireguard.android.viewmodel.PeerProxy Item) {
        updateRegistration(0, Item);
        this.mItem = Item;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.item);
        super.requestRebind();
    }
    public void setFragment(@Nullable com.wireguard.android.fragment.TunnelEditorFragment Fragment) {
        this.mFragment = Fragment;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.fragment);
        super.requestRebind();
    }
    public void setCollection(@Nullable androidx.databinding.ObservableList<com.wireguard.android.viewmodel.PeerProxy> Collection) {
        this.mCollection = Collection;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeItem((com.wireguard.android.viewmodel.PeerProxy) object, fieldId);
            case 1 :
                return onChangeCollection((androidx.databinding.ObservableList<com.wireguard.android.viewmodel.PeerProxy>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItem(com.wireguard.android.viewmodel.PeerProxy Item, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.publicKey) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        else if (fieldId == BR.preSharedKey) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        else if (fieldId == BR.persistentKeepalive) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        else if (fieldId == BR.endpoint) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        else if (fieldId == BR.allowedIps) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        else if (fieldId == BR.excludingPrivateIps) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        else if (fieldId == BR.ableToExcludePrivateIps) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeCollection(androidx.databinding.ObservableList<com.wireguard.android.viewmodel.PeerProxy> Collection, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String itemEndpoint = null;
        com.wireguard.android.viewmodel.PeerProxy item = mItem;
        com.wireguard.android.fragment.TunnelEditorFragment fragment = mFragment;
        int itemAbleToExcludePrivateIpsViewVISIBLEViewGONE = 0;
        java.lang.String itemPublicKey = null;
        int bindingAdaptersTryParseIntItemPersistentKeepalive = 0;
        java.lang.String itemPreSharedKey = null;
        java.lang.String itemPersistentKeepalive = null;
        boolean itemAbleToExcludePrivateIps = false;
        android.view.View.OnClickListener fragmentOnKeyClickAndroidViewViewOnClickListener = null;
        java.lang.String itemAllowedIps = null;
        boolean itemExcludingPrivateIps = false;
        android.view.View.OnFocusChangeListener fragmentOnKeyFocusChangeAndroidViewViewOnFocusChangeListener = null;
        java.lang.String persistentKeepaliveLabelLayoutAndroidPluralsPersistentKeepaliveSecondsSuffixBindingAdaptersTryParseIntItemPersistentKeepalive = null;

        if ((dirtyFlags & 0x7f9L) != 0) {


            if ((dirtyFlags & 0x441L) != 0) {

                    if (item != null) {
                        // read item.endpoint
                        itemEndpoint = item.getEndpoint();
                    }
            }
            if ((dirtyFlags & 0x409L) != 0) {

                    if (item != null) {
                        // read item.publicKey
                        itemPublicKey = item.getPublicKey();
                    }
            }
            if ((dirtyFlags & 0x411L) != 0) {

                    if (item != null) {
                        // read item.preSharedKey
                        itemPreSharedKey = item.getPreSharedKey();
                    }
            }
            if ((dirtyFlags & 0x421L) != 0) {

                    if (item != null) {
                        // read item.persistentKeepalive
                        itemPersistentKeepalive = item.getPersistentKeepalive();
                    }


                    // read BindingAdapters.tryParseInt(item.persistentKeepalive)
                    bindingAdaptersTryParseIntItemPersistentKeepalive = com.wireguard.android.databinding.BindingAdapters.tryParseInt(itemPersistentKeepalive);


                    // read @android:plurals/persistent_keepalive_seconds_suffix
                    persistentKeepaliveLabelLayoutAndroidPluralsPersistentKeepaliveSecondsSuffixBindingAdaptersTryParseIntItemPersistentKeepalive = persistentKeepaliveLabelLayout.getResources().getQuantityString(R.plurals.persistent_keepalive_seconds_suffix, bindingAdaptersTryParseIntItemPersistentKeepalive);
            }
            if ((dirtyFlags & 0x601L) != 0) {

                    if (item != null) {
                        // read item.ableToExcludePrivateIps
                        itemAbleToExcludePrivateIps = item.isAbleToExcludePrivateIps();
                    }
                if((dirtyFlags & 0x601L) != 0) {
                    if(itemAbleToExcludePrivateIps) {
                            dirtyFlags |= 0x1000L;
                    }
                    else {
                            dirtyFlags |= 0x800L;
                    }
                }


                    // read item.ableToExcludePrivateIps ? View.VISIBLE : View.GONE
                    itemAbleToExcludePrivateIpsViewVISIBLEViewGONE = ((itemAbleToExcludePrivateIps) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x481L) != 0) {

                    if (item != null) {
                        // read item.allowedIps
                        itemAllowedIps = item.getAllowedIps();
                    }
            }
            if ((dirtyFlags & 0x501L) != 0) {

                    if (item != null) {
                        // read item.excludingPrivateIps
                        itemExcludingPrivateIps = item.isExcludingPrivateIps();
                    }
            }
        }
        if ((dirtyFlags & 0x404L) != 0) {



                if (fragment != null) {
                    // read fragment::onKeyClick
                    fragmentOnKeyClickAndroidViewViewOnClickListener = (((mFragmentOnKeyClickAndroidViewViewOnClickListener == null) ? (mFragmentOnKeyClickAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mFragmentOnKeyClickAndroidViewViewOnClickListener).setValue(fragment));
                    // read fragment::onKeyFocusChange
                    fragmentOnKeyFocusChangeAndroidViewViewOnFocusChangeListener = (((mFragmentOnKeyFocusChangeAndroidViewViewOnFocusChangeListener == null) ? (mFragmentOnKeyFocusChangeAndroidViewViewOnFocusChangeListener = new OnFocusChangeListenerImpl()) : mFragmentOnKeyFocusChangeAndroidViewViewOnFocusChangeListener).setValue(fragment));
                }
        }
        // batch finished
        if ((dirtyFlags & 0x481L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.allowedIpsText, itemAllowedIps);
        }
        if ((dirtyFlags & 0x400L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.allowedIpsText, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, allowedIpsTextandroidTextAttrChanged);
            this.delete.setOnClickListener(mCallback3);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.endpointText, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, endpointTextandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.persistentKeepaliveText, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, persistentKeepaliveTextandroidTextAttrChanged);
            com.wireguard.android.databinding.BindingAdapters.setFilter(this.preSharedKeyText, com.wireguard.android.widget.KeyInputFilter.newInstance());
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.preSharedKeyText, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, preSharedKeyTextandroidTextAttrChanged);
            com.wireguard.android.databinding.BindingAdapters.setFilter(this.publicKeyText, com.wireguard.android.widget.KeyInputFilter.newInstance());
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.publicKeyText, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, publicKeyTextandroidTextAttrChanged);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.selectedCheckbox, (android.widget.CompoundButton.OnCheckedChangeListener)null, selectedCheckboxandroidCheckedAttrChanged);
        }
        if ((dirtyFlags & 0x441L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.endpointText, itemEndpoint);
        }
        if ((dirtyFlags & 0x421L) != 0) {
            // api target 1

            this.persistentKeepaliveLabelLayout.setSuffixText(persistentKeepaliveLabelLayoutAndroidPluralsPersistentKeepaliveSecondsSuffixBindingAdaptersTryParseIntItemPersistentKeepalive);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.persistentKeepaliveText, itemPersistentKeepalive);
        }
        if ((dirtyFlags & 0x404L) != 0) {
            // api target 1

            this.preSharedKeyText.setOnClickListener(fragmentOnKeyClickAndroidViewViewOnClickListener);
            com.wireguard.android.databinding.BindingAdapters.setOnFocusChange(this.preSharedKeyText, fragmentOnKeyFocusChangeAndroidViewViewOnFocusChangeListener);
        }
        if ((dirtyFlags & 0x411L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.preSharedKeyText, itemPreSharedKey);
        }
        if ((dirtyFlags & 0x409L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.publicKeyText, itemPublicKey);
        }
        if ((dirtyFlags & 0x501L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.selectedCheckbox, itemExcludingPrivateIps);
        }
        if ((dirtyFlags & 0x601L) != 0) {
            // api target 1

            this.selectedCheckbox.setVisibility(itemAbleToExcludePrivateIpsViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private com.wireguard.android.fragment.TunnelEditorFragment value;
        public OnClickListenerImpl setValue(com.wireguard.android.fragment.TunnelEditorFragment value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onKeyClick(arg0); 
        }
    }
    public static class OnFocusChangeListenerImpl implements android.view.View.OnFocusChangeListener{
        private com.wireguard.android.fragment.TunnelEditorFragment value;
        public OnFocusChangeListenerImpl setValue(com.wireguard.android.fragment.TunnelEditorFragment value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onFocusChange(android.view.View arg0, boolean arg1) {
            this.value.onKeyFocusChange(arg0, arg1); 
        }
    }
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // item
        com.wireguard.android.viewmodel.PeerProxy item = mItem;
        // item != null
        boolean itemJavaLangObjectNull = false;



        itemJavaLangObjectNull = (item) != (null);
        if (itemJavaLangObjectNull) {


            item.unbind();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): item
        flag 1 (0x2L): collection
        flag 2 (0x3L): fragment
        flag 3 (0x4L): item.publicKey
        flag 4 (0x5L): item.preSharedKey
        flag 5 (0x6L): item.persistentKeepalive
        flag 6 (0x7L): item.endpoint
        flag 7 (0x8L): item.allowedIps
        flag 8 (0x9L): item.excludingPrivateIps
        flag 9 (0xaL): item.ableToExcludePrivateIps
        flag 10 (0xbL): null
        flag 11 (0xcL): item.ableToExcludePrivateIps ? View.VISIBLE : View.GONE
        flag 12 (0xdL): item.ableToExcludePrivateIps ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}