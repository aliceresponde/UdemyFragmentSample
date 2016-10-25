package com.example.aliciabeltran.udemyfragmentsample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by alicia.beltran on 24/10/2016.
 */

public class FragmentB extends Fragment {

    private Button btnAdd;
    private int counterValue = 0;
    private FragmentA.ICounter mCounter;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_b, container, false);
        btnAdd = (Button) view.findViewById(R.id.btnAdd);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counterValue++;
                mCounter = (FragmentA.ICounter) getActivity();
                mCounter.setCounterValue(counterValue);
            }
        });
        return view;
    }
}
