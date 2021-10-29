package com.company;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        String numeroCadena;
        Scanner sc = new Scanner(System.in);
        String primeraParte="";
        String segundaParte="";

        do {
            System.out.println("Introduce el número");
            numeroCadena = sc.nextLine();
        } while (numeroCadena.length()%2!=0);

        for (int i = 0; i < numeroCadena.length()/2; i++) {
            primeraParte+=numeroCadena.charAt(i);
        }

        for (int i = numeroCadena.length()/2+1; i < numeroCadena.length(); i++) {
            segundaParte+=numeroCadena.charAt(i);
        }

        int n1 = Integer.parseInt(primeraParte);
        int n2 = Integer.parseInt(segundaParte);

        boolean esPrimo=true;

        for (int i = 2; i < n1 ; i++) {
            if (n1%i==0) {
                esPrimo=false;
                break;
            }
        }

        if (esPrimo) {
            System.out.println(n1+" es primo");
        } else {
            System.out.println(n1+" no es primo");
        }

        esPrimo=true;

        for (int i = 2; i < n2 ; i++) {
            if (n2%i==0) {
                esPrimo=false;
                break;
            }
        }

        if (esPrimo) {
            System.out.println(n2+" es primo");
        } else {
            System.out.println(n2+" no es primo");
        }

    }
}
