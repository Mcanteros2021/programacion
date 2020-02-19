package com.jdperez;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class Ejercicio8 {

    public static void main(String[] args) {
        String[] nombres = {"Ana","Rosa","Pepe","Paco","Pepe"};

        ArrayList<String> lista = new ArrayList<>(Arrays.asList(nombres));

        List<String> listaSinRepetidos = eliminarRepetidos(lista);

        try {

            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("nombres.bin"));

            for (String s: listaSinRepetidos) {
                oos.writeObject(s);
            }

            oos.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    public static List eliminarRepetidos(List lista) {
        Set<String> conjunto = new LinkedHashSet<>();
        conjunto.addAll(lista);
        List<String> nuevaLista = new ArrayList<>();
        nuevaLista.addAll(conjunto);

        return nuevaLista;

    }


}
