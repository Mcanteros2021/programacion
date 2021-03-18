package com.jdperez;

import java.io.*;
import java.util.*;

public class Maraton {

    private Map<Integer,Atleta> atletas;

    public Maraton() {
        atletas = new HashMap<>();
    }

    public Map<Integer, Atleta> getAtletas() {
        return atletas;
    }

    public void setAtletas(Map<Integer, Atleta> atletas) {
        this.atletas = atletas;
    }

    public void addAtleta() {
        String nombre;
        String pais;
        String categoria;
        Categoria c = Categoria.JUNIOR;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el nombre");
        nombre = sc.nextLine();

        System.out.println("Introduce el pais");
        pais = sc.nextLine();

        System.out.println("Introduce la categoria");
        categoria = sc.nextLine();

        switch (categoria) {
            case "SENIOR":
                c = Categoria.SENIOR;
                break;
            case "JUNIOR":
                c = Categoria.JUNIOR;
                break;
            case "VETERANO":
                c = Categoria.VETERANO;
                break;
        }

        Atleta a = new Atleta(nombre,pais,c);
        atletas.put(a.getDorsal(),a);
    }

    public void addTiempo(Integer dorsal, int marca) {

        if (atletas.containsKey(dorsal)) {
            atletas.get(dorsal).setTiempo(marca);
            atletas.get(dorsal).setFinisher(true);
        }

    }

    public boolean borrarAtleta(Integer dorsal) {
        if (atletas.containsKey(dorsal)) {
            atletas.remove(dorsal);
            return true;
        }

        return false;
    }

    public void mostrarListaFinishers() {
         Collection<Atleta> valores = atletas.values();
         Set<Atleta> ordenado = new TreeSet<>();

         Iterator it = valores.iterator();

         while (it.hasNext()) {
             Atleta a = (Atleta)it.next();

             if (a.isFinisher()) {
                ordenado.add(a);
             }
         }

        System.out.println(ordenado);
    }

    public void mostrarListacategoria(Categoria categoria) {
        Collection<Atleta> valores = atletas.values();
        Set<Atleta> ordenado = new TreeSet<>();

        for (Atleta a: valores) {
            if (a.getCategoria().equals(categoria) && a.isFinisher()) {
                ordenado.add(a);
            }
        }

        System.out.println(ordenado);
    }

    public void participantesPorPais(String pais) {
        int num = 0;

        Collection<Atleta> valores = atletas.values();


        for (Atleta a: valores) {
            if (a.getPais().equals(pais)) {
                num++;
            }
        }

        System.out.println("EL número de participantes de "+pais+" es "+num);
    }

    public void cargarAtletas() {
        try {
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("atletas.dat"));

            while (true) {
                Atleta a = (Atleta) is.readObject();
                atletas.put(a.getDorsal(),a);
                Atleta.setNumAtletas(a.getDorsal());

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void guardarAtletas() {

        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("atletas.data"));

            Collection<Atleta> participantes = atletas.values();

            for (Atleta a: participantes ) {
                os.writeObject(a);
            }

            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
