import dev.kikugie.stonecutter.StonecutterSettings

pluginManagement {
    repositories {
        maven("https://maven.fabricmc.net/")
        maven("https://maven.kikugie.dev/releases")
        gradlePluginPortal()
    }
}

plugins {
    id("dev.kikugie.stonecutter") version "0.4.2"
}

extensions.configure<StonecutterSettings> {
    shared {
        versions("1.20.1", "1.20.4", "1.20.6", "1.21", "1.21.2")
        vcsVersion = "1.21.2"
    }

    kotlinController = true
    centralScript = "build.gradle.kts"
    create(rootProject)
}

rootProject.name = "Scribble"
