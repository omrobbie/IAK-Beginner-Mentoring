package com.mavis.gameandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_list);
        ImageView detail_photo = (ImageView) findViewById(R.id.detail_photo);
        TextView detail_title = (TextView) findViewById(R.id.detail_title);
        TextView detail_score = (TextView) findViewById(R.id.detail_score);

        detail_photo.setImageResource(getIntent().getIntExtra("put_item_photo",R.mipmap.ic_launcher));
        detail_title.setText(getIntent().getStringExtra("put_item_title"));
        detail_score.setText(getIntent().getStringExtra("put_item_score"));
    }
}
