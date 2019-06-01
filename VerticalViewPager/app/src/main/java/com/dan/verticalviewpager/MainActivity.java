package com.dan.verticalviewpager;

import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.dan.verticalviewpager.fragments.PageFragment1;
import com.dan.verticalviewpager.fragments.PageFragment2;
import com.dan.verticalviewpager.fragments.PageFragment3;
import com.dan.verticalviewpager.pager.VPagerAdapter;
import com.dan.verticalviewpager.pager.VerticalViewPager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    List<Fragment> list;
    private VerticalViewPager viewPager;
    private PagerAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        control();

        list.add(new PageFragment1());
        list.add(new PageFragment2());
        list.add(new PageFragment3());

        pagerAdapter = new VPagerAdapter(getSupportFragmentManager(), list);

        viewPager.setAdapter(pagerAdapter);

    }

    private void control() {
        viewPager = findViewById(R.id.pager);
        list = new ArrayList<>();
    }
}
