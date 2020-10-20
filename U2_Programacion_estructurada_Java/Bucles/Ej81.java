package com.jdperez;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Ej81 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el número");
        num = sc.nextInt();

        while (num!=0) {
            if (num%2==0) {
                System.out.println("Es par");
            }

            if (num>0) {
                System.out.println("Es positivo");
            }

            System.out.println("El cuadrado del número es "+Math.pow(num,2));

            System.out.println("Introduce el número");
            num = sc.nextInt();
        }

    }
}
