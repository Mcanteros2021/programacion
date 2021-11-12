package com.company;

import jdk.dynalink.StandardNamespace;

import java.util.Scanner;

public class Ej27Bi {
    public static void main(String[] args) {
        int[][] notas = new int[3][5];
        Scanner sc = new Scanner(System.in);
        int suma;

        for (int i = 0; i < notas.length; i++) {
            suma=0;

            for (int j = 0; j < notas[i].length; j++) {
                System.out.println("Introduce el dato para el alumno "+j+" en el trimeste "+(i+1));
                notas[i][j] = sc.nextInt();
                suma += notas[i][j];
            }

            System.out.println("La media del trimeste "+ (i+1)+"es "+ ((double)suma/notas[0].length));
        }

        System.out.println("Introduce el alumno");
        int pos = sc.nextInt();
        suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i][pos];
        }
        System.out.println("La media del alumno "+ pos+" es "+ ((double)suma/notas.length));

    }
}
