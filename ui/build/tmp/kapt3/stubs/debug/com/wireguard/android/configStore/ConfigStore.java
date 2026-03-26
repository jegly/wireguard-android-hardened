package com.wireguard.android.configStore;

/**
 * Interface for persistent storage providers for WireGuard configurations.
 */
@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\nH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005H&J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H&\u00a8\u0006\u000f\u00c0\u0006\u0003"}, d2 = {"Lcom/wireguard/android/configStore/ConfigStore;", "", "create", "Lcom/wireguard/config/Config;", "name", "", "config", "delete", "", "enumerate", "", "load", "rename", "replacement", "save", "ui_debug"})
public abstract interface ConfigStore {
    
    /**
     * Create a persistent tunnel, which must have a unique name within the persistent storage
     * medium.
     *
     * @param name   The name of the tunnel to create.
     * @param config Configuration for the new tunnel.
     * @return The configuration that was actually saved to persistent storage.
     */
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.Exception.class})
    @org.jetbrains.annotations.NotNull()
    public abstract com.wireguard.config.Config create(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    com.wireguard.config.Config config) throws java.lang.Exception;
    
    /**
     * Delete a persistent tunnel.
     *
     * @param name The name of the tunnel to delete.
     */
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.Exception.class})
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    java.lang.String name) throws java.lang.Exception;
    
    /**
     * Enumerate the names of tunnels present in persistent storage.
     *
     * @return The set of present tunnel names.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Set<java.lang.String> enumerate();
    
    /**
     * Load the configuration for the tunnel given by `name`.
     *
     * @param name The identifier for the configuration in persistent storage (i.e. the name of the
     * tunnel).
     * @return An in-memory representation of the configuration loaded from persistent storage.
     */
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.Exception.class})
    @org.jetbrains.annotations.NotNull()
    public abstract com.wireguard.config.Config load(@org.jetbrains.annotations.NotNull()
    java.lang.String name) throws java.lang.Exception;
    
    /**
     * Rename the configuration for the tunnel given by `name`.
     *
     * @param name        The identifier for the existing configuration in persistent storage.
     * @param replacement The new identifier for the configuration in persistent storage.
     */
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.Exception.class})
    public abstract void rename(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String replacement) throws java.lang.Exception;
    
    /**
     * Save the configuration for an existing tunnel given by `name`.
     *
     * @param name   The identifier for the configuration in persistent storage (i.e. the name of
     * the tunnel).
     * @param config An updated configuration object for the tunnel.
     * @return The configuration that was actually saved to persistent storage.
     */
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.Exception.class})
    @org.jetbrains.annotations.NotNull()
    public abstract com.wireguard.config.Config save(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    com.wireguard.config.Config config) throws java.lang.Exception;
}