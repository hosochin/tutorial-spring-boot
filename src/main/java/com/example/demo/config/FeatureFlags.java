package com.example.demo.config;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.context.properties.ConfigurationProperties;

/** 機能フラグを一元管理するクラス */
@ConfigurationProperties(prefix = "feature")
public record FeatureFlags(boolean newUiEnabled) {
  private static FeatureFlags staticFeatureFlags;

  @PostConstruct
  private void init() {
    staticFeatureFlags = new FeatureFlags(newUiEnabled);
  }

  public static FeatureFlags getInstance() {
    return staticFeatureFlags;
  }
}
