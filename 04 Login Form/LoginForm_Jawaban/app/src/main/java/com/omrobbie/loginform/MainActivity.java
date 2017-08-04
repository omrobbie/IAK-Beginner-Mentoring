package com.omrobbie.loginform;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // COMPLETED: (5) Buat variabel untuk menyimpan komponen ImageView untuk logo
    private ImageView imgLogo;

    // COMPLETED: (7) Buat variabel untuk menyimpan komponen EditText untuk username
    private EditText txtUsername;

    // COMPLETED: (9) Buat variabel untuk menyimpan komponen EditText untuk password
    private EditText txtPassword;

    // COMPLETED: (11) Buat variable untuk menyimpan komponen Button untuk login
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // COMPLETED: (6) Deklarasikan gambar logo dari layout ke variabel yang telah dibuat
        imgLogo = (ImageView) findViewById(R.id.imgLogo);

        // COMPLETED: (8) Deklarasikan kolom input username dari layout ke variabel yang telah dibuat
        txtUsername = (EditText) findViewById(R.id.txtUsername);

        // COMPLETED: (10) Deklarasikan kolom input password dari layout ke variabel yang telah dibuat
        txtPassword = (EditText) findViewById(R.id.txtPassword);

        // COMPLETED: (12) Deklarasikan tombol login dari layout ke variabel yang telah dibuat
        btnLogin = (Button) findViewById(R.id.btnLogin);

        // COMPLETED: (13) Panggil method setOnClickListener agar menangkap event klik di tombol login
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // COMPLETED: (14) Jalankan Toast untuk menampilkan pesan bahwa tombol login telah diklik
                Toast.makeText(MainActivity.this, "Anda menekan tombol Login!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
