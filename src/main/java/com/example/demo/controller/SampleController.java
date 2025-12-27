package com.example.demo.controller;

import com.example.demo.utils.SampleUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
@RequiredArgsConstructor
public class SampleController {

//    private final SampleUtil sampleUtil;

    @GetMapping
    public String get() {
        return SampleUtil.getMessage();
    }
}
