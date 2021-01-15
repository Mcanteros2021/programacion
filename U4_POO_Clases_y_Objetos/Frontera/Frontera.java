package com.jdperez;

import java.util.Arrays;
import java.util.Scanner;

public class Frontera {
    private Persona[] personas;

    public Frontera(Persona[] personas) {
        this.personas = personas;
    }

    public Frontera() {
        personas = new Persona[0];
    }

    public Persona[] getPersonas() {
        return personas;
    }

    public void setPersonas(Persona[] personas) {
        this.personas = personas;
    }

    public void addPersona(Persona p) {
        personas = Arrays.copyOf(personas,personas.length+1);
        personas[personas.length-1] = p;
    }

    public void addPersonas(Persona[] gente) {
        int longitud = personas.length;
        personas = Arrays.copyOf(personas,personas.length+gente.length);
        for (int i = 0; i < gente.length ; i++) {
            personas[longitud+i] = gente[i];
        }
    }

    public void pasoFrontera() {
        Scanner sc = new Scanner(System.in);
        String nombre;
        String apellidos;
        String dni;
        System.out.println("Introduce el nombre");
        nombre = sc.nextLine();
        System.out.println("Introduce los apellidos");
        apellidos = sc.nextLine();
        System.out.println("Introduce el dni");
        dni = sc.nextLine();

        addPersona(new Persona(nombre,apellidos,dni));
    }

    public String busquedaPorNombre(String nombre) {
        for (int i = 0; i < personas.length; i++) {
            if (personas[i].getNombre().equals(nombre)) {
                return personas[i].toString();
            }
        }

        return "NO LO ENCUENTRO";
    }

    public String busquedaPorDNI(String dni) {
        for (int i = 0; i < personas.length; i++) {
            if (personas[i].getDni().equals(dni)) {
                return personas[i].toString();
            }
        }

        return "NO LO ENCUENTRO";
    }

    @Override
    public String toString() {
        return "Frontera{" +
                "personas=" + Arrays.toString(personas) +
                '}';
    }
}
