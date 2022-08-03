plugins {
    id ("com.android.library")
    id ("kotlin-android")
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
    implementation(Dependency.Network.gsonConverter)
    implementation(Dependency.Network.loggingInterceptor)
    implementation(Dependency.Network.retrofit)
    implementation(Dependency.Network.okhttp)

    implementation(Dependency.LocalStorage.room)
    implementation(Dependency.LocalStorage.roomCompiler)
    implementation(Dependency.LocalStorage.sharedPreference)
}