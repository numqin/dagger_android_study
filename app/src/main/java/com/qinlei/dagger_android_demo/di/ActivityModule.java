package com.qinlei.dagger_android_demo.di;

import com.qinlei.dagger_android_demo.main.MainActivity;
import com.qinlei.dagger_android_demo.main.MainModel;
import com.qinlei.dagger_android_demo.second.SecondActivity;
import com.qinlei.dagger_android_demo.second.SecondFragmentModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
abstract class ActivityModule {
    /**
     * 在这里使用 @PreActivity 只能保证在 MainActivity 是单例的
     * 因为 dagger 的单例模式是通过保持 Component 唯一才能做到的
     */
    @PreActivity
    @ContributesAndroidInjector(modules = MainModel.class)
    abstract MainActivity contributeMainActivity();

    @PreActivity
    @ContributesAndroidInjector(modules = {MainModel.class, SecondFragmentModule.class})
    abstract SecondActivity contributeSecondActivity();
}
