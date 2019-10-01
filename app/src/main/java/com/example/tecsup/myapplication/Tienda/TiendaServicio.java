package com.example.tecsup.myapplication.Tienda;


import retrofit2.Call;
import retrofit2.http.GET;

public interface TiendaServicio {
    @GET("1")
    Call<TiendaServicio>ObtenerListaTienda();



}
