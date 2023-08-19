import org.springframework.boot.gradle.tasks.bundling.BootJar

plugins {
    id("build.logic.convention.springboot")
    alias(libs.plugins.springBoot)
}

tasks.withType(Jar::class.java) {
    enabled = false
}

tasks.withType(BootJar::class.java) {
    enabled = true
}

dependencies {
    implementation(libs.springBoot.starter.web)
}