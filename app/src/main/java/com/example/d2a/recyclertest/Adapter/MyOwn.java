package com.example.d2a.recyclertest.Adapter;

import android.content.Context;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.d2a.recyclertest.R;

/**
 * Created by D2A on 10/11/2017.
 */

public class MyOwn extends RecyclerView.Adapter<MyOwn.MyOwnHolder> {

    String data1[], data2[];
    int img[];
    Context context2;

    public MyOwn(Context context, String animals[], String desc[], int imageRes[]) {
        context2 = context;
        data1 = animals;
        data2 = desc;
        img = imageRes;
    }

    @Override
    public MyOwnHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context2);
        View myOwnView = inflater.inflate(R.layout.my_row,parent,false);
        return new MyOwnHolder(myOwnView);
    }

    @Override
    public void onBindViewHolder(MyOwnHolder holder, int position) {
        holder.animals.setText(data1[position]);
        holder.desc.setText(data2[position]);
        holder.image.setImageResource(img[position]);
    }

    @Override
    public int getItemCount() {
        return data1.length;
    }

    public class MyOwnHolder extends RecyclerView.ViewHolder {
        TextView animals, desc;
        ImageView image;
        public MyOwnHolder(View itemView) {
            super(itemView);
            animals = (TextView)itemView.findViewById(R.id.myText);
            desc = (TextView)itemView.findViewById(R.id.myText2);
            image = (ImageView)itemView.findViewById(R.id.myImage);
        }
    }
}
