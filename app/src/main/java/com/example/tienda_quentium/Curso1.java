package com.example.tienda_quentium;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.MediaController;
import android.widget.Spinner;
import android.widget.VideoView;

import Objetos.Curso;

public class Curso1 extends AppCompatActivity {

    private VideoView video;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_curso1);

        //Buscamos el VideoView por controles
        video = findViewById(R.id.vc1);
        String videoPAth = "android.resource://"+getPackageName()+"/"+ R.raw.claseuno;
        Uri uri = Uri.parse(videoPAth);
        video.setVideoURI(uri);

        // Le agregamos los mecanismos de control de el video
        MediaController controladres = new MediaController(this);
        video.setMediaController(controladres);
        controladres.setAnchorView(video);


    }

    public void Somos(View view)
    {

        class Task extends AsyncTask<String, Void, String>
        {
            //define la configuración inicial de mi tarea
            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                Intent i = new Intent(getBaseContext(),Carga.class);
                startActivity(i);
                //barra.setVisibility(View.VISIBLE); //hacemos visible la tarea al hacer click en el boton de inicio de sesión
            }

            //Realiza el proces en segundo plano o mi tarea pesada
            @Override
            protected String doInBackground(String... strings) {

                //se carga la tarea pesada
                try{

                    for(int i=0; i<= 10 ; i++)
                    {
                        Thread.sleep(2000); //duerme un proceso
                    }

                }catch (InterruptedException e)
                {

                    e.printStackTrace();
                }
                return null;
            }

            // Finaliza nuestra tarea
            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);

               // barra.setVisibility(View.INVISIBLE);
                Intent i = new Intent(getBaseContext(),Quienes_Somos.class);
                startActivity(i);
            }
        }

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