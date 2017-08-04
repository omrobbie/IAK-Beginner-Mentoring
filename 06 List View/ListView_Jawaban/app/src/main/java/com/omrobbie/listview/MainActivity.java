package com.omrobbie.listview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // COMPLETED: (2) Deklarasikan ListView dari layout
        final ListView listView = (ListView) findViewById(R.id.listView);

        // COMPLETED: (3) Buatlah 5 dummy data. Contoh: Data 1, 2, 3,...
        String[] data = new String[] {
                "Data 1",
                "Data 2",
                "Data 3",
                "Data 4",
                "Data 5"
        };

        // COMPLETED: (4) Buatlah ArrayAdapter<String>, gunakan android.R.layout.simple_list_item_1
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                data
        );

        // COMPLETED: (5) Set adapter ke ListView
        listView.setAdapter(adapter);

        // COMPLETED: (6) Panggil method setOnItemClickListener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                // COMPLETED: (7) Tampilkan data item yang di klik dengan Toast
                Toast.makeText(MainActivity.this, listView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
