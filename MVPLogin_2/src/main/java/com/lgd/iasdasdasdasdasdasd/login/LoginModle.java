package com.lgd.iasdasdasdasdasdasd.login;

/**
 * Created by Administrator on 2018/6/25.
 */

public class LoginModle implements LoginContract.LoginModle {
    @Override
    public void login(String name, String pass, LoginContract.LoginCallback callback) {
        //登陆操作回调callback
        callback.onLoginFiled();
        callback.onLoginSuccess();
    }
}
