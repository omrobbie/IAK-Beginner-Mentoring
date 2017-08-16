package com.omrobbie.recyclerview2;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

// COMPLETED: (13) Buatlah class adapter untuk nanti digunakan oleh RecyclerView dengan cara
// extends kelas ini dengan RecyclerView.Adapter

// COMPLETED: (19) Masukkan ViewHolder kedalam Adapter
public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder> {

    // COMPLETED: (21) Buatlah variabel untuk menampung semua item data ke dalam List
    List<ItemData> itemDatas;

    // COMPLETED: (22) Generate constuctor
    public ItemAdapter(List<ItemData> itemDatas) {
        this.itemDatas = itemDatas;
    }

    // COMPLETED: (14) Buatlah static class untuk menampung ViewHolder dengan cara
    // extends kelas ini dengan RecyclerView.ViewHolder

    // COMPLETED: (30) Implement View.OnClickListener
    public static class ItemViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        // COMPLETED: (16) Buatlah variabel penampung data dari layout
        private ImageView item_photo;
        private TextView item_title;

        // COMPLETED: (15) Generate implements method dari RecyclerView.ViewHolder
        public ItemViewHolder(View itemView) {
            super(itemView);

            // COMPLETED: (17) Deklarasikan semua komponen yang digunakan dalam layout item_data.xml
            item_photo = (ImageView) itemView.findViewById(R.id.item_photo);
            item_title = (TextView) itemView.findViewById(R.id.item_title);

            // COMPLETED: (33) Pasang setOnClickListener pada itemView
            itemView.setOnClickListener(this);
        }

        // COMPLETED: (18) Buatlah method sebagai penyambung ke data adapter, berikan parameter berupa data model
        // biasanya method ini diberi nama "bind"
        public void bind (ItemData itemData) {
            item_photo.setImageResource(itemData.getItem_photo());
            item_title.setText(itemData.getItem_title());
        }

        // COMPLETED: (31) Generate dari View.OnClickListener
        @Override
        public void onClick(View view) {
            // COMPLETED: (32) Tampilkan item data melalui Toast
            Toast.makeText(view.getContext(), "Anda mengklik " + item_title.getText().toString(), Toast.LENGTH_SHORT).show();
        }
    }

    // COMPLETED: (20) Generate implements method dari RecyclerView.Adapter
    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // COMPLETED: (23) Inflate layout ke item_data.xml
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_data, parent, false);

        ItemViewHolder itemViewHolder = new ItemViewHolder(view);
        return itemViewHolder;
    }

    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {
        // COMPLETED: (24) Set item data ke posisi masing-masing
        ItemData itemData = itemDatas.get(position);
        holder.bind(itemData);
    }

    @Override
    public int getItemCount() {
        // COMPLETED: (25) Set total dari keseluruhan item data
        return itemDatas.size();
        Toast.makeText(, "", Toast.LENGTH_SHORT).show();
    }
}
