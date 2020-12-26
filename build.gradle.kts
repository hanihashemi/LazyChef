buildscript {
    repositories {
        gradlePluginPortal()
        jcenter()
        google()
        mavenCentral()
        maven("https://plugins.gradle.org/m2/")
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.10")
        classpath("com.android.tools.build:gradle:4.2.0-alpha16")
        classpath("org.jlleitschuh.gradle:ktlint-gradle:9.4.1")
        classpath("com.google.gms:google-services:4.3.4")
    }
}
group = "io.github.hanihashemi.lazychef"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}
