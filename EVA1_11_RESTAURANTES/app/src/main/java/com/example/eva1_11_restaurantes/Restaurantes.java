package com.example.eva1_11_restaurantes;

public class Restaurantes {

    private int imagen;
    private String texto;

    public Restaurantes(){

        imagen = R.drawable.f1;
        texto = "¡Viajes!";

    }

    public Restaurantes(int imagen, String texto) {
        this.imagen = imagen;
        this.texto = texto;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
