package com.jdperez;

public class Guerrero extends Hombre implements Atacar {
    private int edad;

    public Guerrero(int energia, int ataque, int defensa, String nombre, int edad) {
        super(energia, ataque, defensa, nombre);
        this.edad = edad;
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
        return super.toString()+"edad=" + edad + "\n";
    }
}
