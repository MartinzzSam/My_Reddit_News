import extentions.*

plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
}

android {
    namespace = "com.martinz.data.repository"
    compileSdk = 32
}

dependencies {

    CORE
    MODEL
    REMOTE
    LOCAL

    addTestDependencies()
    addCoroutinesDependencies()
    addDaggerHiltDependencies()
    addStorageDependencies()
}