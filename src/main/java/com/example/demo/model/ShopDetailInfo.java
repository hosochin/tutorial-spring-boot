package com.example.demo.model;

public class ShopDetailInfo {
    // 種別カラム
    private String type;
    // 住所カラム
    private String location;
    // コメントカラム
    private String comment;

    public void setType(String type) {
        this.type = type;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setComment(String comment) {
        this.comment = comment;
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

    public ShopDetailInfo(String type, String location, String comment) {
        this.type = type;
        this.location = location;
        this.comment = comment;
    }
}
