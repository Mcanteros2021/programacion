package com.jdperez;

import java.util.*;

public class Ejercicio2 {

    public static void main(String[] args) {
        LinkedList<Integer> lista = new LinkedList<>();

        for (int i = 0; i <20 ; i++) {
            lista.add((int) (Math.random()*99+1));
        }
        System.out.println(lista);
        /*lista.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer integer, Integer t1) {
                return t1-integer;
            }
        });*/

        /*Collections.sort(lista);
        System.out.println(lista);
        Collections.reverse(lista);
        System.out.println(lista);*/
        Collections.sort(lista, new Comparator<Integer>() {
            @Override
            public int compare(Integer integer, Integer t1) {
                return t1-integer;
            }
        });


        System.out.println(lista);
    }
}
