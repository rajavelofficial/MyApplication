package com.example.myapplication;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    Button b1, b2;
    TextView t1;
    float font = 20;
    int i = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.button1); // No need to cast
        t1 = findViewById(R.id.textView1); // No need to cast

        // Button 1: Change Font Size (Using lambda)
        b1.setOnClickListener(v -> {
            t1.setTextSize(font);
            font = font + 4;
            if (font == 40) {
                font = 20;
            }
        });

        // Button 2: Change Text Color (Using lambda)
        b2 = findViewById(R.id.button2); // No need to cast
        b2.setOnClickListener(v -> {
            switch (i) {
                case 1:
                    t1.setTextColor(Color.parseColor("#0000FF"));
                    break;
                case 2:
                    t1.setTextColor(Color.parseColor("#00FF00"));
                    break;
                case 3:
                    t1.setTextColor(Color.parseColor("#FF0000"));
                    break;
                default:
                    t1.setTextColor(Color.parseColor("#800000"));
                    break;
            }
            i++;
            if (i == 5) {
                i = 1;
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}