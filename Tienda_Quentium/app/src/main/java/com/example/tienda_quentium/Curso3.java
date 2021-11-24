package com.example.tienda_quentium;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Curso3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_curso3);
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

    public void Servicio(View view)
    {
        Intent i = new Intent(getBaseContext(),Servicios.class);
        startActivity(i);


    }
}
