import extentions.*

plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
}

android {
    namespace = "com.martinz.domain"
    compileSdk = 32
}

dependencies {

    CORE
    MODEL
    REPOSITORY
    addTestDependencies()

    addCoroutinesDependencies()
    addDaggerHiltDependencies()

}