package com.swayam.demo.springbootdemo.cucumber.cukes;

import org.springframework.test.context.ContextConfiguration;

import io.cucumber.spring.CucumberContextConfiguration;

@CucumberContextConfiguration
@ContextConfiguration(classes = {SpringTestConfig.class})
public class CucumberSpringContextConfig {

}
