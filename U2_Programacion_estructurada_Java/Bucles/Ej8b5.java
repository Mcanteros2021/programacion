package com.company;

import java.util.Scanner;

public class Ej8b5 {
    public static void main(String[] args) {
        int altura, num_espacios;
        Scanner sc = new Scanner(System.in);

        //Solicito la altura de la pirámide
        System.out.println("Introduce la altura");
        altura = sc.nextInt();

        //Calculo el número de espacios de la primera fila
        num_espacios = altura-1;

        for (int i = 1; i <=altura; i++) {

            //Escribimos los espacios en blanco
            for (int j=0; j<num_espacios;j++) {
                System.out.print("-");
            }

            //Escribimos los asteriscos
            // La anchura de la pirámide siempre será 2*altura -1
            // El número de asteriscos será la diferencia de restar a esa anchura
            // el doble de los espacios en blanco que estoy pintando (a ambos lados de los *)
            for (int j = 0; j < ((2*altura)-1)- 2*num_espacios; j++) {
                System.out.print("*");
            }

            System.out.println("");
            num_espacios--;
        }
    }
}
