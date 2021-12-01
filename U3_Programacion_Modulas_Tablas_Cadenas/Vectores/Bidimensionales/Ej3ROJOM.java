package com.company;

public class Ej3ROJOM {
    public static void main(String[] args) {
        int[][] alturas = new int[4][10];
        String[] paises = {"España","Rusia","Japón","Australia"};
        int max=0,min=0,suma=0;

        for (int i = 0; i < alturas.length; i++) {

            System.out.print(paises[i]+": ");

            for (int j = 0; j < alturas[i].length ; j++) {
                int numero = (int)(Math.random()*(210-140)+140);
                alturas[i][j] = numero;
                if (j==0) {
                    max = numero;
                    min = numero;
                    suma = numero;
                } else {
                    if (numero>max) {
                        max = numero;
                    }
                    if (numero<min) {
                        min = numero;
                    }
                    suma+=numero;
                }
                System.out.print(numero+" ");
            }

            System.out.println("| "+(suma/alturas[i].length)+" "+max+" "+min);
        }
    }
}
