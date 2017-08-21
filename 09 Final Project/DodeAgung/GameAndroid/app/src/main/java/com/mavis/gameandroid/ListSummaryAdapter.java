package com.mavis.gameandroid;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dode Agung on 18-Aug-17.
 */

public class ListSummaryAdapter extends RecyclerView.Adapter<ListSummaryHolder> {
   private List<DataListScore> list = new ArrayList<>();

    public ListSummaryAdapter(List<DataListScore> list) {
        this.list = list;
    }

    @Override
    public ListSummaryHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.item_score_layout, parent, false);

        return new ListSummaryHolder(view);
    }

    @Override
    public void onBindViewHolder(ListSummaryHolder holder, int position) {
        holder.bind(list.get(position));
    }



    @Override
    public int getItemCount() {
        return list.size();
    }
}
