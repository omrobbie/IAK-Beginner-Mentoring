package com.wirama.zodiak;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private EditText txtUsername;
    private EditText txtlahir;
    private Button btnLogin;
    private RadioGroup rgjk;
    private DatePickerDialog dtpicker;
    private SimpleDateFormat dateFormatter;



    public void showDateDialog(){
        Calendar newCalendar = Calendar.getInstance();
        dtpicker = new DatePickerDialog(this,new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                Calendar newDate = Calendar.getInstance();
                newDate.set(i,i1,i2);
                txtlahir.setText(dateFormatter.format(newDate.getTime()));
            }
        }, newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));
        dtpicker.show();
    }


    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("=====ZODIAK=====");
        getSupportActionBar().setSubtitle("Selamat Datang");




        imageView = (ImageView) findViewById(R.id.login_ikon);
        txtUsername = (EditText) findViewById(R.id.user_name);
        txtlahir = (EditText) findViewById(R.id.tgl_lhr);
        btnLogin=(Button)findViewById(R.id.login_button);
        rgjk = (RadioGroup) findViewById(R.id.jk);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int gender = rgjk.getCheckedRadioButtonId();
                RadioButton jk = (RadioButton) findViewById(gender);

                Intent intent = new Intent(MainActivity.this, zodiak.class);
                intent.putExtra("namauser",txtUsername.getText().toString());
                intent.putExtra("jk", String.valueOf(jk.getText().toString()));
                intent.putExtra("tgllhr",txtlahir.getText().toString());
                startActivity(intent);
            }
        });

        dateFormatter = new SimpleDateFormat("dd/MM/yyyy", Locale.US);
        txtlahir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog();
            }
        });


    }
}
