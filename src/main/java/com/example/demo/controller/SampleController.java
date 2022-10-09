package com.example.demo.controller;

import com.example.demo.service.SampleService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
@RequiredArgsConstructor
public class SampleController {

    private final SampleService sampleService;

    @Value("${env}")
    private String env;

    @GetMapping
    public String get() {
        System.out.println(env);
        return sampleService.getToken();
    }
}
