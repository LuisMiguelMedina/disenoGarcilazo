package org.example;

import java.io.*;

import javax.swing.JOptionPane;


public class Main {
    public static void main(String[] args) throws Exception {
        JOptionPane.showMessageDialog(null, "Hola mundo");
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
  
        try {
           archivo = new File ("disenoT2/src/CSV/Alumnos.csv");
           fr = new FileReader (archivo);
           br = new BufferedReader(fr);
  
           // Lectura de cada linea
           String linea;
           while((linea=br.readLine())!=null){
            System.out.println(linea);


           }
        }
        catch(Exception e){
           e.printStackTrace();
        }
        
    }
}