package com.example.elderui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class PairActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_pair);

        Button button_pair = (Button) findViewById(R.id.pair);
        button_pair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PairActivity.this, "Successful pairing!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(PairActivity.this, HomepageActivity.class);
                startActivity(intent);
            }
        });


    }
}
