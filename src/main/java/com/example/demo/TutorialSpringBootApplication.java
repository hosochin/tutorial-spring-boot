package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class TutorialSpringBootApplication {

  public static void main(String[] args) {
    SpringApplication.run(TutorialSpringBootApplication.class, args);
  }
}
