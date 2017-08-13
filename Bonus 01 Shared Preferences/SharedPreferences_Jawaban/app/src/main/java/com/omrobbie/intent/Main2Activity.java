package com.omrobbie.intent;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // COMPLETED: (8) Deklarasikan seluruh komponen dari layout ke dua
        TextView login_username = (TextView) findViewById(R.id.login_username);
        Button btnLogout = (Button) findViewById(R.id.btnLogout);

        // COMPLETED: (9) Deklarasikan SharedPreferences
        final SharedPreferences sharedPreferences = getSharedPreferences("login_data", MODE_PRIVATE);
        login_username.setText(sharedPreferences.getString("username", null));

        // COMPLETED: (10) Deklarasikan setOnClickListener
        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // COMPLETED: (11) Bersihkan data login dari shared preferences
                sharedPreferences.edit().clear().commit();

                // COMPLETED: (12) Kembali ke layout utama
                Intent intent = new Intent(Main2Activity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
