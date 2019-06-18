package com.lwx.plugin_login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        EditText name=findViewById(R.id.edtName_loginActivity_plugin);
        EditText pwd=findViewById(R.id.edtPwd_loginActivity_plugin);
        name.setText(getIntent().getStringExtra("name"));
        pwd.setText(getIntent().getStringExtra("pwd"));
    }
}
