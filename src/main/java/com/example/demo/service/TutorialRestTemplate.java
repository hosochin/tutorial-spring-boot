package com.example.demo.service;

import com.example.demo.controller.resource.Message;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class TutorialRestTemplate {

    private final RestTemplate restTemplate;

    // コンストラクタインジェクション
    public TutorialRestTemplate(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    // GETメソッド
    public Message get() {
        return restTemplate.getForObject("http://localhost:3000/users", Message.class);
    }

    // POSTメソッド
    public void post(Message message) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Message> request = new HttpEntity<>(message, headers);
        restTemplate.postForObject("http://localhost:3000/users", request, String.class);
    }
}
