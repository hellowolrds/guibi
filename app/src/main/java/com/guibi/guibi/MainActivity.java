package com.guibi.guibi;

import android.util.Log;

import com.guibi.base.basic.BaseMvpActivity;
import com.guibi.base.contract.MainContract;
import com.guibi.base.model.BannerList;
import com.guibi.base.model.BaseResponse;
import com.guibi.base.presenter.MainPresenter;
import com.jpeng.jptabbar.anno.NorIcons;
import com.jpeng.jptabbar.anno.SeleIcons;
import com.jpeng.jptabbar.anno.Titles;

//项目初始化完成

public class MainActivity extends BaseMvpActivity<MainPresenter> implements MainContract.View {

    @Titles
    private static final String[] titiles = {"首页", "直播", "糖果", "圈子", "我的"};
    @NorIcons
    private static final int[] normalIcons = {
            R.mipmap.tab_index,
            R.mipmap.tab_live,
            R.mipmap.tab_strategy,
            R.mipmap.tab_information,
            R.mipmap.tab_person
    };
    @SeleIcons
    private static final int[] pressIcons = {
            R.mipmap.tab_index_n,
            R.mipmap.tab_live_n,
            R.mipmap.tab_strategy_n,
            R.mipmap.tab_information_n,
            R.mipmap.tab_person_n
    };

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void init_view() {
        mPresenter = new MainPresenter();
        mPresenter.attachView(this);

        mPresenter.get_banner();
    }

    @Override
    public void init_data() {

    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void onError(Throwable throwable) {

    }

    @Override
    public void onSuccess(BaseResponse<BannerList> bean) {
        Log.d("成功", "onSuccess: " + bean);
    }
}
