package com.jdperez.Maquinaria;

public class Vagon {
    private double capacidad;
    private double carga;
    private String tipo;

    public Vagon(double capacidad, double carga, String tipo) {
        this.capacidad = capacidad;
        this.carga = carga;
        this.tipo = tipo;
    }

    public Vagon(double capacidad, String tipo) {
        this(capacidad,0,tipo);
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Vagon{" +
                "capacidad=" + capacidad +
                ", carga=" + carga +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
