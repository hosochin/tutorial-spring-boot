package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class SampleObject {
    private Integer id;
    private String name;
}
