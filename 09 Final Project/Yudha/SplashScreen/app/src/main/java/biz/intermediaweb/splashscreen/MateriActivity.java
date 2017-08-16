package biz.intermediaweb.splashscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MateriActivity extends AppCompatActivity {

    ImageView gambarMateri;
    TextView deskripsi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi);

        gambarMateri = (ImageView) findViewById(R.id.gambar);
        deskripsi = (TextView) findViewById(R.id.desc);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null){
            deskripsi.setText(bundle.getString("MateriBelajar"));
        };
    }
}
