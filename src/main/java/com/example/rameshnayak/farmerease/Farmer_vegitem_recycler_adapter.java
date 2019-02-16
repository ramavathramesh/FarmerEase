package com.example.rameshnayak.farmerease;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.FragmentManager;
import android.support.v4.app.DialogFragment;
import android.app.LauncherActivity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
//import android.support.v4.app.Fragment;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Ramesh Nayak on 19-Oct-18.
 */

public class Farmer_vegitem_recycler_adapter extends RecyclerView.Adapter<Farmer_vegitem_recycler_adapter.VegitemHolder>  {

    String data[];
    int image[];
    Context ctx;
    public String item;



    public Farmer_vegitem_recycler_adapter(Context ct,String s1[],int im1[]){
        ctx=ct;
        data=s1;
        image=im1;

    }


    @NonNull
    @Override
    public VegitemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater myinflater=LayoutInflater.from(ctx);
        View myownview=myinflater.inflate(R.layout.farmer_vegitem_row_item,parent,false);

        return new VegitemHolder(myownview);


    }

    @Override
    public void onBindViewHolder(@NonNull Farmer_vegitem_recycler_adapter.VegitemHolder holder, int position) {
       holder.t1.setText(data[position]);
       holder.imageView.setImageResource(image[position]);



    }

    @Override
    public int getItemCount() {
        return data.length;
    }




    public class VegitemHolder extends RecyclerView.ViewHolder implements View.OnClickListener  {
        TextView t1;
        ImageView imageView;

        private AdapterView.OnItemClickListener itemClickListener;
        public VegitemHolder(View itemView) {
            super(itemView);

            itemView.setOnClickListener(this);


            t1=(TextView) itemView.findViewById(R.id.farmer_vegtiem_text);
            imageView=(ImageView) itemView.findViewById(R.id.farmer_vegtiem_image);

        }

        public void onClick(View view) {

        //    Toast.makeText(ctx,"hello",Toast.LENGTH_SHORT).show();

            int place=getAdapterPosition();
            item=data[place];
            Intent intent = new Intent(ctx, Farmer_vegitem_kg.class);
            intent.putExtra("KEY",item);
            ctx.startActivity(intent);


        }
    }


}
