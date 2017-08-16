package com.wirama.scorecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView skorA, skorB;
    private Button plus3A, plus2A, plus1A, resetA, plus3B, plus2B, plus1B, resetB;

    int hasilA, hasilB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        skorA = (TextView)findViewById(R.id.skorA);
        skorB = (TextView)findViewById(R.id.skorB);

        plus1A = (Button)findViewById(R.id.plus1A);
        plus1B = (Button)findViewById(R.id.plus1B);
        plus2A = (Button)findViewById(R.id.plus2A);
        plus2B = (Button)findViewById(R.id.plus2B);
        plus3A = (Button)findViewById(R.id.plus3A);
        plus3B = (Button)findViewById(R.id.plus3B);
        resetA = (Button)findViewById(R.id.resetA);
        resetB = (Button)findViewById(R.id.resetB);

        plus3A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hasilA = hasilA + 3;
                skorA.setText(String.valueOf(hasilA));
            }
        });

        plus3B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hasilB = hasilB + 3;
                skorB.setText(String.valueOf(hasilB));
            }
        });

        plus2A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hasilA = hasilA + 2;
                skorA.setText(String.valueOf(hasilA));
            }
        });

        plus2B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hasilB = hasilB + 2;
                skorB.setText(String.valueOf(hasilB));
            }
        });

        plus1A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hasilA = hasilA + 1;
                skorA.setText(String.valueOf(hasilA));
            }
        });

        plus1B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hasilB = hasilB + 1;
                skorB.setText(String.valueOf(hasilB));
            }
        });

        resetA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hasilA = 0;
                skorA.setText(String.valueOf(hasilA));
            }
        });

        resetB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hasilB = 0;
                skorB.setText(String.valueOf(hasilB));
            }
        });
    }
}
