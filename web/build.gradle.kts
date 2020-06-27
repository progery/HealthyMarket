plugins {
    kotlin("jvm")
}

group = "com.progery"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation("org.springframework.boot:spring-boot-starter-web:2.3.1.RELEASE")
    implementation(project(":services"))
}