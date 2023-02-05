package com.chidhagni.chidhagnisimplemvp.ui.splash;

import com.chidhagni.chidhagnisimplemvp.data.DataManager;
import com.chidhagni.chidhagnisimplemvp.ui.base.BasePresenter;

public class SplashPresenter<V extends SplashMvpView> extends BasePresenter<V> implements SplashMvpPresenter<V> {

    public SplashPresenter(DataManager dataManager) {
        super(dataManager);
    }

    @Override
    public void decideNextActivity() {
        if (getDataManager().getLoggedInMode()) {
            getMvpView().openMainActivity();
        } else {
            getMvpView().openLoginActivity();
        }
    }
}