package com.example.appmanyviews;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Dieta1 extends AppCompatActivity {

    Button btnRegresa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dieta1);
        btnRegresa = (Button) findViewById(R.id.btnRegresar);

        btnRegresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_dieta);
            }
        });
    }
}