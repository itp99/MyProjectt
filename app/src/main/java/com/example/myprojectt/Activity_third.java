package com.example.myprojectt;

import static com.example.myprojectt.R.id.imageView3;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.annotation.Nullable;

public class Activity_third extends Activity  {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thirdlayout);


        ImageView ph = findViewById(R.id.imageView3);
        ph.setImageResource(R.drawable.photo);

    }
}
