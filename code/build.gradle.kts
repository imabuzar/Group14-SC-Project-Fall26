plugins {
    // Apply the application plugin to add support for building a CLI application in Java.
    application

    // Apply the OpenJFX plugin to handle platform-specific dependencies and module paths.
    id("org.openjfx.javafxplugin") version "0.1.0"
}

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}


javafx {
    version = "25.0.5"
    modules = listOf("javafx.controls")
}

dependencies {
}

// Apply a specific Java toolchain to ease working on different environments.
java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(25)
    }
}

application {
    // Define the main class for the application.
    mainClass = "App"
}
