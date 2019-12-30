package com.example.meer_.bookreader;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class bannarads extends AppCompatActivity {

    private AdView m1,m2,m3,m4,m5,m6;
    private Button clickbut;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bannarads);



        loadadsbanner();


         Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {

                    clickbut = (Button) findViewById(R.id.ClickId);
                    clickbut.setVisibility(View.INVISIBLE);

                   // clickbut = (Button) findViewById(R.id.ClickId);
                    Thread.sleep(20000);

                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {

                            clickbut.setVisibility(View.VISIBLE);
                            loadinter();

                        }
                    });



                }catch (Exception e)
                {
                    System.out.println("Error " + e.getMessage());
                }
            }
        });thread.start();



    }

    public void loadadsbanner(){
        m1 = findViewById(R.id.adView);
        AdRequest adRequest1 = new AdRequest.Builder().build();
        m1.loadAd(adRequest1);


        m2 = findViewById(R.id.adView2);
        AdRequest adRequest2 = new AdRequest.Builder().build();
        m2.loadAd(adRequest2);


        m3 = findViewById(R.id.adView3);
        AdRequest adRequest3 = new AdRequest.Builder().build();
        m3.loadAd(adRequest3);


        m4 = findViewById(R.id.adView4);
        AdRequest adRequest4 = new AdRequest.Builder().build();
        m4.loadAd(adRequest4);


        m5 = findViewById(R.id.adView5);
        AdRequest adRequest5 = new AdRequest.Builder().build();
        m5.loadAd(adRequest5);

        m6 = findViewById(R.id.adView6);
        AdRequest adRequest6 = new AdRequest.Builder().build();
        m6.loadAd(adRequest6);



    }

    public void loadinter()
    {

        clickbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(bannarads.this,TaskSecond.class);
                startActivity(intent2);
            }
        });
    }
}
