package com.example.childapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class registration1 extends AppCompatActivity {
    EditText e1,e2,e3,e4,e5,e6,e7;
    Button b1;
   String firstname,lastname,housename,placename,phonenum,email,child;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration1);

        e1=(EditText)findViewById(R.id.firstname);
        e2=(EditText)findViewById(R.id.lastname);
        e3=(EditText)findViewById(R.id.housename);
        e4=(EditText)findViewById(R.id.placename);
        e5=(EditText)findViewById(R.id.phonenum);
        e6=(EditText)findViewById(R.id.email);
        e7=(EditText)findViewById(R.id.child);
        b1=(Button) findViewById(R.id.Register);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstname = e1.getText().toString();
                lastname=e2.getText().toString();
                housename=e3.getText().toString();
                placename=e4.getText().toString();
                phonenum=e5.getText().toString();
                email=e5.getText().toString();
                child=e6.getText().toString();
                if(firstname.equalsIgnoreCase(""))
                {
                    e1.setError("Please Enter your first name");
                    e1.setFocusable(true);
                }
                else if (lastname.equalsIgnoreCase(""))
                {
                    e2.setError("please Enter your second name");
                    e2.setFocusable(true);
                }
                else if (housename.equalsIgnoreCase(""))
                {
                    e3.setError("Please Enter your house name");
                    e3.setFocusable(true);
                }
                else if (placename.equalsIgnoreCase(""))
                {
                    e4.setError("Please Enter your place name");
                    e4.setFocusable(true);
                }
                else if (phonenum.equalsIgnoreCase(""))
                {
                    e5.setError("Please Enter your valid Phone Number");
                    e5.setFocusable(true);
                } else if (email.equalsIgnoreCase(""))
                {
                       e6.setError("Please Enter your Valid email ");
                       e6.setFocusable(true);
                }
                else if (child.equalsIgnoreCase(""))
                {
                      e7.setError("Please Enter no of children");
                      e7.setFocusable(true);
                }
                else {
                    Toast.makeText(registration1.this, "Firstname" + firstname + "\n Lastname" + lastname + "\n Housename" + housename + "\n Placename" + placename + "\n Email" + email + "\n Child" + child, Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}