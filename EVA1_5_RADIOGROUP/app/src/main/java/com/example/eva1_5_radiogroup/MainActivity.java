package com.example.eva1_5_radiogroup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {
    RadioGroup Comida;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Comida = findViewById(R.id.Comida);
        Comida.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        String Mensaje = "";
        if (checkedId == R.id.radioButton){
            Mensaje = "Tacos";
        } else if (checkedId == R.id.radioButton2){
            Mensaje = "Tortas";
        } else if (checkedId == R.id.radioButton3){
            Mensaje = "Montados";
        } else if (checkedId == R.id.radioButton4){
            Mensaje = "Burritos";
        }
        Toast.makeText(this, Mensaje, Toast.LENGTH_SHORT).show();
    }
}
