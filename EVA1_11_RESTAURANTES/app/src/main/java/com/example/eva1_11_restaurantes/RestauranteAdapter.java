package com.example.eva1_11_restaurantes;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class RestauranteAdapter extends ArrayAdapter<Restaurantes> {

    Context context;
    int resource;
    Restaurantes[] restaurantes;

    public RestauranteAdapter(@NonNull Context context, int resource, @NonNull Restaurantes[] objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.restaurantes = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        ImageView imagenRestaurante;
        TextView textoMensaje;

        if (convertView == null){

            //Si convertView es nulo debemos crear nuestro layout
            //INFLATER

            LayoutInflater layoutInflater = ((Activity)context).getLayoutInflater();
            convertView = layoutInflater.inflate(resource, parent, false);

        }

        imagenRestaurante = convertView.findViewById(R.id.imagenView);
        textoMensaje = convertView.findViewById(R.id.txtViewMensaje);

        imagenRestaurante.setImageResource(restaurantes[position].getImagen());
        textoMensaje.setText(restaurantes[position].getTexto());


        return convertView;
    }
}
