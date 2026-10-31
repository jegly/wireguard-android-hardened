/*
 * Copyright © 2017-2025 WireGuard LLC. All Rights Reserved.
 * SPDX-License-Identifier: Apache-2.0
 */

package com.wireguard.android.util

/**
 * Public DNS resolvers offered in the tunnel editor's DNS picker. Taken from the encrypted-DNS
 * providers in Iris (github.com/jegly/iris, patches/apply-doh-*.sh), using each provider's plain
 * DNS addresses, since WireGuard tunnels use plain DNS (sent inside the tunnel).
 *
 * Each address was checked live on 2026-10-31: example.com resolves, filtering matches the label
 * (doubleclick.net blocked by the ad-blocking ones, an adult site blocked by the family ones), and
 * the address is registered to the provider (RDAP; DNSforge by reverse DNS). IPv4 only: an IPv6
 * DNS server outside the tunnel's routes could leak queries.
 * Iris providers without verified plain addresses (DoH/DoT-only, account-bound or unreachable on
 * port 53) are not listed.
 */
object DnsProviders {
    class Provider(val name: String, val servers: List<String>) {
        val dnsServers: String get() = servers.joinToString(", ")
    }

    val ALL = listOf(
        Provider("Quad9 (blocks malware)", listOf("9.9.9.9", "149.112.112.112")),
        Provider("Quad9 (unfiltered)", listOf("9.9.9.10", "149.112.112.10")),
        Provider("Cloudflare", listOf("1.1.1.1", "1.0.0.1")),
        Provider("Cloudflare (blocks malware)", listOf("1.1.1.2", "1.0.0.2")),
        Provider("Cloudflare (family)", listOf("1.1.1.3", "1.0.0.3")),
        Provider("AdGuard DNS (blocks ads and trackers)", listOf("94.140.14.14", "94.140.15.15")),
        Provider("AdGuard DNS (unfiltered)", listOf("94.140.14.140", "94.140.14.141")),
        Provider("AdGuard DNS (family protection)", listOf("94.140.14.15", "94.140.15.16")),
        Provider("Control D (unfiltered)", listOf("76.76.2.0", "76.76.10.0")),
        Provider("Control D (blocks malware)", listOf("76.76.2.1", "76.76.10.1")),
        Provider("Control D (blocks ads and trackers)", listOf("76.76.2.2", "76.76.10.2")),
        Provider("DNS4EU (protective)", listOf("86.54.11.1", "86.54.11.201")),
        Provider("DNS4EU (unfiltered)", listOf("86.54.11.100", "86.54.11.200")),
        Provider("DNS4EU (blocks ads)", listOf("86.54.11.13", "86.54.11.213")),
        Provider("DNS4EU (child protection)", listOf("86.54.11.12", "86.54.11.212")),
        Provider("CleanBrowsing (security)", listOf("185.228.168.9", "185.228.169.9")),
        Provider("CleanBrowsing (family)", listOf("185.228.168.168", "185.228.169.168")),
        Provider("CleanBrowsing (adult)", listOf("185.228.168.10", "185.228.169.11")),
        Provider("CIRA Canadian Shield (blocks malware)", listOf("149.112.121.10", "149.112.122.10")),
        Provider("CZ.NIC ODVR", listOf("193.17.47.1", "185.43.135.1")),
        Provider("DNS4All by SIDN Labs", listOf("194.0.5.3", "194.0.5.64")),
        Provider("DNSforge (blocks ads)", listOf("176.9.93.198", "176.9.1.117")),
        Provider("Freifunk München (Germany)", listOf("5.1.66.255", "185.150.99.255")),
        Provider("Hurricane Electric", listOf("74.82.42.42")),
        Provider("OpenDNS", listOf("208.67.222.222", "208.67.220.220")),
        Provider("OpenDNS FamilyShield", listOf("208.67.222.123", "208.67.220.123")),
    )
}
