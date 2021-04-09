package com.example.demo.service;

import com.example.demo.domain.model.ShopInfo;
import com.example.demo.domain.repository.ShopInfoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 店舗情報を扱うクラス
 */
@Service
public class ShopDataService {

    public ShopDataService() {
    }

    /**
     * 店舗検索メソッド
     *
     * @param shopName 店舗名
     * @return 店舗詳細情報
     */
    public ShopInfo searchShopInfo(String shopName) {
        // 店舗情報テーブルを店舗名をキーにして検索する
        ShopInfoRepository shopInfoRepository = new ShopInfoRepository();
        ShopInfo shopInfo = shopInfoRepository.selectShopInfo(shopName);

        if (shopInfo == null) {
            // 店舗名が見つからなかった場合
            String noData = "no data";
            return new ShopInfo(noData,noData, noData, noData);
        } else {
            return shopInfo;
        }
    }

    /**
     * 店舗名一覧検索メソッド
     *
     * @return 店舗名リスト
     */
    public List<String> searchShopNameList() {
        // 店舗情報テーブルから店舗名一覧を取得する
        ShopInfoRepository shopInfoRepository = new ShopInfoRepository();
        return shopInfoRepository.selectShopNameList();
    }

    /**
     * 店舗情報登録メソッド
     */
    public void insertShopInfo(ShopInfo shopInfo) {
        ShopInfoRepository shopInfoRepository = new ShopInfoRepository();
        shopInfoRepository.insertShopInfo(shopInfo);
    }


    /**
     * 店舗情報更新メソッド
     */
    // TODO

    /**
     * 店舗情報削除メソッド
     * @param shopInfo
     */
    public void deleteShopInfo(String shopInfo) {
        ShopInfoRepository shopInfoRepository = new ShopInfoRepository();
        shopInfoRepository.deleteShopInfo(shopInfo);
    }
}
