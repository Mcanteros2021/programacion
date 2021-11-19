package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Ej34 {
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
        System.out.println("Introduzca la posición del alfil");
        posicion = sc.nextLine();

        int col = obtenerColumna(posicion.charAt(0),columnas);
        int fila = 8 - Integer.parseInt(""+posicion.charAt(1));

        tablero[fila][col] = "X";



        //Diagonal Superior Derecha
        int i = fila-1;
        int j = col+1;
        while (estaDentro(i,j)) {
            tablero[i][j] = "x";
            System.out.print(columnas[j]+""+(8-i)+" ");
            i--;
            j++;
        }

        //Diagonal SUperior Izquierda
        i = fila-1;
        j = col-1;
        while (estaDentro(i,j)) {
            tablero[i][j] = "x";
            System.out.print(columnas[j]+""+(8-i)+" ");
            i--;
            j--;
        }

        //Diagonal Inferior Derecha
        i = fila+1;
        j = col+1;
        while (estaDentro(i,j)) {
            tablero[i][j] = "x";
            System.out.print(columnas[j]+""+(8-i)+" ");
            i++;
            j++;
        }

        //Diagonal Inferior Izquierda
        i = fila+1;
        j = col-1;
        while (estaDentro(i,j)) {
            tablero[i][j] = "x";
            System.out.print(columnas[j]+""+(8-i)+" ");
            i++;
            j--;
        }

        System.out.println();
        for (String[] row: tablero) {
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

    public static boolean estaDentro(int i, int j) {
        return (i>=0 && i<=7 && j>=0 && j<=7);
    }


}
