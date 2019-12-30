package com.example.meer_.bookreader;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GoToNext extends AppCompatActivity {

    private Button gdLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go_to_next);

        gdLink = (Button) findViewById(R.id.getBookId);

        gdLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1iU4ZaeOygsa3IWVBuMNBIFer1Rbh2tcR/view?usp=drive_web"));
                startActivity(gintent);
            }
        });
    }
}
