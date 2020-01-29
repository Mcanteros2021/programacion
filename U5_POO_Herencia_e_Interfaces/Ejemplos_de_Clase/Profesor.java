package com.jdperez;

import java.util.Objects;

public class Profesor extends Persona implements CalcularNomina, Comparable {
    private String nss;

    public Profesor(String nombre, String apellidos, String dni, String nss) {
        super(nombre, apellidos, dni);
        this.nss = nss;
    }

    public String getNss() {
        return nss;
    }

    public void setNss(String nss) {
        this.nss = nss;
    }

    @Override
    public String toString() {
        return super.toString()+"nss="+nss+"\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Profesor profesor = (Profesor) o;
        return getNss().equals(profesor.getNss());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNss());
    }

    @Override
    public int cobrar() {
        return 1500;
    }

    @Override
    public int compareTo(Object o) {
        Profesor p = (Profesor) o;
        return getNss().compareTo(p.getNss());
    }
}
