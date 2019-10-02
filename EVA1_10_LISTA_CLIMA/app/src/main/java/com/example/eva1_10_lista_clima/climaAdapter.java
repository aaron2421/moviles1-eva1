package com.example.eva1_10_lista_clima;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class climaAdapter extends ArrayAdapter <Clima>{
    Context context;
    int resource;
    Clima[] ciudades;

    public climaAdapter(Context context, int resource, Clima[] objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.ciudades = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imgClima;
        TextView txtCiudad, txtTemp, txtClima;

        //Convertview es una fila de la lista
        if (convertView == null){
            //Crear nuestro layout
            //Inflater

            LayoutInflater inflator = ((Activity)context).getLayoutInflater();
            convertView = inflator.inflate(resource, parent, false);

        }

        imgClima = convertView.findViewById(R.id.imagen);
        txtCiudad = convertView.findViewById(R.id.textoCiudad);
        txtTemp = convertView.findViewById(R.id.textoTemp);
        txtClima = convertView.findViewById(R.id.textoClima);

        imgClima.setImageResource(ciudades[position].getImagen());
        txtCiudad.setText(ciudades[position].getCiudad());
        txtTemp.setText(ciudades[position].getTemp() + "ºC");
        txtClima.setText(ciudades[position].getClima());

        return convertView;
    }
}
