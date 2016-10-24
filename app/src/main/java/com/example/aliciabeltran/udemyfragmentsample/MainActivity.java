package com.example.aliciabeltran.udemyfragmentsample;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Create instance o FragmentA
        FragmentA fragmentA = new FragmentA();
        addFragmentAtoActivity(fragmentA);
       // addFragmentAToActivity2(fragmentA);


    }

    /**
     * single line to add fragment to main layout
     * @param fragmentA
     */
    private void addFragmentAToActivity2(FragmentA fragmentA) {
        getFragmentManager()
            .beginTransaction()
            .add(R.id.activity_main_root, fragmentA,"myFragmentA")
            .commit();
    }

    /**
     * Long way  to add FragmentA to mainLayout
     * @param fragmentA
     */
    private void addFragmentAtoActivity(FragmentA fragmentA) {
        //Reference to Fragment Manager
        android.app.FragmentManager fragmentManager = getFragmentManager();
        android.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        //                      (root elemte un activity layout, fragment to add, fragments alias);
        fragmentTransaction.add(R.id.activity_main_root, fragmentA, "MyFragmentA");
        fragmentTransaction.commit();
    }
}
