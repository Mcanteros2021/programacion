package com.jdperez.ejerciciosadicionales;

import java.sql.Array;
import java.util.Arrays;

public class Ej5 {
    public static void main(String[] args) {
        int[][] numeros = new int[10][10];
        int maximo=0;
        int minimo=0;
        int suma=0;


        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = (int) (Math.random()*101+200);
                if (i==0 && j==0) {
                    maximo = numeros[i][j];
                    minimo = numeros[i][j];
                }

                if (i==j) {

                    suma+=numeros[i][j];
                    if (numeros[i][j]>maximo) {
                        maximo = numeros[i][j];
                    }
                    if (numeros[i][j]<minimo) {
                        minimo = numeros[i][j];
                    }
                }
            }
        }


       /* for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                if (i==j) {
                    if (numeros[i][j]>maximo) {
                        maximo = numeros[i][j];
                    }
                    if (numeros[i][j]<minimo) {
                        minimo = numeros[i][j];
                    }
                }
            }
        }

        for (int i = 0; i < numeros.length ; i++) {
            if (numeros[i][i]>maximo) {
                maximo = numeros[i][i];
            }
            if (numeros[i][i]<minimo) {
                minimo = numeros[i][i];
            }
        }*/


      /*  System.out.println(Arrays.deepToString(numeros));

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(Arrays.toString(numeros[i]));
        }*/

        for (int[] fila: numeros) {
            System.out.println(Arrays.toString(fila));
        }

        System.out.println("El mayor es "+maximo);
        System.out.println("El menor es "+minimo);
        System.out.println("La media es "+(double)suma/10);

    }
}
