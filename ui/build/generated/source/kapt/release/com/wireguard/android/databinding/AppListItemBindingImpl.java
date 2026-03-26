package com.wireguard.android.databinding;
import com.wireguard.android.R;
import com.wireguard.android.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class AppListItemBindingImpl extends AppListItemBinding implements com.wireguard.android.generated.callback.OnClickListener.Listener {

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
    private final android.widget.LinearLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener selectedCheckboxandroidCheckedAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of item.selected
            //         is item.setSelected((boolean) callbackArg_0)
            boolean callbackArg_0 = selectedCheckbox.isChecked();
            // localize variables for thread safety
            // item
            com.wireguard.android.model.ApplicationData item = mItem;
            // item != null
            boolean itemJavaLangObjectNull = false;
            // item.selected
            boolean itemSelected = false;



            itemJavaLangObjectNull = (item) != (null);
            if (itemJavaLangObjectNull) {




                item.setSelected(((boolean) (callbackArg_0)));
            }
        }
    };

    public AppListItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private AppListItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.CheckBox) bindings[3]
            );
        this.appIcon.setTag(null);
        this.appName.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.selectedCheckbox.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.wireguard.android.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
            setItem((com.wireguard.android.model.ApplicationData) variable);
        }
        else if (BR.collection == variableId) {
            setCollection((com.wireguard.android.databinding.ObservableKeyedArrayList<java.lang.String,com.wireguard.android.model.ApplicationData>) variable);
        }
        else if (BR.key == variableId) {
            setKey((java.lang.String) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItem(@Nullable com.wireguard.android.model.ApplicationData Item) {
        updateRegistration(0, Item);
        this.mItem = Item;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.item);
        super.requestRebind();
    }
    public void setCollection(@Nullable com.wireguard.android.databinding.ObservableKeyedArrayList<java.lang.String,com.wireguard.android.model.ApplicationData> Collection) {
        this.mCollection = Collection;
    }
    public void setKey(@Nullable java.lang.String Key) {
        this.mKey = Key;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.key);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeItem((com.wireguard.android.model.ApplicationData) object, fieldId);
            case 1 :
                return onChangeCollection((com.wireguard.android.databinding.ObservableKeyedArrayList<java.lang.String,com.wireguard.android.model.ApplicationData>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItem(com.wireguard.android.model.ApplicationData Item, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.selected) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeCollection(com.wireguard.android.databinding.ObservableKeyedArrayList<java.lang.String,com.wireguard.android.model.ApplicationData> Collection, int fieldId) {
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
        com.wireguard.android.model.ApplicationData item = mItem;
        boolean itemSelected = false;
        android.graphics.drawable.Drawable itemIcon = null;
        java.lang.String key = mKey;

        if ((dirtyFlags & 0x19L) != 0) {



                if (item != null) {
                    // read item.selected
                    itemSelected = item.isSelected();
                }
            if ((dirtyFlags & 0x11L) != 0) {

                    if (item != null) {
                        // read item.icon
                        itemIcon = item.getIcon();
                    }
            }
        }
        if ((dirtyFlags & 0x14L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x11L) != 0) {
            // api target 1

            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.appIcon, itemIcon);
        }
        if ((dirtyFlags & 0x14L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.appName, key);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(mCallback1);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.selectedCheckbox, (android.widget.CompoundButton.OnCheckedChangeListener)null, selectedCheckboxandroidCheckedAttrChanged);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.selectedCheckbox, itemSelected);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // item
        com.wireguard.android.model.ApplicationData item = mItem;
        // !item.selected
        boolean itemSelected = false;
        // item != null
        boolean itemJavaLangObjectNull = false;
        // item.selected
        boolean ItemSelected1 = false;



        itemJavaLangObjectNull = (item) != (null);
        if (itemJavaLangObjectNull) {




            ItemSelected1 = item.isSelected();

            itemSelected = !ItemSelected1;

            item.setSelected(itemSelected);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): item
        flag 1 (0x2L): collection
        flag 2 (0x3L): key
        flag 3 (0x4L): item.selected
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}