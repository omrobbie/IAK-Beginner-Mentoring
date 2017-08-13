package com.omrobbie.detailform;

import android.content.Context;
import android.content.Intent;
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

        // COMPLETED: (3) Buat variabel untuk menampung data context
        private Context context;

        public ItemViewHolder(View itemView) {
            super(itemView);

            item_photo = (ImageView) itemView.findViewById(R.id.item_photo);
            item_title = (TextView) itemView.findViewById(R.id.item_title);

            itemView.setOnClickListener(this);

            // COMPLETED: (4) Set variabel context dengan itemView
            context = itemView.getContext();
        }

        public void bind (ItemData itemData) {
            int resID = itemData.getItem_photo();

            item_photo.setTag(resID);
            item_photo.setImageResource(resID);

            item_title.setText(itemData.getItem_title());
        }

        @Override
        public void onClick(View view) {

            // COMPLETED: (5) Deklarasikan intent ke layout ke dua
            Intent intent = new Intent(view.getContext(), Main2Activity.class);

            // COMPLETED: (6) Set data yang akan di parsing ke layout ke dua
            intent.putExtra("item_photo", (int) item_photo.getTag());
            intent.putExtra("item_title", item_title.getText());

            // COMPLETED: (7) Panggil method startActivity
            context.startActivity(intent);
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
