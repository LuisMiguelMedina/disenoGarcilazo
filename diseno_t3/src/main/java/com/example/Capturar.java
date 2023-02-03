package com.example;

import java.io.*;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import com.example.Encriptado;

public class Capturar {

    private ArrayList<Alumnos> alumnos = new ArrayList<>();
    private Encriptado encriptador = new Encriptado();
    private File Usuarios = new File("diseno_t3/src/Register/usuario.txt");

    public Capturar(ArrayList<Alumnos> alum) {
        this.alumnos = alum;
    }

    public boolean InicioSesion(){

        boolean valido = false;

        do {

            Scanner scan1 = new Scanner(System.in);
            System.out.println("Ingrese usuario: ");
            String usuario = scan1.next();
            
            Scanner scan2 = new Scanner(System.in);
            System.out.println("Ingrese contrasena: ");
            String contra = scan2.next();

            valido = comparar(usuario, contra);
            
        } while (!valido);


        return valido;
    }

    private boolean comparar(String usuario, String contrasena){

        FileReader fr;
        boolean validez = false;

        try {
            fr = new FileReader (Usuarios);
            BufferedReader br = new BufferedReader(fr);
            String linea = null;

            while((linea=br.readLine())!=null){
                String[] line = linea.split(",");
                if(Objects.equals(line[1], encriptador.encrypt(usuario, contrasena))){
                    System.out.println("Usuario validado");
    
                    validez = true;
                }
            }
            if(!validez){
                System.out.println("Usuario no validado");
            }

            br.close();
            fr.close();
        }catch (Exception e) {
            e.printStackTrace();
        }


        return validez;

    }


    public void encriptar(){
        FileReader fr;
        try {
            fr = new FileReader (Usuarios);
            BufferedReader br = new BufferedReader(fr);

            
            Scanner scan = new Scanner(System.in);
            System.out.println("Nuevo usuario");
            String linea = scan.next();

            Scanner scan2 = new Scanner(System.in);
            System.out.println("Contrasena");
            String linea2 = scan2.next();

            escribir(encriptador.encrypt(linea,linea2));
            br.close();
            fr.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    //Funcion para escribir en el archivo el texto encriptado
    private void escribir(String encriptado){
        FileWriter fichero = null;
        BufferedWriter xd = null;
        PrintWriter pw = null;
        int x=0;
        try
        {
            Scanner scan = new Scanner(Usuarios);
            fichero = new FileWriter(Usuarios);
            xd = new BufferedWriter(fichero);
            pw = new PrintWriter(xd);

            while(scan.hasNextLine()){
                x = x+1;
            }

            pw.append(encriptado);

            pw.close();
            xd.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    } 

    public ArrayList<Alumnos> Registro() {
        ArrayList<Alumnos> alum = new ArrayList<>();
        for (int i = 0; i < alumnos.size()-1; i++){
            Alumnos alumn = alumnos.get(i);
            System.out.println("Inserte calificacion de ");
            System.out.println(alumn.getApellido_P()+" " + alumn.getApellido_M()+ " " + alumn.getNombres()+ " en la materia de Diseno de Software");
            Scanner scanner = new Scanner(System.in);
            Calificacion cali = new Calificacion(scanner.nextInt());
            alumn.setCalificacion(cali);
            alum.add(alumn);
        }
        //Crear el arreglo de calificaciones y notar que todo funcione
        return alum;
    }
    
}

    /*

    //Estas funciones son para encriptar el unico usuario que ingresamos, utilizar/cambiar si es necesario cambiar de usuario y contrasena. Sobrescribe el texto en el usuarios.txt y corre estos codigos. Se generara el usuario cencriptado con la contrasena.


    public void encriptar(){
        FileReader fr;
        try {
            fr = new FileReader (Usuarios);
            BufferedReader br = new BufferedReader(fr);
            String linea = br.readLine();
            String linea2 = br.readLine();
            escribir(encriptador.encrypt(linea,linea2));
            System.out.println(encriptador.encrypt(linea, linea2));
            br.close();
            fr.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    //Funcion para escribir en el archivo el texto encriptado
    private void escribir(String encriptado){
        System.out.println(encriptado);
        FileWriter fichero = null;
        BufferedWriter xd = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter(Usuarios);
            xd = new BufferedWriter(fichero);
            pw = new PrintWriter(xd);

            pw.write(encriptado);

            pw.close();
            xd.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    } 
     */