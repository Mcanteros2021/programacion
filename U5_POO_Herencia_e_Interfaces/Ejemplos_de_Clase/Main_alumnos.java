package com.jdperez;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        Profesor[] profesores = new Profesor[3];

        Profesor p1 = new Profesor("Pepe","Perez","11111X","XXXXX");
        Profesor p2 = new Profesor("Manuel","Perez","222222X","AAAAA");
        Profesor p3 = new Profesor("Ana","Perez","3333X","ZZZZZ");

        profesores[0] = p3;
        profesores[1] = p2;
        profesores[2] = p1;

        Arrays.sort(profesores);

        System.out.println(Arrays.deepToString(profesores));

        Arrays.sort(profesores, new Comparator<Profesor>() {
            @Override
            public int compare(Profesor profesor, Profesor t1) {
                return profesor.getDni().compareTo(t1.getDni());
            }
        });

        System.out.println(Arrays.deepToString(profesores));

    }
}
