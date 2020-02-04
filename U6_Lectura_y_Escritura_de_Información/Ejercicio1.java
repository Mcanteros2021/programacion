package com.jdperez;

import java.io.*;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner((System.in));
        String nombre;

        System.out.println("Introduce el nombre del fichero");
        nombre = sc.nextLine();


        if (nombre.equals("")) {
            nombre ="prueba.txt";
        }

        /*File f = ;

        if (!f.exists()) {
            System.out.println(nombre+" no Existe");
            return;
        }*/


        try {
            BufferedReader breader = new BufferedReader(new FileReader(new File(nombre)));
            String linea;
            while ((linea = breader.readLine())!= null) {
                System.out.println(linea);
            }

        } catch (IOException e) {
            System.out.println("ERROR->"+e.getMessage());
        }



    }
}
