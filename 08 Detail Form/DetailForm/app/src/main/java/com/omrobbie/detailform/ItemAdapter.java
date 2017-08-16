package com.omrobbie.detailform;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.omrobbie.recyclerview2.R;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder> {

    List<ItemData> itemDatas;

    public ItemAdapter(List<ItemData> itemDatas) {
        this.itemDatas = itemDatas;
    }

    public static class ItemViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private ImageView item_photo;
        private TextView item_title;

        // TODO: (3) Buat variabel untuk menampung data context

        public ItemViewHolder(View itemView) {
            super(itemView);

            item_photo = (ImageView) itemView.findViewById(R.id.item_photo);
            item_title = (TextView) itemView.findViewById(R.id.item_title);

            itemView.setOnClickListener(this);

            // TODO: (4) Set variabel context dengan itemView
        }

        public void bind (ItemData itemData) {
            int resID = itemData.getItem_photo();

            item_photo.setTag(resID);
            item_photo.setImageResource(resID);

            item_title.setText(itemData.getItem_title());
        }

        @Override
        public void onClick(View view) {

            // TODO: (5) Deklarasikan intent ke layout ke dua

            // TODO: (6) Set data yang akan di parsing ke layout ke dua

            // TODO: (7) Panggil method startActivity
        }
    }

    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_data, parent, false);

        ItemViewHolder itemViewHolder = new ItemViewHolder(view);
        return itemViewHolder;
    }

    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {
        ItemData itemData = itemDatas.get(position);
        holder.bind(itemData);
    }

    @Override
    public int getItemCount() {
        return itemDatas.size();
    }
}
