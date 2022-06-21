package com.example.demo.controller;

import com.example.demo.domain.repository.TeamRepository;
import com.example.demo.domain.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SampleController {
    private final TeamRepository teamRepository;
    private final UserRepository userRepository;

    @GetMapping("/sample")
    public Object get() {
//        return teamRepository.find("A");
        return teamRepository.findAll();
//        return null;
    }

    @GetMapping("/sample2")
    public Object get2() {
//        return teamRepository.find("A");
        return userRepository.findAll();
//        return null;
    }

}
