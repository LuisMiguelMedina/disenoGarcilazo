package com.example;

import java.io.FileNotFoundException;
import java.util.ArrayList;

// Usuario: Garcilazo , Pass: 123
public class App
{
    public static void main(String [] args) throws FileNotFoundException {
        /*
            Capturar je = new Capturar(null);
            je.encriptar();
        */

        Lector archivo = new LecturaCSV("diseno_t3/src/CSV/Alumnos.csv");
        if(archivo.leerArchivo()){//Revisar si la lectura fue exitosa
            ArrayList<Alumnos> alumno = CrearAlumnos(archivo.recuperarDatos()); //Creacion de los alumnos.
            Capturar captura = new Capturar(alumno);
            if(captura.InicioSesion()){
                alumno = captura.Registro();
                System.out.println("Programa terminado");
            }

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

}

/*
    Insertar en el main para ejecutar encriptar

        Capturar je = new Capturar(null);

        je.encriptar();
 */
