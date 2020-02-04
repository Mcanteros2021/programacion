package com.jdperez;

import java.io.*;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcion;
        String original;
        String copia;
        String linea;


        System.out.println("Selecciona una opción");
        System.out.println("1- De original.txt a copia.txt");
        System.out.println("2- Introduce fichero fuente");

        opcion = sc.nextLine();

        if (opcion.equals("1")) {
            original = "original.txt";
            copia = "copia.txt";
        } else {
            System.out.println("Introduce el nombre del origen");
            original = sc.nextLine();
             copia ="copia_de_"+original;
        }

        try {

            BufferedReader br = new BufferedReader(new FileReader(new File(original)));
            BufferedWriter bw = new BufferedWriter(new FileWriter(new File(copia)));

            while ((linea=br.readLine())!=null) {
                bw.write(linea);;
                bw.newLine();
            }

            br.close();
            bw.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
