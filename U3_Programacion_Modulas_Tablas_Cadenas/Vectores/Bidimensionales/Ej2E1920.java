package com.company;

public class Ej2E1920 {
    public static void main(String[] args) {
        int[][] numeros = new int[4][5];
        int suma=0;
        int total=0;

        for (int i = 0; i < numeros.length ; i++) {
            suma = 0;
            for (int j = 0; j < numeros[i].length ; j++) {
                numeros[i][j] = (int)(Math.random()*100);
                System.out.print(numeros[i][j]+" ");
                suma+=numeros[i][j];
            }
            System.out.println(suma);
            total+=suma;
            System.out.println();

        }

        suma = 0;
        for (int j = 0; j < numeros[0].length ; j++) {

            suma=0;
            for (int i = 0; i < numeros.length ; i++) {
                suma+= numeros[i][j];
            }

            System.out.print(suma+" ");
            total+=suma;
        }

        System.out.println(total);




    }
}
