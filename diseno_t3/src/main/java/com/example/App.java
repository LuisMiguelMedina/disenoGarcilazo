package com.example;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import com.Capturar;


public class App 
{
    public static void main(String [] args) throws FileNotFoundException {
        LecturaCSV archivo = new LecturaCSV("diseno_t3/src/CSV/Alumnos.csv");
        if(archivo.leerArchivo()){//Revisar si la lectura fue exitosa
            String[][] variable = archivo.recuperarDatos(); //Lectura de datos
            ArrayList<Alumnos> alum = CrearAlumnos(archivo.recuperarDatos()); //Creacion de los alumnos.
            Capturar captura = new Capturar(alum);
            InsertarCalificaciones(alum,captura.Inicio());
        }else{
            System.out.println("No se encontro el archivo");
        }
    }

    private static ArrayList<Alumnos> CrearAlumnos(String[][] Datos) {
        ArrayList<Alumnos> alum = new ArrayList<>();
        for (int i = 0; i < Datos.length-1; i++) {
            Alumnos alumnos = new Alumnos(Datos[i]);
            alum.add(alumnos);
        }
        return alum;
    }

    private static void InsertarCalificaciones(ArrayList<Alumnos> alum,Calificacion[] calificacion){
        for (int i = 0; i < alum.size(); i++){
            Alumnos alumnos = alum.get(i);
            alumnos.setCalificacion(calificacion[i]);
        }
    }
}

//
