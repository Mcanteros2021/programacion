package com.jdperez.viernes;

import java.util.Arrays;
import java.util.Scanner;

public class Ej4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] clave;
        int tam;
        String claveusuario;


        System.out.println("Introduce el tamaño de la clave");
        tam = sc.nextInt();
        sc.nextLine();

        clave = new int[tam];

        for (int i = 0; i < clave.length; i++) {
            clave[i] = (int) (Math.random()*5+1);
        }

        System.out.println(Arrays.toString(clave));

        do {
            System.out.println("Adivina la clase");
            claveusuario = sc.nextLine();

            for (int i = 0; i < clave.length; i++) {
                int a = Integer.parseInt(claveusuario.substring(i,i+1));
                if (clave[i]>a) {
                    System.out.println(claveusuario.charAt(i)+ " es menor");
                } else if (clave[i]<a) {
                    System.out.println(claveusuario.charAt(i)+ " es mayor");
                } else {
                    System.out.println(clave[i]+" es igual");
                }
            }

        } while (!iguales(clave,claveusuario));

        System.out.println("HAS ACERTADO");

    }

    public static boolean iguales(int[] numeros, String claveusuario) {
        for (int i = 0; i < numeros.length ; i++) {
            int a = Integer.parseInt(claveusuario.substring(i,i+1));
            if (numeros[i]!=a) {
                return false;
            }
        }

        return true;
    }
}
