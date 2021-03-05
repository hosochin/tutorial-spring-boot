package com.example.demo.controller;

import com.example.demo.controller.resource.PostShopInfo;
import com.example.demo.model.ShopDetailInfo;
import com.example.demo.service.ShopDataService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShopInfoController {
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

    /**
     * 店舗情報を登録するコントローラ
     *
     * @param postShopInfo 店舗情報
     */
    @PostMapping("/insertShopInfo")
    public void insertShopInfo(PostShopInfo postShopInfo) {
        // TODO
    }

    /**
     * 店舗情報を削除するコントローラ
     *
     * @param shopName 店舗名
     */
    @DeleteMapping("/deleteShopInfo")
    public void deleteShopInfo(String shopName) {
        // TODO
    }
}
