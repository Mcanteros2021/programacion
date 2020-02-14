package com.jdperez;

public class Enano extends Personaje implements Atacar{
    private int altura;

    public Enano(int energia, int ataque, int defensa, String nombre, int altura) {
        super(energia, ataque, defensa, nombre);
        this.altura = altura;
    }

    @Override
    public void atacarPersonaje(Personaje p) {
        if (!p.getClass().equals(getClass())) {
            System.out.println("SOY "+getNombre()+" Y ESTOY ATACANDO");

            int damage =   p.isEncantado() ? (getAtaque()-p.getDefensa())*2 : getAtaque()-p.getDefensa() ;
            p.setEnergia(p.getEnergia()-damage);
        } else {
            System.out.println("No puedo atacar amigos");
        }
    }

    @Override
    public String toString() {
        return super.toString()+",altura=" + altura+"\n";
    }
}
