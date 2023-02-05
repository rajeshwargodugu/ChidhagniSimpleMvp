package com.chidhagni.chidhagnisimplemvp.ui.main;


import com.chidhagni.chidhagnisimplemvp.ui.base.MvpPresenter;

public interface MainMvpPresenter<V extends MainMvpView> extends MvpPresenter<V> {

    String getEmailId();

    void setUserLoggedOut();
}