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

    @GetMapping("/sample3")
    public int get3(int keyword) {
        return keyword * 2;
    }

    @GetMapping("/strConcatenation")
    public String get4(String keyword1, String keyword2) {
        return keyword1 + keyword2;
    }

    @GetMapping("/calculation/multiplication")
    public int get5(int number1, int number2) {
        return number1 * number2;
    }
}
