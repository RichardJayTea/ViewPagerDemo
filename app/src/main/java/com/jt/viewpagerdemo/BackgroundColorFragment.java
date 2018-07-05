package com.jt.viewpagerdemo;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Spinner;

public class BackgroundColorFragment extends Fragment {
    private Spinner mColorSpinner;
    private RelativeLayout mRelativeLayout;
    private String[] mColorsArray = {"White", "Red", "Green", "Blue"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.background_color_fragment, container,false);

        mRelativeLayout = view.findViewById(R.id.root);
        mColorSpinner = view.findViewById(R.id.spinner);
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), R.layout.support_simple_spinner_dropdown_item, mColorsArray);
        mColorSpinner.setAdapter(adapter);
        mColorSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        mRelativeLayout.setBackgroundColor(Color.WHITE);
                        break;
                    case 1:
                        mRelativeLayout.setBackgroundColor(Color.RED);
                        break;
                    case 2:
                        mRelativeLayout.setBackgroundColor(Color.GREEN);
                        break;
                    case 3:
                        mRelativeLayout.setBackgroundColor(Color.BLUE);
                        break;
                    default:
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        return view;
    }
}
