package com.lgd.iasdasdasdasdasdasd.login;

/**
 * Created by Administrator on 2018/6/25.  契约基类
 */

public interface LoginContract {
    interface LoginView {
        String getUser();

        String getPassword();

        void onCheckFormatFail(String msg);

        void onCheckFormatSuccess();

        void LoginSuccess();

        void LoginFiled();
    }


    interface LoginModle {
        void login(String name, String pass, LoginCallback callback);
    }

    interface LoginCallback {
        void onLoginSuccess();

        void onLoginFiled();
    }
}
