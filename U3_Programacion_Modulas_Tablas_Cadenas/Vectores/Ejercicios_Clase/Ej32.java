package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Ej32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] colores = {"verde","rojo","azul","amarillo","naranja","rosa","negro","blanco","morado"};
        String[] palabras = new String[8];
        String[] resultado = new String[0];

        for (int i = 0; i < palabras.length; i++) {
            System.out.println("Introduce una palabra");
            palabras[i] = sc.nextLine();

            if (esta(colores,palabras[i])) {
                resultado = Arrays.copyOf(resultado,resultado.length+1);
                resultado[resultado.length-1] = palabras[i];
            }
        }
        System.out.println(Arrays.toString(palabras));
        System.out.println(Arrays.toString(resultado));

        for (int i = 0; i < palabras.length; i++) {
            if (!esta(resultado,palabras[i])) {
                resultado = Arrays.copyOf(resultado,resultado.length+1);
                resultado[resultado.length-1] = palabras[i];
            }
        }

        System.out.println(Arrays.toString(palabras));
        System.out.println(Arrays.toString(resultado));


    }

    public static boolean esta(String[] palabras, String palabra) {

        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].equals(palabra)) {
                return true;
            }
        }

        return false;
    }
}
