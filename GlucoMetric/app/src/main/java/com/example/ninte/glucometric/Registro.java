package com.example.ninte.glucometric;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Registro extends AppCompatActivity {

    Button btnSgte, btnVolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        btnSgte = (Button)findViewById(R.id.btnAceptar);
        btnSgte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Registro.this, Registros.class);
                startActivity(intent);
            }
        });
        btnVolver = (Button)findViewById(R.id.btnCancelar);
        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentar = new Intent(Registro.this, Inicio.class);
                startActivity(intentar);
            }
        });

    }
}
