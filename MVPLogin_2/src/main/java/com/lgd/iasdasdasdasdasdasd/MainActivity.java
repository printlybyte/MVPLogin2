package com.lgd.iasdasdasdasdasdasd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.lgd.iasdasdasdasdasdasd.login.LoginContract;
import com.lgd.iasdasdasdasdasdasd.login.LoginPersent;

public class MainActivity extends AppCompatActivity implements LoginContract.LoginView {
    LoginPersent loginPersent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loginPersent = new LoginPersent(this);
    }

    void onChick() {
        loginPersent.startlogin();
    }


    @Override
    public String getUser() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public void onCheckFormatFail(String msg) {

    }

    @Override
    public void onCheckFormatSuccess() {

    }

    @Override
    public void LoginSuccess() {

    }

    @Override
    public void LoginFiled() {

    }
}
