package com.example.demo.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class FoodObject {
    /**
     * 食べ物名
     */
    private final String foodName;
    /**
     * 札幌の味付け
     */
    private final String typeSapporo;
    /**
     * 横浜の味付け
     */
    private final String typeYokohama;
    /**
     * 福岡の味付け
     */
    private final String typeFukuoka;
}
