package com.jdperez;

import java.util.Scanner;

public class Ej312 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Introduce el entero");
        num = sc.nextInt();

        System.out.println("El factorial de "+num+" es "+factorial(num));

    }

    public static int factorial(int n) {
        int factorial = 1;

        for (int i = 1; i <=n ; i++) {
            factorial = factorial*i;
        }

        return factorial;
    }
}
