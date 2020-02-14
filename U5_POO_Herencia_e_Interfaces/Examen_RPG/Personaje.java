package com.jdperez;

public abstract class Personaje implements Comparable {
    private int energia;
    private int ataque;
    private int defensa;
    private String nombre;
    private boolean encantado;

    public Personaje(int energia, int ataque, int defensa, String nombre) {
        this.energia = energia;
        this.ataque = ataque;
        this.defensa = defensa;
        this.nombre = nombre;
        this.encantado = false;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEncantado() {
        return encantado;
    }

    public void setEncantado(boolean encantado) {
        this.encantado = encantado;
    }

    @Override
    public int compareTo(Object o) {
        return getEnergia()- ((Personaje) o).getEnergia();
    }

    @Override
    public String toString() {
        return  "nombre =" + nombre +
                ", ataque=" + ataque +
                ", defensa=" + defensa +
                ", energia='" + energia +
                ", encantado=" + encantado;
    }
}
