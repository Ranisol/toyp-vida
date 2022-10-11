group = "learn.spring"
dependencies {
    // jpa
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    // h2 database
    runtimeOnly("com.h2database:h2")
    // lombok
    annotationProcessor("org.projectlombok:lombok")
    implementation("org.projectlombok:lombok")
}