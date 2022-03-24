package com.example.loginandregister;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText username,password;
        Button login;

        login=findViewById(R.id.loginbtn);
        username=findViewById(R.id.username);
        password=findViewById(R.id.password);


    TextView register;
    register=findViewById(R.id.register);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usernametxt=username.getText().toString();
                String passwordtxt=password.getText().toString();
                if (usernametxt.length()<=0 && passwordtxt.length() <= 0) {
                    Toast.makeText(MainActivity.this,"Please enter the username and password",Toast.LENGTH_SHORT).show();
                } else {

                    if (usernametxt.equals("Harman") && passwordtxt.equals("Harman")){
                        startActivity(new Intent(MainActivity.this,Home.class));
                    }
                }
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,Register.class));
            }
        });

    }



}