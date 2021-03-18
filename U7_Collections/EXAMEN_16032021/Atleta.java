package com.jdperez;

import java.io.Serializable;

public class Atleta implements  Comparable<Atleta>, Serializable {
    private String nombre;
    private String pais;
    private Integer tiempo;
    private boolean finisher;
    private int dorsal;
    private Categoria categoria;
    private static int numAtletas = 1;

    public Atleta(String nombre, String pais, Categoria categoria) {
        this.nombre = nombre;
        this.pais = pais;
        this.categoria = categoria;
        this.finisher = false;
        this.dorsal = Atleta.numAtletas;
        Atleta.numAtletas++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Integer getTiempo() {
        return tiempo;
    }

    public void setTiempo(Integer tiempo) {
        this.tiempo = tiempo;
    }

    public boolean isFinisher() {
        return finisher;
    }

    public void setFinisher(boolean finisher) {
        this.finisher = finisher;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Atleta{" +
                "nombre='" + nombre + '\'' +
                ", pais='" + pais + '\'' +
                ", tiempo=" + tiempo +
                ", finisher=" + finisher +
                ", dorsal=" + dorsal +
                ", categoria=" + categoria +
                '}';
    }

    @Override
    public int compareTo(Atleta o) {
        return this.tiempo-o.getTiempo();
    }

    public static int getNumAtletas() {
        return numAtletas;
    }

    public static void setNumAtletas(int numAtletas) {
        Atleta.numAtletas = numAtletas;
    }
}

