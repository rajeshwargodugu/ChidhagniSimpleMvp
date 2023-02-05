package com.chidhagni.chidhagnisimplemvp.ui.splash;

import com.chidhagni.chidhagnisimplemvp.ui.base.MvpPresenter;

public interface SplashMvpPresenter<V extends SplashMvpView> extends MvpPresenter<V> {

    void decideNextActivity();
}