package com.example.demo;

import com.example.demo.service.SampleService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Value("${name.first}")
    private String firstName;

    @Value("${name.last}")
    private String lastName;

    @Bean
    SampleService sampleService() {
        return new SampleService(firstName, lastName, firstName + lastName);
    }
}