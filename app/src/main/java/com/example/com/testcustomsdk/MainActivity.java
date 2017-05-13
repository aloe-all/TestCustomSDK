package com.example.com.testcustomsdk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button mButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton = (Button) findViewById(R.id.bt_test_custom_sdk);
        mButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        //这个方法就是我们在源码里 android.app.Application.java 中添加的
        /**
         * public void testShowToast(){
         *Toast.makeText(this, "test make update-api", Toast.LENGTH_LONG).show();
         *  }
         */
        getApplication().testShowToast();
    }
}
