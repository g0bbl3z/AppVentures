package com.example.zeke.appventuresarea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class triangleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangle);
    }
    public void clearTriangle(View view) {
        EditText baseLength = findViewById(R.id.base);
        EditText heightLength = findViewById(R.id.height);
        TextView areaDisplay = findViewById(R.id.triangleAreaDisplay);
        baseLength.setText("");
        heightLength.setText("");
        areaDisplay.setText("");
    }

    public void calculateTriangleArea(View view){
        EditText baseLength = findViewById(R.id.base);
        EditText heightLength = findViewById(R.id.height);
        TextView areaDisplay = findViewById(R.id.triangleAreaDisplay);
        try {
            double base = Double.parseDouble(baseLength.getText().toString());
            double height = Double.parseDouble(heightLength.getText().toString());
            double area = (base * height)/2.0;
            areaDisplay.setText("Area of Triangle: " + area);
        }
        catch(Exception e) {
            return;
        }
    }

    public void startCircleActivity(View view) {
        Intent i = new Intent(this, circleActivity.class);
        startActivity(i);
    }
    public void startSquareActivity(View view) {
        Intent i = new Intent(this, squareActivity.class);
        startActivity(i);
    }
}
