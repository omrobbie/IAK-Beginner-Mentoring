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

        SharedPreferences sharedPreferences = getSharedPreferences("login_data", MODE_PRIVATE);
        final SharedPreferences.Editor login_data = sharedPreferences.edit();

        String login_username = sharedPreferences.getString("username", null);
        if (login_username != null) gotoWelcomeScreen();

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtUsername.getText().toString().isEmpty() || txtPassword.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Mohon melengkapi data username dan password pada form ini", Toast.LENGTH_SHORT).show();
                } else {

                    login_data.putString("username", txtUsername.getText().toString());
                    login_data.commit();

                    gotoWelcomeScreen();
                }
            }
        });
    }

    private void gotoWelcomeScreen() {
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(intent);
        finish();
    }
}
