package com.example.demo.controller;

import com.example.demo.service.SampleService;
import com.example.demo.service.SampleService2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
public class SampleController {

    private final SampleService sampleService;
    private final SampleService2 sampleService2;

    public SampleController(SampleService sampleService, SampleService2 sampleService2) {
        this.sampleService = sampleService;
        this.sampleService2 = sampleService2;
    }

    @GetMapping
    public void get() {
        sampleService.print();
        sampleService2.print();
    }
}
