package com.omrobbie.detailform;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.omrobbie.recyclerview2.R;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // TODO: (8) Deklarasikan semua komponen yang ada di layout ke dua

        ImageView detail_photo = (ImageView) findViewById(R.id.detail_photo);
        TextView detail_title = (TextView) findViewById(R.id.detail_title);


        // TODO: (9) Masukkan data parsing ke komponen yang telah disediakan

        detail_photo.setImageResource(getIntent().getIntExtra("item_photo",R.mipmap.ic_launcher_round));
        detail_title.setText(getIntent().getStringExtra("item_title"));
    }
}
