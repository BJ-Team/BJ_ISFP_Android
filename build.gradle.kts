// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath(Dependency.GradlePlugin.service)
        classpath(Dependency.GradlePlugin.hilt)
        classpath(Dependency.GradlePlugin.kotlin)
        classpath(Dependency.GradlePlugin.android)
    }
}
tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}