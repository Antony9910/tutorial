package com.example.childapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ip extends AppCompatActivity {

     EditText e1;
     Button b1;
     String ipaddress;
     SharedPreferences sh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ip);
        sh= PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        e1=(EditText)findViewById(R.id.ipaddress);
        b1=(Button) findViewById(R.id.Submit);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ipaddress = e1.getText().toString();
                if(ipaddress.equalsIgnoreCase(""))
                {
                    e1.setError("Enter ip Address");
                    e1.setFocusable(true);
                }
                else {
//                    Toast.makeText(ip.this, "Ip Address: " + ipaddress + "", Toast.LENGTH_SHORT).show();

                        SharedPreferences.Editor e=sh.edit();
                        e.putString("ip",ipaddress);
                        e.commit();
                        startActivity(new Intent(getApplicationContext(),calculator.class));

                    }
                }
            });
                }
            }
