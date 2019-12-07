package com.example.kalkulator;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private EditText etUsername,etPassword;
    private Button btnLogin;



    private void tampilDialog(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);

        //Set Title Dialog
        alertDialogBuilder.setTitle("Pesan");

        //Set Pesan Dari Dialog
        alertDialogBuilder
                .setMessage("Username dan Password Salah")
                .setIcon(R.mipmap.ic_launcher)
                .setCancelable(false)
                .setPositiveButton("ya", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //Jika Tombol diklik, maka akan menutup activity ini
                        return;
                    }
                });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View v){

                String username = etUsername.getText().toString();
                String password = etPassword.getText().toString();

                if(username.equalsIgnoreCase("ADMIN")  && password.equalsIgnoreCase("ADMIN")){
                    Intent i = new Intent(LoginActivity.this,HomeActivity.class);
                    startActivity(i);
                }
                else{
                    tampilDialog();
                }



            }
        });

    }
}
