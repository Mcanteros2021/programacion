package com.company.empresa;

import java.util.Arrays;
import java.util.Objects;

public class Departamento {
    private String nombre;
    private String sede;
    private String ext;
    private Empleado[] empleados;
    private static int numDepartamentos = 0;

    public Departamento(String nombre, String sede, String ext) {
        this.nombre = nombre;
        this.sede = sede;
        this.ext = ext;
        this.empleados = new Empleado[0];
        Departamento.numDepartamentos++;
    }

    public Departamento(String nombre, String ext) {
       this(nombre,"Castilleja",ext);
    }

    public boolean addEmpleado(Empleado empleado) {

        if (!estaEmpleado(empleado)) {
            Empleado[] resultado = Arrays.copyOf(empleados,empleados.length+1);
            resultado[resultado.length-1] = empleado;
            empleados = resultado;
            return true;
        }

        return false;
    }

    private boolean estaEmpleado(Empleado empleado) {
        for (int i = 0; i < empleados.length; i++) {
            if (empleados[i].equals(empleado)) {
                return true;
            }
        }

        return false;
    }
    public boolean deleteEmpleado(Empleado empleado) {
        if (estaEmpleado(empleado)) {
            Empleado[] resultado = new Empleado[0];
            for (int i = 0; i < empleados.length ; i++) {
                if (!empleados[i].equals(empleado)) {
                    resultado = Arrays.copyOf(empleados,empleados.length+1);
                    resultado[resultado.length-1] =  empleados[i];
                }
            }

            empleados = resultado;
            return true;
        }

        return false;
    }

    public void mostrarEmpleados() {
        System.out.println(Arrays.toString(empleados));
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "nombre='" + nombre + '\'' +
                ", sede='" + sede + '\'' +
                ", ext='" + ext + '\'' +
                ", empleados=" + Arrays.toString(empleados) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Departamento that = (Departamento) o;
        return nombre.equals(that.nombre) && sede.equals(that.sede);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, sede);
    }

    public static int getNumDepartamentos() {
        return numDepartamentos;
    }


}
