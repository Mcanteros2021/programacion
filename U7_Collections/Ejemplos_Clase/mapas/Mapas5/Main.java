package com.jdperez;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcion;
        Set aspirantes = new LinkedHashSet<Aspirante>();
        LinkedList<Calificacion> notas;

        do {
            mostrarMenu();
            opcion = sc.nextLine();

            if (!opcion.equals("4")) {
                switch (opcion) {
                    case "1":
                        String nombre,dni,phone;
                        String seguir;
                        do {
                            System.out.println("Nombre:");
                            nombre = sc.nextLine();
                            System.out.println("DNI");
                            dni = sc.nextLine();
                            System.out.println("Teléfono");
                            phone = sc.nextLine();
                            aspirantes.add(IntroducirAspirante.insertarAspirante(nombre,dni,phone));
                            System.out.println("¿Quiere usted introducir otro aspirante (S/N)?");
                            seguir = sc.nextLine();
                        } while (seguir.equals("S"));

                        guardarAspirantes(aspirantes);
                        guardarIds(aspirantes);
                        break;
                    case "2":
                        notas = CalificacionPruebas.calificaciones();
                        guardarNotas(notas);
                        break;
                }
            }

        } while (!opcion.equals("4"));

    }

    public static void mostrarMenu() {
        System.out.println("1- Introducir datos de aspirantes");
        System.out.println("2- Calificar prueba");
        System.out.println("3- Aprobado");
        System.out.println("4- Salir");

    }

    public static void guardarAspirantes(Set<Aspirante> aspirantes) {
        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("aspirantes.dat"));

            Iterator it = aspirantes.iterator();
            while (it.hasNext()) {
                os.writeObject(it.next());
            }

            os.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void guardarIds(Set<Aspirante> aspirantes) {
        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("aspirantes.dat"));

            Iterator it = aspirantes.iterator();
            while (it.hasNext()) {
                Aspirante a = (Aspirante) it.next();
                os.writeInt(a.getId());
            }

            os.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public  static void guardarNotas(LinkedList<Calificacion> notas) {
        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("calificaciones.dat"));

            for (Calificacion c: notas) {
                os.writeObject(c);
            }

            os.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
