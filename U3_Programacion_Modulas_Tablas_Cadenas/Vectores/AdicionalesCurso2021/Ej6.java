package com.jdperez.ejerciciosadicionales;

public class Ej6 {
    public static void main(String[] args) {
        int[][] numeros = new int[6][10];
        int max=0;
        int min=0;
        String posMax="";
        String posMin="";

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                int n;

                do {
                    n = (int) (Math.random() * 1001);
                } while (estaNumero(numeros, n, i, j));

                numeros[i][j] = n;

                if (i==0 && i==0) {
                    max = numeros[i][j];
                    min = numeros[i][j];
                    posMax="[0:0]";
                    posMin="[0:0]";
                } else {
                    if (n>max) {
                        max = n;
                        posMax = "["+i+":"+j+"]";
                    }

                    if (n<min) {
                        min = n;
                        posMin = "["+i+":"+j+"]";
                    }
                }
            }
        }


        for (int[] fila : numeros) {
            for (int casilla : fila) {
                System.out.print(casilla + " ");
            }
            System.out.println();
        }

        System.out.println("El máximo es "+max+" y está en la posición "+posMax);
        System.out.println("El máximo es "+min+" y está en la posición "+posMin);

    }

    static public boolean estaNumero(int[][] v, int num, int fila, int columna) {
        int numcolumnas = 0;
        for (int i = 0; i < fila; i++) {
            if (i < fila) {
                numcolumnas = v[i].length;
            } else {
                numcolumnas = columna;
            }

            for (int j = 0; j < numcolumnas; j++) {
                if (v[i][j] == num) {
                    System.out.println("repetido el "+num);
                    return true;
                }
            }
        }

        return false;
    }

}
