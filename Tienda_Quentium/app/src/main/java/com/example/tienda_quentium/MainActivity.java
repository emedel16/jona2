package com.example.tienda_quentium;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import Objetos.Usuario;

public class MainActivity extends AppCompatActivity {

    private EditText usuario,pass ;
    private TextView mensajero;
    private Button btn;
    private ProgressBar barra;

    private Usuario us = new Usuario();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuario = findViewById(R.id.user);
        btn = findViewById(R.id.iniciar);
        pass = findViewById(R.id.pw);
        mensajero = findViewById(R.id.msj);


    }

    public void LoadSession(View view)
    {
        //.trim remueve los espacios en blanco

        String users = usuario.getText().toString().trim();
        String contra = pass.getText().toString().trim();

        String userbj = us.getUser().trim();
        String pwbj = us.getPass().trim();

        switch (users)
        {
            case "Ema":
                if(users.equals(userbj)&& contra.equals(pwbj))
                {
                    //vaciar campos de entrada
                    usuario.setText("");
                    pass.setText("");
                    //inicio sesion.......
                    Intent i = new Intent(this,Quienes_Somos.class);
                    startActivity(i);


                }
                break;

            case "":
                if(users.equals("") && contra.isEmpty())
                {
                    //campos vacios

                    mensajero.setText("Campos vacios ingrese nuevamente");



                }
                break;

            default:
                if(!users.equals(userbj)&& !contra.equals(pwbj))
                {

                    mensajero.setText("Campos erroneos");


                }
                break;

        }


    }


}