package com.omrobbie.loginform;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.bumptech.glide.Glide;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

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
                // COMPLETED: (13) Panggil method getRandomUser
                getRandomUser();
            }
        });
    }

    // COMPLETED: (3) Buatlah method untuk mendapatkan data random user API
    private void getRandomUser() {
        // COMPLETED: (4) Panggil Volley.newRequestQueue
        final RequestQueue requestQueue = Volley.newRequestQueue(this);

        String urlAPI = "https://randomuser.me/api/";

        // COMPLETED: (5) Buatlah StringRequest berdasarkan urlAPI diatas
        // Pastikan memiliki new Response.Listener dan new Response.ErrorListener
        StringRequest stringRequest = new StringRequest(Request.Method.GET, urlAPI,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        try {
                            // COMPLETED: (7) Deklarasi API Response
                            JSONObject APIResponse = new JSONObject(response);

                            // COMPLETED: (8) Deklasari "results" array dari API
                            JSONArray results = (JSONArray) APIResponse.get("results");

                            // COMPLETED: (9) Ambil keseluruhan data (array pertama) dari data "results"
                            JSONObject results_item = (JSONObject) results.get(0);

                            // COMPLETED: (10) Ambil data login dan picture dari item data diatas
                            JSONObject results_item_login = (JSONObject) results_item.get("login");
                            JSONObject results_item_picture = (JSONObject) results_item.get("picture");

                            // COMPLETED: (11) Jika data ada, masukkan kedalam komponen masing-masing
                            Glide.with(MainActivity.this)
                                    .load(results_item_picture.getString("medium"))
                                    .into(imgPicture);
                            txtUsername.setText(results_item_login.getString("username"));
                            txtPassword.setText(results_item_login.getString("password"));

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                    }
                },

                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        // COMPLETED: (6) Tampilkan pesan error dengan Toast
                        Toast.makeText(MainActivity.this, error.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }
        );

        // COMPLETED: (12) Masukkan data request kedalam queue
        requestQueue.add(stringRequest);
    }
}
