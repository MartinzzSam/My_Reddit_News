import extentions.*

plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
}


android {
    namespace = "com.martinz.features.post_detail"
    compileSdk = 32


    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.2.0-alpha07"
    }

}

dependencies {

    CORE
    MODEL
    REPOSITORY
    addTestDependencies()

    addComposeDependencies()
    addNavigationDependencies()
    addDaggerHiltDependencies()
}