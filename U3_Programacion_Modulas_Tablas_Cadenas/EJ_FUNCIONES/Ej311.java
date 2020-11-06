package com.jdperez;

import java.util.Scanner;

public class Ej311 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a;
        int n;

        System.out.println("Introduce la base");
        a = sc.nextDouble();

        System.out.println("Introduce el exponente");
        n = sc.nextInt();

        System.out.println("La potencia es "+potencia(a,n));

        System.out.println("La potencia es "+potenciaMath(a,n));

    }

    public static double potencia(double a, int n ) {
        double resultado = 1;

        for (int i = 0; i < n; i++) {
                resultado = resultado *a;
        }

        return resultado;
    }

    public static double potenciaMath(double a, int n) {
        return Math.pow(a,n);
    }


}
