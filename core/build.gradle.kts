import extentions.addComposeDependencies
import extentions.addTestDependencies

plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.martinz.core"
    compileSdk = 33
}

dependencies {






    addTestDependencies()
    addComposeDependencies()
}