package com.example.reysupply;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView iv1 = findViewById(R.id.iv1);
        ImageView iv2 = findViewById(R.id.iv2);
        ImageView iv3 = findViewById(R.id.iv3);

        iv1.setOnClickListener(this);
        iv2.setOnClickListener(this);
        iv3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.iv1) {
            Intent intent1 = new Intent(this, slide1.class);
            startActivity(intent1);

        } else if (v.getId() == R.id.iv2) {
            Intent intent2 = new Intent(this, slide2.class);
            startActivity(intent2);

        } else if (v.getId() == R.id.iv3) {
            Intent intent2 = new Intent(this, slide3.class);
            startActivity(intent2);

        }
    }
}