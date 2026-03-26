package com.wireguard.android.databinding;
import com.wireguard.android.R;
import com.wireguard.android.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class TvTunnelListItemBindingImpl extends TvTunnelListItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final com.wireguard.android.widget.TvCardView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public TvTunnelListItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private TvTunnelListItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (com.google.android.material.textview.MaterialTextView) bindings[3]
            , (com.google.android.material.textview.MaterialTextView) bindings[1]
            , (com.google.android.material.textview.MaterialTextView) bindings[2]
            );
        this.mboundView0 = (com.wireguard.android.widget.TvCardView) bindings[0];
        this.mboundView0.setTag(null);
        this.tunnelDelete.setTag(null);
        this.tunnelName.setTag(null);
        this.tunnelTransfer.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40L;
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
            setItem((com.wireguard.android.model.ObservableTunnel) variable);
        }
        else if (BR.isFocused == variableId) {
            setIsFocused((androidx.databinding.ObservableBoolean) variable);
        }
        else if (BR.isDeleting == variableId) {
            setIsDeleting((androidx.databinding.ObservableBoolean) variable);
        }
        else if (BR.key == variableId) {
            setKey((java.lang.String) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItem(@Nullable com.wireguard.android.model.ObservableTunnel Item) {
        updateRegistration(0, Item);
        this.mItem = Item;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.item);
        super.requestRebind();
    }
    public void setIsFocused(@Nullable androidx.databinding.ObservableBoolean IsFocused) {
        updateRegistration(1, IsFocused);
        this.mIsFocused = IsFocused;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.isFocused);
        super.requestRebind();
    }
    public void setIsDeleting(@Nullable androidx.databinding.ObservableBoolean IsDeleting) {
        updateRegistration(2, IsDeleting);
        this.mIsDeleting = IsDeleting;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.isDeleting);
        super.requestRebind();
    }
    public void setKey(@Nullable java.lang.String Key) {
        this.mKey = Key;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeItem((com.wireguard.android.model.ObservableTunnel) object, fieldId);
            case 1 :
                return onChangeIsFocused((androidx.databinding.ObservableBoolean) object, fieldId);
            case 2 :
                return onChangeIsDeleting((androidx.databinding.ObservableBoolean) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItem(com.wireguard.android.model.ObservableTunnel Item, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.state) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        else if (fieldId == BR.name) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeIsFocused(androidx.databinding.ObservableBoolean IsFocused, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeIsDeleting(androidx.databinding.ObservableBoolean IsDeleting, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
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
        com.wireguard.android.model.ObservableTunnel item = mItem;
        boolean isDeletingGet = false;
        boolean isFocusedGet = false;
        androidx.databinding.ObservableBoolean isFocused = mIsFocused;
        java.lang.String itemName = null;
        androidx.databinding.ObservableBoolean isDeleting = mIsDeleting;
        com.wireguard.android.backend.Tunnel.State itemState = null;
        boolean isDeletingIsFocusedBooleanFalse = false;
        boolean itemStateStateUP = false;
        int isDeletingViewGONEViewVISIBLE = 0;
        int isDeletingIsFocusedBooleanFalseViewVISIBLEViewGONE = 0;

        if ((dirtyFlags & 0x71L) != 0) {


            if ((dirtyFlags & 0x61L) != 0) {

                    if (item != null) {
                        // read item.name
                        itemName = item.getName();
                    }
            }
            if ((dirtyFlags & 0x51L) != 0) {

                    if (item != null) {
                        // read item.state
                        itemState = item.getState();
                    }


                    // read item.state == State.UP
                    itemStateStateUP = (itemState) == (com.wireguard.android.backend.Tunnel.State.UP);
            }
        }
        if ((dirtyFlags & 0x46L) != 0) {



                if (isDeleting != null) {
                    // read isDeleting.get()
                    isDeletingGet = isDeleting.get();
                }
            if((dirtyFlags & 0x46L) != 0) {
                if(isDeletingGet) {
                        dirtyFlags |= 0x100L;
                }
                else {
                        dirtyFlags |= 0x80L;
                }
            }
            if((dirtyFlags & 0x44L) != 0) {
                if(isDeletingGet) {
                        dirtyFlags |= 0x400L;
                }
                else {
                        dirtyFlags |= 0x200L;
                }
            }

            if ((dirtyFlags & 0x44L) != 0) {

                    // read isDeleting.get() ? View.GONE : View.VISIBLE
                    isDeletingViewGONEViewVISIBLE = ((isDeletingGet) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
        }
        // batch finished

        if ((dirtyFlags & 0x100L) != 0) {



                if (isFocused != null) {
                    // read isFocused.get()
                    isFocusedGet = isFocused.get();
                }
        }

        if ((dirtyFlags & 0x46L) != 0) {

                // read isDeleting.get() ? isFocused.get() : false
                isDeletingIsFocusedBooleanFalse = ((isDeletingGet) ? (isFocusedGet) : (false));
            if((dirtyFlags & 0x46L) != 0) {
                if(isDeletingIsFocusedBooleanFalse) {
                        dirtyFlags |= 0x1000L;
                }
                else {
                        dirtyFlags |= 0x800L;
                }
            }


                // read isDeleting.get() ? isFocused.get() : false ? View.VISIBLE : View.GONE
                isDeletingIsFocusedBooleanFalseViewVISIBLEViewGONE = ((isDeletingIsFocusedBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x44L) != 0) {
            // api target 1

            com.wireguard.android.databinding.BindingAdapters.setIsDeleting(this.mboundView0, isDeletingGet);
            this.tunnelTransfer.setVisibility(isDeletingViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x51L) != 0) {
            // api target 1

            com.wireguard.android.databinding.BindingAdapters.setIsUp(this.mboundView0, itemStateStateUP);
        }
        if ((dirtyFlags & 0x46L) != 0) {
            // api target 1

            this.tunnelDelete.setVisibility(isDeletingIsFocusedBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x61L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tunnelName, itemName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): item
        flag 1 (0x2L): isFocused
        flag 2 (0x3L): isDeleting
        flag 3 (0x4L): key
        flag 4 (0x5L): item.state
        flag 5 (0x6L): item.name
        flag 6 (0x7L): null
        flag 7 (0x8L): isDeleting.get() ? isFocused.get() : false
        flag 8 (0x9L): isDeleting.get() ? isFocused.get() : false
        flag 9 (0xaL): isDeleting.get() ? View.GONE : View.VISIBLE
        flag 10 (0xbL): isDeleting.get() ? View.GONE : View.VISIBLE
        flag 11 (0xcL): isDeleting.get() ? isFocused.get() : false ? View.VISIBLE : View.GONE
        flag 12 (0xdL): isDeleting.get() ? isFocused.get() : false ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}