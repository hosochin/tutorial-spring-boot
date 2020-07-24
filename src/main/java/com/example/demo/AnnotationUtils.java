package com.example.demo;

import com.example.demo.myannotation.MyAnnotation;
import com.google.common.base.CaseFormat;
import org.apache.commons.lang3.ArrayUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class AnnotationUtils {
    @Around("@annotation(com.example.demo.myannotation.MyAnnotation)")
    public String myAnnotationImpl(JoinPoint jp) {
        // controllerで受け取った引数を取り出す
        if(ArrayUtils.isEmpty(jp.getArgs())) {
            return "";
        }
        String arg = String.valueOf(jp.getArgs()[0]);

        MethodSignature signature = (MethodSignature) jp.getSignature();
        MyAnnotation instance = signature.getMethod().getAnnotation(MyAnnotation.class);

        switch (instance.conversionType()) {
            case UPPER:
                // 大文字に変換
                return arg.toUpperCase();
            case LOWER:
                // 小文字に変換
                return arg.toLowerCase();
            default:
                return "";
        }
    }
}
