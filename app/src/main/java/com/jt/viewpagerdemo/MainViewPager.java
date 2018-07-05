package com.jt.viewpagerdemo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MainViewPager extends Fragment {
    private ViewPager mViewPager;
    public final static int BACKGROUND_PAGE = 0;
    public final static int HOME_PAGE = 1;
    public final static int WEBVIEW_PAGE = 2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.main_viewpager, container,false);
        mViewPager = view.findViewById(R.id.viewpager);
        mViewPager.setAdapter(new FragmentPagerAdapter(getFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                switch(position){
                    case BACKGROUND_PAGE:
                        return new BackgroundColorFragment();
                    case HOME_PAGE:
                        return new HomePage();
                    case WEBVIEW_PAGE:
                        return new WebViewFragment();
                    default:
                        return new HomePage();
                }
            }

            @Override
            public int getCount() {
                return 3;
            }
        });
        mViewPager.setCurrentItem(1);
        return view;
    }

    public void setPage(int pageIndex){
        mViewPager.setCurrentItem(pageIndex);
    }
}
