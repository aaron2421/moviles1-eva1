package com.example.eva1_10_lista_clima;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    Clima[] ciudades = {
            new Clima(),
            new Clima(R.drawable.atmospher, "Aldama", 25, "atmosfera"),
            new Clima(R.drawable.cloudy, "Aldama", 25, "atmosfera"),
            new Clima(R.drawable.light_rain, "Aldama", 25, "atmosfera"),
            new Clima(R.drawable.rainy, "Aldama", 25, "atmosfera"),
            new Clima(R.drawable.snow, "Aldama", 25, "atmosfera"),
            new Clima(R.drawable.thunderstorm, "Aldama", 25, "atmosfera"),
            new Clima(R.drawable.tornado, "Aldama", 25, "atmosfera"),

    };

    ListView lstClima;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lstClima = findViewById(R.id.listaClima);
    }
}
