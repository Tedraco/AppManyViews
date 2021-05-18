package com.example.appmanyviews;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Operaciones extends AppCompatActivity {
    EditText etNro1, etNro2, etResultado;
    Button btnSumar, btnDividir, btnFactorial, btnPotencia, btnSeno, btnTangente, btnSalir;

    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operaciones);

        etNro1 = (EditText) findViewById(R.id.etNro1);
        etNro2 = (EditText) findViewById(R.id.etNro2);
        etResultado = (EditText) findViewById(R.id.etResultado);
        btnSumar = (Button) findViewById(R.id.btnSumar);
        btnDividir = (Button) findViewById(R.id.btnDividir);
        btnFactorial = (Button) findViewById(R.id.btnFactorial);
        btnPotencia = (Button) findViewById(R.id.btnPotencia);
        btnSeno = (Button) findViewById(R.id.btnSeno);
        btnTangente = (Button) findViewById(R.id.btnTangente);
        btnSalir = (Button) findViewById(R.id.btnSalir2);

        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sumar();
            }
        });

        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dividir();
            }
        });

        btnFactorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Factorial();
            }
        });

        btnPotencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Potencia();
            }
        });

        btnSeno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Seno();
            }
        });

        btnTangente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Tangente();
            }
        });

        btnSalir.setOnClickListener((v) -> {Salir();});
    }

    private  void Sumar()
    {
        double nro1 = Double.valueOf(etNro1.getText().toString());
        double nro2 = Double.valueOf(etNro2.getText().toString());
        double suma = nro1 + nro2;
        etResultado.setText(String.valueOf(suma));
    }

    private void Dividir()
    {
        double nro1 = Double.valueOf(etNro1.getText().toString());
        double nro2 = Double.valueOf(etNro2.getText().toString());
        if(nro2 == 0)
            etResultado.setText("Error: Division entre 0");
        else
        {
            double division = nro1 / nro2;
            etResultado.setText(String.valueOf(division));
        }
    }

    private void Factorial()
    {
        double nro1 = Double.valueOf(etNro1.getText().toString());
        double factorial = 1;
        int i=1;
        if (nro1 == 0)
            etResultado.setText(String.valueOf(factorial));
        else {
            for (i = 1; i < nro1; i++) {
                factorial = factorial + i;
            }
            etResultado.setText(String.valueOf(factorial));
        }
    }

    private void Potencia()
    {
        double nro1 = Double.valueOf(etNro1.getText().toString());
        double nro2 = Double.valueOf(etNro2.getText().toString());

        double potencia = Math.pow(nro1,nro2);
        etResultado.setText(String.valueOf(potencia));
    }

    private void Seno()
    {
        double nro1 = Double.valueOf(etNro1.getText().toString());
        double seno = Math.sin(nro1);

        etResultado.setText(String.valueOf(seno));
    }

    private void Tangente()
    {
        double nro1 = Double.valueOf(etNro1.getText().toString());
        Double tangente = Math.tan(nro1);
        etResultado.setText(String.valueOf(tangente));
    }

    private void Salir()
    {
        setContentView(R.layout.activity_main);
    }



}
