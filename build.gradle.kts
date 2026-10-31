// Force patched versions of vulnerable build-tool transitive dependencies.
// These are pulled in by AGP/Kotlin compiler and do not ship in the APK.
// Addresses all 28 Dependabot alerts on the upstream repo.
val nettyVersion = "4.2.18.Final"
val bouncyCastleVersion = "1.86"

buildscript {
    val nettyVersion = "4.1.138.Final"
    val bouncyCastleVersion = "1.86"
    configurations.all {
        resolutionStrategy {
            force(
                "io.netty:netty-buffer:$nettyVersion",
                "io.netty:netty-codec:$nettyVersion",
                "io.netty:netty-codec-http:$nettyVersion",
                "io.netty:netty-codec-http2:$nettyVersion",
                "io.netty:netty-common:$nettyVersion",
                "io.netty:netty-handler:$nettyVersion",
                "io.netty:netty-handler-proxy:$nettyVersion",
                "io.netty:netty-resolver:$nettyVersion",
                "io.netty:netty-transport:$nettyVersion",
                "io.netty:netty-transport-native-epoll:$nettyVersion",
                "org.bouncycastle:bcprov-jdk18on:$bouncyCastleVersion",
                "org.bouncycastle:bcpkix-jdk18on:$bouncyCastleVersion",
                "org.jdom:jdom2:2.0.6.1",
                "org.bitbucket.b_c:jose4j:0.9.7",
                "org.apache.commons:commons-lang3:3.21.0",
                "org.apache.httpcomponents:httpclient:4.5.14",
                "com.google.guava:guava:33.7.2-jre",
                // AGP's built-in Kotlin brings 2.2.10 (CVE-2026-53914, fixed in 2.4.20).
                "org.jetbrains.kotlin:kotlin-gradle-plugin:2.4.21"
            )
        }
    }
}

allprojects {
    configurations.all {
        resolutionStrategy {
            force(
                "io.netty:netty-buffer:$nettyVersion",
                "io.netty:netty-codec:$nettyVersion",
                "io.netty:netty-codec-http:$nettyVersion",
                "io.netty:netty-codec-http2:$nettyVersion",
                "io.netty:netty-common:$nettyVersion",
                "io.netty:netty-handler:$nettyVersion",
                "io.netty:netty-handler-proxy:$nettyVersion",
                "io.netty:netty-resolver:$nettyVersion",
                "io.netty:netty-transport:$nettyVersion",
                "io.netty:netty-transport-native-epoll:$nettyVersion",
                "org.bouncycastle:bcprov-jdk18on:$bouncyCastleVersion",
                "org.bouncycastle:bcpkix-jdk18on:$bouncyCastleVersion",
                "org.jdom:jdom2:2.0.6.1",
                "org.bitbucket.b_c:jose4j:0.9.7",
                "org.apache.commons:commons-lang3:3.21.0",
                "org.apache.httpcomponents:httpclient:4.5.14"
            )
        }
    }
}

plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.legacy.kapt) apply false
}
