package com.example.reysupply;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class slide2 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide2);

        ImageView ads1 = findViewById(R.id.ivb1);
        ImageView ads2 = findViewById(R.id.ivb2);
        ImageView ads3 = findViewById(R.id.ivb3);
        ImageView ads4 = findViewById(R.id.ivb4);
        ImageView ads5 = findViewById(R.id.ivb5);

        ads1.setOnClickListener(this);
        ads2.setOnClickListener(this);
        ads3.setOnClickListener(this);
        ads4.setOnClickListener(this);
        ads5.setOnClickListener(this);
     }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.ivb1) {
            Detail sepatu1 = new Detail();
            sepatu1.setName("Adidas Samba OG");
            sepatu1.setPrice("Rp. 2,200,000");
            sepatu1.setDesk("   Whether heading to the pitch or the streets, the adidas Samba OG shoes keep your style on point. Their iconic gum sole and suede accents have propelled the Samba into fashion fame. Smooth leather envelops the foot in retro comfort as the serrated 3-Stripes add a flash of contrast.");
            sepatu1.setColor("Color : White");
            sepatu1.setType("Type : Styling ");
            sepatu1.setSize("Size : 40");
            sepatu1.setGambar("adidas__samba_og");

            Intent intent = new Intent(slide2.this, DetailB.class);
            intent.putExtra(DetailB.KEY_DATA, sepatu1);
            startActivity(intent);
        }
        if (v.getId() == R.id.ivb2) {
            Detail sepatu1 = new Detail();
            sepatu1.setName("Adizero Adios Pro 3 M");
            sepatu1.setPrice("Rp. 4,000,000");
            sepatu1.setDesk("   The Adizero Adios Pro 3 is the pinnacle of Adizero Racing products. It was built with and for athletes to achieve unbelievable feats. These adidas running shoes are made to optimize running efficiency. Our carbon-infused ENERGYRODS provide lightweight stiffness for a snappy, efficient stride.");
            sepatu1.setColor("Color : Pink");
            sepatu1.setType("Type : Running ");
            sepatu1.setSize("Size : 42");
            sepatu1.setGambar("adidas__adizero_adios_pro_3m");

            Intent intent = new Intent(slide2.this, DetailB.class);
            intent.putExtra(DetailB.KEY_DATA, sepatu1);
            startActivity(intent);
        }
        if (v.getId() == R.id.ivb3) {
            Detail sepatu1 = new Detail();
            sepatu1.setName("Adizero Takumi Sen 10");
            sepatu1.setPrice("Rp. 3,200,000");
            sepatu1.setDesk("   When milliseconds matter, these adidas running shoes are tuned for speed. Lightning-quick Lightstrike Pro cushioning keeps you light on your feet down to the finish line, while ENERGYRODS limit energy loss so you can maintain your pace. ");
            sepatu1.setColor("Color : Black");
            sepatu1.setType("Type : Running ");
            sepatu1.setSize("Size : 42");
            sepatu1.setGambar("adidas_adizero_takumi_sen_10");

            Intent intent = new Intent(slide2.this, DetailB.class);
            intent.putExtra(DetailB.KEY_DATA, sepatu1);
            startActivity(intent);
        }
        if (v.getId() == R.id.ivb4) {
            Detail sepatu1 = new Detail();
            sepatu1.setName("4DFWD 3 Running");
            sepatu1.setPrice("Rp. 3,500,000");
            sepatu1.setDesk("   Embrace the rush of a run in these adidas 4DFWD 3 running shoes. Named for the futuristic cushioning they ride on, their 3D-printed midsole propels you forwards with every stride. these shoes turn city streets into an open track.");
            sepatu1.setColor("Color : Yellow");
            sepatu1.setType("Type : Running ");
            sepatu1.setSize("Size : 42");
            sepatu1.setGambar("adidas___4dfwd_3_running_shoes");

            Intent intent = new Intent(slide2.this, DetailB.class);
            intent.putExtra(DetailB.KEY_DATA, sepatu1);
            startActivity(intent);
        }
        if (v.getId() == R.id.ivb5) {
            Detail sepatu1 = new Detail();
            sepatu1.setName("Ultra Boost Light");
            sepatu1.setPrice("Rp. 3,300,000");
            sepatu1.setDesk("   Embrace the rush of a run in these adidas 4DFWD 3 running shoes. Named for the futuristic cushioning they ride on, their 3D-printed midsole propels you forwards with every stride. these shoes turn city streets into an open track.");
            sepatu1.setColor("Color : White");
            sepatu1.setType("Type : Running ");
            sepatu1.setSize("Size : 42");
            sepatu1.setGambar("adidas_ultraboostlight_shoes");

            Intent intent = new Intent(slide2.this, DetailB.class);
            intent.putExtra(DetailB.KEY_DATA, sepatu1);
            startActivity(intent);
        }
    }
}