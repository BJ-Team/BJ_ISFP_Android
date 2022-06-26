plugins {
    id 'com.android.application'
    id 'kotlin-android'
}

android {
    compileSdk 32

    defaultConfig {
        applicationId "com.example.bj_isfp_android"
        minSdk 28
        targetSdk 32
        versionCode 1
        versionName "1.0"

        testInstrumentationRunner "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary true
        }
    }

    buildTypes {
        release {
            minifyEnabled false
            proguardFiles getDefaultProguardFile('proguard-android-optimize.txt'), 'proguard-rules.pro'
        }
    }
    compileOptions {
        sourceCompatibility JavaVersion.VERSION_1_8
        targetCompatibility JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = '1.8'
        useIR = true
    }
    buildFeatures {
        compose true
    }
    composeOptions {
        kotlinCompilerExtensionVersion compose_version
        kotlinCompilerVersion '1.5.21'
    }
    packagingOptions {
        resources {
            excludes += '/META-INF/{AL2.0,LGPL2.1}'
        }
    }
}

dependencies {

    implementation 'androidx.core:core-ktx:1.8.0'
    implementation 'androidx.appcompat:appcompat:1.4.2'
    implementation 'com.google.android.material:material:1.6.1'

    implementation(Dependency.UI.material)
    implementation(Dependency.UI.constraintLayout)
    implementation(Dependency.UI.compose)
    implementation(Dependency.UI.composeTooling)
    implementation(Dependency.UI.composePreview)
    implementation(Dependency.UI.composeMaterial)
    implementation(Dependency.UI.composeCompiler)
    implementation(Dependency.UI.activityCompose)
    implementation(Dependency.UI.coilCompose)
    implementation(Dependency.UI.navigationCompose)
    implementation(Dependency.UI.semicolonDesign)

    implementation 'androidx.lifecycle:lifecycle-runtime-ktx:2.4.1'
    implementation 'androidx.activity:activity-compose:1.4.0'
    implementation 'androidx.constraintlayout:constraintlayout:2.1.4'
    testImplementation 'junit:junit:4.+'
    androidTestImplementation 'androidx.test.ext:junit:1.1.3'
    androidTestImplementation 'androidx.test.espresso:espresso-core:3.4.0'
    androidTestImplementation "androidx.compose.ui:ui-test-junit4:$compose_version"
    debugImplementation "androidx.compose.ui:ui-tooling:$compose_version"
}