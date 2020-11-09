package com.quwangpai.testgitapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //这是第一版本内容，将要提交TAG，以后就是TAG-1版本。第一版常驻内容
        //修改主分支内容，合并tag分支内容
    }
}