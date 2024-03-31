
plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.kotlinx.serialization)
    id("co.touchlab.skie") version "0.6.2"
}

kotlin {
    androidTarget {
        compilations.all {
            kotlinOptions {
                jvmTarget = "11"
            }
        }
    }
    
    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach { iosTarget ->
        iosTarget.binaries.framework {
            baseName = "Shared"
            isStatic = true
        }
    }
    
    sourceSets {
        commonMain.dependencies {
            //ktor-client
            implementation(libs.ktor.client.core)
            implementation(libs.ktor.json.serialization)
            implementation(libs.ktor.content.negotiation)
            implementation(libs.ktor.logging)
            implementation(libs.ktor.client.cio)
            implementation(libs.kotlin.serialization)
            // koin
            api(libs.koin.core)
            implementation(libs.koin.annotations)
            implementation(libs.koin.compose)
            // coroutine
            implementation(libs.kotlin.coroutines)
            //date time
            implementation(libs.kotlinx.datetime)
        }
        androidMain.dependencies {
            implementation(libs.ktor.client.cio)

        }
        iosMain.dependencies {
            implementation(libs.ktor.client.drawin)
        }
    }
}

android {
    namespace = "org.example.project.shared"
    compileSdk = libs.versions.android.compileSdk.get().toInt()
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    defaultConfig {
        minSdk = libs.versions.android.minSdk.get().toInt()
    }
}
