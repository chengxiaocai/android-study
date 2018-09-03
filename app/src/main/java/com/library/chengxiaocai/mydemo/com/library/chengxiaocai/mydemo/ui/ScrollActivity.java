package com.library.chengxiaocai.mydemo.com.library.chengxiaocai.mydemo.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.library.chengxiaocai.mydemo.R;

/*
1、scrollTo 一般都是viewgroup去调用，滚动的是内部子view或者内容
2、不管怎么滑动，View的位置一直都不会发生变化，一直都是初始位置
3、是内容的整体滑动
4、mScrollX的值总是等于View左边缘和View内容左边缘在水平方向的距离(mScrollX=X1-X2,，其中X1，表示View的左边缘，其中X2，表示View内容的左边缘)，
   当View内容的左边缘位于View的左边缘的左边时，mScrollX大于零，即mScrollX为正值，反之为负值；
5、mScrollY的值总是等于View上边缘和View内容上边缘在竖直方向的距离(mScrollY=Y1-Y2,，其中Y1，表示View的上边缘，其中Y2，表示View内容的上边缘)，
   当View内容的上边缘位于View的上边缘的上边时，mScrollY大于零，即mScrollY为正值，反之为负值；
6、public void scrollBy(int x, int y) {
        scrollTo(mScrollX + x, mScrollY + y);
    }
7、scroll to 是绝对滑动  scrollBy 是相对滑动
* */
public class ScrollActivity extends AppCompatActivity {
    private TextView mTvView;
    private LinearLayout mLine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll);
        mTvView = findViewById(R.id.view);
        mLine = findViewById(R.id.line);
        findViewById(R.id.scrollTo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mLine.scrollTo(-50, 0);

            }
        });

        findViewById(R.id.scrollBy).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mLine.scrollBy(-50, 0);

            }
        });
    }
}
