package com.example.myprojectt;

import static android.widget.Toast.*;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity   {

   private Button hours;
  private boolean isLongClicked = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hours = findViewById(R.id.button_hours);
            hours.setOnClickListener(new View.OnClickListener() {
             @Override
                 public void onClick(View v) {
                 Toast.makeText(MainActivity.this, "انقر مطولاً للعرض", LENGTH_SHORT).show();
             }
});

        hours.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if (isLongClicked) {
                    Intent i = new Intent (MainActivity.this, Activity_third.class);
               startActivity(i);
               return true;
                }
                else {

                }
                return false;
            }
        });



    }

    public void About(View view) {
        Intent i = new Intent(this,Activity_sec.class);
        startActivity(i);

    }

    public void CallUs(View v) {
        Intent i = new Intent (Intent.ACTION_VIEW, Uri.parse("tel:+9665433290280"));
        startActivity(i);
    }





}