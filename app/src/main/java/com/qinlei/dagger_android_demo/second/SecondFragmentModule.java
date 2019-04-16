package com.qinlei.dagger_android_demo.second;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class SecondFragmentModule {
    @ContributesAndroidInjector
    abstract SecondFragment secondFragment();
}
