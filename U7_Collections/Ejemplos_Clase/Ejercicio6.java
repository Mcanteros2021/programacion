package com.jdperez;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        LinkedHashSet<String> conjunto = new LinkedHashSet<>();

        System.out.println("Introduce nombre");
        while (!(nombre = sc.nextLine()).equals("fin")) {
            conjunto.add(nombre);
            System.out.println(conjunto);
            System.out.println("Introduce nombre");
        }
    }
}
