plugins {
    kotlin("kapt")
    kotlin("plugin.jpa")
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("com.querydsl:querydsl-jpa:5.0.0")
    kapt("com.querydsl:querydsl-apt:5.0.0:jpa")  // querydsl kapt setting
    kapt("org.springframework.boot:spring-boot-configuration-processor")
    implementation("io.springfox:springfox-boot-starter:3.0.0")
}

allOpen {
    annotation("javax.persistence.Entity")
    annotation("javax.persistence.MappedSuperclass")
    annotation("javax.persistence.Embeddable")
}

noArg {
    annotation("javax.persistence.Entity")
    annotation("javax.persistence.MappedSuperclass")
    annotation("javax.persistence.Embeddable")
}

// FIXME: to -> BasePluginConvention
//base.archivesBaseName
version = "1.0.0"

// 이걸 아래처럼 DSL 로 변환 가능
tasks.withType<Jar> { }

tasks {
    val projectName = ""
    jar {
        enabled = true
//        archiveBaseName.set(archiveBaseName)
//        archiveVersion.set("0.0.2")
    }

    bootJar {

    }
}

// 축약으로 사용 가능
tasks.bootJar { enabled = false }