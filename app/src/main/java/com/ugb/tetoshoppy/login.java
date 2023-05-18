package com.ugb.tetoshoppy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class login extends AppCompatActivity {

    Button Registro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        Registro = (Button) findViewById(R.id.btnRegistro);
        Registro.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent registro = new Intent(login.this,registros.class);
                startActivity(registro);
            }
        });
    }
}