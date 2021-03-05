package com.example.demo.model;

/**
 * 店舗詳細情報のオブジェクトクラス
 */
public class ShopDetailInfo {
    // 種別カラム
    private String type;
    // 住所カラム
    private String location;
    // オーナーコメントカラム
    private String ownerComment;

    public void setType(String type) {
        this.type = type;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setOwnerComment(String ownerComment) {
        this.ownerComment = ownerComment;
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
     * @param type         種別
     * @param location     住所
     * @param ownerComment オーナーコメント
     */
    public ShopDetailInfo(String type, String location, String ownerComment) {
        this.type = type;
        this.location = location;
        this.ownerComment = ownerComment;
    }
}
