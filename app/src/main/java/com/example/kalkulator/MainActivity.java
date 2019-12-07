package com.example.kalkulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private TextView tvHasil;
    private EditText etAngka1, etAngka2;
    private Button btnTambah, btnKurang, btnKali, btnBagi;

    //Untuk Adapter
    private RecyclerView recyclerView;
    private RiwayatAdapter adapter;
    private ArrayList<String> list = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //tampilannya bisa di liat di sini
        setContentView(R.layout.activity_main);

        //memanggil id yang ada di tampilan
        tvHasil = findViewById(R.id.tvHasil);
        etAngka1 = findViewById(R.id.etAngka1);
        etAngka2 = findViewById(R.id.etAngka2);
        btnTambah = findViewById(R.id.btnTambah);
        btnKurang = findViewById(R.id.btnKurang);
        btnKali = findViewById(R.id.btnKali);
        btnBagi = findViewById(R.id.btnBagi);

        //inisiasi Recycle
        recyclerView = findViewById(R.id.recyclerView);
        adapter = new RiwayatAdapter(list);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

        //event klik untuk button
        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //ambil data dari Edittext
                String angka1 = etAngka1.getText().toString();
                String angka2 = etAngka2.getText().toString();

                float hasil = Float.valueOf(angka1) + Float.valueOf(angka2);
                tvHasil.setText(String.valueOf(hasil));

                list.add(angka1 + "+" + angka2 + "=" + hasil);
                adapter.notifyDataSetChanged();
            }
        });

        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //ambil data dari Edittext
                String angka1 = etAngka1.getText().toString();
                String angka2 = etAngka2.getText().toString();

                float hasil = Float.valueOf(angka1) - Float.valueOf(angka2);
                tvHasil.setText(String.valueOf(hasil));

                list.add(angka1 + "-" + angka2 + "=" + hasil);
                adapter.notifyDataSetChanged();
            }
        });

        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //ambil data dari Edittext
                String angka1 = etAngka1.getText().toString();
                String angka2 = etAngka2.getText().toString();

                float hasil = Float.valueOf(angka1) * Float.valueOf(angka2);
                tvHasil.setText(String.valueOf(hasil));

                list.add(angka1 + "*" + angka2 + "=" + hasil);
                adapter.notifyDataSetChanged();
            }
        });

        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //ambil data dari Edittext
                String angka1 = etAngka1.getText().toString();
                String angka2 = etAngka2.getText().toString();

                float hasil = Float.valueOf(angka1) / Float.valueOf(angka2);
                tvHasil.setText(String.valueOf(hasil));

                list.add(angka1 + "/" + angka2 + "=" + hasil);
                adapter.notifyDataSetChanged();
            }
        });


    }
}
