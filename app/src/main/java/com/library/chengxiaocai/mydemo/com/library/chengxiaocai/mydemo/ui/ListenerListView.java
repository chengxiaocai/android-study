package com.library.chengxiaocai.mydemo.com.library.chengxiaocai.mydemo.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.AbsListView;
import android.widget.ListView;

/**
 * Created by chengxiaocai on 2018/9/3.
 */

public class ListenerListView extends ListView implements AbsListView.OnScrollListener {
    public ListenerListView(Context context) {
        super(context);
        setOnScrollListener(this);
    }

    public ListenerListView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setOnScrollListener(this);
    }

    public ListenerListView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setOnScrollListener(this);
    }

    @Override
    public void onScrollStateChanged(AbsListView view, int scrollState) {
        if (scrollState == OnScrollListener.SCROLL_STATE_FLING) {
            Log.e("mCurrentState:", "OnScrollListener.SCROLL_STATE_FLING");
            //列表滚动中。。。手指离开屏幕
        }
        if (scrollState == OnScrollListener.SCROLL_STATE_IDLE) {
            Log.e("mCurrentState:", "OnScrollListener.SCROLL_STATE_IDLE");
            //停止滚动
        }
        if (scrollState == OnScrollListener.SCROLL_STATE_TOUCH_SCROLL) {
            Log.e("mCurrentState:", "OnScrollListener.SCROLL_STATE_TOUCH_SCROLL");
            //列表滚动中。。。手指触控屏幕滚动
        }


    }

    @Override
    public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
        //  Log.e("firstVisibleItem:", firstVisibleItem + "");
        //  Log.e("visibleItemCount:", visibleItemCount + "");
        // Log.e("totalItemCount:", totalItemCount + "");

    }
}
