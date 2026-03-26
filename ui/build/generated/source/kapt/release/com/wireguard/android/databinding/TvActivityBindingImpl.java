package com.wireguard.android.databinding;
import com.wireguard.android.R;
import com.wireguard.android.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class TvActivityBindingImpl extends TvActivityBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.banner_logo, 7);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView4;
    // variables
    // values
    private com.wireguard.android.databinding.ObservableKeyedArrayList<java.lang.String,com.wireguard.android.activity.TvMainActivity.KeyedFile> mOldFiles;
    private int mOldAndroidLayoutTvFileListItem;
    private com.wireguard.android.databinding.ObservableKeyedRecyclerViewAdapter.RowConfigurationHandler mOldFilesRowConfigurationHandler;
    private com.wireguard.android.databinding.ObservableKeyedArrayList<java.lang.String,com.wireguard.android.model.ObservableTunnel> mOldTunnels;
    private int mOldAndroidLayoutTvTunnelListItem;
    private com.wireguard.android.databinding.ObservableKeyedRecyclerViewAdapter.RowConfigurationHandler mOldTunnelRowConfigurationHandler;
    // listeners
    // Inverse Binding Event Handlers

    public TvActivityBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private TvActivityBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (com.google.android.material.card.MaterialCardView) bindings[7]
            , (com.google.android.material.button.MaterialButton) bindings[6]
            , (androidx.recyclerview.widget.RecyclerView) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (com.google.android.material.button.MaterialButton) bindings[5]
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            );
        this.deleteButton.setTag(null);
        this.filesList.setTag(null);
        this.filesRootLabel.setTag(null);
        this.importButton.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.tunnelList.setTag(null);
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
        if (BR.filesRoot == variableId) {
            setFilesRoot((androidx.databinding.ObservableField<java.lang.String>) variable);
        }
        else if (BR.files == variableId) {
            setFiles((com.wireguard.android.databinding.ObservableKeyedArrayList<java.lang.String,com.wireguard.android.activity.TvMainActivity.KeyedFile>) variable);
        }
        else if (BR.filesRowConfigurationHandler == variableId) {
            setFilesRowConfigurationHandler((com.wireguard.android.databinding.ObservableKeyedRecyclerViewAdapter.RowConfigurationHandler) variable);
        }
        else if (BR.isDeleting == variableId) {
            setIsDeleting((androidx.databinding.ObservableBoolean) variable);
        }
        else if (BR.tunnels == variableId) {
            setTunnels((com.wireguard.android.databinding.ObservableKeyedArrayList<java.lang.String,com.wireguard.android.model.ObservableTunnel>) variable);
        }
        else if (BR.tunnelRowConfigurationHandler == variableId) {
            setTunnelRowConfigurationHandler((com.wireguard.android.databinding.ObservableKeyedRecyclerViewAdapter.RowConfigurationHandler) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFilesRoot(@Nullable androidx.databinding.ObservableField<java.lang.String> FilesRoot) {
        updateRegistration(0, FilesRoot);
        this.mFilesRoot = FilesRoot;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.filesRoot);
        super.requestRebind();
    }
    public void setFiles(@Nullable com.wireguard.android.databinding.ObservableKeyedArrayList<java.lang.String,com.wireguard.android.activity.TvMainActivity.KeyedFile> Files) {
        updateRegistration(1, Files);
        this.mFiles = Files;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.files);
        super.requestRebind();
    }
    public void setFilesRowConfigurationHandler(@Nullable com.wireguard.android.databinding.ObservableKeyedRecyclerViewAdapter.RowConfigurationHandler FilesRowConfigurationHandler) {
        this.mFilesRowConfigurationHandler = FilesRowConfigurationHandler;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.filesRowConfigurationHandler);
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
    public void setTunnels(@Nullable com.wireguard.android.databinding.ObservableKeyedArrayList<java.lang.String,com.wireguard.android.model.ObservableTunnel> Tunnels) {
        updateRegistration(3, Tunnels);
        this.mTunnels = Tunnels;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.tunnels);
        super.requestRebind();
    }
    public void setTunnelRowConfigurationHandler(@Nullable com.wireguard.android.databinding.ObservableKeyedRecyclerViewAdapter.RowConfigurationHandler TunnelRowConfigurationHandler) {
        this.mTunnelRowConfigurationHandler = TunnelRowConfigurationHandler;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.tunnelRowConfigurationHandler);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeFilesRoot((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeFiles((com.wireguard.android.databinding.ObservableKeyedArrayList<java.lang.String,com.wireguard.android.activity.TvMainActivity.KeyedFile>) object, fieldId);
            case 2 :
                return onChangeIsDeleting((androidx.databinding.ObservableBoolean) object, fieldId);
            case 3 :
                return onChangeTunnels((com.wireguard.android.databinding.ObservableKeyedArrayList<java.lang.String,com.wireguard.android.model.ObservableTunnel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeFilesRoot(androidx.databinding.ObservableField<java.lang.String> FilesRoot, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeFiles(com.wireguard.android.databinding.ObservableKeyedArrayList<java.lang.String,com.wireguard.android.activity.TvMainActivity.KeyedFile> Files, int fieldId) {
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
    private boolean onChangeTunnels(com.wireguard.android.databinding.ObservableKeyedArrayList<java.lang.String,com.wireguard.android.model.ObservableTunnel> Tunnels, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
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
        androidx.databinding.ObservableField<java.lang.String> filesRoot = mFilesRoot;
        boolean isDeleting = false;
        int tunnelsIsEmptyIsDeletingBooleanFalseBooleanTrueFilesRootIsEmptyViewGONEViewVISIBLE = 0;
        int filesRootIsEmptyViewGONEViewVISIBLE = 0;
        android.graphics.drawable.Drawable isDeletingDeleteButtonAndroidDrawableIcArrowBackDeleteButtonAndroidDrawableIcActionDelete = null;
        boolean filesRootIsEmpty = false;
        android.graphics.drawable.Drawable filesRootIsEmptyImportButtonAndroidDrawableIcActionAddWhiteImportButtonAndroidDrawableIcArrowBack = null;
        boolean filesRootIsEmptyTunnelsIsEmptyBooleanFalse = false;
        int isDeletingViewGONEViewVISIBLE = 0;
        com.wireguard.android.databinding.ObservableKeyedArrayList<java.lang.String,com.wireguard.android.activity.TvMainActivity.KeyedFile> files = mFiles;
        int tunnelsIsEmptyBooleanTrueFilesRootIsEmptyViewGONEViewVISIBLE = 0;
        boolean isDeletingGet = false;
        boolean tunnelsIsEmptyBooleanTrueFilesRootIsEmpty = false;
        int filesRootIsEmptyTunnelsIsEmptyBooleanFalseViewVISIBLEViewGONE = 0;
        com.wireguard.android.databinding.ObservableKeyedRecyclerViewAdapter.RowConfigurationHandler<? extends androidx.databinding.ViewDataBinding,?> filesRowConfigurationHandler = mFilesRowConfigurationHandler;
        boolean tunnelsIsEmptyIsDeletingBooleanFalse = false;
        boolean tunnelsIsEmptyIsDeletingBooleanFalseBooleanTrueFilesRootIsEmpty = false;
        androidx.databinding.ObservableBoolean IsDeleting1 = mIsDeleting;
        com.wireguard.android.databinding.ObservableKeyedArrayList<java.lang.String,com.wireguard.android.model.ObservableTunnel> tunnels = mTunnels;
        boolean tunnelsIsEmpty = false;
        java.lang.String filesRootGet = null;
        com.wireguard.android.databinding.ObservableKeyedRecyclerViewAdapter.RowConfigurationHandler<? extends androidx.databinding.ViewDataBinding,?> tunnelRowConfigurationHandler = mTunnelRowConfigurationHandler;
        boolean FilesRootIsEmpty1 = false;

        if ((dirtyFlags & 0x49L) != 0) {



                if (filesRoot != null) {
                    // read filesRoot.get()
                    filesRootGet = filesRoot.get();
                }


                if (filesRootGet != null) {
                    // read filesRoot.get().isEmpty
                    FilesRootIsEmpty1 = filesRootGet.isEmpty();
                }
            if((dirtyFlags & 0x41L) != 0) {
                if(FilesRootIsEmpty1) {
                        dirtyFlags |= 0x400L;
                        dirtyFlags |= 0x4000L;
                }
                else {
                        dirtyFlags |= 0x200L;
                        dirtyFlags |= 0x2000L;
                }
            }
            if((dirtyFlags & 0x49L) != 0) {
                if(FilesRootIsEmpty1) {
                        dirtyFlags |= 0x10000L;
                }
                else {
                        dirtyFlags |= 0x8000L;
                }
            }

            if ((dirtyFlags & 0x41L) != 0) {

                    // read filesRoot.get().isEmpty ? View.GONE : View.VISIBLE
                    filesRootIsEmptyViewGONEViewVISIBLE = ((FilesRootIsEmpty1) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                    // read filesRoot.get().isEmpty ? @android:drawable/ic_action_add_white : @android:drawable/ic_arrow_back
                    filesRootIsEmptyImportButtonAndroidDrawableIcActionAddWhiteImportButtonAndroidDrawableIcArrowBack = ((FilesRootIsEmpty1) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(importButton.getContext(), R.drawable.ic_action_add_white)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(importButton.getContext(), R.drawable.ic_arrow_back)));
            }
        }
        if ((dirtyFlags & 0x52L) != 0) {
        }
        if ((dirtyFlags & 0x44L) != 0) {



                if (IsDeleting1 != null) {
                    // read isDeleting.get()
                    isDeletingGet = IsDeleting1.get();
                }
            if((dirtyFlags & 0x44L) != 0) {
                if(isDeletingGet) {
                        dirtyFlags |= 0x1000L;
                        dirtyFlags |= 0x40000L;
                }
                else {
                        dirtyFlags |= 0x800L;
                        dirtyFlags |= 0x20000L;
                }
            }


                // read isDeleting.get() ? @android:drawable/ic_arrow_back : @android:drawable/ic_action_delete
                isDeletingDeleteButtonAndroidDrawableIcArrowBackDeleteButtonAndroidDrawableIcActionDelete = ((isDeletingGet) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(deleteButton.getContext(), R.drawable.ic_arrow_back)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(deleteButton.getContext(), R.drawable.ic_action_delete)));
                // read isDeleting.get() ? View.GONE : View.VISIBLE
                isDeletingViewGONEViewVISIBLE = ((isDeletingGet) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        if ((dirtyFlags & 0x6dL) != 0) {


            if ((dirtyFlags & 0x4dL) != 0) {

                    if (tunnels != null) {
                        // read tunnels.isEmpty
                        tunnelsIsEmpty = tunnels.isEmpty();
                    }
                if((dirtyFlags & 0x49L) != 0) {
                    if(tunnelsIsEmpty) {
                            dirtyFlags |= 0x400000L;
                    }
                    else {
                            dirtyFlags |= 0x200000L;
                    }
                }
                if((dirtyFlags & 0x4dL) != 0) {
                    if(tunnelsIsEmpty) {
                            dirtyFlags |= 0x4000000L;
                    }
                    else {
                            dirtyFlags |= 0x2000000L;
                    }
                }
            }
        }
        if ((dirtyFlags & 0x68L) != 0) {
        }
        // batch finished

        if ((dirtyFlags & 0x200000L) != 0) {



                if (filesRoot != null) {
                    // read filesRoot.get()
                    filesRootGet = filesRoot.get();
                }


                if (filesRootGet != null) {
                    // read filesRoot.get().isEmpty
                    FilesRootIsEmpty1 = filesRootGet.isEmpty();
                }
            if((dirtyFlags & 0x41L) != 0) {
                if(FilesRootIsEmpty1) {
                        dirtyFlags |= 0x400L;
                        dirtyFlags |= 0x4000L;
                }
                else {
                        dirtyFlags |= 0x200L;
                        dirtyFlags |= 0x2000L;
                }
            }
            if((dirtyFlags & 0x49L) != 0) {
                if(FilesRootIsEmpty1) {
                        dirtyFlags |= 0x10000L;
                }
                else {
                        dirtyFlags |= 0x8000L;
                }
            }


                // read !filesRoot.get().isEmpty
                filesRootIsEmpty = !FilesRootIsEmpty1;
        }
        if ((dirtyFlags & 0x4000000L) != 0) {



                if (IsDeleting1 != null) {
                    // read isDeleting.get()
                    isDeletingGet = IsDeleting1.get();
                }
            if((dirtyFlags & 0x44L) != 0) {
                if(isDeletingGet) {
                        dirtyFlags |= 0x1000L;
                        dirtyFlags |= 0x40000L;
                }
                else {
                        dirtyFlags |= 0x800L;
                        dirtyFlags |= 0x20000L;
                }
            }


                // read !isDeleting.get()
                isDeleting = !isDeletingGet;
        }

        if ((dirtyFlags & 0x49L) != 0) {

                // read tunnels.isEmpty ? true : !filesRoot.get().isEmpty
                tunnelsIsEmptyBooleanTrueFilesRootIsEmpty = ((tunnelsIsEmpty) ? (true) : (filesRootIsEmpty));
            if((dirtyFlags & 0x49L) != 0) {
                if(tunnelsIsEmptyBooleanTrueFilesRootIsEmpty) {
                        dirtyFlags |= 0x100000L;
                }
                else {
                        dirtyFlags |= 0x80000L;
                }
            }


                // read tunnels.isEmpty ? true : !filesRoot.get().isEmpty ? View.GONE : View.VISIBLE
                tunnelsIsEmptyBooleanTrueFilesRootIsEmptyViewGONEViewVISIBLE = ((tunnelsIsEmptyBooleanTrueFilesRootIsEmpty) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        if ((dirtyFlags & 0x4dL) != 0) {

                // read tunnels.isEmpty ? !isDeleting.get() : false
                tunnelsIsEmptyIsDeletingBooleanFalse = ((tunnelsIsEmpty) ? (isDeleting) : (false));
            if((dirtyFlags & 0x4dL) != 0) {
                if(tunnelsIsEmptyIsDeletingBooleanFalse) {
                        dirtyFlags |= 0x10000000L;
                }
                else {
                        dirtyFlags |= 0x8000000L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x8000000L) != 0) {



                if (filesRoot != null) {
                    // read filesRoot.get()
                    filesRootGet = filesRoot.get();
                }


                if (filesRootGet != null) {
                    // read filesRoot.get().isEmpty
                    FilesRootIsEmpty1 = filesRootGet.isEmpty();
                }
            if((dirtyFlags & 0x41L) != 0) {
                if(FilesRootIsEmpty1) {
                        dirtyFlags |= 0x400L;
                        dirtyFlags |= 0x4000L;
                }
                else {
                        dirtyFlags |= 0x200L;
                        dirtyFlags |= 0x2000L;
                }
            }
            if((dirtyFlags & 0x49L) != 0) {
                if(FilesRootIsEmpty1) {
                        dirtyFlags |= 0x10000L;
                }
                else {
                        dirtyFlags |= 0x8000L;
                }
            }


                // read !filesRoot.get().isEmpty
                filesRootIsEmpty = !FilesRootIsEmpty1;
        }

        if ((dirtyFlags & 0x4dL) != 0) {

                // read tunnels.isEmpty ? !isDeleting.get() : false ? true : !filesRoot.get().isEmpty
                tunnelsIsEmptyIsDeletingBooleanFalseBooleanTrueFilesRootIsEmpty = ((tunnelsIsEmptyIsDeletingBooleanFalse) ? (true) : (filesRootIsEmpty));
            if((dirtyFlags & 0x4dL) != 0) {
                if(tunnelsIsEmptyIsDeletingBooleanFalseBooleanTrueFilesRootIsEmpty) {
                        dirtyFlags |= 0x100L;
                }
                else {
                        dirtyFlags |= 0x80L;
                }
            }


                // read tunnels.isEmpty ? !isDeleting.get() : false ? true : !filesRoot.get().isEmpty ? View.GONE : View.VISIBLE
                tunnelsIsEmptyIsDeletingBooleanFalseBooleanTrueFilesRootIsEmptyViewGONEViewVISIBLE = ((tunnelsIsEmptyIsDeletingBooleanFalseBooleanTrueFilesRootIsEmpty) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        // batch finished

        if ((dirtyFlags & 0x49L) != 0) {

                // read filesRoot.get().isEmpty ? tunnels.isEmpty : false
                filesRootIsEmptyTunnelsIsEmptyBooleanFalse = ((FilesRootIsEmpty1) ? (tunnelsIsEmpty) : (false));
            if((dirtyFlags & 0x49L) != 0) {
                if(filesRootIsEmptyTunnelsIsEmptyBooleanFalse) {
                        dirtyFlags |= 0x1000000L;
                }
                else {
                        dirtyFlags |= 0x800000L;
                }
            }


                // read filesRoot.get().isEmpty ? tunnels.isEmpty : false ? View.VISIBLE : View.GONE
                filesRootIsEmptyTunnelsIsEmptyBooleanFalseViewVISIBLEViewGONE = ((filesRootIsEmptyTunnelsIsEmptyBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x4dL) != 0) {
            // api target 1

            this.deleteButton.setVisibility(tunnelsIsEmptyIsDeletingBooleanFalseBooleanTrueFilesRootIsEmptyViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x44L) != 0) {
            // api target 1

            this.deleteButton.setIcon(isDeletingDeleteButtonAndroidDrawableIcArrowBackDeleteButtonAndroidDrawableIcActionDelete);
            this.importButton.setVisibility(isDeletingViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x41L) != 0) {
            // api target 1

            this.filesList.setVisibility(filesRootIsEmptyViewGONEViewVISIBLE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.filesRootLabel, filesRootGet);
            this.filesRootLabel.setVisibility(filesRootIsEmptyViewGONEViewVISIBLE);
            this.importButton.setIcon(filesRootIsEmptyImportButtonAndroidDrawableIcActionAddWhiteImportButtonAndroidDrawableIcArrowBack);
        }
        if ((dirtyFlags & 0x52L) != 0) {
            // api target 1

            com.wireguard.android.databinding.BindingAdapters.setItems(this.filesList, this.mOldFiles, this.mOldAndroidLayoutTvFileListItem, this.mOldFilesRowConfigurationHandler, files, R.layout.tv_file_list_item, filesRowConfigurationHandler);
        }
        if ((dirtyFlags & 0x49L) != 0) {
            // api target 1

            this.mboundView4.setVisibility(filesRootIsEmptyTunnelsIsEmptyBooleanFalseViewVISIBLEViewGONE);
            this.tunnelList.setVisibility(tunnelsIsEmptyBooleanTrueFilesRootIsEmptyViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x68L) != 0) {
            // api target 1

            com.wireguard.android.databinding.BindingAdapters.setItems(this.tunnelList, this.mOldTunnels, this.mOldAndroidLayoutTvTunnelListItem, this.mOldTunnelRowConfigurationHandler, tunnels, R.layout.tv_tunnel_list_item, tunnelRowConfigurationHandler);
        }
        if ((dirtyFlags & 0x52L) != 0) {
            this.mOldFiles = files;
            this.mOldAndroidLayoutTvFileListItem = R.layout.tv_file_list_item;
            this.mOldFilesRowConfigurationHandler = filesRowConfigurationHandler;
        }
        if ((dirtyFlags & 0x68L) != 0) {
            this.mOldTunnels = tunnels;
            this.mOldAndroidLayoutTvTunnelListItem = R.layout.tv_tunnel_list_item;
            this.mOldTunnelRowConfigurationHandler = tunnelRowConfigurationHandler;
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): filesRoot
        flag 1 (0x2L): files
        flag 2 (0x3L): isDeleting
        flag 3 (0x4L): tunnels
        flag 4 (0x5L): filesRowConfigurationHandler
        flag 5 (0x6L): tunnelRowConfigurationHandler
        flag 6 (0x7L): null
        flag 7 (0x8L): tunnels.isEmpty ? !isDeleting.get() : false ? true : !filesRoot.get().isEmpty ? View.GONE : View.VISIBLE
        flag 8 (0x9L): tunnels.isEmpty ? !isDeleting.get() : false ? true : !filesRoot.get().isEmpty ? View.GONE : View.VISIBLE
        flag 9 (0xaL): filesRoot.get().isEmpty ? View.GONE : View.VISIBLE
        flag 10 (0xbL): filesRoot.get().isEmpty ? View.GONE : View.VISIBLE
        flag 11 (0xcL): isDeleting.get() ? @android:drawable/ic_arrow_back : @android:drawable/ic_action_delete
        flag 12 (0xdL): isDeleting.get() ? @android:drawable/ic_arrow_back : @android:drawable/ic_action_delete
        flag 13 (0xeL): filesRoot.get().isEmpty ? @android:drawable/ic_action_add_white : @android:drawable/ic_arrow_back
        flag 14 (0xfL): filesRoot.get().isEmpty ? @android:drawable/ic_action_add_white : @android:drawable/ic_arrow_back
        flag 15 (0x10L): filesRoot.get().isEmpty ? tunnels.isEmpty : false
        flag 16 (0x11L): filesRoot.get().isEmpty ? tunnels.isEmpty : false
        flag 17 (0x12L): isDeleting.get() ? View.GONE : View.VISIBLE
        flag 18 (0x13L): isDeleting.get() ? View.GONE : View.VISIBLE
        flag 19 (0x14L): tunnels.isEmpty ? true : !filesRoot.get().isEmpty ? View.GONE : View.VISIBLE
        flag 20 (0x15L): tunnels.isEmpty ? true : !filesRoot.get().isEmpty ? View.GONE : View.VISIBLE
        flag 21 (0x16L): tunnels.isEmpty ? true : !filesRoot.get().isEmpty
        flag 22 (0x17L): tunnels.isEmpty ? true : !filesRoot.get().isEmpty
        flag 23 (0x18L): filesRoot.get().isEmpty ? tunnels.isEmpty : false ? View.VISIBLE : View.GONE
        flag 24 (0x19L): filesRoot.get().isEmpty ? tunnels.isEmpty : false ? View.VISIBLE : View.GONE
        flag 25 (0x1aL): tunnels.isEmpty ? !isDeleting.get() : false
        flag 26 (0x1bL): tunnels.isEmpty ? !isDeleting.get() : false
        flag 27 (0x1cL): tunnels.isEmpty ? !isDeleting.get() : false ? true : !filesRoot.get().isEmpty
        flag 28 (0x1dL): tunnels.isEmpty ? !isDeleting.get() : false ? true : !filesRoot.get().isEmpty
    flag mapping end*/
    //end
}