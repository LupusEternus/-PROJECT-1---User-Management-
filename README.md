# Project Documentation

## Technologies and Tools Used

1. **Java 17**
   - Language used for developing the application.

2. **Spring Boot 3.2.5**
   - **Spring Boot Starter Data JPA**: For data persistence using JPA.
   - **Spring Boot Starter Web**: For building web, including RESTful, applications using Spring MVC.
   - **Spring Boot Starter Validation**: For validating request bodies and parameters.
   - **Spring Boot Starter Test**: For testing with JUnit, Hamcrest, and Mockito.

3. **Database**
   - **MySQL Connector**: JDBC driver for connecting to MySQL databases.

4. **Lombok**
   - Library used to reduce boilerplate code through annotations.

5. **Build Tool**
   - **Maven**: Used for managing dependencies and the build lifecycle.
   - **Spring Boot Maven Plugin**: For integrating Spring Boot application lifecycle support into the Maven build process.

## Dependencies Summary

```xml
<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-validation</artifactId>
    </dependency>
    <dependency>
        <groupId>com.mysql</groupId>
        <artifactId>mysql-connector-j</artifactId>
        <scope>runtime</scope>
    </dependency>
    <dependency>
        <groupId>org.projectlombok</groupId>
        <artifactId>lombok</artifactId>
        <optional>true</optional>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-test</artifactId>
        <scope>test</scope>
    </dependency>
</dependencies>
