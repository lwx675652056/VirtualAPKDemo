package com.lwx.virtualapk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Environment;

import com.didi.virtualapk.PluginManager;

import java.io.File;

/**
 * Created by Dell on 2019/6/18.
 */

public class BaseApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        // 加载存储根目录的插件apk，实际项目中按需保存
        File plugin = new File(Environment.getExternalStorageDirectory(), "plugin.apk");
        if (plugin.exists()) {
            try {
                PluginManager.getInstance(this).loadPlugin(plugin);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        // 初始化VirtualAPK
        PluginManager.getInstance(base).init();
    }
}
