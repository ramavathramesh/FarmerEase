package com.example.rameshnayak.farmerease;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class Farmer_vegitem extends AppCompatActivity {

    RecyclerView farmer_vegitem_recycler;
    String s1[];
    Farmer_vegitem_recycler_adapter farmer_vegitem_recycler_adapter;
    int imageresource[]={R.drawable.tomato,R.drawable.ladyfinger,R.drawable.chillies,R.drawable.carrot,R.drawable.beetroot,R.drawable.cabbage,R.drawable.cauliflower,R.drawable.onion,R.drawable.corn,R.drawable.potta};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farmer_vegitem);

        farmer_vegitem_recycler=(RecyclerView) findViewById(R.id.farmer_vegitem_recycler);
        s1=getResources().getStringArray(R.array.veg);

        farmer_vegitem_recycler_adapter=new Farmer_vegitem_recycler_adapter(this,s1,imageresource);


        farmer_vegitem_recycler.setAdapter(farmer_vegitem_recycler_adapter);

        farmer_vegitem_recycler.setLayoutManager(new LinearLayoutManager(this));



    }
}
