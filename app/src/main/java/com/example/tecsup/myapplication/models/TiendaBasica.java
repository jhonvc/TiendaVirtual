package com.example.tecsup.myapplication.models;

public class TiendaBasica {
    private int id;
    private String descripcion;
    private String imagen_banner;
    private String imagen_cuadrada;
    private int cant_hijos;
    private int nivel;
    private int red_color;
    private int green_color;
    private int blue_color;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagen_banner() {
        return imagen_banner;
    }

    public void setImagen_banner(String imagen_banner) {
        this.imagen_banner = imagen_banner;
    }

    public String getImagen_cuadrada() {
        return imagen_cuadrada;
    }

    public void setImagen_cuadrada(String imagen_cuadrada) {
        this.imagen_cuadrada = imagen_cuadrada;
    }

    public int getCant_hijos() {
        return cant_hijos;
    }

    public void setCant_hijos(int cant_hijos) {
        this.cant_hijos = cant_hijos;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getRed_color() {
        return red_color;
    }

    public void setRed_color(int red_color) {
        this.red_color = red_color;
    }

    public int getGreen_color() {
        return green_color;
    }

    public void setGreen_color(int green_color) {
        this.green_color = green_color;
    }

    public int getBlue_color() {
        return blue_color;
    }

    public void setBlue_color(int blue_color) {
        this.blue_color = blue_color;
    }
}
