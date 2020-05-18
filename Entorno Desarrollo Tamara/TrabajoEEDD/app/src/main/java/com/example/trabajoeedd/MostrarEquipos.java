package com.example.trabajoeedd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Iterator;
import java.util.List;

public class MostrarEquipos extends AppCompatActivity {

    private String NombreDelClub;
    private Entrenador entrenador;

    private TextView VerDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_equipos);

        NombreDelClub = getIntent().getStringExtra("NombreDelClub");
        entrenador = (Entrenador) getIntent().getSerializableExtra("entrenador");

        VerDatos=(TextView) findViewById(R.id.DatosEntrenador);

        VerDatos.setText("DEPORTE: "+entrenador.getDeporte()+
                "\nNombre: "+entrenador.getNombre()+
                "\nApellidos: "+entrenador.getApellidos()+
                "\nEdad: "+entrenador.getEdad()+
                "\nEspecialidad: "+entrenador.getEspecialidad());
    }
    public void Volver(View view){
        Intent Volver = new Intent(this,Deportes.class);

        Volver.putExtra("NombreDelClub",NombreDelClub);
        Volver.putExtra("entrenador",entrenador);
        startActivity(Volver);
    }
}
