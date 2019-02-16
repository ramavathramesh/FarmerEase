package com.example.rameshnayak.farmerease;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;


/**
 * Created by Ramesh Nayak on 22-Oct-18.
 */

public class ViewHolder extends RecyclerView.ViewHolder{

    View mView;
    public ViewHolder(View itemView){
        super(itemView);
        mView = itemView;
    }

    public void seeDdetails(Context ctx,String title,String desc, String image){


        TextView mTitleView=mView.findViewById(R.id.rTitleTv);
        TextView mDetailTv=mView.findViewById(R.id.rDescriptionTv);
        ImageView mImageTv=mView.findViewById(R.id.rImageView);

        mTitleView.setText(title);
        mDetailTv.setText(desc);
        Picasso.get().load(image).into(mImageTv);

    }

}
