package com.jt.viewpagerdemo;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends FragmentActivity {
    private MainViewPager mViewPagerFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getSupportFragmentManager();
        mViewPagerFragment = new MainViewPager();
        fm.beginTransaction().add(R.id.frag_container, mViewPagerFragment).commit();
    }

    public void setViewPagerPage(int pageIndex){
        mViewPagerFragment.setPage(pageIndex);
    }
}
