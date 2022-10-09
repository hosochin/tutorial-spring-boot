package com.example.demo.service;

public class DevSampleService implements SampleService {
    @Override
    public String getToken() {
        return "dev token";
    }
}
