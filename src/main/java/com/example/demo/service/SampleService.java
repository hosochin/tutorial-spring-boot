package com.example.demo.service;

import com.example.demo.service.resource.MyObj;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SampleService {

    public void sample() {

        List<String> list = Arrays.asList(
                "A",
                "B",
                "C",
                "A"
        );

        list.stream().distinct().collect(Collectors.toList());

        List<MyObj> list = Arrays.asList(
                new MyObj(1, "Ichiro"),
                new MyObj(2, "Jiro"),
                new MyObj(3, "Jiro"),
                new MyObj(3, "Sabro"),
                new MyObj(3, "Sabro2"),
                new MyObj(1, "Ichiro")
        );

        list.stream().distinct().collect(Collectors.toList());

    }

}
