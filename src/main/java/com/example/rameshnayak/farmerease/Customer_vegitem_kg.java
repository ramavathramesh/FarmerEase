package com.example.rameshnayak.farmerease;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Customer_vegitem_kg extends AppCompatActivity {

    EditText names;
    EditText phones;
    EditText quantitys;
    Button submits;
    public String vegitems;
    DatabaseReference farmerdatabases;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_vegitem_kg);
        Intent intent = getIntent();

        vegitems = intent.getStringExtra("KEY");


        farmerdatabases= FirebaseDatabase.getInstance().getReference("buyer");

        names=(EditText)findViewById(R.id.cus_name);
        phones=(EditText)findViewById(R.id.cus_phone);
        quantitys=(EditText)findViewById(R.id.cus_quantity);

        submits =(Button)findViewById(R.id.cus_send);



        submits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                farmeradd(vegitems);
            }
        });
    }
    private void farmeradd(String vegitem){
        String nameadds=names.getText().toString().trim();
        String phoneadds=phones.getText().toString().trim();
        String quantityadds=quantitys.getText().toString().trim();

        String vegitems=vegitem.toString().trim();



        if(!TextUtils.isEmpty(nameadds)){

            if(!TextUtils.isEmpty(phoneadds)){
                if(!TextUtils.isEmpty(quantityadds)){


                    String id= farmerdatabases.push().getKey();

                    CustomerModelclass customerModelclass=new CustomerModelclass(id,nameadds,phoneadds,quantityadds,vegitems);
                    farmerdatabases.child(id).setValue(customerModelclass);
                    Toast.makeText(this,"farmer added",Toast.LENGTH_SHORT).show();

                }
                else{
                    Toast.makeText(this,"enter quantity",Toast.LENGTH_SHORT).show();
                }
            }else{
                Toast.makeText(this,"enter phone",Toast.LENGTH_SHORT).show();
            }

        }else{
            Toast.makeText(this,"enter name",Toast.LENGTH_SHORT).show();
        }
    }
}
