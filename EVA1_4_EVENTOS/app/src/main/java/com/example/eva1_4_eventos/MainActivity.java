package com.example.eva1_4_eventos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnPorInt, btnPorClaseAn, btnPorClaseEx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnPorInt = findViewById(R.id.btnPorInt);
        btnPorClaseAn = findViewById(R.id.btnPorClaseAn);
        btnPorClaseEx = findViewById(R.id.btnPorClaseEx);

        btnPorInt.setOnClickListener(this);
        btnPorClaseAn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Por clase anonima!!", Toast.LENGTH_LONG).show();
            }
        });

        MiEventoClick evento = new MiEventoClick();
        evento.setContext(this);
        btnPorClaseEx.setOnClickListener(evento);

    }

    public void miClick(View v){
        Toast.makeText(this, "Hola mundo!!", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this, "Evento por listener!", Toast.LENGTH_LONG).show();
    }
}
