package com.example.meer_.bookreader;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class addshow extends AppCompatActivity {

    private AdView m1,m2,m3,m4,m5,m6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addshow);


        m1 = findViewById(R.id.adView11);
        AdRequest adRequest1 = new AdRequest.Builder().build();
        m1.loadAd(adRequest1);


        m2 = findViewById(R.id.adView12);
        AdRequest adRequest2 = new AdRequest.Builder().build();
        m2.loadAd(adRequest2);


        m3 = findViewById(R.id.adView13);
        AdRequest adRequest3 = new AdRequest.Builder().build();
        m3.loadAd(adRequest3);
    }
}
