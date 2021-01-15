package com.jdperez;

import java.io.PipedWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Persona p1 = new Persona("Pepe","Pérez","2222222x");
	    Persona p2 = new Persona("Rosa","Pérez","3333333x");

        Scanner sc = new Scanner(System.in);
        Persona[] v = new Persona[2];
        v[0] = p1;
        v[1] = p2;

        Frontera f = new Frontera(v);
        String opcion;

        /*f.addPersona(p1);
        f.addPersona(p2);*/

        System.out.println(f);

        do {
            mostrarMenu();
            System.out.println("Introduce la opción");
            opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                    f.pasoFrontera();
                    break;
                case "2":
                    System.out.println(f);
                    break;
                case "3":
                    System.out.println("Introduce el nombre a buscar");
                    String nombre;
                    nombre = sc.nextLine();
                    System.out.println(f.busquedaPorNombre(nombre));
                    break;
                case "4":
                    System.out.println("Introduce el dni a buscar");
                    String dni;
                    dni = sc.nextLine();
                    System.out.println(f.busquedaPorDNI(dni));
                    break;
                case "5":
                    System.out.println("ADIOS");
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }

        } while (!opcion.equals("5"));
    }

    public static void mostrarMenu() {
        System.out.println("1- Paso de Frontera");
        System.out.println("2- Mostrar todas las personas");
        System.out.println("3- Búsqueda por nombre");
        System.out.println("4- Búsqueda por DNI");
        System.out.println("5- Salir");

    }
}
