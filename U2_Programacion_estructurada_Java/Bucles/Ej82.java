package com.jdperez;

import java.util.Scanner;

public class Ej82 {
    public static void main(String[] args) {
        int num, suma, num_alumnos, num_adultos;
        Scanner sc = new Scanner(System.in);

        suma = 0;
        num_adultos = 0;
        num_alumnos = 0;

        System.out.println("Introduce la edad del alumno");
        num = sc.nextInt();

        while (num>0) {
            num_alumnos++;
            suma += num;
            if (num > 18) {
                num_adultos++;
            }
            System.out.println("Introduce la edad del alumno");
            num = sc.nextInt();
        }

        System.out.println("La suma es "+suma);
        System.out.println("La media es "+ (suma/num_alumnos));
        System.out.println("El números de mayores de edad es"+num_adultos);

    }
}
