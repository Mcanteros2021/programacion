package com.jdperez;

import com.jdperez.Maquinaria.Locomotora;
import com.jdperez.Maquinaria.Tren;
import com.jdperez.Maquinaria.Vagon;
import com.jdperez.Personal.Maquinista;
import com.jdperez.Personal.Mecanico;

import javax.sound.sampled.FloatControl;

public class Main {

    public static void main(String[] args) {

        Mecanico pepe = new Mecanico("Pepe Perez","666777888");
        Locomotora loc = new Locomotora("2222XXX777",5000,2000,pepe);
        Maquinista maquinista = new Maquinista("Julián Rodríguez","6666555X",1500,"Oficial");
        Vagon[] vagones = {new Vagon(10000,1500,"MERCANCIA"),
                           new Vagon(11000,1500,"PASAJEROS"),
                           new Vagon(12000,1500,"PASAJEROS"),
                           new Vagon(13000,1500,"PASAJEROS")};



        Tren tren1 = new Tren(maquinista, loc);

        Tren tren2 = new Tren(maquinista,loc,vagones);

        System.out.println(tren1);
        System.out.println(tren2);

        System.out.println(tren1.addVagon(new Vagon(15000,1500,"PASAJEROS")));

        System.out.println(tren1);

        if (tren2.addVagon(new Vagon(15000,1500,"PASAJEROS"))) {
            System.out.println("AÑADIDO");
        }

        System.out.println(tren2);




    }
}
