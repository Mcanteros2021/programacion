package com.company;

import java.util.Arrays;

public class EJ4ROJOM {
    public static void main(String[] args) {

        String[][] m1 = {
                {"Hola","Perro","C++"},
                {"Adios","Gato","Python"},
                {"Hasta Luego","Vaca","Java"},
                {"Hasta Luego","Vaca","Java"}
        };

        String[][] m2 = {
                {"BD","Sobresaliente","Pepe"},
                {"LM","Notable","Manuel"},
                {"Prog","Aprobado","Rosa"},
                {"Hasta Luego","Vaca","Java"}
        };

        String[][] resultado = unirMatrices(m1,m2);
        for (String[] row: resultado) {
            System.out.println(Arrays.toString(row));
        }

        if (resultado.length==0) {
            System.out.printf("{}");
        }
     }

    public static String[][] unirMatrices(String[][] m1,String[][] m2) {
        String[][] resultado;

        if (m1.length==m2.length && m1[0].length==m2[0].length) {

            resultado = new String[m1.length][2* m1[0].length];

            for (int i = 0; i < resultado.length ; i++) {

                for (int j = 0; j < resultado[i].length ; j++) {
                    if (j<3) {
                        resultado[i][j] = m1[i][j];
                    } else {
                        resultado[i][j] = m2[i][j-m1[i].length];
                    }
                }
            }

            return resultado;

        } else {
            resultado = new String[0][0];
            return resultado;
        }
    }
}
