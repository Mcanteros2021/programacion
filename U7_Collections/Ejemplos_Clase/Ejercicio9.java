package com.jdperez;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ejercicio9 {
    public static void main(String[] args) {
        String[] v1 = {"Ana","Pepe","Carlos","Rosa","Curro"};
        String[] v2 = {"Ana","Juan","Rosa","Isabel","Sara"};
        Set<String> conjunto1 = new HashSet<>(Arrays.asList(v1));
        Set<String> conjunto2 = new HashSet<>(Arrays.asList(v2));

        System.out.println(conjuntoUnion(conjunto1,conjunto2));
        System.out.println(conjuntoInterseccion(conjunto1,conjunto2));
        System.out.println(conjuntoDirencia(conjunto1,conjunto2));


    }

    public static Set conjuntoUnion(Set c1,Set c2) {

        Set<String> resultado = new HashSet<>();
        resultado.addAll(c1);
        resultado.addAll(c2);

        return resultado;

    }

    public static Set conjuntoInterseccion(Set<String> c1,Set<String> c2) {
        Set<String> resultado = new HashSet<>();

        for (String s : c1) {
            if (c2.contains(s)) {
                resultado.add(s);
            }
        }

        return resultado;

    }

    public static Set conjuntoDirencia(Set<String> c1,Set<String> c2) {
        Set<String> resultado = new HashSet<>();

        for (String s : c1) {
            if (!c2.contains(s)) {
                resultado.add(s);
            }
        }

        return resultado;

    }


}
