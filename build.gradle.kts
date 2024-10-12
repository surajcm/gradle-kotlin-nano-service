buildscript {
    repositories {
        mavenCentral()
    }

    dependencies {
        classpath(kotlin("gradle-plugin", version = "2.0.21"))
    }
}

plugins {
    idea
    application
    kotlin("jvm") version "1.3.40"
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
