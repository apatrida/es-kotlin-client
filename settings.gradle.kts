rootProject.name = "es-kotlin-client"

pluginManagement {
    repositories {
        mavenLocal()
        gradlePluginPortal()
    }
}

plugins {
    id("de.fayard.refreshVersions") version "0.23.0"
////                            # available:"0.30.0"
////                            # available:"0.30.1"
}

refreshVersions {
//    extraArtifactVersionKeyRules(file("version_key_rules.txt"))
}
