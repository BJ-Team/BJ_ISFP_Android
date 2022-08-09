object Dependency {

    const val appcompat = "androidx.appcompat:appcompat:${Version.appcompat}"
    const val coreKtx = "androidx.core:core-ktx:${Version.coreKtx}"
    const val androidKtx = "androidx.activity:activity-ktx:${Version.androidKtx}"
    const val fragmentKtx = "androidx.fragment:fragment-ktx:${Version.fragmentKtx}"
    const val material = "com.google.android.material:material:${Version.material}"

    object UI {
        object Compose {
            const val composeUi = "androidx.compose.ui:ui:${Version.jetpackCompose}"
            const val composeMaterial = "androidx.compose.material:material:${Version.jetpackCompose}"
            const val composePreView = "androidx.compose.ui:ui-tooling-preview:${Version.jetpackCompose}"
            const val composeActivity =
                "androidx.activity:activity-compose:${Version.activityCompose}"
            const val composeTest = "androidx.compose.ui:ui-test-junit4:${Version.jetpackCompose}"
            const val composeUiTool = "androidx.compose.ui:ui-tooling:${Version.jetpackCompose}"

            const val composeNav = "androidx.navigation:navigation-compose:${Version.nav}"
            const val composeAniNav =
                "com.google.accompanist:accompanist-navigation-animation:${Version.aniNav}"
            const val accompanistPager =
                "com.google.accompanist:accompanist-pager:${Version.accompanistPager}"
            const val accompanistIconController =
                "com.google.accompanist:accompanist-systemuicontroller:${Version.accompanistIconController}"
            const val composeConstraint =
                "androidx.constraintlayout:constraintlayout-compose:${Version.composeConstraint}"
            const val composeMaterialIcon =
                "androidx.compose.material:material-icons-extended:${Version.jetpackCompose}"
        }

        object ViewModel {
            const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-compose:${Version.viewModel}"
        }
    }

    object WorkManager {
        const val ktx = "androidx.work:work-runtime-ktx:${Version.workManager}"
        const val hiltExtension = "androidx.hilt:hilt-work:${Version.workManagerHiltExtension}"
    }

    object Coroutine {
        const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Version.coroutine}"
        const val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Version.coroutine}"
    }

    object DI {
        const val hiltAndroid = "com.google.dagger:hilt-android:${Version.hilt}"
        const val hiltCompiler = "com.google.dagger:hilt-android-compiler:${Version.hilt}"
        const val inject = "javax.inject:javax.inject:1"
        const val hiltCompose = "androidx.hilt:hilt-navigation-compose:${Version.hiltCompose}"
    }

    object Network {
        const val retrofit = "com.squareup.retrofit2:retrofit:${Version.retrofit}"
        const val gsonConverter = "com.squareup.retrofit2:converter-gson:${Version.retrofit}"
        const val okhttp = "com.squareup.okhttp3:okhttp:${Version.okhttp}"
        const val loggingInterceptor = "com.squareup.okhttp3:logging-interceptor:${Version.okhttp}"
    }

    object LocalStorage {
        const val room = "androidx.room:room-ktx:${Version.room}"
        const val roomCompiler = "androidx.room:room-compiler:${Version.room}"
        const val sharedPreference =
            "androidx.preference:preference-ktx:${Version.sharedPreference}"
    }

    object Lifecycle {
        const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Version.lifecycle}"
        const val liveData = "androidx.lifecycle:lifecycle-livedata-ktx:${Version.lifecycle}"
        const val runTime = "androidx.lifecycle:lifecycle-runtime-ktx:${Version.lifecycle}"
    }

    object GradlePlugin {
        const val android = "com.android.tools.build:gradle:${Version.gradle}"
        const val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Version.kotlin}"
        const val hilt = "com.google.dagger:hilt-android-gradle-plugin:${Version.hilt}"
        const val service = "com.google.gms:google-services:${Version.service}"
    }
}