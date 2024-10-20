plugins {
    `java-library`
    `maven-publish`
    kotlin("jvm")
}

repositories {
    mavenLocal()
    maven {
        url = uri("https://repo.maven.apache.org/maven2/")
    }
    mavenCentral()
}

dependencies {
    api(libs.kotlin.stdlib)
    api(libs.kotlinx.datetime.jvm)
    testImplementation(libs.kotlin.test.junit)
    testImplementation(libs.junit)
    implementation(kotlin("stdlib-jdk8"))
}

group = "recruiting"
version = "1.0-SNAPSHOT"
description = "kotlinproblem-envsetup"

publishing {
    publications.create<MavenPublication>("maven") {
        from(components["java"])
    }
}
kotlin {
    jvmToolchain(8)
}