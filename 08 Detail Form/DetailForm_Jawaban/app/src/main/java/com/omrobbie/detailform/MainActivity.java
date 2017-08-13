package com.omrobbie.detailform;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.omrobbie.recyclerview2.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(
                this,
                LinearLayoutManager.VERTICAL,
                false
        ));

        recyclerView.setAdapter(new ItemAdapter(getDummyData()));
    }

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
