package com.jdperez;

import java.io.Serializable;

public class Aspirante implements Serializable {
    private String nombre;
    private String dni;
    private String phone;
    private int id;
    private static int idAspirante = 0;

    public Aspirante(String nombre, String dni, String phone) {
        this.nombre = nombre;
        this.dni = dni;
        this.phone = phone;
        this.id = Aspirante.idAspirante;
        Aspirante.idAspirante++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
