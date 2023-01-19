package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LecturaCSV {

    private String path = null;

    public LecturaCSV(){
        path = null;

    }


    public  boolean leerArchivo(String Path){
        File file = new File(Path);
        path = Path;
        datos(file);
        return file.canRead();
    }

    public  String[][] recuperarDatos(){

        return null;
        
    }

    private void datos(File archivo){
        //Columnas 
        File file = new File(path);
        Scanner scanner = new Scanner(file);
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
}

/*
 *         
 */
