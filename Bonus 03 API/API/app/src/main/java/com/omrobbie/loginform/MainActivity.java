package com.omrobbie.loginform;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imgPicture;
    private EditText txtUsername;
    private EditText txtPassword;
    private Button btnRandomUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgPicture = (ImageView) findViewById(R.id.imgPicture);
        txtUsername = (EditText) findViewById(R.id.txtUsername);
        txtPassword = (EditText) findViewById(R.id.txtPassword);
        btnRandomUser = (Button) findViewById(R.id.btnRandomUser);

        btnRandomUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO: (13) Panggil method getRandomUser
            }
        });
    }

    // TODO: (3) Buatlah method untuk mendapatkan data random user API
    private void getRandomUser() {
        // TODO: (4) Panggil Volley.newRequestQueue

        String urlAPI = "https://randomuser.me/api/";

        // TODO: (5) Buatlah StringRequest berdasarkan urlAPI diatas
        // Pastikan memiliki new Response.Listener dan new Response.ErrorListener

                            // TODO: (7) Deklarasi API Response

                            // TODO: (8) Deklasari "results" array dari API

                            // TODO: (9) Ambil keseluruhan data (array pertama) dari data "results"

                            // TODO: (10) Ambil data login dan picture dari item data diatas

                            // TODO: (11) Jika data ada, masukkan kedalam komponen masing-masing


                        // TODO: (6) Tampilkan pesan error dengan Toast

        // TODO: (12) Masukkan data request kedalam queue
    }
}
