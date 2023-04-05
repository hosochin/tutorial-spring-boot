package com.example.demo.controller;

import com.example.demo.service.SampleService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
@RequiredArgsConstructor
@Slf4j
public class SampleController {

    private final SampleService sampleService;

    @GetMapping
    public String get(@RequestParam(name = "message") String message) {
        log.info("処理開始");
        String str = sampleService.sampleCache(message);
//        sampleService.sampleCache2(message);
        log.info("処理終了");
        return str;
    }
}
