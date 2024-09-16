## Spring boot V3 - CRUD Spring Boot + MySQL + Thymeleaf

## System Requirements

- Java openjdk : ( version "17.0.2")
- Spring Boot : (version 3.3.3)
- MySQL Database
- Maven : (Apache Maven 3.9.3)
- Editor : (Intellij IDEA 2023.1.1 Community Edition)

## Dependencis

- Spring Data JPA
- Spring Web
- MySQL Driver
- Thymeleaf
- Lombok

## run project

1. clone project Spring boot
```
https://github.com/rardan97/spring-boot-crud-user-thymeleaf.git
```

2. create a new database mysql with name "db_spring_user"

3. open project with intellij IDEA then edit config database in application.properties change database name, username and password match your config db

   #### location : spring-boot-crud-user-thymeleaf/src/main/resources/application.properties

```
spring.application.name=spring-boot-crud-user-thymeleaf
spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:mysql://localhost:3306/db_spring_user
spring.datasource.username=root
spring.datasource.password=
spring.datasource.driver-class-name=com.mysql.jdbc.Driver
spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect
```


4. open terminal input command
```
mvn clean install 
```
5. when success process clean install, next input command for run application
```
mvn spring-boot:run
```

## Testing project
1. Open Browser and input url below for testing application :
```
http://localhost:8080/user
```