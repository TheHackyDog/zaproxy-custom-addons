import org.zaproxy.gradle.addon.AddOnStatus

plugins {
    id("org.zaproxy.add-on") version "0.13.1"
}

description =
    "WSTG Mapper provides a WSTG compliance dashboard that maps ZAP alerts to " +
    "OWASP Web Security Testing Guide coverage."

zapAddOn {
    addOnName.set("WSTG Mapper")
    addOnStatus.set(AddOnStatus.ALPHA)

    manifest {
        author.set("Theodoros Vartamtzidis")
        url.set("https://github.com/thehackydog/zaproxy-custom-addons")
        bundle {
            baseName.set("org.zaproxy.addon.wstgmapper.resources.Messages")
            prefix.set("wstgmapper")
        }
        dependencies {
            addOns {
                register("commonlib") {
                    version.set(">= 1.38.0 & < 2.0.0")
                }
            }
        }
    }
}

dependencies {
    compileOnly(libs.zap)

    testImplementation(libs.zap)
    testImplementation(libs.test.junit.jupiter)
    testImplementation(libs.test.hamcrest)
    testImplementation(libs.test.mockito)
    testRuntimeOnly(libs.test.junit.platformLauncher)
}
