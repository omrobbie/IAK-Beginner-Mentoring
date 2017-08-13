package com.omrobbie.recyclerview2;

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

        // COMPLETED: (26) Deklarasikan RecyclerView dari layout
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        // COMPLETED: (27) Set layout manager
        recyclerView.setLayoutManager(new LinearLayoutManager(
                this,
                LinearLayoutManager.VERTICAL,
                false
        ));

        // COMPLETED: (28) Set adapter
        recyclerView.setAdapter(new ItemAdapter(getDummyData()));
    }

    // COMPLETED: (29) Buatlah dummyData
    private List<ItemData> getDummyData() {
        List<ItemData> dummyList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            ItemData itemData = new ItemData();
            itemData.setItem_photo(R.mipmap.ic_launcher);
            itemData.setItem_title("Data " + i);
            dummyList.add(itemData);
        }

        return dummyList;
    }
}
