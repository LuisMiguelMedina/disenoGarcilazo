package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LecturaCSV {

    private String path = null;

    public LecturaCSV(){
        path = null;

    }


    public  boolean leerArchivo(String Path) throws FileNotFoundException{
        File file = new File(Path);
        path = Path;
        datos(file);
        return file.canRead();
    }

    public  String[][] recuperarDatos(){

        return null;
        
    }

    private void datos(File archivo) throws FileNotFoundException{
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

        String elementos[][] = new String[espacio][cont];

        for (int i = 0; i < elementos.length; i++) {
            for (int j = 0; j < elementos[i].length; j++) {
                System.out.println("Estado");
                auxS = teclado.readLine();
                elementos[i][j] = auxS;
                System.out.println("Elemento");
                auxS = teclado.readLine();
                elementos[i][j] = auxS;
            }
        }
        for( int x = 0; x<elementos.length;x++) {
            for( int z = 0; z<elementos.length;z++) {
                System.out.println("Estado "+elementos[x][z]);
                System.out.println("Elemento "+elementos[z][z]);
            }
        }

    }
}

/*
 *         
 */
