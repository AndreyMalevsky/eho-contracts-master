import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.springframework.boot") version "2.5.2"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
    id("org.flywaydb.flyway") version "7.11.3"
    kotlin("jvm") version "1.5.20"
    kotlin("plugin.spring") version "1.5.20"
    java
}

group = "ru.eho"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
    mavenCentral()
    val mavenUsername: String by project
    val mavenPassword: String by project
    maven {
        url = uri("https://maven.pkg.jetbrains.space/rdclr/p/hrc/maven/")
        credentials {
            username = System.getenv("USERNAME") ?: mavenUsername
            password = System.getenv("PASSWORD") ?: mavenPassword
        }
    }
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}