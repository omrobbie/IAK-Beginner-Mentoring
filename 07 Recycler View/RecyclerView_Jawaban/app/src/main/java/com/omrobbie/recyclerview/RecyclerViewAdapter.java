package com.omrobbie.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

// COMPLETED: (14) Extends kelas ini dengan RecyclerView.Adapter<RecyclerViewHolder>
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {

    // COMPLETED: (16) Deklarasikan data ke dalam list
    private List<Data> list = new ArrayList<>();

    // COMPLETED: (17) Buatlah constructor untuk kelas ini
    public RecyclerViewAdapter(List<Data> list) {
        this.list = list;
    }

    // COMPLETED: (15) Deklarasikan overide method dari RecyclerViewHolder
    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // COMPLETED: (18) Inflate data ke layout row_item
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_item, parent, false);

        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        // COMPLETED: (19) Binding data dari holder
        holder.bind(list.get(position));
    }

    @Override
    public int getItemCount() {

        // COMPLETED: (20) Set return dengan total data di list
        return list.size();
    }
}
