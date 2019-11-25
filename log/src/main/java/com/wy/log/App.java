package com.wy.log;

import android.app.Application;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        //异常捕获
        CrashHandler crashHandler = CrashHandler.getInstance();
        crashHandler.init(this);
    }
}
