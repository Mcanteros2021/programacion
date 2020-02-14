package com.jdperez;

public class Mago extends Hombre implements Magia{
    private int longitudBarba;

    public Mago(int energia, int ataque, int defensa, String nombre, int longitudBarba) {
        super(energia, ataque, defensa, nombre);
        this.longitudBarba = longitudBarba;
    }

    @Override
    public String toString() {
        return super.toString()+",longitudBarba=" + longitudBarba;
    }
}
