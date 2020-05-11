package com.example.trabajoeedd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText NombreClub;
    private String NombreDelClub;
    private Entrenador entrenador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NombreClub = (EditText)findViewById(R.id.NombreClub);

    }

    public void Crear_Club(View view){

        NombreDelClub = NombreClub.getText().toString().toUpperCase();

        if(NombreDelClub.length()<4){
            Toast.makeText(this,"EL NOMBRE DEL CLUB DEBE TENER AL MENOS 4 LETRAS",Toast.LENGTH_LONG).show();
        } else{
            Toast.makeText(this,"GENERANDO CLUB;\n ESPERE...",Toast.LENGTH_LONG).show();

            Intent Crear = new Intent(this,Deportes.class); // PARA PASAR A OTRA ACTIVITY
            entrenador = null;
            Crear.putExtra("entrenador",entrenador);
            Crear.putExtra("NombreDelClub",NombreDelClub); //PASAR EL DATO A LA SIGUIENTE ACTIVITY
            startActivity(Crear);
        }
    }
}

