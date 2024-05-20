package com.example.tugasday11;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class SayaActivity extends AppCompatActivity {

    ImageButton imgHome, imgLive, imgShorts, imgVip, imgSaya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.saya); // pastikan ini mengacu pada layout yang benar untuk SayaActivity
        imgHome = findViewById(R.id.imgHome);
        imgLive = findViewById(R.id.imgLive);
        imgShorts = findViewById(R.id.imgShorts);
        imgVip = findViewById(R.id.imgvip); // pastikan ini sesuai dengan ID di layout XML
        imgSaya = findViewById(R.id.imgSaya);
        klik();
    }

    void klik() {
        imgHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHome = new Intent(SayaActivity.this, MainActivity.class);
                startActivity(intentHome);
            }
        });
        imgLive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLive = new Intent(SayaActivity.this, LiveActivity.class);
                startActivity(intentLive);
            }
        });
        imgShorts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentShorts = new Intent(SayaActivity.this, ShortsActivity.class);
                startActivity(intentShorts);
            }
        });
        imgVip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentVip = new Intent(SayaActivity.this, VipActivity.class);
                startActivity(intentVip);
            }
        });
        // Hilangkan onClickListener untuk imgSaya karena kita sudah di SayaActivity
    }
}
