package com.omrobbie.intent;

import android.content.Intent;
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

        // COMPLETED: (1) Deklarasikan gambar logo dari layout
        ImageView imgLogo = (ImageView) findViewById(R.id.imgLogo);

        // COMPLETED: (2) Deklarasikan kolom input username dari layout
        final EditText txtUsername = (EditText) findViewById(R.id.txtUsername);

        // COMPLETED: (3) Deklarasikan kolom input password dari layout
        final EditText txtPassword = (EditText) findViewById(R.id.txtPassword);

        // COMPLETED: (4) Deklarasikan tombol login dari layout
        Button btnLogin = (Button) findViewById(R.id.btnLogin);

        // COMPLETED: (5) Panggil method setOnClickListener agar menangkap event klik dari tombol login
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // COMPLETED: (8) Cek apakah username dan password sudah dilengkapi
                if (txtUsername.getText().toString().isEmpty() || txtPassword.getText().toString().isEmpty()) {
                    // COMPLETED: (9) Jika username dan password belum lengkap, tampilkan pesan error dengan Toast
                    Toast.makeText(MainActivity.this, "Mohon melengkapi data username dan password pada form ini", Toast.LENGTH_SHORT).show();
                } else {
                    // COMPLETED: (10) Jika sudah lengkap, tampilkan activity yang baru
                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
            }
        });

        // COMPLETED: (6) Buatlah Empty Activity baru dari template
        // COMPLETED: (7) Didalam Empty Activity, tambahkan komponen TextView di tengah layar dengan tulisan "Selamat Datang"
    }
}
