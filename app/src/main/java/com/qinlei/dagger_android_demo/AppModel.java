package com.qinlei.dagger_android_demo;

import android.util.Log;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModel {
    @Singleton
    @Provides
    int getVersion() {
        Log.d("numqin", "getVersion: 调用");
        return 12;
    }
}
