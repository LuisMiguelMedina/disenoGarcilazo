package com.example;

public class Alumnos {
    private int matricula = 00000000;
    private String apellido_P = null;
    private String apellido_M = null;
    private String nombres = null;
    private Calificacion calificacion = new Calificacion();

    public Alumnos(String[] Datos){
        matricula = Integer.parseInt(Datos[0]);
        apellido_P = Datos[1];
        apellido_M = Datos[2];
        nombres = Datos[3];
    }

    
    

    public int getMatricula() {
        return matricula;
    }




    public String getApellido_P() {
        return apellido_P;
    }




    public String getApellido_M() {
        return apellido_M;
    }




    public String getNombres() {
        return nombres;
    }




    public Calificacion getCalificacion() {
        return calificacion;
    }



    public void setCalificacion(Calificacion calificacion) {
        this.calificacion = calificacion;
    }



    @Override
    public String toString() {
        return "Alumnos [matricula=" + matricula + ", apellido_P=" + apellido_P + ", apellido_M=" + apellido_M
                + ", nombres=" + nombres + ", calificacion=" + calificacion + "]";
    }
    
}