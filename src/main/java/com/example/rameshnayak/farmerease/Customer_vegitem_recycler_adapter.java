package com.example.rameshnayak.farmerease;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Ramesh Nayak on 20-Oct-18.
 */

public class Customer_vegitem_recycler_adapter extends RecyclerView.Adapter<Customer_vegitem_recycler_adapter.Customer_vegitem>{



    String data[];
    int image[];
    Context ctx;
    public String item;



    public Customer_vegitem_recycler_adapter(Context ct,String s1[],int im1[]){
        ctx=ct;
        data=s1;
        image=im1;

    }
    @NonNull
    @Override
    public Customer_vegitem_recycler_adapter.Customer_vegitem onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater myinflater=LayoutInflater.from(ctx);
        View myownview=myinflater.inflate(R.layout.customer_vegitem_row_item,parent,false);

        return new Customer_vegitem_recycler_adapter.Customer_vegitem(myownview);

    }

    @Override
    public void onBindViewHolder(@NonNull Customer_vegitem_recycler_adapter.Customer_vegitem holder, int position) {
        holder.t1.setText(data[position]);
        holder.imageView.setImageResource(image[position]);

    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class Customer_vegitem extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView t1;
        ImageView imageView;

        private AdapterView.OnItemClickListener itemClickListener;

        public Customer_vegitem(View itemView) {
            super(itemView);

            itemView.setOnClickListener(this);


            t1 = (TextView) itemView.findViewById(R.id.customer_vegtiem_text);
            imageView = (ImageView) itemView.findViewById(R.id.customer_vegtiem_image);

        }

        public void onClick(View view) {

            //    Toast.makeText(ctx,"hello",Toast.LENGTH_SHORT).show();


            int place=getAdapterPosition();
            item=data[place];
            Intent intent = new Intent(ctx, Customer_vegitem_kg.class);
            intent.putExtra("KEY",item);
            ctx.startActivity(intent);


        }
    }
}