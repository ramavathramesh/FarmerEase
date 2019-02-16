package com.example.rameshnayak.farmerease;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Ramesh Nayak on 22-Oct-18.
 */

public class Customer_recycler_details_list  extends ArrayAdapter<CustomerModelclass> {
    private Activity context;
    private List<CustomerModelclass> customerlist;

    public Customer_recycler_details_list(Activity context , List<CustomerModelclass> customerlist) {
        super(context,R.layout.customer_recycler_details,customerlist);
        this.context=context;
        this.customerlist = customerlist;
    }


    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View listViewItem=inflater.inflate(R.layout.customer_recycler_details,null,true);

        TextView name=(TextView) listViewItem.findViewById(R.id.customername);
        TextView vegnames=(TextView) listViewItem.findViewById(R.id.cus_vegname);

        CustomerModelclass customerModelclass=customerlist.get(position);

        name.setText(customerModelclass.getName());

        vegnames.setText(customerModelclass.getVegitem());


        return listViewItem;

    }

}
