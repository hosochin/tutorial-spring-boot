package com.example.demo.service;

import com.example.demo.model.ShopDetailInfo;
import com.example.demo.model.ShopInfo;
import org.springframework.stereotype.Service;

@Service
public class ShopDataService {
    public ShopDetailInfo selectShopInfo(String shopName) {
        return ShopInfo.SHOP_INFO_DATA.get(shopName);
    }
}
