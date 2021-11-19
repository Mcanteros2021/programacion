package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Ej33 {
    public static void main(String[] args) {
        int[] mesas = new int[10];
        final int CAP_MESAS = 4;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < mesas.length; i++) {
            mesas[i] = (int) (Math.random()*5);
        }

        System.out.println(Arrays.toString(mesas));

        int personas;
        do {
            System.out.println("Introduce el número de comensales");
            personas = sc.nextInt();

            boolean sentados = false;

            if (mesaLibre(mesas) && personas<5) {
                for (int i = 0; i < mesas.length ; i++) {
                    if (mesas[i]==0) {
                        sentados = true;
                        mesas[i] = personas;
                        break;
                    }
                }
            } else {
                for (int i = 0; i < mesas.length; i++) {
                    if (mesas[i]+personas <= CAP_MESAS) {
                        sentados = true;
                        mesas[i]+= personas;
                        break;
                    }
                }
            }

            if (sentados) {
                System.out.println("Clientes aposentados");
            } else {
                System.out.println("No hay sitio en el restaurante");
            }

            System.out.println(Arrays.toString(mesas));

        } while (personas>0);

    }

    public static boolean mesaLibre(int[] mesas) {
        for(int m: mesas) {
            if (m==0) {
                return true;
            }
        }

        return false;
    }
}
