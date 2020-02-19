package com.jdperez;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Ejercicio3 {
    public static void main(String[] args) {
        LinkedList<Integer> lista = new LinkedList<>();

        for (int i = 0; i <20 ; i++) {
            lista.add((int) (Math.random()*10));
            lista.sort(new Comparator<Integer>() {
                @Override
                public int compare(Integer integer, Integer t1) {
                    return t1-integer;
                }
            });
            /*Collections.sort(lista);
            Collections.reverse(lista);*/
            System.out.println(lista);
        }
    }
}
