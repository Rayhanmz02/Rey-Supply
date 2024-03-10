package com.example.reysupply;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public class Detail extends AppCompatActivity implements Parcelable {
    private String Name;
    private String Price;
    private String Desk;
    private String Color;
    private String Type;
    private String Size;
    private String Gambar;
    protected Detail(Parcel in) {

        Name = in.readString();
        Price = in.readString();
        Desk = in.readString();
        Color = in.readString();
        Type = in.readString();
        Size = in.readString();
        Gambar = in.readString();
           }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getDesk() {
        return Desk;
    }

    public void setDesk(String desk) {
        Desk = desk;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String size) {
        Size = size;
    }

    public String getGambar() {
        return Gambar;
    }

    public void setGambar(String gambar) {
        Gambar = gambar;
    }

    public static final Creator<Detail> CREATOR = new Creator<Detail>() {
        @Override
        public Detail createFromParcel(Parcel in) {
            return new Detail(in);
        }

        @Override
        public Detail[] newArray(int size) {
            return new Detail[size];
        }
    };

    public Detail() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeString(Name);
        dest.writeString(Price);
        dest.writeString(Desk);
        dest.writeString(Color);
        dest.writeString(Type);
        dest.writeString(Size);
        dest.writeString(Gambar);

    }
}