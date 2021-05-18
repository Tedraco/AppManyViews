package com.example.appmanyviews;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Dieta4 extends AppCompatActivity {

    Button btnRegresa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitivity_dieta4);
        btnRegresa = (Button) findViewById(R.id.btnRegresar4);

        btnRegresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_dieta);
            }
        });
    }
}