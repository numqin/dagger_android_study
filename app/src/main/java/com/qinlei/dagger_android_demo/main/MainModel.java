package com.qinlei.dagger_android_demo.main;

import android.util.Log;


import com.qinlei.dagger_android_demo.di.PreActivity;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class MainModel {
    @PreActivity
    @Provides
    @Named("first")
    String getFirstName() {
        Log.d("numqin", "getFirstName: 初始化");
        return "qin";
    }

    @Provides
    @Named("last")
    String getLastName() {
        Log.d("numqin", "getLastName: 初始化");
        return "lei";
    }
}
