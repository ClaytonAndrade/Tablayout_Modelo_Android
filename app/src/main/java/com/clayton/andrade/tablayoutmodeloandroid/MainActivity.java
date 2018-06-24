package com.clayton.andrade.tablayoutmodeloandroid;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout    = (TabLayout)findViewById(R.id.tab_layout_id);
        appBarLayout = (AppBarLayout)findViewById(R.id.app_bar_id);
        viewPager    = (ViewPager)findViewById(R.id.view_page_id);

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());

        viewPagerAdapter.AddFragment(new FragmentQuiz(), "Quiz");
        viewPagerAdapter.AddFragment(new FragmentExplore(), "Explore");
        viewPagerAdapter.AddFragment(new FragmentStore(), "Store");

        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
