package com.omrobbie.intent;

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

        // TODO: (3) Deklarasikan SharedPreferences

        // TODO: (4) Cek apakah user sudah pernah login sebelumnya

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtUsername.getText().toString().isEmpty() || txtPassword.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Mohon melengkapi data username dan password pada form ini", Toast.LENGTH_SHORT).show();
                } else {

                    // TODO: (6) Simpan data login ke shared preferences

                    // TODO: (7) Panggil method untuk menuju ke halaman selanjutnya
                }
            }
        });
    }

    // TODO: (5) Buatlah method baru untuk menuju ke halaman selanjutnya
}
