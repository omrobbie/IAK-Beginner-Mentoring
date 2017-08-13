package com.omrobbie.intent;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView login_username = (TextView) findViewById(R.id.login_username);

        sharedPreferences = getSharedPreferences("login_data", MODE_PRIVATE);
        login_username.setText(sharedPreferences.getString("username", null));

    }

    // TODO: (3) Override onCreateOptionMenu

        // TODO: (4) Inflate layout menu


    // TODO: (5) Override onOptionsItemSelected

                // TODO: (6) Hapus semua data dalam shared preferences

                // TODO: (7) Pindah ke layout utama
}

// TODO: (1) Buatlah layout untuk menu item di folder /res/menu
// TODO: (2) Buatlah item menu untuk action logout, beri icon dan id
