package com.example.demo;

import org.springframework.boot.autoconfigure.cache.RedisCacheManagerBuilderCustomizer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheConfiguration;

import java.time.Duration;

@Configuration
@EnableCaching
public class RedisConfig {

    @Bean
    public RedisCacheManagerBuilderCustomizer redisCacheManagerBuilderCustomizer() {
        return (builder) -> builder
                .withCacheConfiguration(
                        // キャッシュ名を指定する
                        "getMessages",
                        // TTLを指定する
                        // ここでは10秒に設定
                        RedisCacheConfiguration.defaultCacheConfig().entryTtl(Duration.ofSeconds(10))
                )
                // それ以外のキャッシュしたいメソッドについても続けて書いていける
                .withCacheConfiguration(
                        "そのほかにキャッシュしたいメソッド",
                        RedisCacheConfiguration.defaultCacheConfig().entryTtl(Duration.ofMinutes(10))
                );
    }
}
