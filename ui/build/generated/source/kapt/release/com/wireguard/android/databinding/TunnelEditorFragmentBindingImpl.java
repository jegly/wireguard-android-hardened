package com.wireguard.android.databinding;
import com.wireguard.android.R;
import com.wireguard.android.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class TunnelEditorFragmentBindingImpl extends TunnelEditorFragmentBinding implements com.wireguard.android.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.interface_title, 11);
        sViewsWithIds.put(R.id.interface_name_layout, 12);
        sViewsWithIds.put(R.id.private_key_text_layout, 13);
        sViewsWithIds.put(R.id.public_key_label_layout, 14);
        sViewsWithIds.put(R.id.addresses_label_layout, 15);
        sViewsWithIds.put(R.id.listen_port_label_layout, 16);
        sViewsWithIds.put(R.id.dns_servers_label_layout, 17);
        sViewsWithIds.put(R.id.mtu_label_layout, 18);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    // values
    private androidx.databinding.ObservableList<com.wireguard.android.viewmodel.PeerProxy> mOldConfigPeers;
    private int mOldAndroidLayoutTunnelEditorPeer;
    private com.wireguard.android.fragment.TunnelEditorFragment mOldFragment;
    // listeners
    private OnFocusChangeListenerImpl mFragmentOnKeyFocusChangeAndroidViewViewOnFocusChangeListener;
    private OnClickListenerImpl mClipboardUtilsCopyTextViewAndroidViewViewOnClickListener;
    private OnClickListenerImpl1 mFragmentOnRequestSetExcludedIncludedApplicationsAndroidViewViewOnClickListener;
    private OnClickListenerImpl2 mFragmentOnKeyClickAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener addressesLabelTextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of config.interface.addresses
            //         is config.interface.setAddresses((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(addressesLabelText);
            // localize variables for thread safety
            // config != null
            boolean configJavaLangObjectNull = false;
            // config.interface
            com.wireguard.android.viewmodel.InterfaceProxy configInterface = null;
            // config.interface.addresses
            java.lang.String configInterfaceAddresses = null;
            // config.interface != null
            boolean configInterfaceJavaLangObjectNull = false;
            // config
            com.wireguard.android.viewmodel.ConfigProxy config = mConfig;



            configJavaLangObjectNull = (config) != (null);
            if (configJavaLangObjectNull) {


                configInterface = config.getInterface();

                configInterfaceJavaLangObjectNull = (configInterface) != (null);
                if (configInterfaceJavaLangObjectNull) {




                    configInterface.setAddresses(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener dnsServersTextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of config.interface.dnsServers
            //         is config.interface.setDnsServers((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(dnsServersText);
            // localize variables for thread safety
            // config != null
            boolean configJavaLangObjectNull = false;
            // config.interface
            com.wireguard.android.viewmodel.InterfaceProxy configInterface = null;
            // config.interface.dnsServers
            java.lang.String configInterfaceDnsServers = null;
            // config.interface != null
            boolean configInterfaceJavaLangObjectNull = false;
            // config
            com.wireguard.android.viewmodel.ConfigProxy config = mConfig;



            configJavaLangObjectNull = (config) != (null);
            if (configJavaLangObjectNull) {


                configInterface = config.getInterface();

                configInterfaceJavaLangObjectNull = (configInterface) != (null);
                if (configInterfaceJavaLangObjectNull) {




                    configInterface.setDnsServers(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener interfaceNameTextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of name
            //         is com.wireguard.android.databinding.TunnelEditorFragmentBindingImpl.this.setName(callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(interfaceNameText);
            // localize variables for thread safety
            // name
            java.lang.String name = mName;


            if ((com.wireguard.android.databinding.TunnelEditorFragmentBindingImpl.this) != (null)) {



                com.wireguard.android.databinding.TunnelEditorFragmentBindingImpl.this.setName(callbackArg_0);
            }
        }
    };
    private androidx.databinding.InverseBindingListener listenPortTextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of config.interface.listenPort
            //         is config.interface.setListenPort((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(listenPortText);
            // localize variables for thread safety
            // config != null
            boolean configJavaLangObjectNull = false;
            // config.interface
            com.wireguard.android.viewmodel.InterfaceProxy configInterface = null;
            // config.interface != null
            boolean configInterfaceJavaLangObjectNull = false;
            // config
            com.wireguard.android.viewmodel.ConfigProxy config = mConfig;
            // config.interface.listenPort
            java.lang.String configInterfaceListenPort = null;



            configJavaLangObjectNull = (config) != (null);
            if (configJavaLangObjectNull) {


                configInterface = config.getInterface();

                configInterfaceJavaLangObjectNull = (configInterface) != (null);
                if (configInterfaceJavaLangObjectNull) {




                    configInterface.setListenPort(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mtuTextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of config.interface.mtu
            //         is config.interface.setMtu((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mtuText);
            // localize variables for thread safety
            // config != null
            boolean configJavaLangObjectNull = false;
            // config.interface
            com.wireguard.android.viewmodel.InterfaceProxy configInterface = null;
            // config.interface.mtu
            java.lang.String configInterfaceMtu = null;
            // config.interface != null
            boolean configInterfaceJavaLangObjectNull = false;
            // config
            com.wireguard.android.viewmodel.ConfigProxy config = mConfig;



            configJavaLangObjectNull = (config) != (null);
            if (configJavaLangObjectNull) {


                configInterface = config.getInterface();

                configInterfaceJavaLangObjectNull = (configInterface) != (null);
                if (configInterfaceJavaLangObjectNull) {




                    configInterface.setMtu(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener privateKeyTextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of config.interface.privateKey
            //         is config.interface.setPrivateKey((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(privateKeyText);
            // localize variables for thread safety
            // config != null
            boolean configJavaLangObjectNull = false;
            // config.interface
            com.wireguard.android.viewmodel.InterfaceProxy configInterface = null;
            // config.interface.privateKey
            java.lang.String configInterfacePrivateKey = null;
            // config.interface != null
            boolean configInterfaceJavaLangObjectNull = false;
            // config
            com.wireguard.android.viewmodel.ConfigProxy config = mConfig;



            configJavaLangObjectNull = (config) != (null);
            if (configJavaLangObjectNull) {


                configInterface = config.getInterface();

                configInterfaceJavaLangObjectNull = (configInterface) != (null);
                if (configInterfaceJavaLangObjectNull) {




                    configInterface.setPrivateKey(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public TunnelEditorFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 19, sIncludes, sViewsWithIds));
    }
    private TunnelEditorFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (com.google.android.material.button.MaterialButton) bindings[10]
            , (com.google.android.material.textfield.TextInputLayout) bindings[15]
            , (com.google.android.material.textfield.TextInputEditText) bindings[4]
            , (com.google.android.material.textfield.TextInputLayout) bindings[17]
            , (com.google.android.material.textfield.TextInputEditText) bindings[6]
            , (com.google.android.material.textfield.TextInputLayout) bindings[12]
            , (com.google.android.material.textfield.TextInputEditText) bindings[1]
            , (com.google.android.material.textview.MaterialTextView) bindings[11]
            , (com.google.android.material.textfield.TextInputLayout) bindings[16]
            , (com.google.android.material.textfield.TextInputEditText) bindings[5]
            , (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0]
            , (com.google.android.material.textfield.TextInputLayout) bindings[18]
            , (com.google.android.material.textfield.TextInputEditText) bindings[7]
            , (android.widget.LinearLayout) bindings[9]
            , (com.google.android.material.textfield.TextInputEditText) bindings[2]
            , (com.google.android.material.textfield.TextInputLayout) bindings[13]
            , (com.google.android.material.textfield.TextInputLayout) bindings[14]
            , (com.google.android.material.textfield.TextInputEditText) bindings[3]
            , (com.google.android.material.button.MaterialButton) bindings[8]
            );
        this.addPeerButton.setTag(null);
        this.addressesLabelText.setTag(null);
        this.dnsServersText.setTag(null);
        this.interfaceNameText.setTag(null);
        this.listenPortText.setTag(null);
        this.mainContainer.setTag(null);
        this.mtuText.setTag(null);
        this.peersLayout.setTag(null);
        this.privateKeyText.setTag(null);
        this.publicKeyText.setTag(null);
        this.setExcludedApplications.setTag(null);
        setRootTag(root);
        // listeners
        mCallback2 = new com.wireguard.android.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2000L;
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
        if (BR.fragment == variableId) {
            setFragment((com.wireguard.android.fragment.TunnelEditorFragment) variable);
        }
        else if (BR.config == variableId) {
            setConfig((com.wireguard.android.viewmodel.ConfigProxy) variable);
        }
        else if (BR.name == variableId) {
            setName((java.lang.String) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFragment(@Nullable com.wireguard.android.fragment.TunnelEditorFragment Fragment) {
        this.mFragment = Fragment;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.fragment);
        super.requestRebind();
    }
    public void setConfig(@Nullable com.wireguard.android.viewmodel.ConfigProxy Config) {
        this.mConfig = Config;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.config);
        super.requestRebind();
    }
    public void setName(@Nullable java.lang.String Name) {
        this.mName = Name;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.name);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeConfigInterfaceExcludedApplications((androidx.databinding.ObservableList<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeConfigInterface((com.wireguard.android.viewmodel.InterfaceProxy) object, fieldId);
            case 2 :
                return onChangeConfigPeers((androidx.databinding.ObservableList<com.wireguard.android.viewmodel.PeerProxy>) object, fieldId);
            case 3 :
                return onChangeConfigInterfaceIncludedApplications((androidx.databinding.ObservableList<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeConfigInterfaceExcludedApplications(androidx.databinding.ObservableList<java.lang.String> ConfigInterfaceExcludedApplications, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeConfigInterface(com.wireguard.android.viewmodel.InterfaceProxy ConfigInterface, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        else if (fieldId == BR.privateKey) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        else if (fieldId == BR.publicKey) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        else if (fieldId == BR.addresses) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
            }
            return true;
        }
        else if (fieldId == BR.listenPort) {
            synchronized(this) {
                    mDirtyFlags |= 0x400L;
            }
            return true;
        }
        else if (fieldId == BR.dnsServers) {
            synchronized(this) {
                    mDirtyFlags |= 0x800L;
            }
            return true;
        }
        else if (fieldId == BR.mtu) {
            synchronized(this) {
                    mDirtyFlags |= 0x1000L;
            }
            return true;
        }
        else if (fieldId == BR.includedApplications) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        else if (fieldId == BR.excludedApplications) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeConfigPeers(androidx.databinding.ObservableList<com.wireguard.android.viewmodel.PeerProxy> ConfigPeers, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeConfigInterfaceIncludedApplications(androidx.databinding.ObservableList<java.lang.String> ConfigInterfaceIncludedApplications, int fieldId) {
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
        com.wireguard.android.fragment.TunnelEditorFragment fragment = mFragment;
        androidx.databinding.ObservableList<java.lang.String> configInterfaceExcludedApplications = null;
        java.lang.String configInterfaceMtu = null;
        com.wireguard.android.viewmodel.ConfigProxy config = mConfig;
        java.lang.String configInterfacePrivateKey = null;
        android.view.View.OnFocusChangeListener fragmentOnKeyFocusChangeAndroidViewViewOnFocusChangeListener = null;
        boolean configInterfaceIncludedApplicationsSizeInt0 = false;
        com.wireguard.android.viewmodel.InterfaceProxy configInterface = null;
        java.lang.String setExcludedApplicationsAndroidPluralsSetExcludedApplicationsConfigInterfaceExcludedApplicationsSizeConfigInterfaceExcludedApplicationsSize = null;
        java.lang.String name = mName;
        int configInterfaceExcludedApplicationsSize = 0;
        java.lang.String configInterfaceIncludedApplicationsSizeInt0SetExcludedApplicationsAndroidPluralsSetIncludedApplicationsConfigInterfaceIncludedApplicationsSizeConfigInterfaceIncludedApplicationsSizeConfigInterfaceExcludedApplicationsSizeInt0SetExcludedApplicationsAndroidPluralsSetExcludedApplicationsConfigInterfaceExcludedApplicationsSizeConfigInterfaceExcludedApplicationsSizeSetExcludedApplicationsAndroidStringAllApplications = null;
        java.lang.String configInterfaceExcludedApplicationsSizeInt0SetExcludedApplicationsAndroidPluralsSetExcludedApplicationsConfigInterfaceExcludedApplicationsSizeConfigInterfaceExcludedApplicationsSizeSetExcludedApplicationsAndroidStringAllApplications = null;
        java.lang.String configInterfacePublicKey = null;
        android.view.View.OnClickListener fragmentOnRequestSetExcludedIncludedApplicationsAndroidViewViewOnClickListener = null;
        androidx.databinding.ObservableList<com.wireguard.android.viewmodel.PeerProxy> configPeers = null;
        int configInterfaceIncludedApplicationsSize = 0;
        boolean configInterfaceExcludedApplicationsSizeInt0 = false;
        androidx.databinding.ObservableList<java.lang.String> configInterfaceIncludedApplications = null;
        java.lang.String configInterfaceDnsServers = null;
        java.lang.String setExcludedApplicationsAndroidPluralsSetIncludedApplicationsConfigInterfaceIncludedApplicationsSizeConfigInterfaceIncludedApplicationsSize = null;
        android.view.View.OnClickListener fragmentOnKeyClickAndroidViewViewOnClickListener = null;
        java.lang.String configInterfaceListenPort = null;
        java.lang.String configInterfaceAddresses = null;

        if ((dirtyFlags & 0x2034L) != 0) {


            if ((dirtyFlags & 0x2010L) != 0) {

                    if (fragment != null) {
                        // read fragment::onKeyFocusChange
                        fragmentOnKeyFocusChangeAndroidViewViewOnFocusChangeListener = (((mFragmentOnKeyFocusChangeAndroidViewViewOnFocusChangeListener == null) ? (mFragmentOnKeyFocusChangeAndroidViewViewOnFocusChangeListener = new OnFocusChangeListenerImpl()) : mFragmentOnKeyFocusChangeAndroidViewViewOnFocusChangeListener).setValue(fragment));
                        // read fragment::onRequestSetExcludedIncludedApplications
                        fragmentOnRequestSetExcludedIncludedApplicationsAndroidViewViewOnClickListener = (((mFragmentOnRequestSetExcludedIncludedApplicationsAndroidViewViewOnClickListener == null) ? (mFragmentOnRequestSetExcludedIncludedApplicationsAndroidViewViewOnClickListener = new OnClickListenerImpl1()) : mFragmentOnRequestSetExcludedIncludedApplicationsAndroidViewViewOnClickListener).setValue(fragment));
                        // read fragment::onKeyClick
                        fragmentOnKeyClickAndroidViewViewOnClickListener = (((mFragmentOnKeyClickAndroidViewViewOnClickListener == null) ? (mFragmentOnKeyClickAndroidViewViewOnClickListener = new OnClickListenerImpl2()) : mFragmentOnKeyClickAndroidViewViewOnClickListener).setValue(fragment));
                    }
            }
        }
        if ((dirtyFlags & 0x3fbfL) != 0) {


            if ((dirtyFlags & 0x3fabL) != 0) {

                    if (config != null) {
                        // read config.interface
                        configInterface = config.getInterface();
                    }
                    updateRegistration(1, configInterface);

                if ((dirtyFlags & 0x3022L) != 0) {

                        if (configInterface != null) {
                            // read config.interface.mtu
                            configInterfaceMtu = configInterface.getMtu();
                        }
                }
                if ((dirtyFlags & 0x20a2L) != 0) {

                        if (configInterface != null) {
                            // read config.interface.privateKey
                            configInterfacePrivateKey = configInterface.getPrivateKey();
                        }
                }
                if ((dirtyFlags & 0x2122L) != 0) {

                        if (configInterface != null) {
                            // read config.interface.publicKey
                            configInterfacePublicKey = configInterface.getPublicKey();
                        }
                }
                if ((dirtyFlags & 0x202bL) != 0) {

                        if (configInterface != null) {
                            // read config.interface.includedApplications
                            configInterfaceIncludedApplications = configInterface.getIncludedApplications();
                        }
                        updateRegistration(3, configInterfaceIncludedApplications);


                        if (configInterfaceIncludedApplications != null) {
                            // read config.interface.includedApplications.size
                            configInterfaceIncludedApplicationsSize = configInterfaceIncludedApplications.size();
                        }


                        // read config.interface.includedApplications.size > 0
                        configInterfaceIncludedApplicationsSizeInt0 = (configInterfaceIncludedApplicationsSize) > (0);
                    if((dirtyFlags & 0x202bL) != 0) {
                        if(configInterfaceIncludedApplicationsSizeInt0) {
                                dirtyFlags |= 0x8000L;
                        }
                        else {
                                dirtyFlags |= 0x4000L;
                        }
                    }
                }
                if ((dirtyFlags & 0x2822L) != 0) {

                        if (configInterface != null) {
                            // read config.interface.dnsServers
                            configInterfaceDnsServers = configInterface.getDnsServers();
                        }
                }
                if ((dirtyFlags & 0x2422L) != 0) {

                        if (configInterface != null) {
                            // read config.interface.listenPort
                            configInterfaceListenPort = configInterface.getListenPort();
                        }
                }
                if ((dirtyFlags & 0x2222L) != 0) {

                        if (configInterface != null) {
                            // read config.interface.addresses
                            configInterfaceAddresses = configInterface.getAddresses();
                        }
                }
            }
            if ((dirtyFlags & 0x2034L) != 0) {

                    if (config != null) {
                        // read config.peers
                        configPeers = config.getPeers();
                    }
                    updateRegistration(2, configPeers);
            }
        }
        if ((dirtyFlags & 0x2040L) != 0) {
        }
        // batch finished

        if ((dirtyFlags & 0x4000L) != 0) {



                if (config != null) {
                    // read config.interface
                    configInterface = config.getInterface();
                }
                updateRegistration(1, configInterface);


                if (configInterface != null) {
                    // read config.interface.excludedApplications
                    configInterfaceExcludedApplications = configInterface.getExcludedApplications();
                }
                updateRegistration(0, configInterfaceExcludedApplications);


                if (configInterfaceExcludedApplications != null) {
                    // read config.interface.excludedApplications.size
                    configInterfaceExcludedApplicationsSize = configInterfaceExcludedApplications.size();
                }


                // read config.interface.excludedApplications.size > 0
                configInterfaceExcludedApplicationsSizeInt0 = (configInterfaceExcludedApplicationsSize) > (0);
            if((dirtyFlags & 0x4000L) != 0) {
                if(configInterfaceExcludedApplicationsSizeInt0) {
                        dirtyFlags |= 0x20000L;
                }
                else {
                        dirtyFlags |= 0x10000L;
                }
            }
        }
        if ((dirtyFlags & 0x8000L) != 0) {

                // read @android:plurals/set_included_applications
                setExcludedApplicationsAndroidPluralsSetIncludedApplicationsConfigInterfaceIncludedApplicationsSizeConfigInterfaceIncludedApplicationsSize = setExcludedApplications.getResources().getQuantityString(R.plurals.set_included_applications, configInterfaceIncludedApplicationsSize, configInterfaceIncludedApplicationsSize);
        }
        // batch finished

        if ((dirtyFlags & 0x20000L) != 0) {

                // read @android:plurals/set_excluded_applications
                setExcludedApplicationsAndroidPluralsSetExcludedApplicationsConfigInterfaceExcludedApplicationsSizeConfigInterfaceExcludedApplicationsSize = setExcludedApplications.getResources().getQuantityString(R.plurals.set_excluded_applications, configInterfaceExcludedApplicationsSize, configInterfaceExcludedApplicationsSize);
        }

        if ((dirtyFlags & 0x4000L) != 0) {

                // read config.interface.excludedApplications.size > 0 ? @android:plurals/set_excluded_applications : @android:string/all_applications
                configInterfaceExcludedApplicationsSizeInt0SetExcludedApplicationsAndroidPluralsSetExcludedApplicationsConfigInterfaceExcludedApplicationsSizeConfigInterfaceExcludedApplicationsSizeSetExcludedApplicationsAndroidStringAllApplications = ((configInterfaceExcludedApplicationsSizeInt0) ? (setExcludedApplicationsAndroidPluralsSetExcludedApplicationsConfigInterfaceExcludedApplicationsSizeConfigInterfaceExcludedApplicationsSize) : (setExcludedApplications.getResources().getString(R.string.all_applications)));
        }

        if ((dirtyFlags & 0x202bL) != 0) {

                // read config.interface.includedApplications.size > 0 ? @android:plurals/set_included_applications : config.interface.excludedApplications.size > 0 ? @android:plurals/set_excluded_applications : @android:string/all_applications
                configInterfaceIncludedApplicationsSizeInt0SetExcludedApplicationsAndroidPluralsSetIncludedApplicationsConfigInterfaceIncludedApplicationsSizeConfigInterfaceIncludedApplicationsSizeConfigInterfaceExcludedApplicationsSizeInt0SetExcludedApplicationsAndroidPluralsSetExcludedApplicationsConfigInterfaceExcludedApplicationsSizeConfigInterfaceExcludedApplicationsSizeSetExcludedApplicationsAndroidStringAllApplications = ((configInterfaceIncludedApplicationsSizeInt0) ? (setExcludedApplicationsAndroidPluralsSetIncludedApplicationsConfigInterfaceIncludedApplicationsSizeConfigInterfaceIncludedApplicationsSize) : (configInterfaceExcludedApplicationsSizeInt0SetExcludedApplicationsAndroidPluralsSetExcludedApplicationsConfigInterfaceExcludedApplicationsSizeConfigInterfaceExcludedApplicationsSizeSetExcludedApplicationsAndroidStringAllApplications));
        }
        // batch finished
        if ((dirtyFlags & 0x2000L) != 0) {
            // api target 1

            this.addPeerButton.setOnClickListener(mCallback2);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.addressesLabelText, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, addressesLabelTextandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.dnsServersText, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, dnsServersTextandroidTextAttrChanged);
            com.wireguard.android.databinding.BindingAdapters.setFilter(this.interfaceNameText, com.wireguard.android.widget.NameInputFilter.newInstance());
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.interfaceNameText, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, interfaceNameTextandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.listenPortText, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, listenPortTextandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mtuText, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mtuTextandroidTextAttrChanged);
            com.wireguard.android.databinding.BindingAdapters.setFilter(this.privateKeyText, com.wireguard.android.widget.KeyInputFilter.newInstance());
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.privateKeyText, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, privateKeyTextandroidTextAttrChanged);
            this.publicKeyText.setOnClickListener((((mClipboardUtilsCopyTextViewAndroidViewViewOnClickListener == null) ? (mClipboardUtilsCopyTextViewAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mClipboardUtilsCopyTextViewAndroidViewViewOnClickListener)));
        }
        if ((dirtyFlags & 0x2222L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.addressesLabelText, configInterfaceAddresses);
        }
        if ((dirtyFlags & 0x2822L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.dnsServersText, configInterfaceDnsServers);
        }
        if ((dirtyFlags & 0x2040L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.interfaceNameText, name);
        }
        if ((dirtyFlags & 0x2422L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.listenPortText, configInterfaceListenPort);
        }
        if ((dirtyFlags & 0x3022L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mtuText, configInterfaceMtu);
        }
        if ((dirtyFlags & 0x2034L) != 0) {
            // api target 1

            com.wireguard.android.databinding.BindingAdapters.setItems(this.peersLayout, this.mOldConfigPeers, this.mOldAndroidLayoutTunnelEditorPeer, this.mOldFragment, configPeers, R.layout.tunnel_editor_peer, fragment);
        }
        if ((dirtyFlags & 0x2010L) != 0) {
            // api target 1

            this.privateKeyText.setOnClickListener(fragmentOnKeyClickAndroidViewViewOnClickListener);
            com.wireguard.android.databinding.BindingAdapters.setOnFocusChange(this.privateKeyText, fragmentOnKeyFocusChangeAndroidViewViewOnFocusChangeListener);
            this.setExcludedApplications.setOnClickListener(fragmentOnRequestSetExcludedIncludedApplicationsAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0x20a2L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.privateKeyText, configInterfacePrivateKey);
        }
        if ((dirtyFlags & 0x2122L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.publicKeyText, configInterfacePublicKey);
        }
        if ((dirtyFlags & 0x202bL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.setExcludedApplications, configInterfaceIncludedApplicationsSizeInt0SetExcludedApplicationsAndroidPluralsSetIncludedApplicationsConfigInterfaceIncludedApplicationsSizeConfigInterfaceIncludedApplicationsSizeConfigInterfaceExcludedApplicationsSizeInt0SetExcludedApplicationsAndroidPluralsSetExcludedApplicationsConfigInterfaceExcludedApplicationsSizeConfigInterfaceExcludedApplicationsSizeSetExcludedApplicationsAndroidStringAllApplications);
        }
        if ((dirtyFlags & 0x2034L) != 0) {
            this.mOldConfigPeers = configPeers;
            this.mOldAndroidLayoutTunnelEditorPeer = R.layout.tunnel_editor_peer;
            this.mOldFragment = fragment;
        }
    }
    // Listener Stub Implementations
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
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        @Override
        public void onClick(android.view.View arg0) {
            com.wireguard.android.util.ClipboardUtils.copyTextView(arg0); 
        }
    }
    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener{
        private com.wireguard.android.fragment.TunnelEditorFragment value;
        public OnClickListenerImpl1 setValue(com.wireguard.android.fragment.TunnelEditorFragment value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onRequestSetExcludedIncludedApplications(arg0); 
        }
    }
    public static class OnClickListenerImpl2 implements android.view.View.OnClickListener{
        private com.wireguard.android.fragment.TunnelEditorFragment value;
        public OnClickListenerImpl2 setValue(com.wireguard.android.fragment.TunnelEditorFragment value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onKeyClick(arg0); 
        }
    }
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // config.addPeer()
        com.wireguard.android.viewmodel.PeerProxy configAddPeer = null;
        // config != null
        boolean configJavaLangObjectNull = false;
        // config
        com.wireguard.android.viewmodel.ConfigProxy config = mConfig;



        configJavaLangObjectNull = (config) != (null);
        if (configJavaLangObjectNull) {


            configAddPeer = config.addPeer();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): config.interface.excludedApplications
        flag 1 (0x2L): config.interface
        flag 2 (0x3L): config.peers
        flag 3 (0x4L): config.interface.includedApplications
        flag 4 (0x5L): fragment
        flag 5 (0x6L): config
        flag 6 (0x7L): name
        flag 7 (0x8L): config.interface.privateKey
        flag 8 (0x9L): config.interface.publicKey
        flag 9 (0xaL): config.interface.addresses
        flag 10 (0xbL): config.interface.listenPort
        flag 11 (0xcL): config.interface.dnsServers
        flag 12 (0xdL): config.interface.mtu
        flag 13 (0xeL): null
        flag 14 (0xfL): config.interface.includedApplications.size > 0 ? @android:plurals/set_included_applications : config.interface.excludedApplications.size > 0 ? @android:plurals/set_excluded_applications : @android:string/all_applications
        flag 15 (0x10L): config.interface.includedApplications.size > 0 ? @android:plurals/set_included_applications : config.interface.excludedApplications.size > 0 ? @android:plurals/set_excluded_applications : @android:string/all_applications
        flag 16 (0x11L): config.interface.excludedApplications.size > 0 ? @android:plurals/set_excluded_applications : @android:string/all_applications
        flag 17 (0x12L): config.interface.excludedApplications.size > 0 ? @android:plurals/set_excluded_applications : @android:string/all_applications
    flag mapping end*/
    //end
}