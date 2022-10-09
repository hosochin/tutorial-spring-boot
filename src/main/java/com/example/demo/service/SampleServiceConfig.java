package com.example.demo.service;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SampleServiceConfig {

    @Bean
    @ConditionalOnProperty(value = "env", havingValue = "dev", matchIfMissing = true)
    public SampleService sampleDevService() {
        return new DevSampleService();
    }

    @Bean
    @ConditionalOnProperty(value = "env", havingValue = "prod")
    public SampleService sampleProdService() {
        return new ProdSampleService();
    }

}
