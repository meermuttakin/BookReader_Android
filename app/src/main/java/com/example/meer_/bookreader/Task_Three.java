package com.example.meer_.bookreader;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Task_Three extends AppCompatActivity {

    private Button startbutton1;
    private TextView t1,t2,t3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task__three);


        t1 = (TextView) findViewById(R.id.taskinfo3);
        t2 = (TextView) findViewById(R.id.taskheader3);
        t3 = (TextView) findViewById(R.id.warn_info3);

        startbutton1 = (Button) findViewById(R.id.startid3);

        startbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent51 = new Intent(Task_Three.this,ClickToNext.class);
                startActivity(intent51);
            }
        });

    }
}
