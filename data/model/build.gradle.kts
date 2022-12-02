import extentions.addNetworkDependencies
import extentions.addStorageDependencies
import extentions.addTestDependencies

plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
}

android {
    namespace = "com.martinz.model"
    compileSdk = 32
}


dependencies {

    addTestDependencies()
    addStorageDependencies()

}