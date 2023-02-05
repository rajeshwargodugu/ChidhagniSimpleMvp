package com.chidhagni.chidhagnisimplemvp.ui.main;

import com.chidhagni.chidhagnisimplemvp.data.DataManager;
import com.chidhagni.chidhagnisimplemvp.ui.base.BasePresenter;

public class MainPresenter<V extends MainMvpView> extends BasePresenter<V> implements MainMvpPresenter<V> {

    public MainPresenter(DataManager dataManager) {
        super(dataManager);
    }

    @Override
    public String getEmailId() {
        return getDataManager().getEmailId();
    }

    @Override
    public void setUserLoggedOut() {
        getDataManager().clear();
        getMvpView().openSplashActivity();
    }
}