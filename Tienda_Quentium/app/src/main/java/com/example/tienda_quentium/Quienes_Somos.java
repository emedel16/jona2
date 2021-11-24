package com.example.tienda_quentium;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import Objetos.Curso;

public class Quienes_Somos extends AppCompatActivity {


    private Curso c1 = new Curso();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quienes_somos);

     //Boton on click transpasar array



    }

    public void Servicio1(View view)
    {
        Intent i = new Intent(getBaseContext(),Servicios.class);
        Bundle bun = new Bundle();
        bun.putStringArray("curso",c1.getCurso());
        i.putExtras(bun);
        startActivity(i);
    }

    public void Somos(View view)
    {
        Intent i = new Intent(getBaseContext(),Quienes_Somos.class);
        startActivity(i);
    }

    public void Team(View view)
    {
        Intent i = new Intent(getBaseContext(),Team.class);
        startActivity(i);

    }

    public void Contactanos(View view)
    {
        Intent i = new Intent(getBaseContext(),Contactanos.class);
        startActivity(i);

    }

    //public void Servicio(View view)
    {
       // Intent i = new Intent(getBaseContext(),Servicios.class);
        //startActivity(i);


    }
}