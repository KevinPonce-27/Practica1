package com.kdpr.practica1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class activity_info extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        //Localizar los controles
        TextView txtSaludo = (TextView)findViewById(R.id.txtSaludo);
        TextView txtSaludo2 = (TextView)findViewById(R.id.txtSaludo2);
        TextView txtSaludo3 = (TextView)findViewById(R.id.txtSaludo3);
        TextView txtSaludo4 = (TextView)findViewById(R.id.txtSaludo4);
        TextView txtSaludo5 = (TextView)findViewById(R.id.txtSaludo5);
        TextView txtSaludo6 = (TextView)findViewById(R.id.txtSaludo6);
        TextView txtSaludo7 = (TextView)findViewById(R.id.txtSaludo7);


        //Recuperamos la información pasada en el intent
        Bundle bundle = this.getIntent().getExtras();


        //Construimos el mensaje a mostrar
        txtSaludo.setText("Cédula: " + bundle.getString("CEDULA"));
        txtSaludo2.setText("Nombre: " + bundle.getString("NOMBRE"));
        txtSaludo3.setText("Fecha nacimiento: " + bundle.getString("FECH"));
        txtSaludo4.setText("Ciudad: " + bundle.getString("CIUDAD"));
        txtSaludo5.setText("Género: " + bundle.getString("GENERO"));
        txtSaludo6.setText("Correo: " + bundle.getString("CORREO"));
        txtSaludo7.setText("Télefono: " + bundle.getString("TELEFONO"));
    }
}