package com.imooc.broadcsttest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends BaseActivity {
    private EditText accountEdit;
    private EditText passwordEdit;
    private Button login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        accountEdit= (EditText) findViewById(R.id.account);
        passwordEdit= (EditText) findViewById(R.id.password);
        login= (Button) findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                String account=accountEdit.getText().toString();
                String password=passwordEdit.getText().toString();
                /*如果帐号是admin，密码是12346就认为登陆成功*/
                if(account.equals("biaoge666")&&password.equals("123456")){
                    Intent intent=new Intent(LoginActivity.this,MainActivity.class);
                    startActivity(intent);
                    finish();
                }else {
                    Toast.makeText(LoginActivity.this,"account or password is invalid",Toast.LENGTH_SHORT).show();
                }
            }
        });

        }
    }

