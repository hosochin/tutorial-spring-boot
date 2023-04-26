package com.example.demo.controller;

import com.example.demo.model.Message;
import com.example.demo.service.SampleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class SampleController {

    private final SampleService sampleService;

    @GetMapping("/get/message")
    public Message getMessage(@RequestParam(name = "message") String message) {
        return sampleService.getMessage(message);
    }

//    @GetMapping("/get/messages")
//    public String getMessages(
//            @RequestParam(name = "message1") String message1,
//            @RequestParam(name = "message2") String message2
//    ) {
//        return sampleService.getMessages(message1, message2);
//    }

    @GetMapping("/get/messages")
    public String getMessages(
            @RequestParam(name = "messages") List<String> messages
    ) {
        return sampleService.getMessages(messages);
    }

    @GetMapping("/get/message/object")
    public Message getMessageObject(
            @RequestParam(name = "message") String message
    ) {
        return sampleService.getMessageObject(message);
    }

}
