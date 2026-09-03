import org.gradle.kotlin.dsl.`kotlin-dsl`

plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
}

dependencies {
    gradleApi()
    implementation("net.darkhax.curseforgegradle:CurseForgeGradle:1.3.33")
    implementation(group = "com.modrinth.minotaur", name = "Minotaur", version = "2.9.+")
}