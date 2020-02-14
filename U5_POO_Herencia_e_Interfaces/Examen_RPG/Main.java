package com.jdperez;

public class Main {

    public static void main(String[] args) {
        RPG juego = new RPG();

        Elfo e1 = new Elfo(1000,80,50,"Pepe", TipoElfo.BOSQUE);
        Elfo e2 = new Elfo(800,50,60,"Ana", TipoElfo.BOSQUE);
        Enano en1 = new Enano(50,10,20,"Gimli",80);
        Mago m1 = new Mago(100,100,1000,"Gandalf",60);

        juego.addPersonaje(e1);
        juego.addPersonaje(e2);
        juego.addPersonaje(en1);
        juego.addPersonaje(m1);

        m1.encantar(en1);

        e1.atacarPersonaje(en1);

        juego.mostrarEstado();
        juego.borrarMuertos();
        juego.mostrarxAtaque();
        juego.mostrarxDefensa();
    }

}
