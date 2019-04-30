package com.guibi.base.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BannerList {
    @SerializedName("ads")
    @Expose
    private List<Banner> ads;
    @SerializedName("live")
    @Expose
    private Live live;
    @SerializedName("is_show")
    @Expose
    private Boolean is_show;


    public class Live {
        private String title;
        private int total_count;
        private int created_at;
        private String img;
        private String video;
        private String introduction;
    }
}
