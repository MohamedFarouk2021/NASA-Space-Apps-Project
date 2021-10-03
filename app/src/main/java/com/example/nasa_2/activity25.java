package com.example.nasa_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class activity25 extends AppCompatActivity {
    TextView link;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_25);
        link= findViewById(R.id.tView1);
        link.setMovementMethod(LinkMovementMethod.getInstance());

    }
}