package com.qinlei.dagger_android_demo.di;

import com.qinlei.dagger_android_demo.App;
import com.qinlei.dagger_android_demo.AppModel;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;

@Singleton
@Component(modules = {AndroidInjectionModule.class, ActivityModule.class, AppModel.class})
abstract class AppComponent implements AndroidInjector<App> {
}
