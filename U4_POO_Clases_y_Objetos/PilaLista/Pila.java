package com.company.Pila;

import java.util.Arrays;

public class Pila {
    private int[] numeros;

    public Pila() {
        this.numeros = new int[0];
    }

    public int[] getNumeros() {
        return numeros;
    }

    public void apilar(int numero) {
        int[] resultado = Arrays.copyOf(numeros,numeros.length+1);
        resultado[resultado.length-1] = numero;
        numeros = resultado;
    }

    public boolean desapilar() {
        if (numeros.length>0) {
            numeros = Arrays.copyOf(numeros,numeros.length-1);
            return true;
        }
        return false;
    }

    public int cima() {
        if (numeros.length>0) {
            return  numeros[numeros.length-1];
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Pila{" +
                "numeros=" + Arrays.toString(numeros) +
                '}';
    }
}
