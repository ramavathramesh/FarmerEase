package com.example.rameshnayak.farmerease;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ramesh Nayak on 21-Oct-18.
 */

public class Farmer_recycler_details_list extends ArrayAdapter<FarmerModelFirebase> {


    private Activity context;
    private List<FarmerModelFirebase> farmerlist;

    public Farmer_recycler_details_list(Activity context , List<FarmerModelFirebase> farmerlist) {
        super(context,R.layout.farmer_recycler_details,farmerlist);
        this.context=context;
        this.farmerlist = farmerlist;
    }

    public View getView(int position,  View convertView,  ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View listViewItem=inflater.inflate(R.layout.farmer_recycler_details,null,true);

        TextView name=(TextView) listViewItem.findViewById(R.id.farmername);
        TextView vegnames=(TextView) listViewItem.findViewById(R.id.vegname);
        TextView phone=(TextView) listViewItem.findViewById(R.id.phoneno);
        TextView quant=(TextView) listViewItem.findViewById(R.id.quantity);


        FarmerModelFirebase farmerModelFirebase=farmerlist.get(position);

        name.setText(farmerModelFirebase.getName());


       phone.setText(farmerModelFirebase.getPhone());

        quant.setText(farmerModelFirebase.getQuantity());

        vegnames.setText(farmerModelFirebase.getVegitem());


        return listViewItem;

    }


    /*   private Activity context;
 private List<FarmerModelFirebase> artistlist;

 //ArrayAdapter<FarmerModelFirebase>

    public Farmer_recycler_details_list(Activity context , List<FarmerModelFirebase> artistlist) {
        super(context,R.layout.farmer_recycler_details);
        this.context=context;
        this.artistlist = artistlist;
    }

    @NonNull
    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
    LayoutInflater inflater=context.getLayoutInflater();
        View listViewItem=inflater.inflate(R.layout.farmer_recycler_details,null,true);

        TextView name=(TextView) listViewItem.findViewById(R.id.farmername);
        TextView vegnames=(TextView) listViewItem.findViewById(R.id.vegname);

        FarmerModelFirebase farmerModelFirebase=artistlist.get(position);

        name.setText(farmerModelFirebase.getName());

        vegnames.setText(farmerModelFirebase.getVegitem());

        return listViewItem;

    }*/


}
