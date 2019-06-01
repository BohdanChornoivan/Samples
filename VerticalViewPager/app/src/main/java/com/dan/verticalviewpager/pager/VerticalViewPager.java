package com.dan.verticalviewpager.pager;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

public class VerticalViewPager extends ViewPager {

    public VerticalViewPager(@NonNull Context context) {
        super(context);
        init();
    }

    public VerticalViewPager(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        setPageTransformer(true, new VerticalPage());
        setOverScrollMode(OVER_SCROLL_NEVER);
    }

    private MotionEvent getExchangeXY(MotionEvent event) {
        float width = getWidth();
        float height = getHeight();

        float newX = (event.getY() / height) * width;
        float newY = (event.getX() / width) * height;

        event.setLocation(newX,newY);

        return event;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        boolean intercepted = super.onInterceptTouchEvent(getExchangeXY(ev));
        getExchangeXY(ev);
        return intercepted;
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        return super.onTouchEvent(getExchangeXY(ev));
    }

    private class VerticalPage implements PageTransformer {

        @Override
        public void transformPage(@NonNull View view, float position) {
            if(position < -1) {
                view.setAlpha(0);
            } else if (position <= 1) {
                view.setAlpha(1);
                view.setTranslationX(view.getWidth() * -position);
                float vPosition = position * view.getHeight();
                view.setTranslationY(vPosition);
            } else {
                view.setAlpha(0);
            }
        }
    }
}
