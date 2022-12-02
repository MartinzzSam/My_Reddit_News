object Versions {
    const val Kotlin = "1.6.10"
}




object SupportLib {
    private const val coreKtx = "1.7.0"
    const val CoreKtx = "androidx.core:core-ktx:$coreKtx"
    const val Appcompat = "androidx.appcompat:appcompat:1.4.1"
    const val Material = "com.google.android.material:material:1.5.0"
    const val CoroutineCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.1"
    const val CoroutineAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.1"
    const val LifecycleRuntime = "androidx.lifecycle:lifecycle-runtime-ktx:2.4.1"
    const val ActivityKtx = "androidx.activity:activity-ktx:1.4.0"

    const val Splashscreen = "androidx.core:core-splashscreen:1.0.0-beta02"
    const val Timber = "com.jakewharton.timber:timber:5.0.1"
}

object StorageLib {

    private const val room_version = "2.3.0-alpha01"

    const val room = "androidx.room:room-ktx:$room_version"
    const val roomRuntime = "androidx.room:room-runtime:$room_version"
    const val kaptRoomCompiler = "androidx.room:room-compiler:$room_version"
}

object Android {
    const val nameSpace = "com.martinz.myredditnews"
    const val appId = "com.martinz.myredditnews"
    const val compileSdk = 33
    const val buildTools = "30.0.3"
    const val minSdk = 21
    const val targetSdk = 33
    const val versionCode = 1
    const val versionName = "1.0"
}

object ComposeLib {
    private const val activityComposeVersion = "1.2.0-alpha07"
    const val Activity = "androidx.activity:activity-compose:$activityComposeVersion"

    const val composeVersion = "1.2.0-alpha07"
    const val Ui = "androidx.compose.ui:ui:$composeVersion"
    const val Material = "androidx.compose.material:material:$composeVersion"
    const val Tooling = "androidx.compose.ui:ui-tooling:$composeVersion"

    const val ViewModel = "androidx.lifecycle:lifecycle-viewmodel-compose:2.4.1"
    const val Lottie = "com.airbnb.android:lottie-compose:5.0.3"
    const val Coil = "io.coil-kt:coil-compose:2.0.0-rc02"
    const val hiltViewModel = "androidx.hilt:hilt-lifecycle-viewmodel:1.0.0-alpha03"
}

object NetworkLib {
    const val Retrofit = "com.squareup.retrofit2:retrofit:2.9.0"
    const val Gson = "com.squareup.retrofit2:converter-gson:2.5.0"
    const val Okhttp = "com.squareup.okhttp3:okhttp:5.0.0-alpha.5"
    const val LoggingInterceptor = "com.squareup.okhttp3:logging-interceptor:5.0.0-alpha.5"
}
object NavigationLib {
    private const val navigationVersion = "2.4.0-alpha04"
    const val Navigation = "androidx.navigation:navigation-compose:$navigationVersion"

    private const val hiltNavigationComposeVersion = "1.0.0-alpha03"
    const val HiltNavigation = "androidx.hilt:hilt-navigation-compose:$hiltNavigationComposeVersion"
}

object DaggerHiltLib {
    const val hiltVersion = "2.41"
    const val Android = "com.google.dagger:hilt-android:$hiltVersion"
    const val Compiler = "com.google.dagger:hilt-android-compiler:$hiltVersion"
    const val hiltCompiler = "androidx.hilt:hilt-compiler:1.0.0-beta01"
}

object CoroutinesLib {
    const val Coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.9"

}

object TestLib {

    const val JUNIT = "junit:junit:4.13.2"
    const val JUNIT_EXT = "androidx.test.ext:junit:1.1.3"
    const val ESPRESSO =  "androidx.test.espresso:espresso-core:3.4.0"
}



