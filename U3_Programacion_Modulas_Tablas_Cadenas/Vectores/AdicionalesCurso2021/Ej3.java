package com.jdperez.ejerciciosadicionales;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Ej3 {

    public static final int CAPACIDAD = 4;

    public static void main(String[] args) {
        int[] mesas = new int[10];
        int[] nummesas = {1,2,3,4,5,6,7,8,9,10};
        int entrada;
        Scanner sc = new Scanner(System.in);


        for (int i = 0; i < mesas.length ; i++) {
            mesas[i] = (int) (Math.random()*5);
        }

        System.out.println(Arrays.toString(nummesas));
        System.out.println(Arrays.toString(mesas));

        do {
            System.out.println("Cúantos son?. (-1 para salir");
            entrada = sc.nextInt();

            if (entrada!=-1) {
                if (hayMesaVacia(mesas) && entrada<=CAPACIDAD) {
                    for (int i = 0; i < mesas.length ; i++) {
                        if (mesas[i]==0) {
                            mesas[i] = entrada;
                            System.out.println("A LA MESA:"+(i+1));
                            break;
                        }
                    }
                } else if (hayHueco(mesas,entrada)) {
                    for (int i = 0; i < mesas.length ; i++) {
                        if (mesas[i]+entrada<=CAPACIDAD) {
                            mesas[i] = mesas[i]+entrada;
                            System.out.println("A LA MESA:"+(i+1));
                            break;
                        }
                    }
                } else {
                    System.out.println("NO HAY SITIO");
                }
            }

            System.out.println(Arrays.toString(nummesas));
            System.out.println(Arrays.toString(mesas));

        } while (entrada!=-1);
    }

    public static boolean hayMesaVacia(int[] m) {

        for (int i = 0; i < m.length; i++) {
            if (m[i]==0) {
                return true;
            }
        }

        return false;
    }

    public static boolean hayHueco(int[] m, int entrada) {
        for (int i = 0; i < m.length; i++) {
            if (m[i]+entrada<=CAPACIDAD) {
                return true;
            }
        }

        return false;
    }

}
