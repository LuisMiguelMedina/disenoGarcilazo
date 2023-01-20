package com.example;

public class Alumnos {
    private int matricula = 00000000;
    private String apellido_P = null;
    private String apellido_M = null;
    private String nombres = null;
    private Calificacion calificacion = new Calificacion();

    public Alumnos(int Matricula, String Paterno, String Materno, String Nombres){
        matricula = Matricula;
        apellido_P = Paterno;
        apellido_M = Materno;
        nombres = Nombres;
    }
}
