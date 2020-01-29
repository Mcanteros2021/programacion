package com.jdperez;

import java.util.Objects;

public class Pas extends Persona implements CalcularNomina,Comparable{
    private int id;

    public Pas(String nombre, String apellidos, String dni, int id) {
        super(nombre, apellidos, dni);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return super.toString()+"id="+id+"\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pas pas = (Pas) o;
        return getId() == pas.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public int cobrar() {
        return 1200;
    }

    @Override
    public int compareTo(Object o) {
        Pas p = (Pas) o;
        return getId()-p.getId();
    }
}
