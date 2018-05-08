package com.anhtong8x.a32mvp.views.v_user;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.anhtong8x.a32mvp.R;
import com.anhtong8x.a32mvp.presenters.p_user.PresenterLgUserLogin;
import com.anhtong8x.a32mvp.views.v_user.ViewImUserLogin;

public class ViewLoginActivity extends AppCompatActivity implements ViewImUserLogin, View.OnClickListener {

    PresenterLgUserLogin presenterLgUserLogin;

    Button btnLogin;
    EditText eUserName, ePassWord;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        connectView ();

        presenterLgUserLogin = new PresenterLgUserLogin(this);
        btnLogin.setOnClickListener(this);

    }

    void connectView (){
        btnLogin = (Button)findViewById(R.id.btnLogin);
        eUserName = (EditText)findViewById(R.id.eUserName);
        ePassWord = (EditText)findViewById(R.id.ePassWord);
    }

    @Override
    public void loginSuccess() {
        Toast.makeText(this, "Login success", Toast.LENGTH_LONG).show();
    }

    @Override
    public void loginUnSuccess() {
        Toast.makeText(this, "Login unsuccess", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View view) {
        if ( presenterLgUserLogin.checkUserLogin(eUserName.getText().toString().trim(),ePassWord.getText().toString().trim())) {
            loginSuccess();
        }else {
            loginUnSuccess();
        }
    }
}
