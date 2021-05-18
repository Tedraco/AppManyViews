package com.example.appmanyviews;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Dieta extends AppCompatActivity {

    Button btnDieta1,btnDieta2,btnDieta3,btnDieta4,btnSalir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dieta);

        btnDieta1 = (Button) findViewById(R.id.btnDieta1);
        btnDieta2 = (Button) findViewById(R.id.btnDieta2);
        btnDieta3 = (Button) findViewById(R.id.btnDieta3);
        btnDieta4 = (Button) findViewById(R.id.btnDieta4);
        btnSalir = (Button) findViewById(R.id.btnSalir4);

        btnDieta1.setOnClickListener((v) -> {dietanro1();});


        btnDieta2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.acitivity_dieta2);
            }
        });

        btnDieta3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.acitivity_dieta3);
            }
        });

        btnDieta4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.acitivity_dieta4);
            }
        });

        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_main);
            }
        });
    }

    private void dietanro1()
    {
        setContentView(R.layout.activity_dieta1);
    }
}
