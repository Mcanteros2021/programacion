package com.jdperez;

import java.util.Scanner;

public class Ej2Logaritmo {
    public static void main(String[] args) {
        int num,num_final,cifra;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el número");
        num = sc.nextInt(); //84123

        num_final = 0;

        while (num!=0) {

            int log = (int) Math.log10(num); //1º 4 - 2º 3
            cifra = num / (int) Math.pow(10,log); // 1ª 8 - 2º 4

            if (cifra!=0 && cifra!=8) {
                num_final = num_final*10 + cifra;
            }

            num = num - cifra*(int) Math.pow(10,log); // 1º 4123
        }

        System.out.println(num_final);
    }
}
