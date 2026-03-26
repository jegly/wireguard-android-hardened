package com.wireguard.android.databinding;
import com.wireguard.android.R;
import com.wireguard.android.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class TunnelDetailFragmentBindingImpl extends TunnelDetailFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tunnel_detail_card, 17);
        sViewsWithIds.put(R.id.interface_title, 18);
        sViewsWithIds.put(R.id.interface_name_label, 19);
        sViewsWithIds.put(R.id.public_key_label, 20);
        sViewsWithIds.put(R.id.listen_port_mtu_barrier, 21);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    // values
    private java.util.List<com.wireguard.config.Peer> mOldConfigPeers;
    private int mOldAndroidLayoutTunnelDetailPeer;
    // listeners
    private OnBeforeCheckedChangeListenerImpl mFragmentSetTunnelStateComWireguardAndroidWidgetToggleSwitchOnBeforeCheckedChangeListener;
    private OnClickListenerImpl mClipboardUtilsCopyTextViewAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public TunnelDetailFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 22, sIncludes, sViewsWithIds));
    }
    private TunnelDetailFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[19]
            , (android.widget.TextView) bindings[2]
            , (com.google.android.material.textview.MaterialTextView) bindings[18]
            , (android.widget.TextView) bindings[10]
            , (androidx.constraintlayout.widget.Barrier) bindings[21]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[13]
            , (android.widget.LinearLayout) bindings[16]
            , (android.widget.TextView) bindings[20]
            , (android.widget.TextView) bindings[3]
            , (com.google.android.material.card.MaterialCardView) bindings[17]
            , (com.wireguard.android.widget.ToggleSwitch) bindings[1]
            );
        this.addressesLabel.setTag(null);
        this.addressesText.setTag(null);
        this.applicationsLabel.setTag(null);
        this.applicationsText.setTag(null);
        this.dnsSearchDomainsLabel.setTag(null);
        this.dnsSearchDomainsText.setTag(null);
        this.dnsServersLabel.setTag(null);
        this.dnsServersText.setTag(null);
        this.interfaceNameText.setTag(null);
        this.listenPortLabel.setTag(null);
        this.listenPortText.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mtuLabel.setTag(null);
        this.mtuText.setTag(null);
        this.peersLayout.setTag(null);
        this.publicKeyText.setTag(null);
        this.tunnelSwitch.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
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
            setFragment((com.wireguard.android.fragment.TunnelDetailFragment) variable);
        }
        else if (BR.config == variableId) {
            setConfig((com.wireguard.config.Config) variable);
        }
        else if (BR.tunnel == variableId) {
            setTunnel((com.wireguard.android.model.ObservableTunnel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFragment(@Nullable com.wireguard.android.fragment.TunnelDetailFragment Fragment) {
        this.mFragment = Fragment;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.fragment);
        super.requestRebind();
    }
    public void setConfig(@Nullable com.wireguard.config.Config Config) {
        this.mConfig = Config;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.config);
        super.requestRebind();
    }
    public void setTunnel(@Nullable com.wireguard.android.model.ObservableTunnel Tunnel) {
        updateRegistration(0, Tunnel);
        this.mTunnel = Tunnel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.tunnel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeTunnel((com.wireguard.android.model.ObservableTunnel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeTunnel(com.wireguard.android.model.ObservableTunnel Tunnel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.state) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        else if (fieldId == BR.name) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
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
        boolean configInterfaceAddressesIsEmpty = false;
        com.wireguard.android.widget.ToggleSwitch.OnBeforeCheckedChangeListener fragmentSetTunnelStateComWireguardAndroidWidgetToggleSwitchOnBeforeCheckedChangeListener = null;
        com.wireguard.crypto.Key configInterfaceKeyPairPublicKey = null;
        com.wireguard.android.fragment.TunnelDetailFragment fragment = mFragment;
        java.util.Set<java.lang.String> configInterfaceExcludedApplications = null;
        boolean configInterfaceListenPortIsPresent = false;
        boolean tunnelStateStateUP = false;
        java.lang.String configInterfaceIncludedApplicationsIsEmptyApplicationsTextAndroidPluralsNExcludedApplicationsConfigInterfaceExcludedApplicationsSizeConfigInterfaceExcludedApplicationsSizeApplicationsTextAndroidPluralsNIncludedApplicationsConfigInterfaceIncludedApplicationsSizeConfigInterfaceIncludedApplicationsSize = null;
        int configInterfaceIncludedApplicationsSize = 0;
        int configInterfaceDnsServersIsEmptyAndroidViewViewGONEAndroidViewViewVISIBLE = 0;
        java.lang.String applicationsTextAndroidPluralsNExcludedApplicationsConfigInterfaceExcludedApplicationsSizeConfigInterfaceExcludedApplicationsSize = null;
        java.util.Optional<java.lang.Integer> configInterfaceMtu = null;
        com.wireguard.config.Config config = mConfig;
        com.wireguard.android.backend.Tunnel.State tunnelState = null;
        com.wireguard.crypto.KeyPair configInterfaceKeyPair = null;
        int configInterfaceMtuIsPresentAndroidViewViewGONEAndroidViewViewVISIBLE = 0;
        int configInterfaceExcludedApplicationsSize = 0;
        int configInterfaceListenPortIsPresentAndroidViewViewGONEAndroidViewViewVISIBLE = 0;
        int configInterfaceDnsSearchDomainsIsEmptyAndroidViewViewGONEAndroidViewViewVISIBLE = 0;
        com.wireguard.config.Interface configInterface = null;
        int configInterfaceAddressesIsEmptyAndroidViewViewGONEAndroidViewViewVISIBLE = 0;
        java.lang.String applicationsTextAndroidPluralsNIncludedApplicationsConfigInterfaceIncludedApplicationsSizeConfigInterfaceIncludedApplicationsSize = null;
        java.util.Set<java.lang.String> configInterfaceDnsSearchDomains = null;
        boolean configInterfaceIncludedApplicationsIsEmptyConfigInterfaceExcludedApplicationsIsEmptyBooleanFalse = false;
        boolean configInterfaceMtuIsPresent = false;
        java.lang.String tunnelName = null;
        java.lang.String configInterfaceKeyPairPublicKeyToBase64 = null;
        int configInterfaceIncludedApplicationsIsEmptyConfigInterfaceExcludedApplicationsIsEmptyBooleanFalseAndroidViewViewGONEAndroidViewViewVISIBLE = 0;
        java.util.List<com.wireguard.config.Peer> configPeers = null;
        boolean configInterfaceDnsSearchDomainsIsEmpty = false;
        java.util.Set<java.lang.String> configInterfaceIncludedApplications = null;
        java.util.Set<java.net.InetAddress> configInterfaceDnsServers = null;
        java.util.Optional<java.lang.Integer> configInterfaceListenPort = null;
        boolean configInterfaceExcludedApplicationsIsEmpty = false;
        boolean configInterfaceDnsServersIsEmpty = false;
        java.util.Set<com.wireguard.config.InetNetwork> configInterfaceAddresses = null;
        boolean ConfigInterfaceListenPortIsPresent1 = false;
        boolean ConfigInterfaceMtuIsPresent1 = false;
        com.wireguard.android.model.ObservableTunnel tunnel = mTunnel;
        boolean configInterfaceIncludedApplicationsIsEmpty = false;

        if ((dirtyFlags & 0x22L) != 0) {



                if (fragment != null) {
                    // read fragment::setTunnelState
                    fragmentSetTunnelStateComWireguardAndroidWidgetToggleSwitchOnBeforeCheckedChangeListener = (((mFragmentSetTunnelStateComWireguardAndroidWidgetToggleSwitchOnBeforeCheckedChangeListener == null) ? (mFragmentSetTunnelStateComWireguardAndroidWidgetToggleSwitchOnBeforeCheckedChangeListener = new OnBeforeCheckedChangeListenerImpl()) : mFragmentSetTunnelStateComWireguardAndroidWidgetToggleSwitchOnBeforeCheckedChangeListener).setValue(fragment));
                }
        }
        if ((dirtyFlags & 0x24L) != 0) {



                if (config != null) {
                    // read config.interface
                    configInterface = config.getInterface();
                    // read config.peers
                    configPeers = config.getPeers();
                }


                if (configInterface != null) {
                    // read config.interface.mtu
                    configInterfaceMtu = configInterface.getMtu();
                    // read config.interface.keyPair
                    configInterfaceKeyPair = configInterface.getKeyPair();
                    // read config.interface.dnsSearchDomains
                    configInterfaceDnsSearchDomains = configInterface.getDnsSearchDomains();
                    // read config.interface.includedApplications
                    configInterfaceIncludedApplications = configInterface.getIncludedApplications();
                    // read config.interface.dnsServers
                    configInterfaceDnsServers = configInterface.getDnsServers();
                    // read config.interface.listenPort
                    configInterfaceListenPort = configInterface.getListenPort();
                    // read config.interface.addresses
                    configInterfaceAddresses = configInterface.getAddresses();
                }


                if (configInterfaceMtu != null) {
                    // read config.interface.mtu.isPresent()
                    ConfigInterfaceMtuIsPresent1 = configInterfaceMtu.isPresent();
                }
                if (configInterfaceKeyPair != null) {
                    // read config.interface.keyPair.publicKey
                    configInterfaceKeyPairPublicKey = configInterfaceKeyPair.getPublicKey();
                }
                if (configInterfaceDnsSearchDomains != null) {
                    // read config.interface.dnsSearchDomains.isEmpty()
                    configInterfaceDnsSearchDomainsIsEmpty = configInterfaceDnsSearchDomains.isEmpty();
                }
            if((dirtyFlags & 0x24L) != 0) {
                if(configInterfaceDnsSearchDomainsIsEmpty) {
                        dirtyFlags |= 0x8000L;
                }
                else {
                        dirtyFlags |= 0x4000L;
                }
            }
                if (configInterfaceIncludedApplications != null) {
                    // read config.interface.includedApplications.isEmpty()
                    configInterfaceIncludedApplicationsIsEmpty = configInterfaceIncludedApplications.isEmpty();
                }
            if((dirtyFlags & 0x24L) != 0) {
                if(configInterfaceIncludedApplicationsIsEmpty) {
                        dirtyFlags |= 0x80L;
                        dirtyFlags |= 0x80000L;
                }
                else {
                        dirtyFlags |= 0x40L;
                        dirtyFlags |= 0x40000L;
                }
            }
                if (configInterfaceDnsServers != null) {
                    // read config.interface.dnsServers.isEmpty()
                    configInterfaceDnsServersIsEmpty = configInterfaceDnsServers.isEmpty();
                }
            if((dirtyFlags & 0x24L) != 0) {
                if(configInterfaceDnsServersIsEmpty) {
                        dirtyFlags |= 0x200L;
                }
                else {
                        dirtyFlags |= 0x100L;
                }
            }
                if (configInterfaceListenPort != null) {
                    // read config.interface.listenPort.isPresent()
                    ConfigInterfaceListenPortIsPresent1 = configInterfaceListenPort.isPresent();
                }
                if (configInterfaceAddresses != null) {
                    // read config.interface.addresses.isEmpty()
                    configInterfaceAddressesIsEmpty = configInterfaceAddresses.isEmpty();
                }
            if((dirtyFlags & 0x24L) != 0) {
                if(configInterfaceAddressesIsEmpty) {
                        dirtyFlags |= 0x20000L;
                }
                else {
                        dirtyFlags |= 0x10000L;
                }
            }


                // read !config.interface.mtu.isPresent()
                configInterfaceMtuIsPresent = !ConfigInterfaceMtuIsPresent1;
                // read config.interface.dnsSearchDomains.isEmpty() ? android.view.View.GONE : android.view.View.VISIBLE
                configInterfaceDnsSearchDomainsIsEmptyAndroidViewViewGONEAndroidViewViewVISIBLE = ((configInterfaceDnsSearchDomainsIsEmpty) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                // read config.interface.dnsServers.isEmpty() ? android.view.View.GONE : android.view.View.VISIBLE
                configInterfaceDnsServersIsEmptyAndroidViewViewGONEAndroidViewViewVISIBLE = ((configInterfaceDnsServersIsEmpty) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                // read !config.interface.listenPort.isPresent()
                configInterfaceListenPortIsPresent = !ConfigInterfaceListenPortIsPresent1;
                // read config.interface.addresses.isEmpty() ? android.view.View.GONE : android.view.View.VISIBLE
                configInterfaceAddressesIsEmptyAndroidViewViewGONEAndroidViewViewVISIBLE = ((configInterfaceAddressesIsEmpty) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            if((dirtyFlags & 0x24L) != 0) {
                if(configInterfaceMtuIsPresent) {
                        dirtyFlags |= 0x800L;
                }
                else {
                        dirtyFlags |= 0x400L;
                }
            }
            if((dirtyFlags & 0x24L) != 0) {
                if(configInterfaceListenPortIsPresent) {
                        dirtyFlags |= 0x2000L;
                }
                else {
                        dirtyFlags |= 0x1000L;
                }
            }
                if (configInterfaceKeyPairPublicKey != null) {
                    // read config.interface.keyPair.publicKey.toBase64
                    configInterfaceKeyPairPublicKeyToBase64 = configInterfaceKeyPairPublicKey.toBase64();
                }


                // read !config.interface.mtu.isPresent() ? android.view.View.GONE : android.view.View.VISIBLE
                configInterfaceMtuIsPresentAndroidViewViewGONEAndroidViewViewVISIBLE = ((configInterfaceMtuIsPresent) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                // read !config.interface.listenPort.isPresent() ? android.view.View.GONE : android.view.View.VISIBLE
                configInterfaceListenPortIsPresentAndroidViewViewGONEAndroidViewViewVISIBLE = ((configInterfaceListenPortIsPresent) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        if ((dirtyFlags & 0x39L) != 0) {


            if ((dirtyFlags & 0x29L) != 0) {

                    if (tunnel != null) {
                        // read tunnel.state
                        tunnelState = tunnel.getState();
                    }


                    // read tunnel.state == State.UP
                    tunnelStateStateUP = (tunnelState) == (com.wireguard.android.backend.Tunnel.State.UP);
            }
            if ((dirtyFlags & 0x31L) != 0) {

                    if (tunnel != null) {
                        // read tunnel.name
                        tunnelName = tunnel.getName();
                    }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x80080L) != 0) {

                if (configInterface != null) {
                    // read config.interface.excludedApplications
                    configInterfaceExcludedApplications = configInterface.getExcludedApplications();
                }

            if ((dirtyFlags & 0x80L) != 0) {

                    if (configInterfaceExcludedApplications != null) {
                        // read config.interface.excludedApplications.size()
                        configInterfaceExcludedApplicationsSize = configInterfaceExcludedApplications.size();
                    }


                    // read @android:plurals/n_excluded_applications
                    applicationsTextAndroidPluralsNExcludedApplicationsConfigInterfaceExcludedApplicationsSizeConfigInterfaceExcludedApplicationsSize = applicationsText.getResources().getQuantityString(R.plurals.n_excluded_applications, configInterfaceExcludedApplicationsSize, configInterfaceExcludedApplicationsSize);
                    // read @android:plurals/n_excluded_applications
                    applicationsTextAndroidPluralsNExcludedApplicationsConfigInterfaceExcludedApplicationsSizeConfigInterfaceExcludedApplicationsSize = applicationsText.getResources().getQuantityString(R.plurals.n_excluded_applications, configInterfaceExcludedApplicationsSize, configInterfaceExcludedApplicationsSize);
            }
            if ((dirtyFlags & 0x80000L) != 0) {

                    if (configInterfaceExcludedApplications != null) {
                        // read config.interface.excludedApplications.isEmpty()
                        configInterfaceExcludedApplicationsIsEmpty = configInterfaceExcludedApplications.isEmpty();
                    }
            }
        }
        if ((dirtyFlags & 0x40L) != 0) {

                if (configInterfaceIncludedApplications != null) {
                    // read config.interface.includedApplications.size()
                    configInterfaceIncludedApplicationsSize = configInterfaceIncludedApplications.size();
                }


                // read @android:plurals/n_included_applications
                applicationsTextAndroidPluralsNIncludedApplicationsConfigInterfaceIncludedApplicationsSizeConfigInterfaceIncludedApplicationsSize = applicationsText.getResources().getQuantityString(R.plurals.n_included_applications, configInterfaceIncludedApplicationsSize, configInterfaceIncludedApplicationsSize);
                // read @android:plurals/n_included_applications
                applicationsTextAndroidPluralsNIncludedApplicationsConfigInterfaceIncludedApplicationsSizeConfigInterfaceIncludedApplicationsSize = applicationsText.getResources().getQuantityString(R.plurals.n_included_applications, configInterfaceIncludedApplicationsSize, configInterfaceIncludedApplicationsSize);
        }

        if ((dirtyFlags & 0x24L) != 0) {

                // read config.interface.includedApplications.isEmpty() ? @android:plurals/n_excluded_applications : @android:plurals/n_included_applications
                configInterfaceIncludedApplicationsIsEmptyApplicationsTextAndroidPluralsNExcludedApplicationsConfigInterfaceExcludedApplicationsSizeConfigInterfaceExcludedApplicationsSizeApplicationsTextAndroidPluralsNIncludedApplicationsConfigInterfaceIncludedApplicationsSizeConfigInterfaceIncludedApplicationsSize = ((configInterfaceIncludedApplicationsIsEmpty) ? (applicationsTextAndroidPluralsNExcludedApplicationsConfigInterfaceExcludedApplicationsSizeConfigInterfaceExcludedApplicationsSize) : (applicationsTextAndroidPluralsNIncludedApplicationsConfigInterfaceIncludedApplicationsSizeConfigInterfaceIncludedApplicationsSize));
                // read config.interface.includedApplications.isEmpty() ? config.interface.excludedApplications.isEmpty() : false
                configInterfaceIncludedApplicationsIsEmptyConfigInterfaceExcludedApplicationsIsEmptyBooleanFalse = ((configInterfaceIncludedApplicationsIsEmpty) ? (configInterfaceExcludedApplicationsIsEmpty) : (false));
            if((dirtyFlags & 0x24L) != 0) {
                if(configInterfaceIncludedApplicationsIsEmptyConfigInterfaceExcludedApplicationsIsEmptyBooleanFalse) {
                        dirtyFlags |= 0x200000L;
                }
                else {
                        dirtyFlags |= 0x100000L;
                }
            }


                // read config.interface.includedApplications.isEmpty() ? config.interface.excludedApplications.isEmpty() : false ? android.view.View.GONE : android.view.View.VISIBLE
                configInterfaceIncludedApplicationsIsEmptyConfigInterfaceExcludedApplicationsIsEmptyBooleanFalseAndroidViewViewGONEAndroidViewViewVISIBLE = ((configInterfaceIncludedApplicationsIsEmptyConfigInterfaceExcludedApplicationsIsEmptyBooleanFalse) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        // batch finished
        if ((dirtyFlags & 0x24L) != 0) {
            // api target 1

            this.addressesLabel.setVisibility(configInterfaceAddressesIsEmptyAndroidViewViewGONEAndroidViewViewVISIBLE);
            com.wireguard.android.databinding.BindingAdapters.setInetNetworkSetText(this.addressesText, configInterfaceAddresses);
            this.addressesText.setVisibility(configInterfaceAddressesIsEmptyAndroidViewViewGONEAndroidViewViewVISIBLE);
            this.applicationsLabel.setVisibility(configInterfaceIncludedApplicationsIsEmptyConfigInterfaceExcludedApplicationsIsEmptyBooleanFalseAndroidViewViewGONEAndroidViewViewVISIBLE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.applicationsText, configInterfaceIncludedApplicationsIsEmptyApplicationsTextAndroidPluralsNExcludedApplicationsConfigInterfaceExcludedApplicationsSizeConfigInterfaceExcludedApplicationsSizeApplicationsTextAndroidPluralsNIncludedApplicationsConfigInterfaceIncludedApplicationsSizeConfigInterfaceIncludedApplicationsSize);
            this.applicationsText.setVisibility(configInterfaceIncludedApplicationsIsEmptyConfigInterfaceExcludedApplicationsIsEmptyBooleanFalseAndroidViewViewGONEAndroidViewViewVISIBLE);
            this.dnsSearchDomainsLabel.setVisibility(configInterfaceDnsSearchDomainsIsEmptyAndroidViewViewGONEAndroidViewViewVISIBLE);
            com.wireguard.android.databinding.BindingAdapters.setStringSetText(this.dnsSearchDomainsText, configInterfaceDnsSearchDomains);
            this.dnsSearchDomainsText.setVisibility(configInterfaceDnsSearchDomainsIsEmptyAndroidViewViewGONEAndroidViewViewVISIBLE);
            this.dnsServersLabel.setVisibility(configInterfaceDnsServersIsEmptyAndroidViewViewGONEAndroidViewViewVISIBLE);
            com.wireguard.android.databinding.BindingAdapters.setInetAddressSetText(this.dnsServersText, configInterfaceDnsServers);
            this.dnsServersText.setVisibility(configInterfaceDnsServersIsEmptyAndroidViewViewGONEAndroidViewViewVISIBLE);
            this.listenPortLabel.setVisibility(configInterfaceListenPortIsPresentAndroidViewViewGONEAndroidViewViewVISIBLE);
            com.wireguard.android.databinding.BindingAdapters.setOptionalText(this.listenPortText, configInterfaceListenPort);
            this.listenPortText.setVisibility(configInterfaceListenPortIsPresentAndroidViewViewGONEAndroidViewViewVISIBLE);
            this.mtuLabel.setVisibility(configInterfaceMtuIsPresentAndroidViewViewGONEAndroidViewViewVISIBLE);
            com.wireguard.android.databinding.BindingAdapters.setOptionalText(this.mtuText, configInterfaceMtu);
            this.mtuText.setVisibility(configInterfaceMtuIsPresentAndroidViewViewGONEAndroidViewViewVISIBLE);
            com.wireguard.android.databinding.BindingAdapters.setItems(this.peersLayout, this.mOldConfigPeers, this.mOldAndroidLayoutTunnelDetailPeer, configPeers, R.layout.tunnel_detail_peer);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.publicKeyText, configInterfaceKeyPairPublicKeyToBase64);
        }
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            this.addressesText.setOnClickListener((((mClipboardUtilsCopyTextViewAndroidViewViewOnClickListener == null) ? (mClipboardUtilsCopyTextViewAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mClipboardUtilsCopyTextViewAndroidViewViewOnClickListener)));
            this.applicationsText.setOnClickListener((((mClipboardUtilsCopyTextViewAndroidViewViewOnClickListener == null) ? (mClipboardUtilsCopyTextViewAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mClipboardUtilsCopyTextViewAndroidViewViewOnClickListener)));
            this.dnsSearchDomainsText.setOnClickListener((((mClipboardUtilsCopyTextViewAndroidViewViewOnClickListener == null) ? (mClipboardUtilsCopyTextViewAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mClipboardUtilsCopyTextViewAndroidViewViewOnClickListener)));
            this.dnsServersText.setOnClickListener((((mClipboardUtilsCopyTextViewAndroidViewViewOnClickListener == null) ? (mClipboardUtilsCopyTextViewAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mClipboardUtilsCopyTextViewAndroidViewViewOnClickListener)));
            this.interfaceNameText.setOnClickListener((((mClipboardUtilsCopyTextViewAndroidViewViewOnClickListener == null) ? (mClipboardUtilsCopyTextViewAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mClipboardUtilsCopyTextViewAndroidViewViewOnClickListener)));
            this.listenPortText.setOnClickListener((((mClipboardUtilsCopyTextViewAndroidViewViewOnClickListener == null) ? (mClipboardUtilsCopyTextViewAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mClipboardUtilsCopyTextViewAndroidViewViewOnClickListener)));
            this.mtuText.setOnClickListener((((mClipboardUtilsCopyTextViewAndroidViewViewOnClickListener == null) ? (mClipboardUtilsCopyTextViewAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mClipboardUtilsCopyTextViewAndroidViewViewOnClickListener)));
            this.publicKeyText.setOnClickListener((((mClipboardUtilsCopyTextViewAndroidViewViewOnClickListener == null) ? (mClipboardUtilsCopyTextViewAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mClipboardUtilsCopyTextViewAndroidViewViewOnClickListener)));
        }
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.interfaceNameText, tunnelName);
        }
        if ((dirtyFlags & 0x29L) != 0) {
            // api target 1

            com.wireguard.android.databinding.BindingAdapters.setChecked(this.tunnelSwitch, tunnelStateStateUP);
        }
        if ((dirtyFlags & 0x22L) != 0) {
            // api target 1

            com.wireguard.android.databinding.BindingAdapters.setOnBeforeCheckedChanged(this.tunnelSwitch, fragmentSetTunnelStateComWireguardAndroidWidgetToggleSwitchOnBeforeCheckedChangeListener);
        }
        if ((dirtyFlags & 0x24L) != 0) {
            this.mOldConfigPeers = configPeers;
            this.mOldAndroidLayoutTunnelDetailPeer = R.layout.tunnel_detail_peer;
        }
    }
    // Listener Stub Implementations
    public static class OnBeforeCheckedChangeListenerImpl implements com.wireguard.android.widget.ToggleSwitch.OnBeforeCheckedChangeListener{
        private com.wireguard.android.fragment.TunnelDetailFragment value;
        public OnBeforeCheckedChangeListenerImpl setValue(com.wireguard.android.fragment.TunnelDetailFragment value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onBeforeCheckedChanged(com.wireguard.android.widget.ToggleSwitch arg0, boolean arg1) {
            this.value.setTunnelState(arg0, arg1); 
        }
    }
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
        flag 0 (0x1L): tunnel
        flag 1 (0x2L): fragment
        flag 2 (0x3L): config
        flag 3 (0x4L): tunnel.state
        flag 4 (0x5L): tunnel.name
        flag 5 (0x6L): null
        flag 6 (0x7L): config.interface.includedApplications.isEmpty() ? @android:plurals/n_excluded_applications : @android:plurals/n_included_applications
        flag 7 (0x8L): config.interface.includedApplications.isEmpty() ? @android:plurals/n_excluded_applications : @android:plurals/n_included_applications
        flag 8 (0x9L): config.interface.dnsServers.isEmpty() ? android.view.View.GONE : android.view.View.VISIBLE
        flag 9 (0xaL): config.interface.dnsServers.isEmpty() ? android.view.View.GONE : android.view.View.VISIBLE
        flag 10 (0xbL): !config.interface.mtu.isPresent() ? android.view.View.GONE : android.view.View.VISIBLE
        flag 11 (0xcL): !config.interface.mtu.isPresent() ? android.view.View.GONE : android.view.View.VISIBLE
        flag 12 (0xdL): !config.interface.listenPort.isPresent() ? android.view.View.GONE : android.view.View.VISIBLE
        flag 13 (0xeL): !config.interface.listenPort.isPresent() ? android.view.View.GONE : android.view.View.VISIBLE
        flag 14 (0xfL): config.interface.dnsSearchDomains.isEmpty() ? android.view.View.GONE : android.view.View.VISIBLE
        flag 15 (0x10L): config.interface.dnsSearchDomains.isEmpty() ? android.view.View.GONE : android.view.View.VISIBLE
        flag 16 (0x11L): config.interface.addresses.isEmpty() ? android.view.View.GONE : android.view.View.VISIBLE
        flag 17 (0x12L): config.interface.addresses.isEmpty() ? android.view.View.GONE : android.view.View.VISIBLE
        flag 18 (0x13L): config.interface.includedApplications.isEmpty() ? config.interface.excludedApplications.isEmpty() : false
        flag 19 (0x14L): config.interface.includedApplications.isEmpty() ? config.interface.excludedApplications.isEmpty() : false
        flag 20 (0x15L): config.interface.includedApplications.isEmpty() ? config.interface.excludedApplications.isEmpty() : false ? android.view.View.GONE : android.view.View.VISIBLE
        flag 21 (0x16L): config.interface.includedApplications.isEmpty() ? config.interface.excludedApplications.isEmpty() : false ? android.view.View.GONE : android.view.View.VISIBLE
    flag mapping end*/
    //end
}