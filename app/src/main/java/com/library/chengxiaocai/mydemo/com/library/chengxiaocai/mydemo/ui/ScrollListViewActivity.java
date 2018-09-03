package com.library.chengxiaocai.mydemo.com.library.chengxiaocai.mydemo.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.library.chengxiaocai.adaper.SimpleAdapter;
import com.library.chengxiaocai.mydemo.R;

public class ScrollListViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_list_view);
        ListView listView = findViewById(R.id.listview);
        listView.setAdapter(new SimpleAdapter(this));

    }
}
