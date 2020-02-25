package com.jdperez.mapas;

import javax.imageio.ImageTranscoder;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<Integer,String> alumnos = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        String dni;

        alumnos.put(dniValue("22222222X"),"22222222X");
        alumnos.put(dniValue("33333333X"),"33333333X");
        alumnos.put(dniValue("44444444X"),"44444444X");
        alumnos.put(dniValue("55555555X"),"55555555X");
        alumnos.put(dniValue("66666666X"),"66666666X");

        System.out.println(alumnos);

        System.out.println("Introduce el DNI a buscar");
        dni = sc.nextLine();

        if (alumnos.containsKey(dniValue(dni))) {
            System.out.println("El alumno existe");
            System.out.println("El valor es"+alumnos.get(dniValue(dni)));
        } else {
            System.out.println("El alumno no existe");
        }

        Set<Map.Entry<Integer,String>> alumnos2 = alumnos.entrySet();

        /*for ( Map.Entry<Integer,String> a : alumnos2) {
            System.out.println("La clave "+ a.getKey());
            System.out.println("El valor es "+a.getValue());
        }*/

        Iterator it = alumnos2.iterator();
        while (it.hasNext()) {
            Map.Entry<Integer,String> a = (Map.Entry<Integer,String>)it.next();
            System.out.println("La clave "+ a.getKey());
            System.out.println("El valor es "+a.getValue());
        }
    }

    public static int dniValue(String dni) {
        int result = 0;
        for (int i = 0; i < dni.length()-1 ; i++) {
            result += Character.getNumericValue(dni.charAt(i));
        }

        return result;
    }
}
