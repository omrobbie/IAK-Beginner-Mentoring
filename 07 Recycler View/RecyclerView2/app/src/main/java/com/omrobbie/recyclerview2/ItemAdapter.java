package com.omrobbie.recyclerview2;

// TODO: (13) Buatlah class adapter untuk nanti digunakan oleh RecyclerView dengan cara
// extends kelas ini dengan RecyclerView.Adapter

import android.view.View;
import android.widget.Toast;

// TODO: (19) Masukkan ViewHolder kedalam Adapter
public class ItemAdapter implements View.OnClickListener {
    @Override
    public void onClick(View v) {
        Toast.makeText(, "", Toast.LENGTH_SHORT).show();
    }

    // TODO: (21) Buatlah variabel untuk menampung semua item data ke dalam List

    // TODO: (22) Generate constuctor

    // TODO: (14) Buatlah static class untuk menampung ViewHolder dengan cara
    // extends kelas ini dengan RecyclerView.ViewHolder

    // TODO: (30) Implement View.OnClickListener
    public static class ItemViewHolder {
        
 
        // TODO: (16) Buatlah variabel penampung data dari layout

        // TODO: (15) Generate implements method dari RecyclerView.ViewHolder

            // TODO: (17) Deklarasikan semua komponen yang digunakan dalam layout item_data.xml

            // TODO: (33) Pasang setOnClickListener pada itemView

        // TODO: (18) Buatlah method sebagai penyambung ke data adapter, berikan parameter berupa data model
        // biasanya method ini diberi nama "bind"

        // TODO: (31) Generate dari View.OnClickListener

            // TODO: (32) Tampilkan item data melalui Toast
    }

    // TODO: (20) Generate implements method dari RecyclerView.Adapter

        // TODO: (23) Inflate layout ke item_data.xml

        // TODO: (24) Set item data ke posisi masing-masing

        // TODO: (25) Set total dari keseluruhan item data
}
