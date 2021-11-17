package com.company;

import java.util.Arrays;

public class Ej35 {
    public static void main(String[] args) {
        int[][] numeros = new int[10][10];
        int mayor = 0;
        int menor = 0;
        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {

            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = (int) (Math.random() * 100) + 200;
                if (i == 0 && j == 0) {
                    mayor = numeros[i][j];
                    menor = numeros[i][j];
                }
                if (i == j) {
                    suma+= numeros[i][j];
                    if (numeros[i][j] > mayor) {
                        mayor = numeros[i][j];
                    }
                    if (numeros[i][j] < menor) {
                        menor = numeros[i][j];
                    }
                }
            }
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(Arrays.toString(numeros[i]));
        }

        System.out.println("El mayor es :"+mayor);
        System.out.println("El menor es :"+menor);
        System.out.println("la media es :"+ (suma/numeros.length));
    }
}
