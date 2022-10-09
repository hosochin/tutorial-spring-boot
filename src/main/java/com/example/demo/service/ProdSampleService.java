package com.example.demo.service;

public class ProdSampleService implements SampleService {
    @Override
    public String getToken() {
        return "prod token";
    }
}
