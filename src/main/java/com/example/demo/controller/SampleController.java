package com.example.demo.controller;

import com.example.demo.domain.entity.UserEntity;
import com.example.demo.domain.repository.UserRepository;
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
    private final UserRepository userRepository;

//    @PostMapping
//    public void post() {
//        List<UserEntity> entities = Arrays.asList(
//                new UserEntity("001", "Taro", "Tanaka"),
//                new UserEntity("002", "Jiro", "Suzuki")
//        );
//        userRepository.saveAll(entities);
//    }
}
