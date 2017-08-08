package com.omrobbie.intent;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

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

    // COMPLETED: (3) Override onCreateOptionMenu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // COMPLETED: (4) Inflate layout menu
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    // COMPLETED: (5) Override onOptionsItemSelected
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_1:
                Toast.makeText(this, "Anda mengklik menu 1", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu_2:
                Toast.makeText(this, "Anda mengklink menu 2", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu_logout:

                // COMPLETED: (6) Hapus semua data dalam shared preferences
                sharedPreferences.edit().clear().commit();

                // COMPLETED: (7) Pindah ke layout utama
                Intent intent = new Intent(Main2Activity.this, MainActivity.class);
                startActivity(intent);
                finish();

                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}

// COMPLETED: (1) Buatlah layout untuk menu item di folder /res/menu
// COMPLETED: (2) Buatlah item menu untuk action logout, beri icon dan id
