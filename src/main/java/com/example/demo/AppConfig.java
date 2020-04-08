package com.example.demo;

import com.example.demo.model.SampleObject;
import com.example.demo.service.SampleService2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Value("${sample.id}")
    private Integer id;

    @Value("${sample.name}")
    private String name;

    @Bean
    SampleService2 sampleService2() {
        return new SampleService2(id, name, new SampleObject());
    }
}
