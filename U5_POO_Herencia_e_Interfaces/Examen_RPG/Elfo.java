package com.jdperez;

public class Elfo extends Personaje implements Atacar{
    private TipoElfo tipo;

    public Elfo(int energia, int ataque, int defensa, String nombre, TipoElfo tipo) {
        super(energia, ataque, defensa, nombre);
        this.tipo = tipo;
    }

    @Override
    public void atacarPersonaje(Personaje p) {
        if (!p.getClass().equals(getClass())) {
            System.out.println("SOY "+getNombre()+" Y ESTOY ATACANDO");

            int damage =   p.isEncantado() ? (getAtaque()-p.getDefensa())*2
                    : getAtaque()-p.getDefensa() ;
            p.setEnergia(p.getEnergia()-damage);
        } else {
            System.out.println("No puedo atacar amigos");
        }
    }

    @Override
    public String toString() {
        return super.toString() +",tipo=" + tipo+"\n";
    }
}
