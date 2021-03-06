package com.example.demo;

import com.example.demo.domain.model.ShopInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * 店舗情報テーブルのスタブ
 */
public class StubShopInfoTableData {

    // チュートリアルではDBは構築しないため仮のデータをここで保持しておく
    // 実際にDBに接続するようにした場合修正はrepositoryクラスのみの想定
    public static final List<ShopInfo> SHOP_INFO_DATA = new ArrayList<>();

    static {
        // 初期データを投入する
        SHOP_INFO_DATA.add(new ShopInfo("Yahiko", "ラーメン屋", "長野飯田市", "うまい"));
        SHOP_INFO_DATA.add(new ShopInfo("Matuya", "牛丼屋", "全国", "ぎり食える、安い"));
        SHOP_INFO_DATA.add(new ShopInfo("MatidaShoten", "ラーメン屋", "全国", "食える、安い"));
        SHOP_INFO_DATA.add(new ShopInfo("McDonald", "ハンバーガー屋", "全国", "食える"));
    }
}
