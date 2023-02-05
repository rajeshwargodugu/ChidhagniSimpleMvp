package com.chidhagni.chidhagnisimplemvp.ui.login;

import com.chidhagni.chidhagnisimplemvp.ui.base.MvpPresenter;

public interface LoginMvpPresenter<V extends LoginMvpView> extends MvpPresenter<V> {

    void startLogin(String emailId);
}