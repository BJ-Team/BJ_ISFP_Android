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
        kotlinCompilerExtensionVersion = Version.COMPOSE
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        dataBinding = true
        compose = true
    }
}

dependencies {

    implementation(Dependency.coreKtx)
    implementation(Dependency.appcompat)
    implementation(Dependency.androidKtx)
    implementation(Dependency.fragmentKtx)

    implementation(Dependency.UI.composeActivity)
    implementation(Dependency.UI.composeMaterial)
    implementation(Dependency.UI.composePreView)
    implementation(Dependency.UI.composeTest)
    implementation(Dependency.UI.composeUi)
    implementation(Dependency.UI.composeUiTool)
    implementation(Dependency.UI.composeActivity)
    implementation(Dependency.UI.composeNav)
    implementation(Dependency.UI.composeAniNav)

    testImplementation(Dependency.Test.junit)
    testImplementation(Dependency.Test.mockito)
    androidTestImplementation(Dependency.Test.androidJunit)
    androidTestImplementation(Dependency.Test.espresso)

    implementation(Dependency.DI.hiltAndroid)
    implementation(Dependency.DI.hiltCompose)
    kapt(Dependency.DI.hiltCompiler)

    implementation(Dependency.Network.retrofit)
    implementation(Dependency.Network.gsonConverter)
    implementation(Dependency.Network.okhttp)
    implementation(Dependency.Network.loggingInterceptor)

    implementation(Dependency.LocalStorage.room)
    kapt(Dependency.LocalStorage.roomCompiler)

    implementation(Dependency.Coroutine.core)
    implementation(Dependency.Coroutine.android)

    implementation(Dependency.Lifecycle.viewModel)
    implementation(Dependency.Lifecycle.liveData)
    implementation(Dependency.Lifecycle.runTime)

    implementation(Dependency.Navigation.navigationFragment)
    implementation(Dependency.Navigation.navigationUi)

    implementation(Dependency.WorkManager.ktx)
    implementation(Dependency.WorkManager.hiltExtension)

    implementation(Dependency.FireBase.fcm)
    implementation(Dependency.FireBase.message)

    implementation(Dependency.GooglePlayService.fitness)
    implementation(Dependency.GooglePlayService.auth)

    implementation(Dependency.Permission.tedPermission)

    implementation(Dependency.ThreeTenAndroidBackport.threeTenAbp)

    implementation(Dependency.CircleImageView.circleImage)

    implementation(Dependency.Glide.glideCore)
    annotationProcessor(Dependency.Glide.glideCompiler)

    implementation(Dependency.Socket.socketIo) {
        exclude(group = "org.json", module = "json")
    }
}