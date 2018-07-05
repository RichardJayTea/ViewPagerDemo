package com.jt.viewpagerdemo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class HomePage extends Fragment {
    private ImageView mBgColorButton;
    private ImageView mWebButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.home_page_layout, container,false);
        mBgColorButton = view.findViewById(R.id.bgfragbutton);
        mWebButton = view.findViewById(R.id.webfragbutton);

        mBgColorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).setViewPagerPage(MainViewPager.BACKGROUND_PAGE);
            }
        });
        mWebButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).setViewPagerPage(MainViewPager.WEBVIEW_PAGE);
            }
        });

        return view;
    }
}
