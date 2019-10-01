package com.example.tecsup.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.tecsup.myapplication.Tienda.TiendaServicio;
import com.example.tecsup.myapplication.models.TiendaRespuesta;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private Retrofit retrofit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        retrofit= new Retrofit.Builder()
                .baseUrl("https://viveyupi.com/api/categorias/nivel")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        obtenerdatos();

    }
    private void obtenerdatos(){
        TiendaServicio servicio=retrofit.create(TiendaServicio.class);
       servicio.ObtenerListaTienda();


    }
}
