package com.example.demo.controller;

import com.example.demo.controller.resource.SampleObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/sample")
public class SampleController {

    @GetMapping
    public String get() {
        List<SampleObject.SubSampleObject> list = new ArrayList<>();
        list.add(new SampleObject.SubSampleObject(null));
        SampleObject sampleObject = new SampleObject(null, null, list, new SampleObject.SubSampleObject(null));
        validation(sampleObject);

        return "";
    }

    /**
     * オブジェクトをバリデーションするメソッド
     */
    private void validation(Object obj) {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();

        // バリデーションの実行
        Set<ConstraintViolation<Object>> results = validator.validate(obj);
        results.forEach(this::outputLog);
    }

    /**
     * ログ出力
     */
    private void outputLog(ConstraintViolation<Object> result) {
        System.out.println(
                "propertyPath: " + result.getPropertyPath()
                + ", message: " + result.getMessage());
    }
}
