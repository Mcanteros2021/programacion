package com.company;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        int altura,anchura;
        Scanner sc = new Scanner(System.in);
        String fila ="";
        do {
            System.out.println("Introduce la altura");
            altura = sc.nextInt();
        } while (altura<3 && altura%2==0);

        anchura = altura*2+2;

        for (int i = 0; i < altura ; i++) {

            for (int j = 0; j < anchura ; j++) {
                 if ((i==0 && j!=altura && j!=altura+1) ||
                         (i==altura-1 && j!=altura && j!=altura+1) ||
                         (i+j==altura-1) ||
                         (i+j)==anchura-1) {
                     System.out.print("*");
                } else {
                     System.out.print("-");
                 }

            }
            System.out.println();
        }

        for (int i = 0; i < altura ; i++) {
            fila="";
            for (int j = 0; j < altura ; j++) {
                if (i==0 || i==altura-1 || i+j==altura-1) {
                    fila+="*";
                } else {
                    fila+="-";
                }
            }
            System.out.println(fila+"---"+fila);

        }

    }
}
