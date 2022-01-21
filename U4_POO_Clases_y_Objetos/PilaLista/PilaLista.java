package com.company.Pila;

import com.company.Lista.Lista;

import java.util.Arrays;

public class PilaLista {

    Lista lista;

    public PilaLista() {
        lista = new Lista(100);
    }

    public void apilar(int numero) {
        lista.addFinal(numero);
    }

    public boolean desapilar() {
        return lista.eliminarPosicion(lista.getNumeros().length-1);
    }

    public int cima() {
        if (lista.getNumeros().length>0) {
            return lista.getNumeros()[lista.getNumeros().length-1];
        }

        return -1;
    }

    @Override
    public String toString() {
        return "PilaLista{" +
                "lista=" + lista +
                '}';
    }
}
