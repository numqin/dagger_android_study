package com.qinlei.dagger_android_demo.di;

import com.qinlei.dagger_android_demo.App;
import com.qinlei.dagger_android_demo.AppModel;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(modules = {
        AndroidInjectionModule.class,
        ActivityModule.class,//配置 Activity Module
        AppModel.class,
        AndroidSupportInjectionModule.class//配置 dagger.android 和 dagger.android.support 的可用性，需要在根配置
})
abstract class AppComponent implements AndroidInjector<App> {
}
