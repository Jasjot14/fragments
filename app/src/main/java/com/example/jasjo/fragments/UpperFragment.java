/*
package com.example.jasjo.fragments;


import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;


*/
/**
 * A simple {@link Fragment} subclass.
 *//*

public class UpperFragment extends Fragment {
    WebView webView;
    //MyListener listener;
    //LowerFragment lowerFragment;
    UpperFragment upperFragment;
    FragmentManager fragmentManager;

    void initViews() {
        webView = webView.findViewById(R.id.webView);

        WebViewClient client = new WebViewClient();
        webView.setWebViewClient(client);

        webView.getSettings().setJavaScriptEnabled(true);
        //Intent rcv = getIntent();
upperFragment=new UpperFragment();
lowerFragment= new LowerFragment();
        upperFragment.registerMyListener(lowerFragment);
        fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().add(R.id.listView,lowerFragment).commit();
        //int position=rcv.getIntExtra("position",0);
        if (position == 0) {
            //getSupportActionBar().setTitle("AAj Tak");
            webView.loadUrl("https://aajtak.intoday.in/");
        } else if (position == 1) {
            //getSupportActionBar().setTitle("Zee News");
            webView.loadUrl("http://zeenews.india.com/");
        } */
/*else if (position == 2) {
            getSupportActionBar().setTitle("News18");
            webView.loadUrl("https://www.news18.com/");
        } else if (position == 3) {
            getSupportActionBar().setTitle("DD News");
            webView.loadUrl("http://ddnews.gov.in/");
        } else if (position == 4) {
            getSupportActionBar().setTitle("NDTV");
            webView.loadUrl("https://www.ndtv.com/");
        }*//*


    }

    private FragmentManager getSupportFragmentManager() {
    }

    public UpperFragment() {
        // Required empty public constructor
        initViews();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_upper, container, false);

    }

    public void registerMyListener(LowerFragment lowerFragment) {
    }

    */
/*public void registerMyListener(LowerFragment lowerFragment) {

        this.listener = listener;
    }*//*

}
*/
