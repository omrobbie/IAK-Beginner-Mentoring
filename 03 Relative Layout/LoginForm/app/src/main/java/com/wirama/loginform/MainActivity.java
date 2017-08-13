package com.wirama.loginform;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private EditText txtUsername;
    private EditText txtPassword;
    private Button btnLogin;
    private Button btnBatal;


    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.login_ikon);
        txtUsername = (EditText) findViewById(R.id.user_name);
        txtPassword = (EditText) findViewById(R.id.password);
        btnLogin=(Button)findViewById(R.id.login_button);
        btnBatal=(Button) findViewById(R.id.batal_button) ;

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (txtUsername.getText().toString().isEmpty()|| (txtPassword.getText().toString().isEmpty())) {

                    Toast.makeText(MainActivity.this, "Masukan User Name Dan Password!", Toast.LENGTH_LONG).show();


                }
                else {
                    //Toast.makeText(MainActivity.this, "Sukses", Toast.LENGTH_LONG).show();

                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                    intent.putExtra("namauser",txtUsername.getText().toString());
                    startActivity(intent);
                }
            }
        });

        btnBatal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v,"Tombol Batal!!",Snackbar.LENGTH_LONG).show();
            }
        });


    }
}
