package com.mavis.gameandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class TapImageMainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tap_image_main);
        Button btnStart = (Button) findViewById(R.id.btnStart);
        btnStart.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                // Toast.makeText(getBaseContext(), "yes, you right", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(TapImageMainActivity.this, ScoreCounterActivity.class);
                startActivity(intent);
            }
        });
    }


}
