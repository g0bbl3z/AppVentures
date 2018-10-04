package com.example.zeke.appventuresarea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class squareActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_square);
    }

    public void clearSquare(View view) {
        EditText sideLength = findViewById(R.id.side);
        TextView areaDisplay = findViewById(R.id.squareAreaDisplay);
        sideLength.setText("");
        areaDisplay.setText("");
    }

    public void calculateSquareArea(View view){
        EditText sideLength = findViewById(R.id.side);
        TextView areaDisplay = findViewById(R.id.squareAreaDisplay);
        try {
            int side = Integer.parseInt(sideLength.getText().toString());
            int area = side * side;
            areaDisplay.setText("Area of Square: " + area);
        }
        catch(Exception e) {
            return;
        }
    }

    public void startCircleActivity(View view) {
        Intent i = new Intent(this, circleActivity.class);
        startActivity(i);
    }
    public void startTriangleActivity(View view) {
        Intent i = new Intent(this, triangleActivity.class);
        startActivity(i);
    }

}
