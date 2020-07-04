plugins{
    kotlin("kapt")
}

dependencies {
    implementation(project(":data"))
    implementation("org.mapstruct:mapstruct:1.4.0.Beta1")
    kapt("org.mapstruct:mapstruct-processor:1.4.0.Beta1")
    api("com.github.pozo:mapstruct-kotlin:1.3.1.2")
    kapt("com.github.pozo:mapstruct-kotlin-processor:1.3.1.2")
}