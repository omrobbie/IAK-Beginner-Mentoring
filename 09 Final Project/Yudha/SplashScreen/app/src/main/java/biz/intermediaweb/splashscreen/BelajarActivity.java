package biz.intermediaweb.splashscreen;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class BelajarActivity extends AppCompatActivity {

    ListView listView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belajar);

        listView = (ListView)findViewById(R.id.listView);

        ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(BelajarActivity.this,
                android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.learn));


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                Intent intent = new Intent(BelajarActivity.this,MateriActivity.class);
                intent.putExtra("MateriBelajar", listView.getItemAtPosition(i).toString());
                startActivity(intent);
            }
        });

        listView.setAdapter(mAdapter);

    }
}
