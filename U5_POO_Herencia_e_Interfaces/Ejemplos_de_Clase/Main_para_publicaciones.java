package com.jdperez;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        Revista[] revistas = new Revista[3];

        revistas[0] = new Revista("33333","A",2018,1);
        revistas[1] = new Revista("22222","E",2018,2);
        revistas[2] = new Revista("11111","B",2018,3);

        Arrays.sort(revistas);

        System.out.println(Arrays.deepToString(revistas));

        Arrays.sort(revistas, new Comparator<Revista>() {
            @Override
            public int compare(Revista revista, Revista t1) {
                return revista.getTitulo().compareTo(t1.getTitulo());
            }
        });

        System.out.println(Arrays.deepToString(revistas));
    }
}
