package com.jdperez;

import java.util.*;

public class Ejercicio5 {

    public static void main(String[] args) {
        //Solución con comparator decreciente
        /*TreeSet<Integer> conjunto = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer integer, Integer t1) {
                return t1-integer;
            }
        });

        while (conjunto.size()<20) {
            conjunto.add((int)(Math.random()*100));
            System.out.println(conjunto);
        }

        */

        //Solución "mala" haciendo conversión de collections
       LinkedHashSet<Integer> conjunto = new LinkedHashSet<>();

        while (conjunto.size()<20) {
            conjunto.add((int)(Math.random()*100));
            List<Integer> lista= new ArrayList<>();
            lista.addAll(conjunto);
            Collections.sort(lista);
            Collections.reverse(lista);
            conjunto.clear();
            conjunto.addAll(lista);
            System.out.println(conjunto);
        }
    }
}
