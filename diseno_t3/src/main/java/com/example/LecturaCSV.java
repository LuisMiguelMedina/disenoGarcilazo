package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import com.example.Alumnos;

public class LecturaCSV extends Lector{

    private String path = null;
    private String [][] List_Alum = null;

    public LecturaCSV(){
        path = null;
    }

    public LecturaCSV(String Path){
        path = Path;
    }


    public  boolean leerArchivo() throws FileNotFoundException{
        File file = new File(this.path);
        if (file.canRead())
            datos();

        return file.canRead();
    }

    public  String[][] recuperarDatos(){
        return List_Alum;
    }

    private void datos() throws FileNotFoundException{
        int filas = contar_filas();
        int datosxFila = contar_Datos();
        AsignarDatos(contar_filas(),contar_Datos());
    }

    
    private int contar_Datos(){
        File file = new File(path);
        Scanner scanner;
        int cont_Datosxfila = 0;
        try {
            scanner = new Scanner(file);
            String[] divisor = scanner.nextLine().split(",");
            cont_Datosxfila = divisor.length;
            //System.out.println(cont_Datosxfila);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            cont_Datosxfila = 0;
        }

        return cont_Datosxfila;

    }


    private int contar_filas(){
        File file = new File(path);
        Scanner scanner;
        int filas = 0;
        try {
            scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                filas = filas + 1;
                //System.out.println(filas);
            }
    
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            filas = 0;
        }

        return filas;
    }


    private  void AsignarDatos(int filas, int datosxFila) throws FileNotFoundException{
        File file = new File(path);
        Scanner scanner;
        scanner = new Scanner(file);
        scanner.nextLine();

        List_Alum = new String[filas][datosxFila];

        for (int i = 0; i < List_Alum.length-1; i++) {
            String[] divisor = scanner.nextLine().split(",");
            for (int j = 0; j < List_Alum[i].length; j++) {
                List_Alum[i][j] = divisor[j];
            }
        }


    }

    


    public void recorer(){
        for( int x = 0; x<List_Alum.length-1;x++) {
            for( int z = 0; z<List_Alum[x].length;z++) {
                System.out.println(List_Alum[x][z]);
            }
        }

    }

} // Final de la clase