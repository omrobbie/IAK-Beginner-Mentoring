package com.omrobbie.intent;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imgLogo = (ImageView) findViewById(R.id.imgLogo);
        final EditText txtUsername = (EditText) findViewById(R.id.txtUsername);
        final EditText txtPassword = (EditText) findViewById(R.id.txtPassword);

        Button btnLogin = (Button) findViewById(R.id.btnLogin);

        // COMPLETED: (3) Deklarasikan SharedPreferences
        SharedPreferences sharedPreferences = getSharedPreferences("login_data", MODE_PRIVATE);
        final SharedPreferences.Editor login_data = sharedPreferences.edit();

        // COMPLETED: (4) Cek apakah user sudah pernah login sebelumnya
        String login_username = sharedPreferences.getString("username", null);
        if (login_username != null) gotoWelcomeScreen();

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtUsername.getText().toString().isEmpty() || txtPassword.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Mohon melengkapi data username dan password pada form ini", Toast.LENGTH_SHORT).show();
                } else {

                    // COMPLETED: (6) Simpan data login ke shared preferences
                    login_data.putString("username", txtUsername.getText().toString());
                    login_data.commit();

                    // COMPLETED: (7) Panggil method untuk menuju ke halaman selanjutnya
                    gotoWelcomeScreen();
                }
            }
        });
    }

    // COMPLETED: (5) Buatlah method baru untuk menuju ke halaman selanjutnya
    private void gotoWelcomeScreen() {
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(intent);
        finish();
    }
}
