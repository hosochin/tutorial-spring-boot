package com.example.demo.model;

import java.util.HashMap;
import java.util.Map;

public class ShopInfo {
    public static final Map<String, ShopDetailInfo> SHOP_INFO_DATA = new HashMap<>();

    static {
        SHOP_INFO_DATA.put("やひこ", new ShopDetailInfo("ラーメン屋", "長野飯田市", "うまい"));
        SHOP_INFO_DATA.put("松屋", new ShopDetailInfo("牛丼や", "全国", "ぎり食える、安い"));
        SHOP_INFO_DATA.put("町田商店", new ShopDetailInfo("ラーメン屋", "全国", "食える、安い"));
        SHOP_INFO_DATA.put("マクドナルド", new ShopDetailInfo("ハンバーガー屋", "全国", "食える"));
    }
}
