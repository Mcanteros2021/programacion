package com.jdperez;

import javax.imageio.IIOException;
import java.io.*;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        String edad;

        System.out.println("Introduce el nombre");
        nombre = sc.nextLine();

        System.out.println("Introduce la edad");
        edad = sc.nextLine();

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(new File("datos.txt")));

            bw.write("Nombre: "+nombre);
            bw.newLine();
            bw.write("Edad: "+edad);
            bw.newLine();

            bw.close();
        } catch (IOException e) {
            System.out.println("ERROR--->"+e.getMessage());
        }
    }
}
