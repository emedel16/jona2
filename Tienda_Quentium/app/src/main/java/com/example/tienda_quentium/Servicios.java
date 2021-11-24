package com.example.tienda_quentium;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

import Objetos.Curso;

public class Servicios extends AppCompatActivity {

    private Spinner costo;
    private TextView result;
    //Instancion objeto Curso
    Curso c1 = new Curso();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servicios);

        costo = findViewById(R.id.sp1);
        result = findViewById(R.id.tx1);

        //Recibo

        Bundle bun = getIntent().getExtras();
        String[] Listado = bun.getStringArray("curso");

        ArrayAdapter adaptCurso = new ArrayAdapter(this, android.R.layout.simple_list_item_1, Listado);
        costo.setAdapter(adaptCurso);



    }

    public void Calcular (View view){
        String opcion = costo.getSelectedItem().toString();
        int resultado = 0;

        for (int i = 0; i < opcion.length(); i++) {
            if (opcion.equals(c1.getCurso()[i])) {
                resultado = c1.getPrecios()[i];
                result.setText( "es "+resultado);
                break;

            }
        }
    }

    //Falta curso 1 implementar boton ver precio o algo por el estilo para mostrar precio del curso tanto en USD como en CLP

    public void Curso2(View view)
    {
        Intent i = new Intent(this,Curso2.class);
        startActivity(i);

    }

    public void Curso3(View view)
    {
        Intent i = new Intent(this,Curso3.class);
        startActivity(i);

    }


    public void Curso4(View view)
    {
        Intent i = new Intent(this,Curso4.class);
        startActivity(i);

    }

    //Intentes Menus

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