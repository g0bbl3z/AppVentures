package com.example.zeke.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button zero;
    Button one;
    Button two;
    Button three;
    Button four;
    Button five;
    Button six;
    Button seven;
    Button eight;
    Button nine;
    Button multiply;
    Button divide;
    Button add;
    Button subtract;
    Button clear;
    Button equals;
    Button dot;
    TextView display;

    String disp = "";

    //TODO: Fix Format
    String num1 = null;
    String num2 = null;
    String operator = "";


    public void changeDisplay() {
        display.setText(disp);
    }

    public void clear(View view) {
        disp = "";
        num1 = null;
        num2 = null;
        operator = "";
        changeDisplay();
    }

    public void setNum1(String n) {
        if(num1 == null) {
            num1 = n;
        }
        else {
            num1 += n;
        }
        disp = "" + num1;
        changeDisplay();

    }

    public void setNum2(String n) {
        if(num2 == null) {
            num2 = n;
        }
        else {
            num2 += n;
        }
        disp = num1 + " " + operator + " " + num2;
        changeDisplay();
    }

    //Numbers
    public void zero(View view) {
        String n = "" + 0;
        if (operator.isEmpty()) {
            //Still working num1
            setNum1(n);
        } else {
            setNum2(n);
        }
    }

    public void one(View view) {
        String n = "" + 1;
        if (operator.isEmpty()) {
            //Still working num1
            setNum1(n);
        } else {
            setNum2(n);
        }
    }

    public void two(View view) {
        String n = "" + 2;
        if (operator.isEmpty()) {
            //Still working num1
            setNum1(n);
        } else {
            setNum2(n);
        }
    }

    public void three(View view) {
        String n = "" + 3;
        if (operator.isEmpty()) {
            //Still working num1
            setNum1(n);
        } else {
            setNum2(n);
        }
    }

    public void four(View view) {
        String n = "" + 4;
        if (operator.isEmpty()) {
            //Still working num1
            setNum1(n);
        } else {
            setNum2(n);
        }
    }

    public void five(View view) {
        String n = "" + 5;
        if (operator.isEmpty()) {
            //Still working num1
            setNum1(n);
        } else {
            setNum2(n);
        }
    }

    public void six(View view) {
        String n = "" + 6;
        if (operator.isEmpty()) {
            //Still working num1
            setNum1(n);
        } else {
            setNum2(n);
        }
    }

    public void seven(View view) {
        String n = "" + 7;
        if (operator.isEmpty()) {
            //Still working num1
            setNum1(n);
        } else {
            setNum2(n);
        }
    }

    public void eight(View view) {
        String n = "" + 8;
        if (operator.isEmpty()) {
            //Still working num1
            setNum1(n);
        } else {
            setNum2(n);
        }
    }

    public void nine(View view) {
        String n = "" + 9;
        if (operator.isEmpty()) {
            //Still working num1
            setNum1(n);
        } else {
            setNum2(n);
        }
    }

    public void dot(View view) {
        if (operator.isEmpty()) {
            //Still working num1
            if(num1 == null) {
                //num1 is empty
                setNum1("0.");
            }
            setNum1(".");
            } else {
            if(num2 == null) {
                //num1 is empty
                setNum2("0.");
            }
            setNum2(".");
        }
    }

    // Operations
    public void multiply(View view) {
        if(operator.isEmpty() || num2 == null) {
            operator = "*";
        }
        else {
            calculate();
            operator = "*";
        }
        disp = num1 + " " + operator;
        changeDisplay();
    }

    public void divide(View view) {
        if(operator.isEmpty() || num2 == null) {
            operator = "/";
        }
        else {
            calculate();
            operator = "/";
        }
        disp = num1 + " " + operator;
        changeDisplay();
    }

    public void add(View view) {
        if(operator.isEmpty() || num2 == null) {
            operator = "+";
        }
        else {
            calculate();
            operator = "+";
        }
        disp = num1 + " " + operator;
        changeDisplay();
    }

    public void subtract(View view) {
        if(operator.isEmpty() || num2 == null) {
            operator = "-";
        }
        else {
            calculate();
            operator = "-";
        }
        disp = num1 + " " + operator;
        changeDisplay();
    }

    public void equate(View view) {
        calculate();
        disp = "" + num1;
        changeDisplay();
    }

    public void calculate() {
        try {
            switch (operator) {
                case "*":
                    num1 = "" + Double.parseDouble(num1) * Double.parseDouble(num2);
                    num2 = null;
                    break;
                case "/":
                    num1 = "" + Double.parseDouble(num1) / Double.parseDouble(num2);
                    num2 = null;
                    break;
                case "+":
                    num1 = "" + (Double.parseDouble(num1) + Double.parseDouble(num2));
                    num2 = null;
                    break;
                case "-":
                    num1 = "" + (Double.parseDouble(num1) - Double.parseDouble(num2));
                    num2 = null;
                    break;
            }
        }
        catch (Exception e){}
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display = findViewById(R.id.display);
        one = findViewById(R.id.zero);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        multiply = findViewById(R.id.mutliply);
        divide = findViewById(R.id.division);
        add = findViewById(R.id.add);
        subtract = findViewById(R.id.subtract);
        clear = findViewById(R.id.clear);
        equals = findViewById(R.id.equals);
        dot = findViewById(R.id.dot);
    }
}
