package com.company;

import java.util.Arrays;

public class Mezclar {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b = {4,5,6};

        System.out.println(Arrays.toString(mezcla(a,b)));
        System.out.println(Arrays.toString(mezclaACO(a,b)));

        int[] c = {1,2,3,4,5,6};
        int[] d = {7,8,9};

        System.out.println(Arrays.toString(mezcla(c,d)));
        System.out.println(Arrays.toString(mezclaACO(c,d)));

        int[] e = {1,2,3};
        int[] f = {4,5,6,7,8,9};

        System.out.println(Arrays.toString(mezcla(e,f)));
        System.out.println(Arrays.toString(mezclaACO(e,f)));
    }

    public static int[] mezcla(int[] a,int[] b) {
        int[] resultado = new int[a.length+ b.length];
        int pos = 0;
        int tamMenor = (a.length>b.length ? b.length : a.length);

        for (int i = 0; i < tamMenor; i++) {
            resultado[pos] = a[i];
            pos++;
            resultado[pos] = b[i];
            pos++;
        }

        int[] vMayor = (a.length>b.length ? a : b);

        for (int i = tamMenor; i < vMayor.length ; i++) {
            resultado[pos] = vMayor[i];
            pos++;
        }

        return resultado;
    }

    public static int[] mezclaACO(int[] a,int[] b) {
        int[] resultado = new int[0];
        int tamMenor = (a.length>b.length ? b.length : a.length);

        for (int i = 0; i < tamMenor ; i++) {

            resultado = Arrays.copyOf(resultado,resultado.length+1);
            resultado[resultado.length-1] = a[i];

            resultado = Arrays.copyOf(resultado,resultado.length+1);
            resultado[resultado.length-1] = b[i];
        }

        int[] vMayor = (a.length>b.length ? a : b);

        for (int i = tamMenor; i < vMayor.length ; i++) {
            resultado = Arrays.copyOf(resultado,resultado.length+1);
            resultado[resultado.length-1] = vMayor[i];
        }

        return  resultado;
    }
}
