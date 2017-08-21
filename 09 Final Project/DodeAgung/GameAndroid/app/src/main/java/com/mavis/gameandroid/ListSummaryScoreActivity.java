package com.mavis.gameandroid;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ListSummaryScoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary_score);

        RecyclerView listScoreView = (RecyclerView)findViewById(R.id.idRecyclerScoreView);

        List<DataListScore> list =new ArrayList<>();

        list.add(new DataListScore(R.drawable.kickoff, "Indonesia vs Kamboja", "30 : 49"));
        list.add(new DataListScore(R.drawable.footbal, "Indonesia vs Singapure", "45 : 41"));
        list.add(new DataListScore(R.drawable.footbal, "Indonesia vs Malaysia", "50 : 40"));
        list.add(new DataListScore(R.drawable.kickoff, "Malaysia vs Singapure", "30 : 40"));
        list.add(new DataListScore(R.drawable.footbal, "Kamboja vs Singapure", "45 : 40"));
        list.add(new DataListScore(R.drawable.footbal, "Kamboja vs Malaysia", "65 : 40"));

        ListSummaryAdapter adapterScore =new ListSummaryAdapter(list);

        listScoreView.setLayoutManager(new LinearLayoutManager(this));

        listScoreView.setAdapter(adapterScore);


     }
}
