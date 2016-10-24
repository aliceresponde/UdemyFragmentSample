package com.example.aliciabeltran.udemyfragmentsample;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by alicia.beltran on 24/10/2016.
 */

public class FragmentA extends Fragment {

    /**
     * How to asocciate layout file to fragment
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //                          (layout_file, viewGlow as a parent, attach to parent?)
        View view = inflater.inflate(R.layout.fragment_a, container , false);
        return view;
    }
}
