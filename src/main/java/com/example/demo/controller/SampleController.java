package com.example.demo.controller;

import com.example.demo.service.SampleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
@RequiredArgsConstructor
public class SampleController {

  private final SampleService sampleService;

  @GetMapping
  public String get() {
    return sampleService.execute();
  }
}
