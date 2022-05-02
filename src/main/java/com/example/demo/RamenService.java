package com.example.demo;

import com.example.demo.model.FoodEnum;
import com.example.demo.model.FoodObject;
import org.springframework.stereotype.Service;

@Service
public class RamenService {

    /**
     * 地域ごとのラーメン情報を取得するメソッド
     */
    public String findRamen(String prefecture) {
        // DBからデータを取ってくる
        FoodObject foodObject = findFood("ラーメン");
        // 土地ごとの属性を取得
        return FoodEnum.getFoodEnum(prefecture).getFunction().apply(foodObject);
    }

    public String findRamen_NG(String prefecture) {
        // DBからデータを取ってくる
        FoodObject foodObject = findFood("ラーメン");

        FoodEnum foodEnum = FoodEnum.getFoodEnum(prefecture);
        switch (foodEnum) {
            case SAPPORO:
                return foodObject.getTypeSapporo();
            case YOKOHAMA:
                return foodObject.getTypeYokohama();
            case FUKUOKA:
                return foodObject.getTypeFukuoka();
        }
        // 土地ごとの属性を取得
        return FoodEnum.getFoodEnum(prefecture).getFunction().apply(foodObject);
    }

    /**
     * サンプルデータを返却
     */
    private FoodObject findFood(String foodName) {

        // foodNameでDBを検索
        // 今回は固定でラーメンの値を返却
        return new FoodObject(
                "ラーメン",
                "味噌",
                "豚骨醤油",
                "豚骨");
    }
}
