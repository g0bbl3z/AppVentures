package com.example.zeke.appventuresarea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startCircleActivity(View view) {
        Intent i = new Intent(this, circleActivity.class);
        startActivity(i);
    }
    public void startTriangleActivity(View view) {
        Intent i = new Intent(this, triangleActivity.class);
        startActivity(i);
    }
    public void startSquareActivity(View view) {
        Intent i = new Intent(this, squareActivity.class);
        startActivity(i);
    }
}
