package com.anhtong8x.a32mvp.models.m_user;

/**
 * Created by Administrator on 5/8/2018.
 */

public class ModelUserLogin {
    private String userName;
    private String passWord;

    public ModelUserLogin(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
