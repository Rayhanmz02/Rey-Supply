package com.example.reysupply;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class slide3 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide3);

        ImageView nb1 = findViewById(R.id.ivc1);
        ImageView nb2 = findViewById(R.id.ivc2);
        ImageView nb3 = findViewById(R.id.ivc3);
        ImageView nb4 = findViewById(R.id.ivc4);
        ImageView nb5 = findViewById(R.id.ivc5);

        nb1.setOnClickListener(this);
        nb2.setOnClickListener(this);
        nb3.setOnClickListener(this);
        nb4.setOnClickListener(this);
        nb5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.ivc1) {
            Detail sepatu1 = new Detail();
            sepatu1.setName("NB 520 V8");
            sepatu1.setPrice("Rp. 1,199,000");
            sepatu1.setDesk("   Our men's 520v8 is made for the comfort seekers also looking for a great performance design.This shoe takes inspiration from high-end running shoes while ensuring that comfort and support are the priority. ");
            sepatu1.setColor("Color : Black");
            sepatu1.setType("Type : Running ");
            sepatu1.setSize("Size : 41");
            sepatu1.setGambar("nb_520_v8");

            Intent intent = new Intent(slide3.this, DetailB.class);
            intent.putExtra(DetailB.KEY_DATA, sepatu1);
            startActivity(intent);
        }
        if (v.getId() == R.id.ivc2) {
            Detail sepatu1 = new Detail();
            sepatu1.setName("NB 550 Sneakers");
            sepatu1.setPrice("Rp. 2,099,000");
            sepatu1.setDesk("   The return of a legend. Originally worn by pros, the new 550 pays tribute to the 1989 original with classic details reminiscent of the era - simple, clean and true to its legacy. ");
            sepatu1.setColor("Color : White");
            sepatu1.setType("Type : Running ");
            sepatu1.setSize("Size : 43");
            sepatu1.setGambar("nb_550_mens_sneakers_shoes");

            Intent intent = new Intent(slide3.this, DetailB.class);
            intent.putExtra(DetailB.KEY_DATA, sepatu1);
            startActivity(intent);
        }
        if (v.getId() == R.id.ivc3) {
            Detail sepatu1 = new Detail();
            sepatu1.setName("NB 1180 fresh foam x 1080 v13");
            sepatu1.setPrice("Rp. 2,799,000");
            sepatu1.setDesk("   If we only made one running shoe, that shoe would be the 1080. What makes the 1080 unique isn’t just that it’s the best running shoe we make, it’s also the most versatile.   ");
            sepatu1.setColor("Color : Black");
            sepatu1.setType("Type : Running ");
            sepatu1.setSize("Size : 41");
            sepatu1.setGambar("nb_1080_fresh_foam_x_1080_v13");

            Intent intent = new Intent(slide3.this, DetailB.class);
            intent.putExtra(DetailB.KEY_DATA, sepatu1);
            startActivity(intent);
        }
        if (v.getId() == R.id.ivc4) {
            Detail sepatu1 = new Detail();
            sepatu1.setName("NB Fresh Foam X More Trail V3");
            sepatu1.setPrice("Rp. 2,599,000");
            sepatu1.setDesk("   Whether you're hitting the trails for training or just to enjoy the scenery, you can keep your feet cool, comfortable, and cushioned in the New Balance Fresh Foam X Trail More v3. ");
            sepatu1.setColor("Color : Black and Grey");
            sepatu1.setType("Type : Running ");
            sepatu1.setSize("Size : 42");
            sepatu1.setGambar("nb_fresh_foam_x_more_trail_v3");

            Intent intent = new Intent(slide3.this, DetailB.class);
            intent.putExtra(DetailB.KEY_DATA, sepatu1);
            startActivity(intent);
        }
        if (v.getId() == R.id.ivc5) {
            Detail sepatu1 = new Detail();
            sepatu1.setName("NB Made In Us Teddy");
            sepatu1.setPrice("Rp. 4,499,000");
            sepatu1.setDesk("   Proof that quality still exists, our Made in the USA 990v6 is the ultimate blend of performance and style. Made without compromise, the 990v6 is a staple of both morning runs and fashion runways. ");
            sepatu1.setColor("Color : White");
            sepatu1.setType("Type : Running ");
            sepatu1.setSize("Size : 42");
            sepatu1.setGambar("nb_made_in_us_teddy_990v6");

            Intent intent = new Intent(slide3.this, DetailB.class);
            intent.putExtra(DetailB.KEY_DATA, sepatu1);
            startActivity(intent);
        }
    }
}