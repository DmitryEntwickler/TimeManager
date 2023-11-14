// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.1.1" apply false

    // kotlin version standart ist 1.8.10
    // um 1.9.0 zu verwenden, man soll  kotlinCompilerExtensionVersion auf "1.5.2" setzen
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false

    kotlin("jvm") version "1.9.0" // or kotlin("multiplatform") or any other kotlin plugin
    kotlin("plugin.serialization") version "1.9.0"
    id("com.android.library") version "8.1.1" apply false
}