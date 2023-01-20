package com.example;

import java.io.FileNotFoundException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String [] args) throws FileNotFoundException {
        LecturaCSV archivo = new LecturaCSV();
        System.out.println(archivo.leerArchivo("DisenoT2/src/CSV/Alumnos.csv"));
    }
}
