package com.omrobbie.recyclerview;

import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

// TODO: (9) Extends kelas ini dengan RecyclerView.ViewHolder
public class RecyclerViewHolder extends RecyclerView.ViewHolder {


    // TODO: (11) Setup variabel untuk menampung data komponen dari layout row_item
    private ImageView image1;
    private TextView title;
    private TextView description;


    // TODO: (10) Buatlah constructor untuk kelas ini
    public RecyclerViewHolder(View itemView) {

        super(itemView);

        // TODO: (12) Deklarasikan komponen dari layout row_item ke dalam variabel
        image1 = (ImageView) itemView.findViewById(R.id.id.image1);
        title = (TextView) itemView.findViewById(R.id.title)

    }







    // TODO: (13) Buat method untuk menulis data ke komponen dari row_item
}
