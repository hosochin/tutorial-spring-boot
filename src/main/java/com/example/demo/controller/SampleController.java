package com.example.demo.controller;

import com.example.demo.service.SampleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/sample")
public class SampleController {

    private final SampleService service;

    @GetMapping
    public String get() {
        service.sample();
        return "Hello World";
    }
}
