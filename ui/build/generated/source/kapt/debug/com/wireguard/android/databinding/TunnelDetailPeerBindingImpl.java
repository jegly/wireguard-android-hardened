package com.wireguard.android.databinding;
import com.wireguard.android.R;
import com.wireguard.android.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class TunnelDetailPeerBindingImpl extends TunnelDetailPeerBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.peer_title, 12);
        sViewsWithIds.put(R.id.public_key_label, 13);
        sViewsWithIds.put(R.id.transfer_label, 14);
        sViewsWithIds.put(R.id.latest_handshake_label, 15);
    }
    // views
    @NonNull
    private final com.google.android.material.card.MaterialCardView mboundView0;
    // variables
    // values
    // listeners
    private OnClickListenerImpl mClipboardUtilsCopyTextViewAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public TunnelDetailPeerBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private TunnelDetailPeerBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[11]
            , (com.google.android.material.textview.MaterialTextView) bindings[12]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[10]
            );
        this.allowedIpsLabel.setTag(null);
        this.allowedIpsText.setTag(null);
        this.endpointLabel.setTag(null);
        this.endpointText.setTag(null);
        this.latestHandshakeText.setTag(null);
        this.mboundView0 = (com.google.android.material.card.MaterialCardView) bindings[0];
        this.mboundView0.setTag(null);
        this.persistentKeepaliveLabel.setTag(null);
        this.persistentKeepaliveText.setTag(null);
        this.preSharedKeyLabel.setTag(null);
        this.preSharedKeyText.setTag(null);
        this.publicKeyText.setTag(null);
        this.transferText.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
            setItem((com.wireguard.config.Peer) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItem(@Nullable com.wireguard.config.Peer Item) {
        this.mItem = Item;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.item);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        java.util.Optional<com.wireguard.config.InetEndpoint> itemEndpoint = null;
        boolean itemPreSharedKeyIsPresent = false;
        com.wireguard.config.Peer item = mItem;
        boolean ItemPreSharedKeyIsPresent1 = false;
        com.wireguard.crypto.Key itemPublicKey = null;
        java.lang.String persistentKeepaliveTextAndroidPluralsPersistentKeepaliveSecondsUnitItemPersistentKeepaliveOrElseInt0ItemPersistentKeepaliveOrElseInt0 = null;
        int itemPreSharedKeyIsPresentAndroidViewViewGONEAndroidViewViewVISIBLE = 0;
        java.util.Optional<com.wireguard.crypto.Key> itemPreSharedKey = null;
        int itemAllowedIpsIsEmptyAndroidViewViewGONEAndroidViewViewVISIBLE = 0;
        boolean itemPersistentKeepaliveIsPresent = false;
        java.util.Optional<java.lang.Integer> itemPersistentKeepalive = null;
        java.util.Set<com.wireguard.config.InetNetwork> itemAllowedIps = null;
        java.lang.String itemPublicKeyToBase64 = null;
        boolean itemAllowedIpsIsEmpty = false;
        boolean itemEndpointIsPresent = false;
        boolean ItemPersistentKeepaliveIsPresent1 = false;
        boolean ItemEndpointIsPresent1 = false;
        java.lang.Integer itemPersistentKeepaliveOrElseInt0 = null;
        int itemPersistentKeepaliveIsPresentAndroidViewViewGONEAndroidViewViewVISIBLE = 0;
        int itemEndpointIsPresentAndroidViewViewGONEAndroidViewViewVISIBLE = 0;

        if ((dirtyFlags & 0x3L) != 0) {



                if (item != null) {
                    // read item.endpoint
                    itemEndpoint = item.getEndpoint();
                    // read item.publicKey
                    itemPublicKey = item.getPublicKey();
                    // read item.preSharedKey
                    itemPreSharedKey = item.getPreSharedKey();
                    // read item.persistentKeepalive
                    itemPersistentKeepalive = item.getPersistentKeepalive();
                    // read item.allowedIps
                    itemAllowedIps = item.getAllowedIps();
                }


                if (itemEndpoint != null) {
                    // read item.endpoint.isPresent()
                    itemEndpointIsPresent = itemEndpoint.isPresent();
                }
                if (itemPublicKey != null) {
                    // read item.publicKey.toBase64
                    itemPublicKeyToBase64 = itemPublicKey.toBase64();
                }
                if (itemPreSharedKey != null) {
                    // read item.preSharedKey.isPresent()
                    itemPreSharedKeyIsPresent = itemPreSharedKey.isPresent();
                }
                if (itemPersistentKeepalive != null) {
                    // read item.persistentKeepalive.isPresent()
                    itemPersistentKeepaliveIsPresent = itemPersistentKeepalive.isPresent();
                    // read item.persistentKeepalive.orElse(0)
                    itemPersistentKeepaliveOrElseInt0 = itemPersistentKeepalive.orElse(0);
                }
                if (itemAllowedIps != null) {
                    // read item.allowedIps.isEmpty()
                    itemAllowedIpsIsEmpty = itemAllowedIps.isEmpty();
                }
            if((dirtyFlags & 0x3L) != 0) {
                if(itemAllowedIpsIsEmpty) {
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x10L;
                }
            }


                // read !item.endpoint.isPresent()
                ItemEndpointIsPresent1 = !itemEndpointIsPresent;
                // read !item.preSharedKey.isPresent()
                ItemPreSharedKeyIsPresent1 = !itemPreSharedKeyIsPresent;
                // read !item.persistentKeepalive.isPresent()
                ItemPersistentKeepaliveIsPresent1 = !itemPersistentKeepaliveIsPresent;
                // read @android:plurals/persistent_keepalive_seconds_unit
                persistentKeepaliveTextAndroidPluralsPersistentKeepaliveSecondsUnitItemPersistentKeepaliveOrElseInt0ItemPersistentKeepaliveOrElseInt0 = persistentKeepaliveText.getResources().getQuantityString(R.plurals.persistent_keepalive_seconds_unit, itemPersistentKeepaliveOrElseInt0, itemPersistentKeepaliveOrElseInt0);
                // read @android:plurals/persistent_keepalive_seconds_unit
                persistentKeepaliveTextAndroidPluralsPersistentKeepaliveSecondsUnitItemPersistentKeepaliveOrElseInt0ItemPersistentKeepaliveOrElseInt0 = persistentKeepaliveText.getResources().getQuantityString(R.plurals.persistent_keepalive_seconds_unit, itemPersistentKeepaliveOrElseInt0, itemPersistentKeepaliveOrElseInt0);
                // read item.allowedIps.isEmpty() ? android.view.View.GONE : android.view.View.VISIBLE
                itemAllowedIpsIsEmptyAndroidViewViewGONEAndroidViewViewVISIBLE = ((itemAllowedIpsIsEmpty) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            if((dirtyFlags & 0x3L) != 0) {
                if(ItemEndpointIsPresent1) {
                        dirtyFlags |= 0x200L;
                }
                else {
                        dirtyFlags |= 0x100L;
                }
            }
            if((dirtyFlags & 0x3L) != 0) {
                if(ItemPreSharedKeyIsPresent1) {
                        dirtyFlags |= 0x8L;
                }
                else {
                        dirtyFlags |= 0x4L;
                }
            }
            if((dirtyFlags & 0x3L) != 0) {
                if(ItemPersistentKeepaliveIsPresent1) {
                        dirtyFlags |= 0x80L;
                }
                else {
                        dirtyFlags |= 0x40L;
                }
            }


                // read !item.endpoint.isPresent() ? android.view.View.GONE : android.view.View.VISIBLE
                itemEndpointIsPresentAndroidViewViewGONEAndroidViewViewVISIBLE = ((ItemEndpointIsPresent1) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                // read !item.preSharedKey.isPresent() ? android.view.View.GONE : android.view.View.VISIBLE
                itemPreSharedKeyIsPresentAndroidViewViewGONEAndroidViewViewVISIBLE = ((ItemPreSharedKeyIsPresent1) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                // read !item.persistentKeepalive.isPresent() ? android.view.View.GONE : android.view.View.VISIBLE
                itemPersistentKeepaliveIsPresentAndroidViewViewGONEAndroidViewViewVISIBLE = ((ItemPersistentKeepaliveIsPresent1) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.allowedIpsLabel.setVisibility(itemAllowedIpsIsEmptyAndroidViewViewGONEAndroidViewViewVISIBLE);
            com.wireguard.android.databinding.BindingAdapters.setInetNetworkSetText(this.allowedIpsText, itemAllowedIps);
            this.allowedIpsText.setVisibility(itemAllowedIpsIsEmptyAndroidViewViewGONEAndroidViewViewVISIBLE);
            this.endpointLabel.setVisibility(itemEndpointIsPresentAndroidViewViewGONEAndroidViewViewVISIBLE);
            com.wireguard.android.databinding.BindingAdapters.setOptionalText(this.endpointText, itemEndpoint);
            this.endpointText.setVisibility(itemEndpointIsPresentAndroidViewViewGONEAndroidViewViewVISIBLE);
            this.persistentKeepaliveLabel.setVisibility(itemPersistentKeepaliveIsPresentAndroidViewViewGONEAndroidViewViewVISIBLE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.persistentKeepaliveText, persistentKeepaliveTextAndroidPluralsPersistentKeepaliveSecondsUnitItemPersistentKeepaliveOrElseInt0ItemPersistentKeepaliveOrElseInt0);
            this.persistentKeepaliveText.setVisibility(itemPersistentKeepaliveIsPresentAndroidViewViewGONEAndroidViewViewVISIBLE);
            this.preSharedKeyLabel.setVisibility(itemPreSharedKeyIsPresentAndroidViewViewGONEAndroidViewViewVISIBLE);
            this.preSharedKeyText.setVisibility(itemPreSharedKeyIsPresentAndroidViewViewGONEAndroidViewViewVISIBLE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.publicKeyText, itemPublicKeyToBase64);
        }
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.allowedIpsText.setOnClickListener((((mClipboardUtilsCopyTextViewAndroidViewViewOnClickListener == null) ? (mClipboardUtilsCopyTextViewAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mClipboardUtilsCopyTextViewAndroidViewViewOnClickListener)));
            this.endpointText.setOnClickListener((((mClipboardUtilsCopyTextViewAndroidViewViewOnClickListener == null) ? (mClipboardUtilsCopyTextViewAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mClipboardUtilsCopyTextViewAndroidViewViewOnClickListener)));
            this.latestHandshakeText.setOnClickListener((((mClipboardUtilsCopyTextViewAndroidViewViewOnClickListener == null) ? (mClipboardUtilsCopyTextViewAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mClipboardUtilsCopyTextViewAndroidViewViewOnClickListener)));
            this.persistentKeepaliveText.setOnClickListener((((mClipboardUtilsCopyTextViewAndroidViewViewOnClickListener == null) ? (mClipboardUtilsCopyTextViewAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mClipboardUtilsCopyTextViewAndroidViewViewOnClickListener)));
            this.publicKeyText.setOnClickListener((((mClipboardUtilsCopyTextViewAndroidViewViewOnClickListener == null) ? (mClipboardUtilsCopyTextViewAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mClipboardUtilsCopyTextViewAndroidViewViewOnClickListener)));
            this.transferText.setOnClickListener((((mClipboardUtilsCopyTextViewAndroidViewViewOnClickListener == null) ? (mClipboardUtilsCopyTextViewAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mClipboardUtilsCopyTextViewAndroidViewViewOnClickListener)));
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        @Override
        public void onClick(android.view.View arg0) {
            com.wireguard.android.util.ClipboardUtils.copyTextView(arg0); 
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): item
        flag 1 (0x2L): null
        flag 2 (0x3L): !item.preSharedKey.isPresent() ? android.view.View.GONE : android.view.View.VISIBLE
        flag 3 (0x4L): !item.preSharedKey.isPresent() ? android.view.View.GONE : android.view.View.VISIBLE
        flag 4 (0x5L): item.allowedIps.isEmpty() ? android.view.View.GONE : android.view.View.VISIBLE
        flag 5 (0x6L): item.allowedIps.isEmpty() ? android.view.View.GONE : android.view.View.VISIBLE
        flag 6 (0x7L): !item.persistentKeepalive.isPresent() ? android.view.View.GONE : android.view.View.VISIBLE
        flag 7 (0x8L): !item.persistentKeepalive.isPresent() ? android.view.View.GONE : android.view.View.VISIBLE
        flag 8 (0x9L): !item.endpoint.isPresent() ? android.view.View.GONE : android.view.View.VISIBLE
        flag 9 (0xaL): !item.endpoint.isPresent() ? android.view.View.GONE : android.view.View.VISIBLE
    flag mapping end*/
    //end
}