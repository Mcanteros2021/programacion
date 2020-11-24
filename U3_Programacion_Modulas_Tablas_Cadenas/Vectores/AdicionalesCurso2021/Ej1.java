package com.jdperez.ejerciciosadicionales;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        int[] numeros = new int[100];
        Scanner sc = new Scanner(System.in);
        int max=0;
        int min=0;
        int opcion;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random()*501);
            if (i==0) {
                max = numeros[i];
                min = numeros[i];
            } else {
                if (numeros[i]>max) {
                    max = numeros[i];
                }

                if (numeros[i]<min) {
                    min = numeros[i];
                }
            }
        }

        for (int num : numeros) {
            System.out.print(num+" ");
        }

        System.out.println();
        System.out.println("¿Qué quieres destacar (1-mínimo, 2-máximo)");
        opcion = sc.nextInt();

        for(int num:numeros) {
            if ( (opcion==1 && num==min) || (opcion==2 && num==max)) {
                System.out.print("**"+num+"** ");
            } else{
                System.out.print(num+" ");
            }
        }

        /*System.out.println();

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]+" ");
        }*/





    }
}
