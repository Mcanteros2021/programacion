package com.company;

import java.util.Scanner;

public class EjNotas {
    public static void main(String[] args) {
        double n1,n2,n3;
        double media;
        String recup;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la primera nota");
        n1 = sc.nextDouble();

        System.out.println("Introduce la segunda nota");
        n2 = sc.nextDouble();

        System.out.println("Introduce la tercera nota");
        n3 = sc.nextDouble();

        media = (n1+n2+n3)/3;

        if (media>=5) {
            if (media>=5 && media<6) {
                System.out.println("Tu nota es "+media+" Suficiente");
            } else if (media>=6 && media < 7) {
                System.out.println("Tu nota es "+media+" Bien");
            } else if (media>=7 && media < 9) {
                System.out.println("Tu nota es "+media+" Notable");
            } else {
                System.out.println("Tu nota es "+media+" Sobresaliente");
            }
        } else {
            System.out.println("Introduce tu nota de recuperación");
            sc.nextLine();
            recup = sc.nextLine();

            if (recup.equals("apto")) {
                System.out.println("Tu nota de programación es suficiente 5");
            } else {
                System.out.println("Tu nota de programación es suspenso "+media);
            }
        }


    }
}
