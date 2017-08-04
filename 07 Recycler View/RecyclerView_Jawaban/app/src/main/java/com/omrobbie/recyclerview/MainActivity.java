package com.omrobbie.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // COMPLETED: (21) Deklarasikan komponen RecyclerView dari layout
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        // COMPLETED: (22) Setup dummy data
        List<Data> list = new ArrayList<>();
        list.add(new Data(R.mipmap.ic_launcher, "Data 1", "Ini data ke 1"));
        list.add(new Data(R.mipmap.ic_launcher, "Data 2", "Ini data ke 2"));
        list.add(new Data(R.mipmap.ic_launcher, "Data 3", "Ini data ke 3"));
        list.add(new Data(R.mipmap.ic_launcher, "Data 4", "Ini data ke 4"));
        list.add(new Data(R.mipmap.ic_launcher, "Data 5", "Ini data ke 5"));

        // COMPLETED: (23) Deklarasikan adapter
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(list);

        // COMPLETED: (24) Set layout manager
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // COMPLETED: (25) Set adapter untuk RecyclerView
        recyclerView.setAdapter(adapter);
    }
}
