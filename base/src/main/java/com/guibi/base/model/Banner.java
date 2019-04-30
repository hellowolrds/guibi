package com.guibi.base.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Banner {
    @SerializedName("ads_id")
    @Expose
    private int ads_id;

    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("img_name")
    @Expose
    private String img_name;

    @SerializedName("img_url")
    @Expose
    private String img_url;

    @SerializedName("height")
    @Expose
    private String height;

    @SerializedName("width")
    @Expose
    private String width;

    @SerializedName("tag_title")
    @Expose
    private String tag_title;

    @SerializedName("order")
    @Expose
    private int order;

    @SerializedName("status")
    @Expose
    private int status;

    @SerializedName("ads_type")
    @Expose
    private String ads_type;

    @SerializedName("type")
    @Expose
    private int type;

    public void setAds_id(int ads_id) {
        this.ads_id = ads_id;
    }
    public int getAds_id() {
        return ads_id;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }

    public void setImg_name(String img_name) {
        this.img_name = img_name;
    }
    public String getImg_name() {
        return img_name;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }
    public String getImg_url() {
        return img_url;
    }

    public void setHeight(String height) {
        this.height = height;
    }
    public String getHeight() {
        return height;
    }

    public void setWidth(String width) {
        this.width = width;
    }
    public String getWidth() {
        return width;
    }

    public void setTag_title(String tag_title) {
        this.tag_title = tag_title;
    }
    public String getTag_title() {
        return tag_title;
    }

    public void setOrder(int order) {
        this.order = order;
    }
    public int getOrder() {
        return order;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    public int getStatus() {
        return status;
    }

    public void setAds_type(String ads_type) {
        this.ads_type = ads_type;
    }
    public String getAds_type() {
        return ads_type;
    }

    public void setType(int type) {
        this.type = type;
    }
    public int getType() {
        return type;
    }
}
