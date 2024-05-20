package com.example.tugasday11;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LiveActivity extends AppCompatActivity {

    ImageButton imgHome, imgLive,imgShorts,imgVip,imgSaya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.live);
        imgHome = findViewById(R.id.imgHome);
        imgLive = findViewById(R.id.imgLive);
        imgShorts = findViewById(R.id.imgShorts);
        imgVip = findViewById(R.id.imgvip);
        imgSaya = findViewById(R.id.imgSaya);
        klik();
    }
    void klik(){
        imgHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHome = new Intent(LiveActivity.this, MainActivity.class);
                startActivity(intentHome);
            }
        });
        imgShorts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentShorts = new Intent(LiveActivity.this, ShortsActivity.class);
                startActivity(intentShorts);
            }
        });
        imgVip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentVip = new Intent(LiveActivity.this, VipActivity.class);
                startActivity(intentVip);
            }
        });
        imgLive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLive = new Intent(LiveActivity.this, LiveActivity.class);
                startActivity(intentLive);
            }
        });
        imgSaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSaya = new Intent(LiveActivity.this, SayaActivity.class);
                startActivity(intentSaya);
            }
        });
    }
}