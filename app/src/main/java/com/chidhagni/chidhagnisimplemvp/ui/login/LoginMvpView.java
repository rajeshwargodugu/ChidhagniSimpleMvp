package com.chidhagni.chidhagnisimplemvp.ui.login;


import com.chidhagni.chidhagnisimplemvp.ui.base.MvpView;

public interface LoginMvpView extends MvpView {

    void openMainActivity();

    void onLoginButtonClick();
}