package com.example.demo.controller.resource;

public class PostShopInfo {
    // 店舗名カラム
    private String shopName;
    // 種別カラム
    private String type;
    // 住所カラム
    private String location;
    // コメントカラム
    private String comment;

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setComment(String comment) {
        this.comment = comment;
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

    public String getComment() {
        return comment;
    }

    public PostShopInfo(String shopName, String type, String location, String comment) {
        this.shopName = shopName;
        this.type = type;
        this.location = location;
        this.comment = comment;
    }
}
