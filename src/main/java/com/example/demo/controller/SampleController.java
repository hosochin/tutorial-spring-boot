package com.example.demo.controller;

import com.example.demo.controller.resource.GetUserTaleResponse;
import com.example.demo.domain.repository.sample01.UserRepository01;
import com.example.demo.domain.repository.sample02.UserRepository02;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
public class SampleController {
    private final UserRepository01 userRepository01;
    private final UserRepository02 userRepository02;

    public SampleController(UserRepository01 userRepository01, UserRepository02 userRepository02) {
        this.userRepository01 = userRepository01;
        this.userRepository02 = userRepository02;
    }

    @GetMapping("/sample01")
    public GetUserTaleResponse getSample01() {
        return new GetUserTaleResponse(userRepository01.findAll());
    }

    @GetMapping("/sample02")
    public GetUserTaleResponse getSample02() {
        return new GetUserTaleResponse(userRepository02.findAll());
    }
}
