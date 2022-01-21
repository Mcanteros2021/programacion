package com.company.Lista;

import java.util.Arrays;

public class Lista {
    private int capacidad;
    private int[] numeros;

    public Lista() {
        this(10);
    }

    public Lista(int capacidad) {
        this.capacidad = capacidad;
        numeros = new int[0];
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int[] getNumeros() {
        return numeros;
    }

    public boolean addFinal(int numero) {
        if (numeros.length<capacidad) {
            int[] resultado = Arrays.copyOf(numeros,numeros.length+1);
            resultado[resultado.length-1] = numero;
            numeros = resultado;
            return true;
        }

        return false;
    }

    public boolean addInicio(int numero) {
        if (numeros.length<capacidad) {
            int[] resultado = new int[numeros.length+1];
            resultado[0] = numero;

            for (int i = 0; i < numeros.length ; i++) {
                resultado[i+1] = numeros[i];
            }
            numeros = resultado;
            return true;
        }

        return false;
    }

    public boolean addPosicion(int numero, int pos) {
        if (numeros.length<capacidad && pos>=0 && pos<=numeros.length-1) {
            int[] resultado = new int[numeros.length+1];

            for (int i = 0; i < numeros.length; i++) {
                if (i<pos) {
                    resultado[i] = numeros[i];
                } else{
                    resultado[i+1] = numeros[i];
                }
            }

            resultado[pos] = numero;
            numeros = resultado;
            return true;
        }

        return false;
    }

    public boolean addLista(Lista lista) {
        if (numeros.length+lista.getNumeros().length<=capacidad) {
            int[] resultado = new int[numeros.length+lista.getNumeros().length];

            for (int i = 0; i < numeros.length; i++) {
                resultado[i] = numeros[i];
            }

            for (int i = 0; i < lista.getNumeros().length; i++) {
                resultado[i+ numeros.length] = lista.getNumeros()[i];
            }

            numeros = resultado;
            return true;
        }

        return false;
    }

    public boolean eliminarPosicion(int pos) {
        if (pos>=0 && pos<=numeros.length-1) {
            int[] resultado = new int[numeros.length-1];

            for (int i = 0; i < numeros.length; i++) {
                if (i<pos) {
                    resultado[i] = numeros[i];
                } else if (i>pos) {
                    resultado[i-1] = numeros[i];
                }
            }

            numeros = resultado;
            return true;
        }

        return false;
    }

    public int posicionNumero(int numero) {

        for (int i = 0; i < numeros.length ; i++) {
            if (numeros[i] == numero) {
                return i;
            }
        }

        return -1;
    }

    @Override
    public String toString() {
        return "Lista{" +
                "capacidad=" + capacidad +
                ", numeros=" + Arrays.toString(numeros) +
                '}';
    }
}
