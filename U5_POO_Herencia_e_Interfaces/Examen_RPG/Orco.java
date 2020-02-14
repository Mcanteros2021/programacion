package com.jdperez;

public class Orco extends Personaje implements Atacar {
    private int tonelaje;

    public Orco(int energia, int ataque, int defensa, String nombre, int tonelaje) {
        super(energia, ataque, defensa, nombre);
        this.tonelaje = tonelaje;
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
        return super.toString()+",tonelaje= " + tonelaje;

    }
}
