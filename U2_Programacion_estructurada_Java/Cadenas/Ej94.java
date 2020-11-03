package com.company;

import java.util.Scanner;

public class Ej94 {
    public static void main(String[] args) {
        //Diseñar un programa que pida una frase al usuario, e indique si el carácter de la posición central es
        //o no es un espacio
        Scanner sc = new Scanner(System.in);
        String frase;

        //Leo la frase
        System.out.println("Introduce una frase");
        frase = sc.nextLine();


        if (frase.charAt((int)Math.floor(frase.length()/2))==' ') {
            System.out.println("El carácter central es un espacio");
        } else {
            System.out.println("El carácter centro no es un espacio");
        }

    }
}
