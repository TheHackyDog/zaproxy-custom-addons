plugins {
    id("org.zaproxy.add-on") version "0.13.1" apply false
    id("io.freefair.lombok") version "9.2.0" apply false
}

subprojects {
    apply(plugin = "io.freefair.lombok")

    repositories {
        mavenCentral()
    }
}
