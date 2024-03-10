package com.example.reysupply;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class slide1 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide1);

        ImageView nike1 = findViewById(R.id.iva1);
        ImageView nike2 = findViewById(R.id.iva2);
        ImageView nike3 = findViewById(R.id.iva3);
        ImageView nike4 = findViewById(R.id.iva4);
        ImageView nike5 = findViewById(R.id.iva5);

        nike1.setOnClickListener(this);
        nike2.setOnClickListener(this);
        nike3.setOnClickListener(this);
        nike4.setOnClickListener(this);
        nike5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.iva1) {
            Detail sepatu1 = new Detail();
            sepatu1.setName("Nike Air Max 1");
            sepatu1.setPrice("Rp. 2,379,000");
            sepatu1.setDesk("   The Air Max 1 SE goes back to basics with a simple black and white design. It retains the same revolutionary cushioning that made it famous while adding a pop of colour to the tongue.");
            sepatu1.setColor("Color : Black and White");
            sepatu1.setType("Type : Running ");
            sepatu1.setSize("Size : 42");
            sepatu1.setGambar("nike_airmax1");

            Intent intent = new Intent(slide1.this, DetailB.class);
            intent.putExtra(DetailB.KEY_DATA, sepatu1);
            startActivity(intent);
        }
        if (v.getId() == R.id.iva2) {
            Detail sepatu1 = new Detail();
            sepatu1.setName("Nike Air Max 97");
            sepatu1.setPrice("Rp. 2,389,000");
            sepatu1.setDesk("   Featuring the original ripple design inspired by Japanese bullet trains, the Nike Air Max 97 lets you push your style full-speed ahead.");
            sepatu1.setColor("Color : White");
            sepatu1.setType("Type : Running ");
            sepatu1.setSize("Size : 43");
            sepatu1.setGambar("nike_airmax_97");

            Intent intent = new Intent(slide1.this, DetailB.class);
            intent.putExtra(DetailB.KEY_DATA, sepatu1);
            startActivity(intent);
        }
        if (v.getId() == R.id.iva3) {
            Detail sepatu1 = new Detail();
            sepatu1.setName("Nike Air Jordan 1 Low");
            sepatu1.setPrice("Rp. 1,729,000");
            sepatu1.setDesk("   Inspired by the original that debuted in 1985, the Air Jordan 1 Low offers a clean, classic look that's familiar yet always fresh. With an iconic design that pairs perfectly with any 'fit, these kicks ensure you'll always be on point.");
            sepatu1.setColor("Color : White");
            sepatu1.setType("Type : Styling ");
            sepatu1.setSize("Size : 42");
            sepatu1.setGambar("nike_airjordan1low");

            Intent intent = new Intent(slide1.this, DetailB.class);
            intent.putExtra(DetailB.KEY_DATA, sepatu1);
            startActivity(intent);
        }
        if (v.getId() == R.id.iva4) {
            Detail sepatu1 = new Detail();
            sepatu1.setName("Nike Air Max Furyosa");
            sepatu1.setPrice("Rp. 2,489,000");
            sepatu1.setDesk("   With a chunky look inspired by the fast-paced running shoes of the '90s, the Air Max Furyosa brings a powerful new voice to your wardrobe. The stacked Air units in the heel are offset, delivering a bold statement and extra cushioning.");
            sepatu1.setColor("Color : White");
            sepatu1.setType("Type : Running ");
            sepatu1.setSize("Size : 41");
            sepatu1.setGambar("nike_airmaxfuryosa");

            Intent intent = new Intent(slide1.this, DetailB.class);
            intent.putExtra(DetailB.KEY_DATA, sepatu1);
            startActivity(intent);
        }
        if (v.getId() == R.id.iva5) {
            Detail sepatu1 = new Detail();
            sepatu1.setName("Nike Air Max Pulse");
            sepatu1.setPrice("Rp. 2,489,000");
            sepatu1.setDesk("   The Air Max Pulse pulls inspiration from the London music scene, bringing an underground touch to the iconic Air Max line. Its textile-wrapped midsole and vacuum-sealed accents keep 'em looking fresh and clean, while colours inspired by the London music scene give your look the edge.");
            sepatu1.setColor("Color : Black");
            sepatu1.setType("Type : Running ");
            sepatu1.setSize("Size : 42");
            sepatu1.setGambar("nike_airmaxpulse");

            Intent intent = new Intent(slide1.this, DetailB.class);
            intent.putExtra(DetailB.KEY_DATA, sepatu1);
            startActivity(intent);
        }
    }
}