package com.example.jasjo.fragments;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class fragments extends AppCompatActivity {

    //UpperFragment upperFragment;
    Upper upperFragment;
    BlankFragment lowerFragment;
    FragmentManager fragmentManager;

    void initViews(){
        //upperFragment = new UpperFragment();

        upperFragment = new Upper();
        lowerFragment = new BlankFragment();

        lowerFragment.registerMylistener((Mylistener) upperFragment);
       // upperFragment.registerMyListener(lowerFragment);
        Fragment fragment1 = new Upper();
        getSupportFragmentManager().beginTransaction().add(R.id.frame1, fragment1).commit();

        Fragment fragment = new BlankFragment();

        getSupportFragmentManager().beginTransaction().add(R.id.frame2, fragment).commit();
        //fragment.registerMyListener(fragment1);
       // fragmentManager = getSupportFragmentManager();
        //fragmentManager.beginTransaction().add(R.id.webView,upperFragment).commit();
        //fragmentManager.beginTransaction().add(0,R.id.listView,lowerFragment).commit();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragments);

        initViews();
    }
}
