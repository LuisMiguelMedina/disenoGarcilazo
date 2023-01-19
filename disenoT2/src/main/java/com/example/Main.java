package main.java.com.example;

import com.example.LecturaCSV;

public class Main {
    public static void main(String [] args) {
        LecturaCSV archivo = new LecturaCSV();
        System.out.println(archivo.leerArchivo("DisenoT2/src/CSV/Alumnos.csv"));
    }
}
