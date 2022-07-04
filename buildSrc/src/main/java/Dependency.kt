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
        }

        object ViewModel {
            const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-compose:${Version.viewModel}"
        }
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