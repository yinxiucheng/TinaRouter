package com.tina.router;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import tina.com.router.annotation.Route;

/**
 * @author yxc
 * @date 2018/9/28
 */
@Route(path = "/main/test")
public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


}
