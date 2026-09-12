buildscript {
    repositories {
        mavenCentral()
    }

    dependencies {
        classpath(kotlin("gradle-plugin", version = "2.4.20"))
    }
}

plugins {
    idea
    application
    kotlin("jvm") version "2.4.20"
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
