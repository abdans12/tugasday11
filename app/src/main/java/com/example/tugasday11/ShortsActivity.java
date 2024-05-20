package com.example.tugasday11;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class ShortsActivity extends AppCompatActivity {

    ImageButton imgHome, imgLive, imgShorts, imgVip, imgSaya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.shorts); // pastikan ini mengacu pada layout yang benar untuk ShortsActivity
        imgHome = findViewById(R.id.imgHome);
        imgLive = findViewById(R.id.imgLive);
        imgShorts = findViewById(R.id.imgShorts);
        imgVip = findViewById(R.id.imgvip);
        imgSaya = findViewById(R.id.imgSaya);
        klik();
    }

    void klik() {
        imgHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHome = new Intent(ShortsActivity.this, MainActivity.class);
                startActivity(intentHome);
            }
        });
        imgLive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLive = new Intent(ShortsActivity.this, LiveActivity.class);
                startActivity(intentLive);
            }
        });
        imgVip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentVip = new Intent(ShortsActivity.this, VipActivity.class);
                startActivity(intentVip);
            }
        });
        // Hilangkan onClickListener untuk imgShorts karena kita sudah di ShortsActivity
        imgSaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSaya = new Intent(ShortsActivity.this, SayaActivity.class);
                startActivity(intentSaya);
            }
        });
    }
}