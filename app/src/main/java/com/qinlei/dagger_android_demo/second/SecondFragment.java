package com.qinlei.dagger_android_demo.second;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.qinlei.dagger_android_demo.R;

import javax.inject.Inject;

import dagger.android.support.DaggerFragment;


public class SecondFragment extends DaggerFragment {

    @Inject
    public SecondFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_second, null);
    }
}
