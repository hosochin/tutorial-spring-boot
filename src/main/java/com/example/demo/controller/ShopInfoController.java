package com.example.demo.controller;

import com.example.demo.domain.model.ShopInfo;
import com.example.demo.service.ShopDataService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ShopInfoController {

    /**
     * 店舗名で店舗情報を検索するコントローラ
     *
     * @param shopName 店舗名
     * @return 店舗詳細情報
     */
    @GetMapping("/searchShopInfo")
    public ShopInfo searchShopInfo(String shopName) {
        ShopDataService shopDataService = new ShopDataService();
        return shopDataService.searchShopInfo(shopName);
    }

    /**
     * 店舗名一覧を返却するコントローラ
     *
     * @return 店舗名リスト
     */
    @GetMapping("/searchShopNameList")
    public List<String> searchShopNameList() {
        ShopDataService shopDataService = new ShopDataService();
        return shopDataService.searchShopNameList();
    }

    /**
     * 店舗情報を登録するコントローラ
     *
     * @param shopInfo 店舗情報
     */
    @PostMapping("/insertShopInfo")
    public void insertShopInfo(ShopInfo shopInfo) {
        // TODO
    }

    /**
     * 店舗情報を更新するコントローラ
     *
     * @param shopInfo 店舗情報
     */
    @PostMapping("/updateShopInfo")
    public void updateShopInfo(ShopInfo shopInfo) {
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
