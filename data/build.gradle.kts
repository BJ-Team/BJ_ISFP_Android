plugins {
    id ("com.android.library")
    id ("kotlin-android")
    kotlin("kapt")
}

android {
    compileSdk = Project.compileSdk

    defaultConfig {
        minSdk = Project.minSdk
        targetSdk = Project.targetSdk
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = Project.javaVersion
        targetCompatibility = Project.javaVersion
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(project(":domain"))


    implementation(Dependency.Moshi.moshi)
    implementation("androidx.room:room-common:2.4.3")
    kapt(Dependency.Moshi.moshiCompiler)


    implementation(Dependency.Network.gsonConverter)
    implementation(Dependency.Network.loggingInterceptor)
    implementation(Dependency.Network.retrofit)
    implementation(Dependency.Network.okhttp)

    implementation(Dependency.Coroutine.core)

    implementation(Dependency.DI.inject)

    implementation(Dependency.DI.hiltAndroid)
    kapt(Dependency.DI.hiltCompiler)
    
    implementation(Dependency.WorkManager.ktx)
    implementation(Dependency.WorkManager.hiltExtension)

    implementation(Dependency.LocalStorage.room)
    annotationProcessor(Dependency.LocalStorage.roomCompiler)
    implementation(Dependency.LocalStorage.sharedPreference)
}