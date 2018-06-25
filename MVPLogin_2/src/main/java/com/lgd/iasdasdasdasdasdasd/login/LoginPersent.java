package com.lgd.iasdasdasdasdasdasd.login;

import android.text.TextUtils;

/**
 * Created by Administrator on 2018/6/25.
 */

public class LoginPersent {
    LoginContract.LoginView loginView;

    public LoginPersent(LoginContract.LoginView loginView) {
        this.loginView = loginView;
    }

    public void startlogin() {
        LoginModle loginModle = new LoginModle();
        if (!checkFormat(loginView.getUser(), loginView.getPassword())) {
            return;
        }

        loginModle.login(loginView.getUser(), loginView.getPassword(), new LoginContract.LoginCallback() {
            @Override
            public void onLoginSuccess() {
                loginView.LoginSuccess();
            }

            @Override
            public void onLoginFiled() {
                loginView.LoginFiled();
            }
        });
    }


    public boolean checkFormat(String name, String password) {
        if (TextUtils.isEmpty(name)) {
            loginView.onCheckFormatFail("请输入用户名");
        } else if (TextUtils.isEmpty(password)) {
            loginView.onCheckFormatFail("请输入密码");
        } else if (password.length() < 6 || password.length() > 18) {
            loginView.onCheckFormatFail("密码格式不正确");
        } else {
            loginView.onCheckFormatSuccess();
            return true;
        }
        return false;
    }
}
