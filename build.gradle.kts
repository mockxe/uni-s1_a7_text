plugins {
    id("application")
    id("java")
}

group = "io.mockxe.uni.s1.a7.text"
version = "1.0-SNAPSHOT"

application {
    mainClass.set("io.mockxe.uni.s1.a7.text.Launcher")
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.9.1")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}