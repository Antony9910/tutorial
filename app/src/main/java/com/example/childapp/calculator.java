package com.example.childapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class calculator extends AppCompatActivity {

    EditText e1, e2, e3;
    Button b1, b2, b3, b4, b5, b6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        e1 = (EditText) findViewById(R.id.firstNumber);
        e2 = (EditText) findViewById(R.id.secondNumber);
        e3 = (EditText) findViewById(R.id.Result);
        b1 = (Button) findViewById(R.id.Add);
        b2 = (Button) findViewById(R.id.Subtract);
        b3 = (Button) findViewById(R.id.multiply);
        b4 = (Button) findViewById(R.id.Division);
        b5 = (Button) findViewById(R.id.Modulus);
        b6 = (Button) findViewById(R.id.clear);
    }
 }


