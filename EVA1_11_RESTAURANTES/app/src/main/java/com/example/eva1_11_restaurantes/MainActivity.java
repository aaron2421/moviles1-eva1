package com.example.eva1_11_restaurantes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    Restaurantes[] restaurantes = {
            new Restaurantes(),
            new Restaurantes(R.drawable.f2,"¡Comida!"),
            new Restaurantes(R.drawable.f3,"¡Naturaleza!"),
            new Restaurantes(R.drawable.trunks,"¡Muerte...!"),
            new Restaurantes(R.drawable.anotherone,"¡Más comida!"),
    };

    ListView listaRestaurantes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listaRestaurantes = findViewById(R.id.listaRestaurantes);
        listaRestaurantes.setAdapter(new RestauranteAdapter(this, R.layout.layout_restaurantes, restaurantes));
        listaRestaurantes.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(this, restaurantes[i].getTexto(), Toast.LENGTH_LONG).show();
    }
}
