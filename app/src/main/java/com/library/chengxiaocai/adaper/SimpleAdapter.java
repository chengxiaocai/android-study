package com.library.chengxiaocai.adaper;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by chengxiaocai on 2018/9/3.
 */

public class SimpleAdapter extends BaseAdapter {
    private Context mContext;

    public SimpleAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return 20;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView textView = new TextView(mContext);
        textView.setText(position + "");
        textView.setTextSize(40);
        return textView;
    }
}
