package com.wirama.loginform;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView txtUser  =(TextView) findViewById(R.id.userinten);

        String username = getIntent().getStringExtra("namauser");
        txtUser.setText(username);

        //Menampilkan set Subtitle Sesuai Nama yang Login atau bisa ketik pesan
        getSupportActionBar().setSubtitle(username);

    }
}
