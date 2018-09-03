package com.library.chengxiaocai.mydemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.library.chengxiaocai.mydemo.com.library.chengxiaocai.mydemo.ui.ScrollActivity;
import com.library.chengxiaocai.mydemo.com.library.chengxiaocai.mydemo.ui.ScrollListViewActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gotoScroll(View view) {
        startActivity(new Intent(this, ScrollActivity.class));

    }
    public void scrollListview(View view){
        startActivity(new Intent(this, ScrollListViewActivity.class));

    }
}
