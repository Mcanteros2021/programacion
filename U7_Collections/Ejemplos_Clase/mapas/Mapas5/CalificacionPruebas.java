package com.jdperez;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CalificacionPruebas {

    public static LinkedList<Calificacion> calificaciones() {
        Scanner sc = new Scanner(System.in);
        LinkedList<Calificacion> lista_califaciones = new LinkedList<Calificacion>();

        Double nota;
        try {
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("id_aspirantes.dat"));

            while (true) {
                Integer id = is.readInt();
                System.out.println("Introduce la nota del aspirante");
                nota = sc.nextDouble();
                lista_califaciones.add (new Calificacion(id,nota));
            }
        } catch (Exception e) {

        }

        return lista_califaciones;
    }
}
