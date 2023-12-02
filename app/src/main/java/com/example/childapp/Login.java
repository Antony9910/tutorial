package com.example.childapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONObject;

public class Login extends AppCompatActivity {
    EditText e1,e2;
    Button b2;
public static String logid;
SharedPreferences sh;
    String usertype,password,username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        e1=(EditText)findViewById(R.id.username);
        e2=(EditText)findViewById(R.id.Password);
        b2=(Button) findViewById(R.id.login);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                username = e1.getText().toString();
                password = e2.getText().toString();

                if (username.equalsIgnoreCase("")) {
                    e1.setError("Enter your Username");
                    e1.setFocusable(true);
                } else if (password.equalsIgnoreCase("")) {
                    e2.setError("Enter your password");
                    e2.setFocusable(true);
                }
                else {
                    Toast.makeText(Login.this, "", Toast.LENGTH_SHORT).show();
            }

            }
        });


    }
}