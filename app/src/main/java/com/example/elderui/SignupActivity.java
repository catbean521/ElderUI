package com.example.elderui;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();

        //横竖屏适配
        if (this.getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
            //竖屏
            System.out.println("竖屏");
            setContentView(R.layout.activity_signup);
        } else {
            //横屏
            System.out.println("横屏");
            setContentView(R.layout.activity_signup_landscape);
        }


        Button button_signup = (Button) findViewById(R.id.signup);
        button_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SignupActivity.this, "Sign up successfully!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SignupActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });


    }
}
