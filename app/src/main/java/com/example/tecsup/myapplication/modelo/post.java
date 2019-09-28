package com.example.tecsup.myapplication.modelo;

public class post {
    int id;
    String descripcion;
    String imagen_banner;
    String imagen_cuadrada;
    int cant_hijos;
    int padre;
    int nivel;
    int red_color;
    int green_color;
    int blue_color;

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getImagen_banner() {
        return imagen_banner;
    }

    public String getImagen_cuadrada() {
        return imagen_cuadrada;
    }

    public int getCant_hijos() {
        return cant_hijos;
    }

    public int getPadre() {
        return padre;
    }

    public int getNivel() {
        return nivel;
    }

    public int getRed_color() {
        return red_color;
    }

    public int getGreen_color() {
        return green_color;
    }

    public int getBlue_color() {
        return blue_color;
    }
}
