package com.example.tienda_quentium;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class Curso2 extends AppCompatActivity {

    private VideoView  videoview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_curso2);

        //Buscamos el VideoView por id
        videoview = findViewById(R.id.vw);


          String ruta = "android.resource://"+getPackageName()+"/"+ R.raw.video;
          Uri uri = Uri.parse(ruta);
          videoview.setVideoURI(uri);

        // Le agregamos los mecanismos de control de el video
       // MediaController controladres = new MediaController(this);
       // videoview.setMediaController(controladres);
       // controladres.setAnchorView(videoview);
        videoview.start();
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