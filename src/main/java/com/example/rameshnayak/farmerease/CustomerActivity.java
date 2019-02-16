package com.example.rameshnayak.farmerease;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

public class CustomerActivity extends AppCompatActivity {

    private FloatingActionButton fab_customreactivity;
    RecyclerView recyclerView_customeractivity;
    DatabaseReference farmerdatabase;
    DatabaseReference myRef;
    private ListView listView;
    List<CustomerModelclass> customerlist;
    private ProgressDialog progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer);

        listView = (ListView) findViewById(R.id.listview_customeractivity);
        farmerdatabase = FirebaseDatabase.getInstance().getReference("buyer");
        customerlist = new ArrayList<>();


        fab_customreactivity = (FloatingActionButton) findViewById(R.id.fab_customeractivity);

        fab_customreactivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(CustomerActivity.this,Customer_vegitem.class);
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

                    CustomerModelclass customerModelclass=farmersnapshot.getValue(CustomerModelclass.class);
                    customerlist.add(customerModelclass);
                }

                Customer_recycler_details_list adapter=new Customer_recycler_details_list(CustomerActivity.this,customerlist);


                listView.setAdapter(adapter);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


    }











}
