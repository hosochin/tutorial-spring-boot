package com.example.demo.service;

import com.example.demo.model.SampleObject;

public class SampleService2 {
    private Integer id;

    private String name;

    private final SampleObject sampleObject;

    /**
     * コンストラクタ
     */
    public SampleService2(Integer id, String name, SampleObject sampleObject) {
        this.id = id;
        this.name = name;
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
