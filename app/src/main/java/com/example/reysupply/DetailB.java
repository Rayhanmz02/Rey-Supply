package com.example.reysupply;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailB extends AppCompatActivity {
    public static final String KEY_DATA = "key_object";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_b);

        ImageView Gambar = findViewById(R.id.detail1);
        TextView Name = findViewById(R.id.detail2);
        TextView Price = findViewById(R.id.detail3);
        TextView Desk = findViewById(R.id.detail4);
        TextView Color = findViewById(R.id.detail5);
        TextView Type = findViewById(R.id.detail6);
        TextView Size = findViewById(R.id.detail7);
        Detail detail;


        if (Build.VERSION.SDK_INT >= 33) {
            detail = getIntent().getParcelableExtra(KEY_DATA, Detail.class);
        } else {
            detail = getIntent().getParcelableExtra(KEY_DATA);
        }

        String sourceGambar = detail.getGambar();
        int sourceGambarID = getResources().getIdentifier(sourceGambar, "drawable", getPackageName());
        Gambar.setImageResource(sourceGambarID);

        Name.setText(detail.getName());
        Price.setText(detail.getPrice());
        Desk.setText(detail.getDesk());
        Color.setText(detail.getColor());
        Type.setText(detail.getType());
        Size.setText(detail.getSize());
    }


}