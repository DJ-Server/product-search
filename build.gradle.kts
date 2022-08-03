import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

val springCloudVersion = "3.1.3"

plugins {
    id("org.springframework.boot") version "2.7.2"
    id("io.spring.dependency-management") version "1.0.12.RELEASE"
    kotlin("jvm") version "1.6.21"
    kotlin("plugin.spring") version "1.6.21"
    kotlin("plugin.jpa") version "1.6.21"
}

group = "com.naver.product-search"
java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
    mavenCentral()
}

dependencies {
//    implementation("org.springframework.boot:spring-boot-starter-actuator")
//    implementation("org.springframework.boot:spring-boot-starter-data-elasticsearch")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
//    implementation("org.springframework.boot:spring-boot-starter-data-redis")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
//    implementation("org.springframework.kafka:spring-kafka")
    implementation("com.github.gavlyukovskiy:p6spy-spring-boot-starter:1.8.0")
//    runtimeOnly("mysql:mysql-connector-java")
    runtimeOnly("com.h2database:h2")

    implementation("org.springframework.cloud:spring-cloud-starter-openfeign:$springCloudVersion")
    implementation("io.github.openfeign:feign-okhttp:10.10.1")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
//    testImplementation("org.springframework.kafka:spring-kafka-test")
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "11"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}
