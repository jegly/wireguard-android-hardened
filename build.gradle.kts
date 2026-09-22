// Force patched versions of vulnerable build-tool transitive dependencies.
// These are pulled in by AGP/Kotlin compiler and do not ship in the APK.
// Addresses all 28 Dependabot alerts on the upstream repo.
val nettyVersion = "4.2.17.Final"
val bouncyCastleVersion = "1.84"

buildscript {
    val nettyVersion = "4.1.135.Final"
    val bouncyCastleVersion = "1.84"
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
                "org.bitbucket.b_c:jose4j:0.9.6",
                "org.apache.commons:commons-lang3:3.20.0",
                "org.apache.httpcomponents:httpclient:4.5.14"
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
                "org.bitbucket.b_c:jose4j:0.9.6",
                "org.apache.commons:commons-lang3:3.20.0",
                "org.apache.httpcomponents:httpclient:4.5.14"
            )
        }
    }
}

plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.kapt) apply false
}
