import extentions.MODEL
import extentions.addDaggerHiltDependencies
import extentions.addStorageDependencies
import extentions.addTestDependencies

plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
}

android {
    namespace = "com.martinz.data"
    compileSdk = 32
}

dependencies {

    //My Model Module Using Extension
    MODEL


    addTestDependencies()
    addStorageDependencies()
    addDaggerHiltDependencies()
}