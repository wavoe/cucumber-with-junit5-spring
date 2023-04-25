package com.swayam.demo.springbootdemo.cucumber;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition
public class CucumberWithJunit5AndSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(CucumberWithJunit5AndSpringApplication.class, args);
    }

}
