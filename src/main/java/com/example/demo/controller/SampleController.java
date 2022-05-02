package com.example.demo.controller;

import com.example.demo.RamenService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
@RequiredArgsConstructor
public class SampleController {

    private final RamenService foodService;

    @GetMapping
    public String get() {
        foodService.findRamen("札幌");
        foodService.findRamen("横浜");
        foodService.findRamen("福岡");
        return "Hello World";
    }
}
