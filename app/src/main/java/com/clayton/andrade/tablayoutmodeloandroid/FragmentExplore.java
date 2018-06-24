package com.clayton.andrade.tablayoutmodeloandroid;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/*
 *@auotor Andrade 23/06/2018
 */

public class FragmentExplore extends android.support.v4.app.Fragment {

    View view;

    public FragmentExplore() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.explore_fragment, container, false);

        return view;
    }
}

