package com.example.meer_.bookreader;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {

    private Button stbut;
    private TextView t1;
    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1 = (TextView) findViewById(R.id.tv);
        stbut = (Button) findViewById(R.id.startid);
        loadpage();
        prepare();

        ScheduledExecutorService schedulerex = Executors.newSingleThreadScheduledExecutor();
        schedulerex.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                Log.i("hello ","Bangladesh");
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        if(mInterstitialAd.isLoaded()){
                            mInterstitialAd.show();
                        }
                        else{
                            prepare();
                        }
                    }
                });
            }
        },20,20, TimeUnit.SECONDS);



 }

    public void loadpage()
    {
        stbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this,TaskFirst.class);
                startActivity(intent1);
            }
        });

    }


    public void prepare(){

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-7511187518970336/8422625243");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

    }
}
