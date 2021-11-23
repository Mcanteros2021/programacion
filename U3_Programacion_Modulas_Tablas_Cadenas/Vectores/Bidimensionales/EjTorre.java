package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class EjTorre {
    public static void main(String[] args) {
        String[][] tablero = new String[8][8];
        Character[] columnas = {'a','b','c','d','e','f','g','h'};
        Scanner sc = new Scanner(System.in);
        String posicion;

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j]="-";
            }
        }

        System.out.println("Introduzca la posición de la torre");
        posicion = sc.nextLine();

        int col = obtenerColumna(posicion.charAt(0),columnas);
        int fila = 8 - Integer.parseInt(""+posicion.charAt(1));

        tablero[fila][col] = "X";

        for (int i = 0; i < tablero.length; i++) {
            if (i!=fila)  {
                tablero[i][col] = "*";
                System.out.print(columnas[col]+""+(8-i)+" ");
            }
        }
        for (int j = 0; j < tablero[fila].length ; j++) {
            if (j!=col) {
                tablero[fila][j] ="*";
                System.out.print(columnas[j]+""+(8-fila)+" ");
            }
        }

        System.out.println();
        System.out.println(Arrays.toString(columnas));
        for ( String[] row: tablero ) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static int obtenerColumna(Character c,Character[] columnas) {
        for (int i = 0; i < columnas.length; i++) {
            if (columnas[i]==c) {
                return i;
            }
        }

        return 0;
    }

}
