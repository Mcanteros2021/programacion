package com.jdperez;

import java.util.Arrays;
import java.util.Comparator;

public class RPG {

    private Personaje[] personajes;

    public boolean addPersonaje(Personaje p) {
        if (personajes!=null) {
            if (personajes.length==10) {
                System.out.println("No se pueden añadir más personajes a la partida");
                return false;
            } else {
                //Creo el nuevo vector con la nueva capacidad
                Personaje[] p1 = new Personaje[personajes.length+1];
                //Copio lo que tenía
                for (int i = 0; i <personajes.length ; i++) {
                    p1[i] = personajes[i];
                }
                p1[personajes.length] = p;
                //Cambio el nuevo por el viejo
                personajes = p1;
                return true;
            }
        } else {
            personajes = new Personaje[1];
            personajes[0] = p;
            return true;
        }

    }

    public void mostrarEstado() {
        Arrays.sort(personajes);
        System.out.println(Arrays.deepToString(personajes));
    }

    public void mostrarxAtaque() {
        Arrays.sort(personajes, new Comparator<Personaje>() {
            @Override
            public int compare(Personaje personaje, Personaje t1) {
                return personaje.getAtaque()-t1.getAtaque();
            }
        });
        System.out.println(Arrays.deepToString(personajes));
    }

    public void mostrarxDefensa() {
        Arrays.sort(personajes, new Comparator<Personaje>() {
            @Override
            public int compare(Personaje personaje, Personaje t1) {
                return personaje.getDefensa()-t1.getDefensa();
            }
        });
        System.out.println(Arrays.deepToString(personajes));
    }

    public void borrarMuertos() {
        int numMuertos = 0;
        //Obtengo el número de
        for (int i = 0; i < personajes.length ; i++) {
            if (personajes[i].getEnergia()<=0) {
                numMuertos++;
            }
        }
        Personaje[] p1 = new Personaje[personajes.length-numMuertos];
         int j=0;
        for (int i = 0; i < personajes.length ; i++) {
            if (personajes[i].getEnergia()>0) {
                p1[j] = personajes[i];
                j++;
            }
        }
        personajes = p1;
    }

}
