package biz.intermediaweb.splashscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.my_option_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.pengaturan:
                Intent pengaturan = new Intent(MainActivity.this, PengaturanActivity.class);
                startActivity(pengaturan);
                return true;
            case R.id.versi:
                Intent versi = new Intent(MainActivity.this, VersiActivity.class);
                startActivity(versi);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton belajar = (ImageButton) findViewById(R.id.btnbelajar);
        ImageButton quiz = (ImageButton) findViewById(R.id.btnquiz);
        ImageButton tentang = (ImageButton) findViewById(R.id.btntentang);
        ImageButton keluar = (ImageButton) findViewById(R.id.btnkeluar);



        belajar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(MainActivity.this, BelajarActivity.class);
                startActivity(myIntent);

            }
        });

        quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(MainActivity.this, QuizActivity.class);
                startActivity(myIntent);

            }
        });

        tentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(MainActivity.this, TentangActivity.class);
                startActivity(myIntent);

            }
        });

        keluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();
                System.exit(0);

            }
        });


    }

}
