package com.example.meer_.bookreader;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TaskFour extends AppCompatActivity {

    private Button startbutton;
    private TextView t1,t2,t3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_four);

        t1 = (TextView) findViewById(R.id.taskinfo4);
        t2 = (TextView) findViewById(R.id.taskheader4);
        t3 = (TextView) findViewById(R.id.warn_info4);

        startbutton = (Button) findViewById(R.id.startid4);

        startbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(TaskFour.this,Youtube.class);
                startActivity(intent1);
            }
        });
    }
}
