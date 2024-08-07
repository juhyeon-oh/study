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
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("com.google.guava:guava:28.1-jre")
    testImplementation("org.testng:testng:7.4.0") // TestNG 라이브러리 추가
    testImplementation(kotlin("test"))
}

tasks.test {
    useTestNG() // TestNG 사용 설정
}

application {
    mainClass.set("org.example.MainKt")
    applicationDefaultJvmArgs = listOf("-Dfile.encoding=UTF-8")
}

kotlin {
    jvmToolchain(17)
    sourceSets {
        val main by getting {
            kotlin.srcDirs("src/main/kotlin")
        }
        val test by getting {
            kotlin.srcDirs("src/test/kotlin")
        }
    }
}

tasks.named<JavaExec>("run") {
    standardInput = System.`in`
}
