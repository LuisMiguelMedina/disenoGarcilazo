package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LecturaCSV {
    String direccion = null;
    
    public LecturaCSV(String direc) {
        direccion = direc;
    }
    
    
    public void Leer(){
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
  
        try {
           archivo = new File (direccion);
           fr = new FileReader (archivo);
           br = new BufferedReader(fr);
           
           br.close();
        }
        catch(Exception e){
           e.printStackTrace();
        }
    }

    private void getRecords() {
        
        //return CVS-HECHO
    }

    public static void main(String[] args){
        LecturaCSV archivo = new LecturaCSV("disenoT2/src/CSV/Alumnos.csv");
        archivo.Leer();
    }
}


