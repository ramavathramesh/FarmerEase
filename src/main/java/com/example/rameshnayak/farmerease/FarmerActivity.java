package com.example.rameshnayak.farmerease;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class FarmerActivity extends AppCompatActivity {


    private FloatingActionButton fab_farmeractivity;
   DatabaseReference farmerdatabase;
   DatabaseReference myRef;

   private ListView listView;

//      ListView listviewfarmer;

    List<FarmerModelFirebase> farmerlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farmer);

        listView = (ListView) findViewById(R.id.listview_farmeractivity);
        farmerdatabase = FirebaseDatabase.getInstance().getReference("farmer");
        farmerlist = new ArrayList<>();



        fab_farmeractivity = (FloatingActionButton) findViewById(R.id.fab_farmeractivity);
        fab_farmeractivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(FarmerActivity.this,Farmer_vegitem.class);
                startActivity(in);
            }
        });





    }

    protected void onStart(){

        super.onStart();

        farmerdatabase.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                for(DataSnapshot farmersnapshot : dataSnapshot.getChildren()){

                    FarmerModelFirebase farmerModelFirebase=farmersnapshot.getValue(FarmerModelFirebase.class);
                    farmerlist.add(farmerModelFirebase);
                }

             Farmer_recycler_details_list adapter=new Farmer_recycler_details_list(FarmerActivity.this,farmerlist);


                listView.setAdapter(adapter);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


    }












      /*farmerdatabase= FirebaseDatabase.getInstance().getReference("farmer");

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview_farmeractivity);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        listviewfarmer=(ListView) findViewById(R.id.listview_farmeractivity);

        farmerlist=new ArrayList<>();

        fab_farmeractivity = (FloatingActionButton) findViewById(R.id.fab_farmeractivity);
        fab_farmeractivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(FarmerActivity.this,Farmer_vegitem.class);
                startActivity(in);
            }
        });



*/
    }









