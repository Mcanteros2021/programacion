package com.jdperez;

import java.util.Scanner;

public class Ej2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num, num_invertido, resto;

        num_invertido = 0;
        System.out.println("Introduce el entero");
        num = sc.nextInt();

        while (num != 0) {

            resto = num % 10; // 1º 5 - 2º 4 - 3º 3 - 4º 2 - 5º 1
            if (resto != 0 && resto != 8) {
                num_invertido = num_invertido * 10 + resto; // 1º 5 2º 54 3º 543 4º 5432 5º 54321
            }

            num = num / 10;
        }

        num = num_invertido;
        num_invertido = 0;

        while (num != 0) {

            resto = num % 10;
            num_invertido = num_invertido * 10 + resto;

            num = num / 10;
        }

        System.out.println(num_invertido);


    }
}
