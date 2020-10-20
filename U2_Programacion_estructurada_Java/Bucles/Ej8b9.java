package com.jdperez;

import java.util.Scanner;

public class Ej8b9 {
    public static void main(String[] args) {
        int altura;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la altura");
        altura = sc.nextInt();

        for (int i = 0; i < altura; i++) {
            if (i<altura-1) {
                System.out.println("*");
            } else {
                for (int j = 0; j < altura/2+1 ; j++) {
                    System.out.print("*");
                }
            }
        }
    }
}
