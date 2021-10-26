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
    implementation("org.springframework.boot:spring-boot-starter-data-jdbc")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springdoc:springdoc-openapi-ui:1.5.10")
    implementation("org.springdoc:springdoc-openapi-kotlin:1.5.10")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("org.flywaydb:flyway-core")
    implementation("ru.eho:common-lib:0.0.1-SNAPSHOT")
    runtimeOnly("org.postgresql:postgresql")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("com.h2database:h2")
    testImplementation("org.mockito:mockito-core")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}