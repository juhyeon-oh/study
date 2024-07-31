plugins {
    kotlin("jvm") version "1.9.23"
    application
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation(kotlin("test"))
}

application {
    // Gradle 8.x에서 사용하는 방식으로 mainClass 설정
    mainClass.set("org.example.MainKt")
}

kotlin {
    jvmToolchain(17) // JVM toolchain 설정
    sourceSets {
        val main by getting {
            kotlin.srcDirs("src/main/kotlin")
        }
    }
}

// Run task 설정
tasks.named<JavaExec>("run") {
    standardInput = System.`in` // 표준 입력을 설정하여 사용자 입력을 받을 수 있도록 설정
}