package com.jdperez.Maquinaria;

import com.jdperez.Personal.Maquinista;

import java.util.Arrays;

public class Tren {
    private Maquinista maquinista;
    private Locomotora locomotora;
    static final int capacidad = 5;
    private Vagon[] vagones;

    public Tren(Maquinista maquinista, Locomotora locomotora, Vagon[] vagones) {
        this.maquinista = maquinista;
        this.locomotora = locomotora;
        if (vagones.length<=Tren.capacidad) {
            this.vagones = vagones;
        } else {
            vagones = new Vagon[0];
        }

    }

    public Tren(Maquinista maquinista, Locomotora locomotora) {
        this(maquinista,locomotora,new Vagon[0]);
    }

    public boolean addVagon(Vagon v) {
        if (this.vagones.length<5) {
            this.vagones = Arrays.copyOf(this.vagones,this.vagones.length+1);
            this.vagones[this.vagones.length-1] = v;
            return true;
        } else {
            return false;
        }
    }

    public boolean removeVagon() {
        if (this.vagones.length>0) {
            this.vagones = Arrays.copyOf(this.vagones,this.vagones.length-1);
            return true;
        } else {
            return false;
        }
    }


    @Override
    public String toString() {
        return "Tren{" +
                "maquinista=" + maquinista +
                ", locomotora=" + locomotora +
                ", vagones=" + Arrays.toString(vagones) +
                '}';
    }
}
