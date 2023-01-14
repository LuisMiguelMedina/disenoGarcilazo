package org.example;

public class Calificaciones {
    int Matricula = 00000000;
    String Materia = "Diseno de Software";
    int Calificacion = 1;
    
    public Calificaciones(int matricula, String materia, int calificacion) {
        Matricula = matricula;
        Materia = materia;
        Calificacion = calificacion;
    }

    public int getMatricula() {
        return Matricula;
    }

    public void setMatricula(int matricula) {
        this.Matricula = matricula;
    }

    public String getMateria() {
        return Materia;
    }

    public void setMateria(String materia) {
        Materia = materia;
    }

    public int getCalificacion() {
        return Calificacion;
    }

    public void setCalificacion(int calificacion) {
        Calificacion = calificacion;
    }

    @Override
    public String toString() {
        return "Calificaciones [Matricula=" + Matricula + ", Materia=" + Materia + ", Calificacion=" + Calificacion + "]";
    }

    
    
}
