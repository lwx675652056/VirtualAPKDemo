package com.lwx.virtualapk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.didi.virtualapk.PluginManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_main_activity_host).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (PluginManager.getInstance(MainActivity.this).getLoadedPlugin("com.lwx.plugin_login") == null) {
                    Toast.makeText(MainActivity.this, "Plugin is not loaded!", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent();
                    intent.setClassName("com.lwx.plugin_login", "com.lwx.plugin_login.LoginActivity");
                    startActivity(intent);
                }
            }
        });
    }
}
