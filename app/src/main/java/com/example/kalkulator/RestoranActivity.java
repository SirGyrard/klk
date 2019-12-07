package com.example.kalkulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class RestoranActivity extends AppCompatActivity {

    private int Nomor = 0;
    private EditText etMakanan,etQty,etHarga;
    private Button btnSimpan;

    //Untuk Adapter
    private RecyclerView recyclerView;
    private RiwayatAdapter adapter;
    private ArrayList<String> list = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //tampilannya bisa di lihat disin
        setContentView(R.layout.activity_restoran);

        //memanggil id
        etMakanan = findViewById(R.id.etMakanan);
        etQty = findViewById(R.id.etQty);
        etHarga = findViewById(R.id.etHarga);
        btnSimpan = findViewById(R.id.btnSimpan);

        //inisiasi recycle
        recyclerView = findViewById(R.id.recyclerView);
        adapter = new RiwayatAdapter(list);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(RestoranActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

        //event Klik button
        btnSimpan.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                for(int i = 0;  i < list.size(); i++){
                    i=Nomor;
                }
                //Ambil Data
                String makanan = etMakanan.getText().toString();
                String qty = etQty.getText().toString();
                String harga = etHarga.getText().toString();
                Nomor ++;


                list.add(Nomor+"." + " " + makanan + " ("+qty+")" + " @ " + harga);
                adapter.notifyDataSetChanged();

                Toast.makeText(RestoranActivity.this, "Berhasil", Toast.LENGTH_SHORT).show();
            }

        });


    }
}
