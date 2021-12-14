package com.company;

import java.util.Arrays;

public class EjDavid3 {
    public static void main(String[] args) {
        int[] a = {14,8,18,123,181,99};
        int[] b = {11,21,31,41,51,100};

        System.out.println(Arrays.toString(filtra8(a)));
        System.out.println(Arrays.toString(filtra8(b)));
    }

    public static int[] filtra8(int[] numeros) {
        int[] resultado = new int[0];

        for (int i = 0; i < numeros.length ; i++) {
            if (contiene8(numeros[i])) {
                resultado = Arrays.copyOf(resultado,resultado.length+1);
                resultado[resultado.length-1] = numeros[i];
            }
        }

        if (resultado.length==0) {
            resultado = Arrays.copyOf(resultado,resultado.length+1);
            resultado[0] = -1;
        }

        return resultado;

    }

    public static boolean contiene8(int numero) {

        while (numero>0) {
            int cifra = numero%10;

            if (cifra==8) {
                return  true;
            }

            numero /=10;
        }

        return false;
    }

}
