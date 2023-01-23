package com.example;

public class Calificacion {
    private String materia = "Diseno de Software";
    private int calificacion = 0;

    public Calificacion(){

    }
    public Calificacion(int cali){
        calificacion = cali;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
    

}
