pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
}

rootProject.name = "zaproxy-custom-addons"

// Add-ons — add new entries here as you create more add-ons
include("addOns:wstgmapper")
project(":addOns:wstgmapper").buildFileName = "wstgmapper.gradle.kts"
