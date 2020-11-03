package com.company;

import java.util.Scanner;

public class PiramideInvertida {
    public static void main(String[] args) {
        int alt,anchura;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introdece la altura");
        alt = sc.nextInt();

        anchura=2*alt-1;

        for (int i = 0; i < alt; i++) {

            //Imprimo los espacios
            for (int j = 0; j < i ; j++) {
                System.out.print(" ");
            }

            //Imprimo los asteriscos
            for (int j = 0; j < anchura- 2*i ; j++) {
                System.out.print("*");
            }

            //Imprimo los espacios
            for (int j = 0; j < i ; j++) {
                System.out.print(" ");
            }

            System.out.println("");
        }
    }
}
