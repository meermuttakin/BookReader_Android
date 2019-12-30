package com.example.meer_.bookreader;


import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.Toast;


public class FacebookVisit extends Fragment {

    View view;
    Button secondButton;

    WebView facebookView;

    private Intent intent5;

    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
// Inflate the layout for this fragment

        view = inflater.inflate(R.layout.activity_facebook_visit, container, false);
// get the reference of Button
//        secondButton = (Button) view.findViewById(R.id.secondButton);
//// perform setOnClickListener on second Button
//        secondButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });


        facebookView = (WebView) view.findViewById(R.id.fff);
        WebSettings webSettings= facebookView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        facebookView.loadUrl("https://www.facebook.com/oofferclub/");
        // Line of Code for opening links in app
        facebookView.setWebViewClient(new WebViewClient());


        return view;
    }
}