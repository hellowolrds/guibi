package com.guibi.base.presenter;

import android.util.Log;

import com.guibi.base.basic.BasePresenter;
import com.guibi.base.contract.MainContract;
import com.guibi.base.model.BannerList;
import com.guibi.base.model.BaseResponse;
import com.guibi.base.response.MainModel;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;


public class MainPresenter extends BasePresenter<MainContract.View> implements MainContract.Presenter {
    private MainContract.Model model;

    public MainPresenter () {
        model = new MainModel();
    }

    @Override
    public void get_banner() {
        // 未绑定视图
        if (!isViewAttached()) {
            return;
        }
        Log.d("测试", "get_banner: 11111111111");
        model.banner().subscribeOn(Schedulers.newThread())
                .observeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<BaseResponse<BannerList>>() {

                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.d("错误", "onNext: 错误"+e.getMessage());
                        mView.onError(e);
                        mView.hideLoading();
                    }

                    @Override
                    public void onNext(BaseResponse<BannerList> bannerListBaseResponse) {
                        Log.d("数据", "onNext: 数据"+bannerListBaseResponse);
                        mView.onSuccess(bannerListBaseResponse);
                        mView.hideLoading();
                    }
                });
    }
}
