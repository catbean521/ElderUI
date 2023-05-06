package com.example.elderui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CheakWalkerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_check_walker);

        Button button_yes = (Button) findViewById(R.id.yes);
        button_yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CheakWalkerActivity.this, PairActivity.class);
                startActivity(intent);
            }
        });

        Button button_no = (Button) findViewById(R.id.no);
        button_no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CheakWalkerActivity.this, HomepageActivity.class);
                startActivity(intent);
            }
        });
    }
}
