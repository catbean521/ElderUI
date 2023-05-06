package com.example.elderui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //hide the title of the app
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        //set button function for signup_main in activity_main.xml
        Button button_signup_main = (Button) findViewById(R.id.signup_main);
        button_signup_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "You will sign up!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, SignupActivity.class);//RegisterActivity
                startActivity(intent);
            }
        });

        //set button function for login_main in activity_main.xml
        Button button_login_main = (Button) findViewById(R.id.login_main);
        button_login_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "You will log in!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);//RegisterActivity
                startActivity(intent);
            }
        });


    }


}