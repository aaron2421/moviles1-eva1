package com.example.eva1_9_listas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    String [] shuguBolas = {
            "Texas",
            "Nacho",
            "Flamin",
            "Tampico",
            "Armada",
            "Junior",
            "Toreada",
            "Mango habanero",
            "Chipotle",
            "De bagui",
            "Hot dog",
            "VIP"
    };

    ListView listViewListaDatos;
    TextView txtMensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listViewListaDatos = findViewById(R.id.listViewListaDatos);
        txtMensaje = findViewById(R.id.txtMensaje);
        listViewListaDatos.setAdapter(new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                shuguBolas
        ));

        listViewListaDatos.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        txtMensaje.setText("La bola de arroz es: " + shuguBolas[i]);
    }
}
