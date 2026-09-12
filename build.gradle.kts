buildscript {
    repositories {
        mavenCentral()
    }

    dependencies {
        classpath(kotlin("gradle-plugin", version = "1.9.25"))
    }
}

plugins {
    idea
    application
    kotlin("jvm") version "1.9.25"
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
