package com.example.elderui;

import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class HomepageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        //横竖屏适配
        if (this.getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
            //竖屏
            System.out.println("竖屏");
            setContentView(R.layout.activity_homepage);
        } else {
            //横屏
            System.out.println("横屏");
            setContentView(R.layout.activity_homepage_landscape);
        }

        ImageButton button_emergency = (ImageButton)findViewById(R.id.emergency_call);
        button_emergency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HomepageActivity.this, "You will make an emergency call!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:911"));
                startActivity(intent);
            }
        });

        ImageButton button1 = (ImageButton)findViewById(R.id.contact_1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HomepageActivity.this, "Emergency call for contact 1!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:123-45678"));
                startActivity(intent);
            }
        });

        ImageButton button2 = (ImageButton)findViewById(R.id.contact_2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HomepageActivity.this, "Emergency call for contact2!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:123-45678"));
                startActivity(intent);
            }
        });

        ImageButton button3 = (ImageButton)findViewById(R.id.contact_3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HomepageActivity.this, "Emergency call for contact 3!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:123-95293"));
                startActivity(intent);
            }
        });
    }
}
