package com.example.demo.service;

import com.example.demo.config.FeatureFlags;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SampleService {

  private final FeatureFlags featureFlags;

  public String execute() {
    // DIして使う場合
    //    if (featureFlags.newUiEnabled()) return "機能フラグON";
    //    return "機能フラグOFF";

    // static参照
    if (FeatureFlags.getInstance().newUiEnabled()) return "機能フラグON";
    return "機能フラグOFF";
  }
}
