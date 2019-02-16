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

public class Farmer_vegitem_kg extends AppCompatActivity {

    EditText name;
    EditText phone;
    EditText quantity;
    Button submit;
    public String vegitem;
DatabaseReference farmerdatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farmer_vegitem_kg);


        Intent intent = getIntent();

       vegitem = intent.getStringExtra("KEY");


        farmerdatabase= FirebaseDatabase.getInstance().getReference("farmer");

        name=(EditText)findViewById(R.id.name);
        phone=(EditText)findViewById(R.id.phone);
        quantity=(EditText)findViewById(R.id.quantity);

         submit =(Button)findViewById(R.id.send);



        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               farmeradd(vegitem);
            }
        });
    }
private void farmeradd(String vegitem){
        String nameadd=name.getText().toString().trim();
        String phoneadd=phone.getText().toString().trim();
        String quantityadd=quantity.getText().toString().trim();

        String vegitems=vegitem.toString().trim();



        if(!TextUtils.isEmpty(nameadd)){

            if(!TextUtils.isEmpty(phoneadd)){
                if(!TextUtils.isEmpty(quantityadd)){


                   String id= farmerdatabase.push().getKey();

                   FarmerModelFirebase farmerModelFirebase=new FarmerModelFirebase(id,nameadd,phoneadd,quantityadd,vegitems);
                   farmerdatabase.child(id).setValue(farmerModelFirebase);
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
