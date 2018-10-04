package com.example.zeke.appventuresarea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class circleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle);
    }

    public void clearCircle(View view) {
        EditText sideLength = findViewById(R.id.radius);
        TextView areaDisplay = findViewById(R.id.circleAreaDisplay);
        sideLength.setText("");
        areaDisplay.setText("");
    }

    public void calculateCircleArea(View view){
        EditText radiusLength = findViewById(R.id.radius);
        TextView areaDisplay = findViewById(R.id.circleAreaDisplay);
        try {
            int radius = Integer.parseInt(radiusLength.getText().toString());
            int area = radius * radius;
            areaDisplay.setText("Area of Circle: " + area + "pi");
        }
        catch(Exception e) {
            return;
        }
    }

    public void startSquareActivity(View view) {
        Intent i = new Intent(this, squareActivity.class);
        startActivity(i);
    }
    public void startTriangleActivity(View view) {
        Intent i = new Intent(this, triangleActivity.class);
        startActivity(i);
    }
}
