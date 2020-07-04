plugins {
    id("org.jetbrains.kotlin.plugin.jpa") version("1.3.72")
    kotlin("kapt")
}

dependencies {
    api("org.springframework.boot:spring-boot-starter-data-jpa:2.3.1.RELEASE")
    runtimeOnly("org.postgresql:postgresql:42.2.12")
    api("com.github.pozo:mapstruct-kotlin:1.3.1.2")
    kapt("com.github.pozo:mapstruct-kotlin-processor:1.3.1.2")
}