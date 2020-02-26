package com.jdperez.mapas;

import java.io.Serializable;

public class Empleado extends Persona implements Serializable {
    private float sueldo;

    public Empleado(String nombre, String dni, int edad, int estatura, float sueldo) {
        super(nombre, dni, edad, estatura);
        this.sueldo = sueldo;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return super.toString()+"Empleado{" +
                "sueldo=" + sueldo +
                '}';
    }
}
