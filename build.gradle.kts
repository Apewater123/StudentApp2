// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.1.1" apply false
    id("org.jetbrains.kotlin.android") version "1.8.10" apply false
    id("com.google.gms.google-services") version "4.3.15" apply true
}

buildscript {
    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:7.0.4") // Gradle Plugin version for Android Studio
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.21") // Latest Kotlin Plugin version
        classpath("com.google.gms:google-services:4.3.15")  // Google Services Plugin
    }
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}
