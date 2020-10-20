package com.jdperez;

import java.util.Scanner;

public class Ej8b10 {
    public static void main(String[] args) {
        int altura;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca la altura");
        altura = sc.nextInt();

        for (int i = 0; i < altura; i++) {
            if (i==altura-1) {
                System.out.println(" **** ");
            } else {
                System.out.println("*    *");
            }

        }


    }
}
