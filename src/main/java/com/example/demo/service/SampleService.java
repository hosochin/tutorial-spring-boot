package com.example.demo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SampleService {

    @Cacheable("sampleCache")
    public String sampleCache(String message) {
        log.info("キャッシュ効いてない, message=" + message);
        return message;
    }

    @Cacheable("sampleCache2")
    public String sampleCache2(String message) {
        log.info("キャッシュ効いてない2, message=" + message);
        return message;
    }
}
