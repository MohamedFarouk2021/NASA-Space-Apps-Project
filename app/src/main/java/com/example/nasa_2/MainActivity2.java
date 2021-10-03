package com.example.nasa_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    private Button bt4;
    private Button bt1;
    private Button bt3;
    private Button bt2;
    private Button bt5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        bt1 = findViewById(R.id.bt1);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(Intent.ACTION_DIAL);
                intent1.setData(Uri.parse("tel:105"));
                startActivity(intent1);
            }
        });

        bt2 = (Button) findViewById(R.id.bt2);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity22();
            }
        });

        bt3 = (Button) findViewById(R.id.bt3);
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity23();
            }
        });


        bt4 = (Button) findViewById(R.id.bt4);
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity24();
            }
        });
        bt5 = (Button) findViewById(R.id.bt5);
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity25();
            }
        });


    }
    public void openactivity22(){
        Intent intent = new Intent(this, activity22.class);
        startActivity(intent);

    }
    public void openactivity23(){
        Intent intent = new Intent(this, activity23.class);
        startActivity(intent);

    }
    public void openactivity24(){
        Intent intent = new Intent(this, activity24.class);
        startActivity(intent);

    }
    public void openactivity25(){
        Intent intent = new Intent(this, activity25.class);
        startActivity(intent);

    }
}