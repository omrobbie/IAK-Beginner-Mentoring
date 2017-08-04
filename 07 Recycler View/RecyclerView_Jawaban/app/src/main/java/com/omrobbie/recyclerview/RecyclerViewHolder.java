package com.omrobbie.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

// COMPLETED: (9) Extends kelas ini dengan RecyclerView.ViewHolder
public class RecyclerViewHolder extends RecyclerView.ViewHolder {

    // COMPLETED: (11) Setup variabel untuk menampung data komponen dari layout row_item
    private ImageView item_image;
    private TextView item_title;
    private TextView item_description;

    // COMPLETED: (10) Buatlah constructor untuk kelas ini
    public RecyclerViewHolder(View itemView) {
        super(itemView);

        // COMPLETED: (12) Deklarasikan komponen dari layout row_item ke dalam variabel
        item_image = (ImageView) itemView.findViewById(R.id.item_image);
        item_title = (TextView) itemView.findViewById(R.id.item_title);
        item_description = (TextView) itemView.findViewById(R.id.item_description);
    }

    // COMPLETED: (13) Buat method untuk menulis data ke komponen dari row_item
    public void bind(Data data) {
        item_image.setImageResource(data.getItem_image());
        item_title.setText(data.getItem_title());
        item_description.setText(data.getItem_description());
    }
}
