package com.wirama.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

        final ListView listView = (ListView)  findViewById(R.id.listView);

        String[] data = new String[]{
                "Data 1",
                "Data 2",
                "Data 3",
                "Data 4",
                "Data 5"
        };

        ArrayAdapter<String> adapter= new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,android.R.id.text1,data);
        listView.setAdapter(adapter);

        //Menampilkan data yang di klik oleh Mouse
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                Toast.makeText(MainActivity.this, "Anda memilih " + listView.getItemAtPosition(position), Toast.LENGTH_SHORT).show();
                //menampilkan list yang di klik dengan getitematposisition
            }
        });
    }
}
