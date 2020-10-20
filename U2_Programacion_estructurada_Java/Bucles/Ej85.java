package com.jdperez;

import java.util.Scanner;

public class Ej85 {
    public static void main(String[] args) {
        int min,max,num,aux;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el mínimo del rango");
        min = sc.nextInt();

        System.out.println("Introduce el máximo del rango");
        max = sc.nextInt();

        if (max < min) {
            aux = min;
            min = max;
            max = aux;
        }

        System.out.println(min);
        System.out.println(max);

        System.out.println("Introduce el número");
        num = sc.nextInt();

        while (num>max || num < min) {
            System.out.println("Introduce el número");
            num = sc.nextInt();
        }

        /*while (!(num>=min && num<=max)) {
            System.out.println("Introduce el número");
            num = sc.nextInt();
        }*/

    }
}
