package com.jdperez;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Ejercicio1 {

    public static void main(String[] args) {
        LinkedList<Integer> lista = new LinkedList<>();

        for (int i = 0; i <20 ; i++) {
            lista.add((int) (Math.random()*99+1));
        }

        System.out.println(lista);

        /*lista.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer integer, Integer t1) {
                return integer-t1;
            }
        });*/

        Collections.sort(lista);

        System.out.println(lista);
    }
}
