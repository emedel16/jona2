package com.example.tienda_quentium;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Contactanos extends AppCompatActivity {

    private EditText cmaill, casunto, cmensaje;
    private Button benviar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactanos);

        //buscamos por id las casillas de texto
        cmaill= findViewById(R.id.nom);
        casunto= findViewById(R.id.email);
        cmensaje =findViewById(R.id.mensaje);
        //buscamos por id el boton enviar para poder enviar el mensaje
        benviar=findViewById(R.id.enviar);

        benviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:" + cmaill.getText().toString()));
                intent.putExtra(Intent.EXTRA_SUBJECT,casunto.getText().toString());
                intent.putExtra(Intent.EXTRA_TEXT,cmensaje.getText().toString());
                startActivity(intent);
            }
        });




    }

    public void Somos(View view)
    {
        Intent i = new Intent(getBaseContext(),Quienes_Somos.class);
        startActivity(i);
    }

    public void Team(View view)
    {
        Intent i = new Intent(getBaseContext(),Teamm.class);
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