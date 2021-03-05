package com.example.demo.service;

import com.example.demo.controller.resource.PostShopInfo;
import com.example.demo.model.ShopDetailInfo;
import com.example.demo.model.ShopInfo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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
        ShopDetailInfo shopDetailInfo = ShopInfo.SHOP_INFO_DATA.get(shopName);
        if (shopDetailInfo == null) {
            return new ShopDetailInfo("no data", "no data", "no data");
        }
        return ShopInfo.SHOP_INFO_DATA.get(shopName);
    }

    /**
     * 店舗検索メソッド(複数キーバージョン)
     *
     * @param shopNameList 店舗名リスト
     * @return 店舗詳細情報リスト
     */
    public List<ShopDetailInfo> selectShopInfoList(List<String> shopNameList) {
        List<ShopDetailInfo> result = new ArrayList<>();
        for(String shopName : shopNameList) {
            if (ShopInfo.SHOP_INFO_DATA.containsKey(shopName)) {
                result.add(ShopInfo.SHOP_INFO_DATA.get(shopName));
            }
        }
        return result;
    }

    /**
     * 店舗登録メソッド
     *
     * @param postShopInfo 登録用店舗情報
     */
    public void insertShopInfo(PostShopInfo postShopInfo) {
        ShopDetailInfo shopDetailInfo = new ShopDetailInfo(
                postShopInfo.getType(), postShopInfo.getLocation(), postShopInfo.getOwnerComment());
        ShopInfo.SHOP_INFO_DATA.put(postShopInfo.getShopName(), shopDetailInfo);
    }

    /**
     * 店舗削除メソッド
     *
     * @param shopName 店舗名
     */
    public void deleteShopInfo(String shopName) {
        ShopInfo.SHOP_INFO_DATA.remove(shopName);
    }
}
