package com.example.demo.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;
import java.util.function.Function;

@RequiredArgsConstructor
@Getter
public enum FoodEnum {
    SAPPORO("札幌", FoodObject::getTypeSapporo),
    YOKOHAMA("横浜", FoodObject::getTypeYokohama),
    FUKUOKA("福岡", FoodObject::getTypeFukuoka);

    private final String prefecture;
    private final Function<FoodObject, String> function;

    /**
     * 地域にヒットしたFoodEnumを返却する
     */
    public static FoodEnum getFoodEnum(String prefecture) {
        return Arrays.stream(FoodEnum.values())
                .filter(e -> e.getPrefecture().equals(prefecture))
                .findFirst()
                .orElse(null);
    }
}
