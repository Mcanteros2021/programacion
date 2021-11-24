package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class RotarMatriz {
    public static void main(String[] args) {
        int[][] original;
        int[][] resultado;
        Scanner sc = new Scanner(System.in);
        int filas,cols;

        System.out.println("Introduce el número de filas");
        filas = sc.nextInt();

        System.out.println("Introduce el número de columnas");
        cols = sc.nextInt();

        original = new int[filas][cols];
        resultado = new int[cols][filas];

        for (int i = 0; i < original.length; i++) {

            for (int j = 0; j < original[i].length ; j++) {
                int valor = (int)(Math.random()*(200-100+1)+100);

                original[i][j] = valor;
                resultado[j][original.length-1-i] = valor;
            }
        }

        for (int[] row: original) {
            System.out.println(Arrays.toString(row));
        }

        for (int[] row: resultado) {
            System.out.println(Arrays.toString(row));
        }


    }
}
