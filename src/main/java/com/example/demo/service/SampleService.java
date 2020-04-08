package com.example.demo.service;

import com.example.demo.model.SampleObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class SampleService {

    @Value("${sample.id}")
    private Integer id;

    @Value("${sample.name}")
    private String name;

    private final SampleObject sampleObject;

//    /**
//     * コンストラクタ
//     */
//    public SampleService(SampleObject sampleObject) {
//        this.sampleObject = sampleObject;
//        this.sampleObject.setId(id);
//        this.sampleObject.setName(name);
//    }

    public SampleService(
            SampleObject sampleObject,
            @Value("${sample.id}") Integer id,
            @Value("${sample.name}") String name
    ) {
        System.out.println("sampleServiceの初期化");
        this.sampleObject = sampleObject;
        this.sampleObject.setId(id);
        this.sampleObject.setName(name);
    }

    public void print() {
        System.out.println("id = " + id);
        System.out.println("name = " + name);
        System.out.println("sampleObject.id = " + sampleObject.getId());
        System.out.println("sampleObject.name = " + sampleObject.getName());
    }
}
