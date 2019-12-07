package com.example.kalkulator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.widget.EditText;
import android.widget.Button;
import android.view.View;


public class perhitunganmahasiswa extends AppCompatActivity {

    private EditText etnmhs,etmp, etnilai;
    private Button btnHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_perhitunganmahasiswa);

        etnmhs = findViewById(R.id.etnmhs);
        etmp = findViewById(R.id.etmp);
        etnilai = findViewById(R.id.etnilai);
        btnHitung = findViewById(R.id.btnHitung);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(this, perhitunganmahasiswa.class);
                i.putExtra("nama", "Gerald");
                i.putExtra("pelajaran", "ANDROID");
                i.putExtra("nilai", "89");
                startActivity();
            }
        });


    }

}
