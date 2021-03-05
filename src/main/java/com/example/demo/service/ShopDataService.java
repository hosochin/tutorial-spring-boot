package com.example.demo.service;

import com.example.demo.model.ShopDetailInfo;
import com.example.demo.model.ShopInfo;
import org.springframework.stereotype.Service;

/**
 * 店舗情報を扱うクラス
 */
@Service
public class ShopDataService {

    /**
     * 店舗検索メソッド
     *
     * @param shopName 店舗名
     * @return 店舗詳細情報
     */
    public ShopDetailInfo selectShopInfo(String shopName) {
        return ShopInfo.SHOP_INFO_DATA.get(shopName);
    }
}
