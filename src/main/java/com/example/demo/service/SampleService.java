package com.example.demo.service;

import com.example.demo.model.Message;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@Slf4j
public class SampleService {

    @Cacheable(cacheNames = "getMessage")
    public Message getMessage(String message) {
        log.info("キャッシュ効いてない, message=" + message);
        return new Message(message, LocalDateTime.now());
    }

//    @Cacheable(cacheNames = "getMessages")
//    public String getMessages(String message1, String message2) {
//        log.info("キャッシュ効いてない, message1=" + message1 + ", message2=" + message2);
//        return message1 + message2;
//    }

    @Cacheable(cacheNames = "getMessages")
    public String getMessages(List<String> messages) {
        log.info("キャッシュ効いてない");
        return messages.get(0);
    }

    @Cacheable(cacheNames = "getMessageObject")
    public Message getMessageObject(String message) {
        log.info("キャッシュ効いてない, message=" + message);
        return new Message(message, LocalDateTime.now());
    }

    @Cacheable(cacheNames = "getMessageObject")
    public String getMessageObject2(Message message) {
        log.info("キャッシュ効いてない");
        return message.getMessage();
    }

}
