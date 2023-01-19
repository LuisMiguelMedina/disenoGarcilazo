package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main( String[] args ){
        leerCSV();
    }

    public static void leerCSV(){
        try{
            File file = new File("demo/src/CSV/Alumnos.csv");
            Scanner scanner = new Scanner(file);
            
            //Columnas 
            String[] columna = scanner.nextLine().split(",");
            int espacio = columna.length;
            System.out.println(espacio);

            //Filas
            int cont = 0;
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                cont = cont + 1;
            }
            System.out.println(cont);
            
        }
        catch(FileNotFoundException e){
            System.out.println("El archivo no existe…");
        }
    }

    public static void arreglo_bi(){
        
    }
}
