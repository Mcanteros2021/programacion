package com.jdperez;

import java.io.*;

public class Ej8 {
    public static void main(String[] args) {
        double[] numeros = new double[10];


        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (Math.random()*1000);
        }

        try {
            FileOutputStream fos= new FileOutputStream("numeros.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            Cliente c = new Cliente("Pepe","Perez","Aquí");

            oos.writeObject((Object)c);

            oos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fis= new FileInputStream("numeros.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Cliente c;
            Persona p;

                c = (Cliente) ois.readObject();

            ois.close();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println();






    }
}
