package com.guibi.base.contract;

import com.guibi.base.basic.BaseView;
import com.guibi.base.model.BannerList;
import com.guibi.base.model.BaseResponse;

import rx.Observable;


public class MainContract {
    public interface Model {
        Observable<BaseResponse<BannerList>> banner();
    }

    public interface View extends BaseView {
        @Override
        void showLoading();

        @Override
        void hideLoading();

        @Override
        void onError(Throwable throwable);

        void onSuccess(BaseResponse<BannerList> bean);
    }

    public interface Presenter {
        /**
         * 登陆
         *
         * @param username
         * @param password
         */
        void get_banner();
    }
}
