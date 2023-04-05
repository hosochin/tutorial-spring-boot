package com.example.demo.service;

import com.example.demo.controller.resource.Message;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Component
public class TutorialWebClient {

    private final WebClient webClient;

    // コンストラクタインジェクション
    public TutorialWebClient() {
        this.webClient = WebClient.builder()
                .baseUrl("http://localhost:3000")
                .build();
    };

    // GETメソッド
    public Message get() {
        return webClient.get()
                .uri("/users")
                .retrieve()
                .bodyToMono(Message.class)
                .block();
    }

    // POSTメソッド
    public void post(Message message) {
        webClient.post()
                .uri("/users")
                .contentType(MediaType.APPLICATION_JSON)
                .body(Mono.just(message), Message.class)
//                .syncBody(message)
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }

    public Object get2() {
        return webClient.get()
                .uri("/users")
                .retrieve()
                .bodyToMono(Object.class)
                .block();
    }

    public Mono<Object> get3() {
        return webClient.get()
                .uri("/users")
                .retrieve()
                .bodyToMono(Object.class);
    }
}
