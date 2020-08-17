package com.example.demo.controller;

import com.example.demo.domain.entity.UserEntity;
import com.example.demo.domain.repository.sample01.UserRepository01;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/sample")
@RequiredArgsConstructor
public class SampleController {
    private final UserRepository01 userRepository01;

    @PostMapping
    public void post() {
        List<UserEntity> entities = Arrays.asList(
                new UserEntity("001", "Taro", "Tanaka"),
                new UserEntity("002", "Jiro", "Suzuki")
        );
        userRepository01.saveAll(entities);
    }
}
