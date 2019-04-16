package com.qinlei.dagger_android_demo.second;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.qinlei.dagger_android_demo.R;

import javax.inject.Inject;
import javax.inject.Named;

import dagger.android.AndroidInjection;
import dagger.android.support.DaggerAppCompatActivity;

public class SecondActivity extends DaggerAppCompatActivity {

    @Inject
    SecondFragment secondFragment;

    @Inject
    @Named("first")
    String firstName;
    @Inject
    @Named("first")
    String firstName2;

    @Inject
    int version;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView textView = findViewById(R.id.tv_test2);

        getSupportFragmentManager().beginTransaction()
                .add(R.id.fragment, secondFragment)
                .commit();
    }
}
