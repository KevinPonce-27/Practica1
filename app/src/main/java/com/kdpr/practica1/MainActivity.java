package com.kdpr.practica1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btEnviar(View view){
        //Creamos el Intent

        Intent intent = new Intent(MainActivity.this, activity_info.class);
        EditText txtNombre = (EditText)findViewById(R.id.txtNombre);
        EditText txtCedula = (EditText)findViewById(R.id.txtCedula);
        EditText txtFecha = (EditText)findViewById(R.id.txtFecha);
        EditText txtCiudad = (EditText)findViewById(R.id.txtCiudad);
        EditText txtGenero = (EditText)findViewById(R.id.txtGenero);
        EditText txtCorreo = (EditText)findViewById(R.id.txtCorreo);
        EditText txtTelefono = (EditText)findViewById(R.id.txtTelefono);


        //Creamos la información a pasar entre actividades - Pares Key-Value
        Bundle b = new Bundle();
        b.putString("NOMBRE", txtNombre.getText().toString());
        b.putString("CEDULA", txtCedula.getText().toString());
        b.putString("FECH", txtFecha.getText().toString());
        b.putString("CIUDAD", txtCiudad.getText().toString());
        b.putString("GENERO", txtGenero.getText().toString());
        b.putString("CORREO", txtCorreo.getText().toString());
        b.putString("TELEFONO", txtTelefono.getText().toString());

        //Añadimos la información al intent
        intent.putExtras(b);

        // Iniciamos la nueva actividad
        startActivity(intent);
    }
}