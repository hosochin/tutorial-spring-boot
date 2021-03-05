package com.example.demo.controller.resource;

/**
 * 登録店舗情報リクエストボディ
 */
public class PostShopInfo {
    // 店舗名
    private String shopName;
    // 種別
    private String type;
    // 住所
    private String location;
    // オーナーコメント
    private String ownerComment;

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setOwnerComment(String ownerComment) {
        this.ownerComment = ownerComment;
    }

    public String getShopName() {
        return shopName;
    }

    public String getType() {
        return type;
    }

    public String getLocation() {
        return location;
    }

    public String getOwnerComment() {
        return ownerComment;
    }

    /**
     * コンストラクタ
     *
     * @param shopName     店舗名
     * @param type         種別
     * @param location     住所
     * @param ownerComment オーナーコメント
     */
    public PostShopInfo(String shopName, String type, String location, String ownerComment) {
        this.shopName = shopName;
        this.type = type;
        this.location = location;
        this.ownerComment = ownerComment;
    }
}
