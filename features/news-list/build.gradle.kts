import extentions.*

plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
}

android {
    namespace = "com.martinz.features.news_list"
    compileSdk = 32


    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.2.0-alpha07"
    }

}

//android {
//    namespace = "com.martinz.news_list"
//    compileSdk = 32
//
//    defaultConfig {
//        minSdk = 21
//        targetSdk = 32
//
//        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
//        consumerProguardFiles("consumer-rules.pro")
//    }
//
//    buildTypes {
//        release {
//            isMinifyEnabled = false
//            proguardFiles(
//                getDefaultProguardFile("proguard-android-optimize.txt"),
//                "proguard-rules.pro"
//            )
//        }
//    }
//    compileOptions {
//        sourceCompatibility = JavaVersion.VERSION_1_8
//        targetCompatibility = JavaVersion.VERSION_1_8
//    }
//    kotlinOptions {
//        jvmTarget = "1.8"
//    }
//}

dependencies {





    CORE
    DOMAIN
    MODEL
    addTestDependencies()

    addComposeDependencies()
    addNavigationDependencies()
    addDaggerHiltDependencies()
}