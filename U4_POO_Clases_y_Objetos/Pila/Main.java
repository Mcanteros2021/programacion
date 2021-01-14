package com.jdperez;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        long num;
        Scanner sc = new Scanner(System.in);
        int pos, valor;

        System.out.println("Introduce el número");
        num = sc.nextLong();

        System.out.println("Introduce la posición");
        pos  = sc.nextInt();

        System.out.println("Introduce el valor");
        valor = sc.nextInt();

        String cadena = Long.toString(num);
        String resultado = "";

        for (int i = 0; i < cadena.length(); i++) {
            if (pos == i+1) {
                resultado+=valor;
            } else {
                resultado+=cadena.charAt(i);
            }
        }

        System.out.println(resultado);


    }
}
