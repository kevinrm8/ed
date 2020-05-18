package com.example.trabajoeedd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Deportes extends AppCompatActivity {

    private TextView NombreClub;
    private String NombreDelClub;
    private Entrenador entrenador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deportes);

        NombreClub=(TextView) findViewById(R.id.Titular);
        NombreDelClub = getIntent().getStringExtra("NombreDelClub");
        entrenador = (Entrenador) getIntent().getSerializableExtra("entrenador");
        NombreClub.setText("BIENVENIDO AL CLUB \n\n "+NombreDelClub);

    }

    public void CrearEquipo(View view){
        Intent CrearEquipo = new Intent(this,Staff_Tecnico.class);

        CrearEquipo.putExtra("NombreDelClub",NombreDelClub);
        CrearEquipo.putExtra("entrenador",entrenador);
        startActivity(CrearEquipo);
    }

    public void VerEquipos(View view){
        Intent VerEquipos = new Intent(this,MostrarEquipos.class);

        if (entrenador == null){
            Toast.makeText(this,"PRIMERO DEBES CREAR EL EQUIPO",Toast.LENGTH_LONG).show();
        }else{
            VerEquipos.putExtra("NombreDelClub",NombreDelClub);
            VerEquipos.putExtra("entrenador",entrenador);
            startActivity(VerEquipos);
        }
    }
}
