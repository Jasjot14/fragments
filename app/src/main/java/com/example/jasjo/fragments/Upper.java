package com.example.jasjo.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;


/**
 * A simple {@link Fragment} subclass.
 */
public class Upper extends Fragment implements Mylistener {
    WebView webView;
    Mylistener listener;


    public Upper() {
        // Required empty public constructor
    }
void initviews(){


    WebViewClient client = new WebViewClient();
    webView.setWebViewClient(client);

    webView.getSettings().setJavaScriptEnabled(true);

}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_upper2, container, false);
        webView = v.findViewById(R.id.webView);
        initviews();
        return v;
    }


    @Override
    public void handler(String url) {
        webView.loadUrl(url);
    }
}


