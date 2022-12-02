package extentions

import ComposeLib
import DaggerHiltLib
import StorageLib


import org.gradle.api.artifacts.Dependency
import org.gradle.api.artifacts.dsl.DependencyHandler


fun DependencyHandler.debugImplementation(dependencyNotation: Any): Dependency? =
    add("debugImplementation", dependencyNotation)

fun DependencyHandler.implementation(dependencyNotation: Any): Dependency? =
    add("implementation", dependencyNotation)



fun DependencyHandler.kapt(dependencyNotation: Any): Dependency? =
    add("kapt", dependencyNotation)


fun DependencyHandler.testImplementation(dependencyNotation: Any): Dependency? =
    add("testImplementation", dependencyNotation)

fun DependencyHandler.androidTestImplementation(dependencyNotation: Any): Dependency? =
    add("androidTestImplementation", dependencyNotation)


fun DependencyHandler.addCommonDependencies() {
    implementation(SupportLib.CoreKtx)
    implementation(SupportLib.Appcompat)
    implementation(SupportLib.Material)
    implementation(SupportLib.CoroutineCore)
    implementation(SupportLib.CoroutineAndroid)
    implementation(SupportLib.LifecycleRuntime)
    implementation(SupportLib.ActivityKtx)
}

fun DependencyHandler.addComposeDependencies() {
    implementation(ComposeLib.Ui)
    implementation(ComposeLib.Material)
    debugImplementation(ComposeLib.Tooling)
    //
    implementation(ComposeLib.Activity)
    implementation(ComposeLib.ViewModel)
    implementation(ComposeLib.Lottie)
    implementation(ComposeLib.Coil)

}

fun DependencyHandler.addNavigationDependencies() {
    // Navigation
    implementation(NavigationLib.Navigation)
    implementation(NavigationLib.HiltNavigation)
}

fun DependencyHandler.addNetworkDependencies() {
    // Network

    /*-Retrofit-*/
    implementation(NetworkLib.Retrofit)

    /*-OkHttp-*/
    implementation(NetworkLib.Okhttp)

    /*-Interceptor-*/
    implementation(NetworkLib.LoggingInterceptor)

    /*-Gson-*/
    implementation(NetworkLib.Gson)
}

fun DependencyHandler.addStorageDependencies() {
    // Storage

    //Room
    implementation(StorageLib.room)
    implementation(StorageLib.roomRuntime)
    kapt(StorageLib.kaptRoomCompiler)

}

fun  DependencyHandler.addDaggerHiltDependencies() {
    // Hilt
    implementation(DaggerHiltLib.Android)
    kapt(DaggerHiltLib.Compiler)
    kapt(DaggerHiltLib.hiltCompiler)
    implementation ("androidx.hilt:hilt-common:1.0.0")

}

fun DependencyHandler.addCoroutinesDependencies() {
    implementation(CoroutinesLib.Coroutines)
}

fun DependencyHandler.addTestDependencies() {
    testImplementation (TestLib.JUNIT)
    androidTestImplementation (TestLib.JUNIT_EXT)
    androidTestImplementation (TestLib.ESPRESSO)
}







// Modules
val DependencyHandler.MODEL
    get() = implementation(project(mapOf("path" to ":data:model")))

val DependencyHandler.CORE
    get() = implementation(project(mapOf("path" to ":core")))

val DependencyHandler.LOCAL
    get() = implementation(project(mapOf("path" to ":data:local")))

val DependencyHandler.REMOTE
    get() = implementation(project(mapOf("path" to ":data:remote")))

val DependencyHandler.REPOSITORY
    get() = implementation(project(mapOf("path" to ":data:repository")))


val DependencyHandler.DOMAIN
    get() = implementation(project(mapOf("path" to ":domain")))

val DependencyHandler.FEATURE_NEWS
    get() = implementation(project(mapOf("path" to ":features:news-list")))

val DependencyHandler.FEATURE_POST_DETAIL
    get() = implementation(project(mapOf("path" to ":features:post-detail")))

