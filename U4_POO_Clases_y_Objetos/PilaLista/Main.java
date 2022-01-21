package com.company.Pila;

public class Main {
    public static void main(String[] args) {
        PilaLista pila = new PilaLista();

        pila.apilar(5);
        pila.apilar(6);
        pila.apilar(8);
        pila.desapilar();
        System.out.println(pila.cima());

        System.out.println(pila);

        pila.desapilar();
        System.out.println(pila);
        pila.desapilar();
        System.out.println(pila);
        pila.desapilar();
        System.out.println(pila);
        pila.desapilar();
        System.out.println(pila);
        pila.desapilar();
        System.out.println(pila);
        pila.desapilar();
        System.out.println(pila);

        System.out.println(pila.cima());

        System.out.println(pila);


    }
}
