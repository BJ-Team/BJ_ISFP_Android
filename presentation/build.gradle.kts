plugins {
    id ("com.android.application")
    id ("kotlin-android")
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

    implementation(Dependency.UI.ViewModel.viewModel)

    implementation(Dependency.Lifecycle.viewModel)
    implementation(Dependency.Lifecycle.liveData)
    implementation(Dependency.Lifecycle.runTime)
}