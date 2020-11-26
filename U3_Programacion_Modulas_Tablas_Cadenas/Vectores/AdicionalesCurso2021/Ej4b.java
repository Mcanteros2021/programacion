package com.jdperez.ejerciciosadicionales;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ej4b {
    public static void main(String[] args) {
        int[] filas = {8,7,6,5,4,3,2,1};
        String[] columnas = {"a","b","c","d","e","f","g","h"};
        String[][] tablero = new String[8][8];


        //POSICION D5
        int filaInicial = 2;
        int columnaInicial =6;

        for (int i = 0; i < tablero.length; i++) {

            for (int j = 0; j < tablero[i].length; j++) {
                if (i+j == filaInicial+columnaInicial || i-j == filaInicial-columnaInicial) {
                    tablero[i][j] ="X";
                    System.out.print(columnas[j]+filas[i]+" ");
                } else {
                    tablero[i][j] ="-";
                }
            }
        }

        System.out.println();
        tablero[filaInicial][columnaInicial]="O";

      /*  System.out.println(Arrays.deepToString(tablero));*/
        System.out.println(" "+Arrays.toString(columnas));
        for (int i = 0; i < tablero.length; i++) {
            System.out.println(filas[i]+Arrays.toString(tablero[i]));
        }

    }
}
