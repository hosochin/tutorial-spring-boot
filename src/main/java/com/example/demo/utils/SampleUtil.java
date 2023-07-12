package com.example.demo.utils;

import com.example.demo.SampleComponent;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
//@RequiredArgsConstructor
public class SampleUtil {
    // finalは除去, staticを付与
    private static SampleComponent sampleComponent;

    // コンストラクタを追加(lombokだと意図したコンストラクタが生成されないためちゃんと記述する）
    public SampleUtil(SampleComponent sampleComponent) {
        SampleUtil.sampleComponent = sampleComponent;
    }

    // staticメソッドに変更
    public static String getMessage() {
        return sampleComponent.getSampleComponentMessage();
    }

}