package com.example.trabajoeedd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class Staff_Tecnico extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private String NombreDelClub;
    private Entrenador entrenador;

    private Spinner NombreDeporte;
    private EditText NombreEntrenador;
    private EditText ApellidosEntrenador;
    private EditText EdadEntrenador;
    private EditText EspecialidadEntrenador;

    private String Deporte;
    private String Nombre;
    private String Apellidos;
    private int Edad;
    private String Especialidad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staff__tecnico);

        NombreDelClub = getIntent().getStringExtra("NombreDelClub");
        entrenador = (Entrenador) getIntent().getSerializableExtra("entrenador");

        NombreDeporte = findViewById(R.id.Deporte);
        NombreEntrenador = findViewById(R.id.Nombre);
        ApellidosEntrenador = findViewById(R.id.Apellidos);
        EdadEntrenador = findViewById(R.id.Edad);
        EspecialidadEntrenador = findViewById(R.id.Especialidad);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.Seleccionar_Deporte,
                android.R.layout.simple_spinner_item);
        NombreDeporte.setAdapter(adapter);
        NombreDeporte.setOnItemSelectedListener(this);

    }
    @Override
    public void onItemSelected(AdapterView<?> adapter, View view, int position, long id) {
        Deporte = adapter.getItemAtPosition(position).toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapter) {
    }

    public void Guardar(View view) {
        Intent Guardar = new Intent(this, Deportes.class);

        Nombre = NombreEntrenador.getText().toString();
        Apellidos = ApellidosEntrenador.getText().toString();
        Edad = Integer.parseInt(EdadEntrenador.getText().toString());
        Especialidad = EspecialidadEntrenador.getText().toString();

        if (Edad < 18) {
            Toast.makeText(this, "El entrenador no puede ser menor de edad", Toast.LENGTH_LONG).show();
            Guardar.putExtra("NombreDelClub", NombreDelClub);
            Guardar.putExtra("entrenador", entrenador);
            startActivity(Guardar);
        } else {
            if (Edad > 66) {
                Toast.makeText(this, "El entrenador está jubilado.", Toast.LENGTH_LONG).show();
                Guardar.putExtra("NombreDelClub", NombreDelClub);
                Guardar.putExtra("entrenador", entrenador);
                startActivity(Guardar);
            } else {
                entrenador = new Entrenador(Deporte, Nombre, Apellidos, Edad, Especialidad);
                Toast.makeText(this, "Se ha creado el primer equipo del club " + NombreDelClub + "\n Deporte elegido: " + Deporte, Toast.LENGTH_LONG).show();

                Guardar.putExtra("NombreDelClub", NombreDelClub);
                Guardar.putExtra("entrenador", entrenador);
                startActivity(Guardar);
            }
        }
    }
}