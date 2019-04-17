package com.qinlei.dagger_android_demo.main;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.qinlei.dagger_android_demo.R;
import com.qinlei.dagger_android_demo.second.SecondActivity;

import javax.inject.Inject;
import javax.inject.Named;

import dagger.android.support.DaggerAppCompatActivity;

//如果使用到了 Fragment 才需要使用 DaggerAppCompatActivity

public class MainActivity extends DaggerAppCompatActivity {

    @Inject
    @Named("first")
    String firstName;
    @Inject
    @Named("first")
    String firstName2;

    @Inject
    @Named("last")
    String lastName;
    @Inject
    @Named("last")
    String lastName2;

    @Inject
    int version;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.tv_test);
        textView.setText("Hello " + firstName + lastName);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SecondActivity.class));
            }
        });
    }
}
