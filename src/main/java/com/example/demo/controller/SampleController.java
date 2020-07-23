package com.example.demo.controller;

import com.example.demo.myannotation.MyAnnotation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping
public class SampleController {

    /**
     * リクエストパラメータの文字列を大文字に変換して返すcontroller
     */
    @GetMapping("/upper-case")
//    @MyAnnotation(conversionType = MyAnnotation.ConversionType.UPPER)
    public String getUpperCase(@RequestParam(name = "message") String message) {
        ArrayList<String> list = new ArrayList();
        ArrayList list2 = new ArrayList<>();
        list2.add(1);
        list = list2;
        list.get(0);
        return message;
    }

    /**
     * リクエストパラメータの文字列を小文字に変換して返すcontroller
     */
    @GetMapping("/lower-case")
    @MyAnnotation(conversionType = MyAnnotation.ConversionType.LOWER)
    public String getLowerCase(@RequestParam(name = "message") String message) {
        return message;
    }
}
