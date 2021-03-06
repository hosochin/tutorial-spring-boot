package com.example.demo.domain.repository;

import com.example.demo.StubShopInfoTableData;
import com.example.demo.domain.model.ShopInfo;

import java.util.List;

public class ShopInfoRepository {

    /**
     * 店舗検索メソッド
     *
     * @param shopName 店舗名
     * @return 店舗詳細情報
     */
    public ShopInfo selectShopInfo(String shopName) {
        for (ShopInfo shopInfo : StubShopInfoTableData.SHOP_INFO_DATA) {
            // 店舗情報テーブルから店舗名
            if(shopName.equals(shopInfo.getShopName())) {
                return shopInfo;
            }
        }

        // 店舗名が見つからなかった場合
        return null;
    }

    /**
     * 店舗名一覧検索メソッド
     *
     * @return 店舗名リスト
     */
    public List<String> selectShopNameList() {
        // TODO
        return null;
    }

    public void insertShopInfo() {
        // TODO
    }

    public void updateShopInfo() {
        // TODO
    }

    public void deleteShopInfo() {
        // TODO
    }
}
