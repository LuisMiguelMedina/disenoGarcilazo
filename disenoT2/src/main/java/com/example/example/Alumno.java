package com.example.example;

public class Alumno {
    int matricula = 00000000;
    String apellido_P = null;
    String apellido_M = null;
    String Nombre = null;

    public Alumno(int matri, String Paterno, String Materno, String nombre){
        this.matricula = matri;
        this.apellido_P = Paterno;
        this.apellido_M = Materno;
        this.Nombre = nombre;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getApellido_P() {
        return apellido_P;
    }

    public void setApellido_P(String apellido_P) {
        this.apellido_P = apellido_P;
    }

    public String getApellido_M() {
        return apellido_M;
    }

    public void setApellido_M(String apellido_M) {
        this.apellido_M = apellido_M;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }


    @Override
    public String toString() {
        return "Alumno [matricula=" + matricula + ", apellido_P=" + apellido_P + ", apellido_M=" + apellido_M
                + ", Nombre=" + Nombre + "]";
    }
}
