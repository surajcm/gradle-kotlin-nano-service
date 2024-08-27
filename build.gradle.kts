buildscript {
    repositories {
        mavenCentral()
    }

    dependencies {
        classpath(kotlin("gradle-plugin", version = "1.3.40"))
    }
}

plugins {
    idea
    application
    kotlin("jvm") version "2.0.20"
}

repositories {
    mavenCentral()
}

application {
    mainClassName = "com.nano.hello.NanoServiceKt"
}

dependencies {
    compile(kotlin("stdlib"))
}
