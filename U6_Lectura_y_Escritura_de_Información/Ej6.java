package com.jdperez;

import java.io.*;
import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firma;
        String opcion="";


        while (!opcion.equals("FIN")) {
            mostrarMenu();
            opcion = sc.nextLine();
            if (opcion.equals("1")) {
                mostrarFichero("firmas.txt");
            } else if (opcion.equals("2")) {
                System.out.println("Introduce el nombre a firmar");
                firma = sc.nextLine();
                if (!estaNombre(firma,"firmas.txt")) {
                    try {
                        BufferedWriter bw = new BufferedWriter(new FileWriter("firmas.txt",true));
                        bw.write(firma+"\n");
                        bw.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }else {
                    System.out.println("Ese nombre ya esta");
                }
            }
        }


    }

    public static void mostrarMenu() {
        System.out.println("1- Mostrar Libro");
        System.out.println("2- Insertar firma");
        System.out.println("3- Fin");
        System.out.println("Seleccion opción:");
    }

    public static void mostrarFichero(String nombre) {

        try {
            BufferedReader bin = new BufferedReader(new FileReader(nombre));
            String linea = bin.readLine();
            while (linea != null ) {
                System.out.println(linea);
                linea = bin.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("---------------------------");
    }

    public static boolean estaNombre(String nombre, String fichero) {

        try {
            BufferedReader bin = new BufferedReader(new FileReader(fichero));
            String linea = bin.readLine();
            while (linea != null ) {
                if (linea.equals(nombre)) {
                    return true;
                }
                linea = bin.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return false;
    }
}
