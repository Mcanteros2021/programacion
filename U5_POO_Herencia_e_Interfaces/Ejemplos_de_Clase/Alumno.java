package com.jdperez;

import java.util.Objects;

public class Alumno extends Persona implements Comparable{
    private int id;

    public Alumno(String nombre, String apellidos, String dni, int id) {
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
        Alumno alumno = (Alumno) o;
        return getId() == alumno.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public int compareTo(Object o) {
        Alumno a  =(Alumno) o;
        return getId()-a.getId();
    }
}
