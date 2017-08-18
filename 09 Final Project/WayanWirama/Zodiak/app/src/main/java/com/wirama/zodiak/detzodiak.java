package com.wirama.zodiak;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by ChuPAK on 8/15/2017.
 */

public class detzodiak extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detzodiak);
        getSupportActionBar().setTitle("Penjelasanya...!!");

        ImageView detail_photo = (ImageView) findViewById(R.id.det_image);
        TextView detail_title = (TextView)findViewById(R.id.det_title);
        TextView detail = (TextView)findViewById(R.id.det_discription);

        detail_photo.setImageResource(getIntent().getIntExtra("itent_image", R.mipmap.ic_launcher_round));
        detail_title.setText(getIntent().getStringExtra("itent_title"));
        detail.setText(getIntent().getStringExtra("itent_description"));
    }
}
