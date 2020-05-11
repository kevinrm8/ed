package com.example.trabajoeedd;

import android.os.Parcel;

import java.io.Serializable;

public class Entrenador implements Serializable {

    private String Deporte;
    private String Nombre;
    private String Apellidos;
    private int Edad;
    private String Especialidad;

    public Entrenador(String deporte, String nombre, String apellidos, int edad, String especialidad) {
        Deporte = deporte;
        Nombre = nombre;
        Apellidos = apellidos;
        Edad = edad;
        Especialidad = especialidad;
    }

    public String getDeporte() { return Deporte; }
    public String getNombre() { return Nombre; }
    public String getApellidos() { return Apellidos; }
    public int getEdad() { return Edad; }
    public String getEspecialidad() { return Especialidad; }

}
