package com.example.loginandregister;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);





        Button btn,profile,fragmnet,todo,sound;
        sound=findViewById(R.id.sound);
        btn=findViewById(R.id.intent);
        profile=findViewById(R.id.Profile);
        fragmnet=findViewById(R.id.fragment);
        todo=findViewById(R.id.todo);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n=new Intent(Home.this,Profilescreen.class);
                startActivity(n);
            }
        });
        sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n=new Intent(Home.this,Soundactivity.class);
                startActivity(n);
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(Home.this,Intentscreen.class);
                startActivity(i);
            }
        });

        fragmnet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(Home.this,Fragmentscreen.class);
                startActivity(i);
            }
        });
        todo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(Home.this,Fragmentscreen.class);
                startActivity(i);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.setitings:
                Intent n = new Intent(Home.this,Settings.class);
                startActivity(n);
                    break;
            case R.id.profile:
                Intent s = new Intent(Home.this,Profilescreen.class);
                startActivity(s);
                break;

            case R.id.Logout:
                Intent l = new Intent(Home.this,MainActivity.class);
                startActivity(l);
                break;


        }
        return super.onOptionsItemSelected(item);
    }
}
