package com.example.rameshnayak.farmerease;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class Customer_vegitem extends AppCompatActivity {

    RecyclerView customer_vegitem_recycler;
    String s1[];
    Customer_vegitem_recycler_adapter customer_vegitem_recycler_adapter;
    int imageresource[]={R.drawable.tomato,R.drawable.ladyfinger,R.drawable.chillies,R.drawable.carrot,R.drawable.beetroot,R.drawable.cabbage,R.drawable.cauliflower,R.drawable.onion,R.drawable.corn,R.drawable.potta};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_vegitem);

        customer_vegitem_recycler=(RecyclerView) findViewById(R.id.customer_vegitem_recycler);
        s1=getResources().getStringArray(R.array.veg);

        customer_vegitem_recycler_adapter=new Customer_vegitem_recycler_adapter(this,s1,imageresource);


        customer_vegitem_recycler.setAdapter(customer_vegitem_recycler_adapter);

        customer_vegitem_recycler.setLayoutManager(new LinearLayoutManager(this));

    }
}
