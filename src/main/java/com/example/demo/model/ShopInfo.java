package com.example.demo.model;

import java.util.HashMap;
import java.util.Map;

/**
 * 店舗情報データ(DB相当)
 */
public class ShopInfo {
    public static final Map<String, ShopDetailInfo> SHOP_INFO_DATA = new HashMap<>();

    static {
        SHOP_INFO_DATA.put("Yahiko", new ShopDetailInfo("ラーメン屋", "長野飯田市", "うまい"));
        SHOP_INFO_DATA.put("Matuya", new ShopDetailInfo("牛丼屋", "全国", "ぎり食える、安い"));
        SHOP_INFO_DATA.put("MatidaShoten", new ShopDetailInfo("ラーメン屋", "全国", "食える、安い"));
        SHOP_INFO_DATA.put("McDonald", new ShopDetailInfo("ハンバーガー屋", "全国", "食える"));
    }
}
