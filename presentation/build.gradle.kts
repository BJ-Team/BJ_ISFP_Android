plugins {
    id("com.android.application")
    id("dagger.hilt.android.plugin")
    id("com.google.gms.google-services")
    kotlin("android")
    kotlin("kapt")
    id("kotlin-android")
}

android {
    compileSdk = Project.compileSdk

    defaultConfig {
        applicationId = "com.example.bj_isfp_android"
        minSdk = Project.minSdk
        targetSdk = Project.targetSdk
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = Project.javaVersion
        targetCompatibility = Project.javaVersion
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Version.jetpackCompose
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
}

dependencies {
    implementation(project(":data"))
    implementation(project(":domain"))

    implementation(Dependency.coreKtx)
    implementation(Dependency.appcompat)
    implementation(Dependency.androidKtx)
    implementation(Dependency.fragmentKtx)
    implementation(Dependency.material)

    implementation(Dependency.UI.Compose.composeActivity)
    implementation(Dependency.UI.Compose.composeMaterial)
    implementation(Dependency.UI.Compose.composePreView)
    implementation(Dependency.UI.Compose.composeTest)
    implementation(Dependency.UI.Compose.composeUi)
    implementation(Dependency.UI.Compose.composeUiTool)
    implementation(Dependency.UI.Compose.composeActivity)
    implementation(Dependency.UI.Compose.composeNav)
    implementation(Dependency.UI.Compose.composeAniNav)
    implementation(Dependency.UI.Compose.accompanistIconController)
    implementation(Dependency.UI.Compose.accompanistPager)
    implementation(Dependency.UI.Compose.composeConstraint)
    implementation(Dependency.UI.Compose.composeMaterialIcon)

    implementation(Dependency.DI.hiltAndroid)
    implementation(Dependency.DI.hiltCompose)
    kapt(Dependency.DI.hiltCompiler)

    implementation(Dependency.DI.inject)

    implementation(Dependency.Network.retrofit)
    implementation(Dependency.Network.gsonConverter)
    implementation(Dependency.Network.okhttp)
    implementation(Dependency.Network.loggingInterceptor)

    implementation(Dependency.WorkManager.ktx)
    implementation(Dependency.WorkManager.hiltExtension)

    implementation(Dependency.Coroutine.core)
    implementation(Dependency.Coroutine.android)

    implementation(Dependency.UI.ViewModel.viewModel)

    implementation(Dependency.Lifecycle.viewModel)
    implementation(Dependency.Lifecycle.liveData)
    implementation(Dependency.Lifecycle.runTime)

}