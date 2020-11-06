package com.jdperez;

import java.util.Scanner;

public class Ej310 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1,n2;


        System.out.println("Introduce el primer número");
        n1 = sc.nextInt();

        System.out.println("Introduce el segundo número");
        n2 = sc.nextInt();

        if (sonAmigos(n1,n2)) {
            System.out.println("SON AMIGOS");
        } else {
            System.out.println("SON ENEMIGOS");
        }
        
    }

    public static boolean sonAmigos(int n1, int n2) {
        int suma1 = 0;
        int suma2 = 0;

        for (int i = 1; i < n1; i++) {
            if (n1%i == 0) {
                suma1 += i;
            }
        }

        for (int i = 1; i <n2 ; i++) {
            if (n2%i == 0) {
                suma2 += i;
            }
        }

        if (n1 == suma2 && n2 == suma1) {
            return true;
        }
        return false;
    }
}
