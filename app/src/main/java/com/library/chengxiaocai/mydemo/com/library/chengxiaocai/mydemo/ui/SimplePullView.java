package com.library.chengxiaocai.mydemo.com.library.chengxiaocai.mydemo.ui;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * Created by chengxiaocai on 2018/9/3.
 */

public class SimplePullView extends LinearLayout {
    public SimplePullView(Context context) {
        super(context);
    }

    public SimplePullView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public SimplePullView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int action = event.getAction();
        float initX;
        float initY;
        switch (action) {
            case MotionEvent.ACTION_DOWN:
                initX = event.getX();
                initY = event.getY();
                return  true;

            case MotionEvent.ACTION_MOVE:
                scrollTo(-(int) event.getX(), -(int) event.getY());
                break;

        }

        return super.onTouchEvent(event);

    }
}
