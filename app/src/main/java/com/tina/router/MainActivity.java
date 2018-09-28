package com.tina.router;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import tina.com.router.annotation.Route;

@Route(path = "/com/tina/router/MainActivity")
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
