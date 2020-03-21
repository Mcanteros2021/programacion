package com.jdperez;

public class Medico {
    private String nombre;
    private String apellidos;
    private String hospital;
    private String numColegiado;

    public Medico(String nombre, String apellidos, String hospital, String numColegiado) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.hospital = hospital;
        this.numColegiado = numColegiado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public String getNumColegiado() {
        return numColegiado;
    }

    public void setNumColegiado(String numColegiado) {
        this.numColegiado = numColegiado;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", hospital='" + hospital + '\'' +
                ", numColegiado='" + numColegiado + '\'' +
                '}';
    }
}
