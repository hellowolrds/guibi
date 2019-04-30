package com.guibi.base.service;

import com.guibi.base.model.BannerList;
import com.guibi.base.model.BaseResponse;

import retrofit2.http.GET;
import rx.Observable;

public interface ApiService {
    // 获取首页轮播
    @GET("api/home/index")
    Observable<BaseResponse<BannerList>> get_banner();
}
