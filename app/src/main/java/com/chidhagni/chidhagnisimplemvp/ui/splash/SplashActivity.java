package com.chidhagni.chidhagnisimplemvp.ui.splash;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.chidhagni.chidhagnisimplemvp.R;
import com.chidhagni.chidhagnisimplemvp.SimpleMvpApp;
import com.chidhagni.chidhagnisimplemvp.data.DataManager;
import com.chidhagni.chidhagnisimplemvp.ui.login.LoginActivity;
import com.chidhagni.chidhagnisimplemvp.ui.main.MainActivity;

public class SplashActivity extends AppCompatActivity implements SplashMvpView {

    SplashPresenter mSplashPresenter;

    public static Intent getStartIntent(Context context) {
        Intent intent = new Intent(context, SplashActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        DataManager dataManager = ((SimpleMvpApp) getApplication()).getDataManager();

        mSplashPresenter = new SplashPresenter(dataManager);

        mSplashPresenter.onAttach(this);

        mSplashPresenter.decideNextActivity();
    }

    @Override
    public void openMainActivity() {
        Intent intent = MainActivity.getStartIntent(this);
        startActivity(intent);
        finish();
    }

    @Override
    public void openLoginActivity() {
        Intent intent = LoginActivity.getStartIntent(this);
        startActivity(intent);
        finish();
    }
}