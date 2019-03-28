package com.example.android.materialme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        ImageView imageViewDetail = (ImageView) findViewById(R.id.sportImageDetail);
        TextView titleDetail = (TextView) findViewById(R.id.titleDetail);
        titleDetail.setText(getIntent().getStringExtra("title"));
        Glide.with(this).load(getIntent().getIntExtra("image",0)).into(imageViewDetail);
    }
}
