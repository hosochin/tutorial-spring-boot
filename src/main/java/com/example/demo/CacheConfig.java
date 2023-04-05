package com.example.demo;

import com.github.benmanes.caffeine.cache.CacheLoader;
import com.github.benmanes.caffeine.cache.Caffeine;
import com.github.benmanes.caffeine.cache.LoadingCache;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

@Configuration
public class CacheConfig {
    @Bean
    public CacheLoader<Object, Object> cacheLoader() {
        return string -> {
            System.out.println("string = " + string);
            return string;
        };
    }

    @Bean
    public LoadingCache<Object, Object> loader(CacheLoader<Object, Object> cacheLoader) {
        return Caffeine.newBuilder()
                .refreshAfterWrite(10, TimeUnit.SECONDS)
                .build(cacheLoader);
    }

}
