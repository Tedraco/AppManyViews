package com.example.appmanyviews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnOperaciones, btnSalud;
    Button btnSalir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOperaciones = (Button) findViewById(R.id.btnOperaciones);
        btnSalud = (Button) findViewById(R.id.btnSalud);
        btnSalir = (Button) findViewById(R.id.btnSalir);

        btnOperaciones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LlamarOperaciones();
            }
        });

        btnSalud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LlamarSalud();
            }
        });

        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void LlamarOperaciones()
    {
        Intent vOperaciones = new Intent(MainActivity.this, Operaciones.class);
        startActivity(vOperaciones);
    }

    private void LlamarSalud()
    {
        Intent vSalud = new Intent(MainActivity.this, Salud.class);
        startActivity(vSalud);
    }
}