package com.company.empresa;

import java.util.Arrays;
import java.util.Objects;

public class Empresa {

    private String nombre;
    private Departamento[] departamentos;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.departamentos = new Departamento[0];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Departamento[] getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(Departamento[] departamentos) {
        this.departamentos = departamentos;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", departamentos=" + Arrays.toString(departamentos) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empresa empresa = (Empresa) o;
        return nombre.equals(empresa.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    public boolean addDepartamento(Departamento departamento) {

        if (!estaDepartamento(departamento)) {
            Departamento[] resultado = Arrays.copyOf(departamentos,departamentos.length+1);
            resultado[resultado.length-1] = departamento;
            departamentos = resultado;
            return true;
        }

        return false;
    }

    private boolean estaDepartamento(Departamento departamento) {
        for (int i = 0; i < departamentos.length; i++) {
            if (departamentos[i].equals(departamento)) {
                return true;
            }
        }

        return false;
    }
}
