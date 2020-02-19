package com.jdperez;

import java.util.*;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;
        String[] palabras;
        ArrayList<String> lista = new ArrayList<>();
        Set<String> conjunto = new LinkedHashSet<>();


        System.out.println("Introduce la frase");
        frase = sc.nextLine();

        palabras = frase.split(" ");

        for(String p:palabras) {
            lista.add(p);
        }

        conjunto.clear();

        Iterator it = lista.iterator();
        while (it.hasNext()) {
            String c = (String) it.next();
            if (Collections.frequency(lista, c) > 1) {
                conjunto.add(c);
            }
        }

        lista.removeAll(conjunto);

        System.out.println(lista);

    }
}
