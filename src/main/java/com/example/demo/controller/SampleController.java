package com.example.demo.controller;

import com.example.demo.controller.resource.Message;
import com.example.demo.service.TutorialRestTemplate;
import com.example.demo.service.TutorialWebClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
public class SampleController {

    private final TutorialRestTemplate tutorialRestTemplate;
    private final TutorialWebClient tutorialWebClient;

    // RestTemplateのGET
    @GetMapping("/restTemplate")
    public Message getRestTemplate() {
        return tutorialRestTemplate.get();
    }

    // RestTemplateのPOST
    @PostMapping("/restTemplate")
    public void postRestTemplate(@RequestBody Message message) {
        tutorialRestTemplate.post(message);
    }

    // WebClientのGET
    @GetMapping("/webClient")
    public Message getWebClient() {
        return tutorialWebClient.get();
    }

    // WebClientのPOST
    @PostMapping("/webClient")
    public void postWebClient(@RequestBody Message message) {
        tutorialWebClient.post(message);
    }
}
