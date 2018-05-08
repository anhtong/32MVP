package com.anhtong8x.a32mvp.presenters.p_user;

import com.anhtong8x.a32mvp.views.v_user.ViewImUserLogin;

/**
 * Created by Administrator on 5/8/2018.
 */

public class PresenterLgUserLogin implements PresenterImUserLogin {
    ViewImUserLogin viewImUserLogin;

    public PresenterLgUserLogin(ViewImUserLogin viewImUserLogin) {
        this.viewImUserLogin = viewImUserLogin;
    }

    @Override
    public boolean checkUserLogin(String userName, String passWord) {
        if ( userName.equals("huy") && passWord.equals("123")){ return true;}
        return false;
    }
}
