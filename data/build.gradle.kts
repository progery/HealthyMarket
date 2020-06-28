plugins {
    id("org.jetbrains.kotlin.plugin.jpa") version("1.3.72")
}

dependencies {
    api("org.springframework.boot:spring-boot-starter-data-jpa:2.3.1.RELEASE")
    runtimeOnly("org.postgresql:postgresql:42.2.12")
}