package com.guibi.base.response;

import com.guibi.base.contract.MainContract;
import com.guibi.base.model.BannerList;
import com.guibi.base.model.BaseResponse;
import com.guibi.base.net.RetrofitClient;

import rx.Observable;


public class MainModel implements MainContract.Model {
    @Override
    public Observable<BaseResponse<BannerList>> banner() {
        return RetrofitClient.getInstance().getApi().get_banner();
    }
}
