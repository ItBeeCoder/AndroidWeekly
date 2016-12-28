package com.github.mzule.androidweekly.ui.view.base;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/**
 * Created by CaoDongping on 8/30/16.
 */

public class BaseLinearLayout extends LinearLayout {

    public BaseLinearLayout(Context context) {
        this(context,null);
    }

    public BaseLinearLayout(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public BaseLinearLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
//        LayoutBinder.bind(this);
//        ButterKnife.bind(this);
    }

}
