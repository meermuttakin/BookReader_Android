package com.example.meer_.bookreader;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class Youtube extends AppCompatActivity {

    Button firstFragment;
    private Button nextbut;
    private WebView mywebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube);

        firstFragment = (Button) findViewById(R.id.firstFragment);
        nextbut = (Button) findViewById(R.id.firstFragment1) ;
        //secondFragment = (Button) findViewById(R.id.secondFragment);

// perform setOnClickListener event on First Button
        firstFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// load First Fragment
                loadFragment(new YoutubeChannel());
            }
        });

        tbwork();

    }


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
                    nextbut.setVisibility(View.INVISIBLE);



                    Thread.sleep(60000);

                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {

//                            clickbut.setVisibility(View.VISIBLE);
//                            loadinter();

                            nextbut.setVisibility(View.VISIBLE);

                            nextbut.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    Intent intent7 = new Intent(Youtube.this,LastTask.class);
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


}
