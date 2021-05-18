package com.example.appmanyviews;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Salud  extends AppCompatActivity {

    Button btnCalcular, btnLimpiar, btnSalir, btnDieta;
    RadioButton rbVaron, rbMujer;
    EditText etNombre, etPeso, etAltura;

    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salud);

        etNombre = (EditText) findViewById(R.id.etNombre);
        etPeso = (EditText) findViewById(R.id.etPeso);
        etAltura = (EditText) findViewById(R.id.etAltura);
        btnCalcular = (Button) findViewById(R.id.btnCalcular);
        btnLimpiar = (Button) findViewById(R.id.btnLimpiar);
        btnSalir = (Button) findViewById(R.id.btnSalir3);
        btnDieta = (Button) findViewById(R.id.btnDieta);
        rbVaron = (RadioButton) findViewById(R.id.rbVaron);
        rbMujer = (RadioButton) findViewById(R.id.rbMujer);


        btnLimpiar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Limpiar();
            }
        });

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CalcularIMC();
            }
        });

        btnSalir.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_main);
            }
        });

        btnDieta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_dieta);
            }
        });
    }
    private void Limpiar ()
    {
        etNombre.setText("");
        etAltura.setText("");
        etPeso.setText("");
    }

    private String MensajeIMC ( double IMC)
    {
        String mensaje = "";
        if (IMC < 16)
            mensaje = "Bajo peso muy grave";
        else if (IMC >= 16 & IMC < 17)
            mensaje = "Bajo peso grave";
        else if (IMC >= 17 & IMC < 18.5)
            mensaje = "Bajo peso";
        else if (IMC >= 18.50 & IMC <25)
            mensaje = "Peso normal";
        else if (IMC >= 25 & IMC < 30)
            mensaje = "Sobrepeso";
        else if (IMC >= 30 & IMC < 35)
            mensaje = "Obesidad Grado 1";
        else if (IMC >= 35 & IMC < 40)
            mensaje = "Obesidad Grado 2";
        else if (IMC > 40)
            mensaje = "Obesidad Grado 3";
        else
            mensaje = "Otro tipo de IMC";

        return mensaje;
    }
    private void CalcularIMC ()
    {
        String nombre = etNombre.getText().toString();
        Double altura = Double.valueOf(etAltura.getText().toString());
        Double peso = Double.valueOf(etPeso.getText().toString());
        double IMC = peso / Math.pow(altura, 2);

        Toast.makeText(this, nombre + " Tu IMC es " + String.format("%.2f", IMC) + MensajeIMC(IMC), Toast.LENGTH_LONG).show();
        if (rbMujer.isChecked() == true)
            Toast.makeText(this,"ERES MUJER" , Toast.LENGTH_SHORT).show();
        else if (rbVaron.isChecked() == true)
            Toast.makeText(this,"ERES VARON",Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(this,"No eligio género",Toast.LENGTH_SHORT).show();
    }
}
