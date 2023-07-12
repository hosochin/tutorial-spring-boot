package com.example.demo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

//@Service
public class SampleService {

//    @Value("${name.first}")
    private String firstName;

//    @Value("${name.last}")
    private String lastName;

    private final String fullName;

//    /**
//     * コンストラクタ
//     */
//    public SampleService() {
//        fullName = firstName + lastName;
//    }

//    /**
//     * コンストラクタ
//     */
//    public SampleService(
//            @Value("${name.first}") String firstName, // 引数に追加
//            @Value("${name.last}") String lastName // 引数に追加
//    ) {
//        fullName = firstName + lastName;
//    }

    /**
     * コンストラクタ
     */
    public SampleService(
            String firstName,
            String lastName,
            String fullName
    ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = fullName;
    }

    public void print() {
        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);
        System.out.println("fullName = " + fullName);
    }
}
