# About

Started from GitHub repo *paawak/spring-boot-demo* >
[cucumber-with-junit5-spring](https://github.com/paawak/spring-boot-demo/tree/master/cucumber/cucumber-with-junit5-spring)

Example of creating Cucumber based **BDD** tests using JUnit5 and Spring for Dependency Injection.  
Start the microservice and then run the tests.

Using:

* Spring-boot v3 (Java 17 & Jakarta EE 9)
* Cucumber v7 (with JUnit 5 & Spring integration)
* Spring Data JPA
* H2 in-memory database
* Liquibase (manage db schema's and foresee some sample data)
* OpenAPI 3 (springdoc-openapi)
* Gradle

# Swagger

<http://localhost:8080/swagger-ui.html>

# Access H2 DB Console

<http://localhost:8080/h2-console/>

The JDBC Url is: *jdbc:h2:mem:library*.  
The user-name and password are both *sa*.

# Rest end points

## Author

### List all Authors

<http://localhost:8080/v1/author/>

### Get Authors by name

<http://localhost:8080/v1/author/ban>

## Book

### List all Books

<http://localhost:8080/v1/book/>

### Get Books by name

<http://localhost:8080/v1/book/agn>

### Update an Author in a Book

    curl -X PUT "http://localhost:8080/v1/book/author?authorId=2&bookId=1" -H  "accept: */*"

# Reference

## Cucumber

Spring Cucumber Reference: <https://github.com/cucumber/cucumber-jvm/tree/main/cucumber-spring>

JUnit 5 Example: <https://github.com/cucumber/cucumber-jvm/tree/main/examples/calculator-java-junit5>
