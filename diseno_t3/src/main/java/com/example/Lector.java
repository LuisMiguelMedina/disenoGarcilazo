package com.example;

import java.io.FileNotFoundException;

public abstract class Lector {

    public abstract boolean leerArchivo() throws FileNotFoundException;

    public  abstract String[][] recuperarDatos();

}
