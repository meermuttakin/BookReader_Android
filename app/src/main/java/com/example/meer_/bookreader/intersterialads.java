package com.example.meer_.bookreader;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class intersterialads extends AppCompatActivity {

    private InterstitialAd mInterstitialAd;
    Button firstFragment, third;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intersterialads);

        //firstFragment = (Button) findViewById(R.id.firstFragment);
        //secondFragment = (Button) findViewById(R.id.secondFragment);
        third = (Button) findViewById(R.id.thirdButton);

       //loadadsinterest();

        // perform setOnClickListener event on First Button
//        firstFragment.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//// load First Fragment
//                loadFragment(new WebsiteVisit());
//            }
//        });
// perform setOnClickListener event on Second Button

//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try {
//
//
////                    clickbut = (Button) findViewById(R.id.ClickId);
////                    clickbut.setVisibility(View.INVISIBLE);
//
//                        secondFragment.setVisibility(View.INVISIBLE);
//
//
//                    Thread.sleep(60000);
//
//                    runOnUiThread(new Runnable() {
//                        @Override
//                        public void run() {
//
////                            clickbut.setVisibility(View.VISIBLE);
////                            loadinter();
//                            secondFragment.setVisibility(View.VISIBLE);
//
//                            secondFragment.setOnClickListener(new View.OnClickListener() {
//                                @Override
//                                public void onClick(View v) {
//// load Second Fragment
//                                    loadFragment(new FacebookVisit());
//                                }
//                            });
//
//                        }
//                    });
//
//
//
//                }catch (Exception e)
//                {
//                    System.out.println("Error " + e.getMessage());
//                }
//            }
//        });thread.start();

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




        tbwork();


    }

//    public void loadadsinterest(){
//        mInterstitialAd = new InterstitialAd(this);
//        mInterstitialAd.setAdUnitId("ca-app-pub-7511187518970336/8422625243");
//        mInterstitialAd.loadAd(new AdRequest.Builder().build());
//
//        mInterstitialAd.setAdListener(new AdListener(){
//            public void onAdLoaded() {
//               display();
//            }
//        });
//
//    }
//
//    public void display(){
//        if(mInterstitialAd.isLoaded())
//        {
//            mInterstitialAd.show();
//        }
//    }

    private void loadFragment(Fragment fragment) {
// create a FragmentManager
        FragmentManager fm = getFragmentManager();
// create a FragmentTransaction to begin the transaction and replace the Fragment
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
// replace the FrameLayout with new Fragment
        fragmentTransaction.replace(R.id.frameLayout, fragment);
        fragmentTransaction.commit(); // save the changes
    }

    public void tbwork()
    {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {


//                    clickbut = (Button) findViewById(R.id.ClickId);
//                    clickbut.setVisibility(View.INVISIBLE);
                    third.setVisibility(View.INVISIBLE);



                    Thread.sleep(60000);

                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {

//                            clickbut.setVisibility(View.VISIBLE);
//                            loadinter();

                            third.setVisibility(View.VISIBLE);

                            third.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    Intent intent7 = new Intent(intersterialads.this,Task_Three.class);
                                    startActivity(intent7);
                                }
                            });


                        }
                    });



                }catch (Exception e)
                {
                    System.out.println("Error " + e.getMessage());
                }
            }
        });thread1.start();


    }

    public void prepare(){

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-7511187518970336/8422625243");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

    }

}
