package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/sample")
    public String get1() {
        return "Hello World";
    }

    @GetMapping("/sample2")
    public String get2(String keyword) {
        return keyword;
    }
}
