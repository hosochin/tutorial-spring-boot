package com.example.demo.controller;

import com.example.demo.model.ShopDetailInfo;
import com.example.demo.service.ShopDataService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/sample")
    public String get1() {
        return "Hello World";
    }

    @GetMapping("/sample2")
    public String get2(String keyword) {
        return keyword;
    }

    @GetMapping("/sample3")
    public int get3(int keyword) {
        return keyword * 2;
    }

    @GetMapping("/strConcatenation")
    public String get4(String keyword1, String keyword2) {
        return keyword1 + keyword2;
    }

    @GetMapping("/calculation/multiplication")
    public int get5(int number1, int number2) {
        return number1 * number2;
    }

    /**
     * 店舗情報を検索するコントローラ
     *
     * @param shopName 店舗名
     * @return 店舗詳細情報
     */
    @GetMapping("/searchShopInfo")
    public String searchShopInfo(String shopName) {
        ShopDataService shopDataService = new ShopDataService();
        ShopDetailInfo shopDetailInfo = shopDataService.selectShopInfo(shopName);

        if (shopDetailInfo == null) {
            return "検索した店舗は存在しません";
        }

        String type = shopDetailInfo.getType();
        String location = shopDetailInfo.getLocation();
        String comment = shopDetailInfo.getComment();
        return "店舗名：" + shopName + ", 種別：" + type + ", 住所：" + location + ", コメント：" + comment;
    }
}
