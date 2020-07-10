package com.beshoykamal.tested;

import android.app.Application;

import com.beardedhen.androidbootstrap.TypefaceProvider;

public class Ayhaga extends Application {

    @Override
    public void onCreate() {

        super.onCreate();
        TypefaceProvider.registerDefaultIconSets();
    }
}
