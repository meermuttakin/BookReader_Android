package com.example.meer_.bookreader;

import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class YoutubeChannel extends Fragment {


    private WebView mywebView;
    View view;
    Button firstButton;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
// Inflate the layout for this fragment
        view = inflater.inflate(R.layout.activity_youtube_channel, container, false);

        mywebView = (WebView) view.findViewById(R.id.webview);
        WebSettings webSettings= mywebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mywebView.loadUrl("https://www.youtube.com/channel/UCzdku1Fq7ERoYXjoklJoYKg");
        // Line of Code for opening links in app
        mywebView.setWebViewClient(new WebViewClient());



        return view;
    }
}
