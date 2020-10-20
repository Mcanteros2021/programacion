package com.jdperez;

import java.util.Scanner;

public class Ej89 {
    public static void main(String[] args) {
        int alt_max,tag,num,cont;
        Scanner sc = new Scanner(System.in);

        alt_max = 0;
        cont = 0;
        tag = 0;

        do {
            System.out.println("Introduzca la altura");
            num = sc.nextInt();

            if (num > alt_max) {
                alt_max = num;
                tag = cont;
            }

            cont++;

        } while (num!=-1);

        System.out.println("La altura max es "+alt_max);
        System.out.println("Del árbol "+tag);

    }
}
