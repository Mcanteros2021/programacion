package com.jdperez;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        TreeSet<String> conjunto = new TreeSet<>();

        System.out.println("Introduce nombre");
        while (!(nombre = sc.nextLine()).equals("fin")) {
            conjunto.add(nombre);
            System.out.println(conjunto);
            System.out.println("Introduce nombre");
        }

        try {
            BufferedWriter bf = new BufferedWriter(new FileWriter(new File("nombres.txt")));

            Iterator it = conjunto.iterator();
            while (it.hasNext()) {
                bf.write(it.next()+"\n");
            }

            for (String s: conjunto) {
                bf.write(s+"\n");
            }

            bf.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
