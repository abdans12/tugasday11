package com.example.tugasday11;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class VipActivity extends AppCompatActivity {

    ImageButton imgHome, imgLive, imgShorts, imgVip, imgSaya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.vip); // pastikan ini mengacu pada layout yang benar untuk VipActivity
        imgHome = findViewById(R.id.imgHome);
        imgLive = findViewById(R.id.imgLive);
        imgShorts = findViewById(R.id.imgShorts);
        imgVip = findViewById(R.id.imgvip); // memperbaiki typo dari "imgvip" menjadi "imgVip"
        imgSaya = findViewById(R.id.imgSaya);
        klik();
    }

    void klik() {
        imgHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHome = new Intent(VipActivity.this, MainActivity.class);
                startActivity(intentHome);
            }
        });
        imgLive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLive = new Intent(VipActivity.this, LiveActivity.class);
                startActivity(intentLive);
            }
        });
        imgShorts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentShorts = new Intent(VipActivity.this, ShortsActivity.class);
                startActivity(intentShorts);
            }
        });
        // Hilangkan onClickListener untuk imgVip karena kita sudah di VipActivity
        imgSaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSaya = new Intent(VipActivity.this, SayaActivity.class);
                startActivity(intentSaya);
            }
        });
    }
}
