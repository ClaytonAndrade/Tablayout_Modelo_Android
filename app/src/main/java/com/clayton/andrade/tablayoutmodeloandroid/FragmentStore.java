package com.clayton.andrade.tablayoutmodeloandroid;

/*
 *@auotor Andrade 23/06/2018
 */

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentStore extends android.support.v4.app.Fragment{

    View view;

    public FragmentStore() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.store_fragment, container, false);

        return view;
    }
}
