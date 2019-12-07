package com.example.kalkulator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void gotoKalkulator(View view){
        //Untuk Pindah Layar
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void gotoRestoran(View view){
        //Untuk Pindah Layar
        Intent i = new Intent(this,RestoranActivity.class);
        startActivity(i);
    }
}
