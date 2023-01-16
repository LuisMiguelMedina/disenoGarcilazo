package org.example;

import java.io.*;

import javax.swing.JOptionPane;


public class Main {
    public static void main(String[] args) throws Exception {
        LecturaCSV archivo = new LecturaCSV("disenoT2/src/CSV/Alumnos.csv");
        archivo.Leer();
    }
}