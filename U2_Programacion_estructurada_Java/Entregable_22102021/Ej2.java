package com.company;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        int num, cifra;
        int numReverse=0;
        int ocurrencias = 0;
        String posiciones="";
        int posicion=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el número");
        num = sc.nextInt();

        System.out.println("Introduce la cifra");
        cifra = sc.nextInt();

        //Le doy la vuelta para contar las ocurrencias
        while (num>0) {
            if (cifra==num%10) {
                ocurrencias++;
            }

            numReverse = numReverse*10 + num%10;
            num = num/10;
        }

        System.out.println("Número al revés "+numReverse);
        System.out.println("Ocurrencias: "+ocurrencias);
        //Vuelvo a darle la vuelta para obtener las posiciones correctas

        while(numReverse>0) {
            if (cifra==numReverse%10) {
                posiciones = posiciones+"-"+posicion;
            }

            numReverse = numReverse/10;
            posicion++;
        }

        if (posiciones.equals("")) {
            System.out.println("Posiciones:NINGUNA");
        } else {
            System.out.println("Posiciones:"+ posiciones);
        }


    }
}
