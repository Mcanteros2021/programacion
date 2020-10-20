package com.jdperez;

import java.util.Scanner;

public class Ej84 {
    public static void main(String[] args) {
        int num,i;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el número");
        num = sc.nextInt();

        for (i = 1; i <= num ; i++) {
            System.out.println("En el for "+i);
        }

        i=1;

        while (i<=num) {
            System.out.println("En el while"+ i);
            i++;
        }

        i=1;
        do {
            System.out.println("En el do"+ i);
            i++;
        } while (i<=num);
    }
}
