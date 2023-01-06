plugins {
    java
}

group = "org.bytedream"
version = "1.3.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.json:json:20220924")
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
}
