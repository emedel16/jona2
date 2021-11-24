package com.example.tienda_quentium;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import DataBase.AdminSQLLiteQuentiumPack;

public class Registrar_Usuario extends AppCompatActivity {

    private EditText nom_u, cont_u;
    private Button crear_u;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_usuario);

        nom_u=findViewById(R.id.N_usuario);
        cont_u=findViewById(R.id.N_contrasena);

    }

    public void guardarusuario(View view){

        AdminSQLLiteQuentiumPack admin = new AdminSQLLiteQuentiumPack(getBaseContext(),"biofit", null, 1);
        SQLiteDatabase db= admin.getWritableDatabase();

        //obtengo los valores segun el cliente

        String nombre =nom_u.getText().toString();
        String contrasena = cont_u.getText().toString();


        if(!nombre.isEmpty() && !contrasena.isEmpty() ){

            ContentValues cont = new ContentValues();
            cont.put("nombre", nombre);
            cont.put("contrasena", contrasena);


            db.insert("Usuario_Nuevo", null, cont);
          //  Clean();
            db.close();
            Toast.makeText(getBaseContext(), "USUARIO REGISTRADO CORRECTAMENTE", Toast.LENGTH_LONG).show();

        }else{

            Toast.makeText(getBaseContext(), "DEBE RELLENAR LOS CAMPOS", Toast.LENGTH_SHORT).show();
        }

    }
    public void mostrarClase(View view){

        AdminSQLLiteQuentiumPack admin = new AdminSQLLiteQuentiumPack(getBaseContext(),"biofit", null, 1);
        SQLiteDatabase db= admin.getWritableDatabase();

        String nombre = nom_u.getText().toString();

        if(!nombre.isEmpty()){

            //consultar la data base
            Cursor file = db.rawQuery("SELECT Contrasena FROM  Usuario_Nuevo WHRERE nombre="+nombre, null);

            if(file.moveToFirst())// verifica si mi consulta está o no vacía
            {

                cont_u.setText(file.getString(0)); //muestra la posición


            }else{

                Toast.makeText(getBaseContext(), "NO EXISTE E USUARIO", Toast.LENGTH_SHORT).show();
            }

        }else{

            Toast.makeText(getBaseContext(), "El costructor nodebe venir vacío", Toast.LENGTH_SHORT).show();
        }

    }
}