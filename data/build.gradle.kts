plugins {
    kotlin("jvm")
    id("org.jetbrains.kotlin.plugin.jpa") version("1.3.72")
}

group = "com.progery"
version = "0.0.1-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    api("org.springframework.boot:spring-boot-starter-data-jpa:2.3.1.RELEASE")
    runtimeOnly("org.postgresql:postgresql:42.2.12")
}