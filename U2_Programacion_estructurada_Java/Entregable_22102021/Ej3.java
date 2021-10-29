package com.company;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        int numEntradas;
        String dia, tarjeta;
        Scanner sc = new Scanner(System.in);
        Double total=0.0;
        Double descuento=0.0;
        Double precioEntrada = 8.0;
        int numEntradasPareja =0;


        System.out.println("Venta de entradas CineCampa");
        System.out.println("Número de entradas");
        numEntradas = sc.nextInt();
        sc.nextLine();

        System.out.println("Día de la semana");
        dia = sc.nextLine();

        System.out.println("¿Tiene tarjeta CineCampa (s/n)?");
        tarjeta = sc.nextLine();

        if (dia.equals("miercoles")) {
            precioEntrada=5.0;
        } else if (dia.equals("jueves")) {
            numEntradasPareja = numEntradas/2;
        }

        if (!dia.equals("jueves")) {
            System.out.println("Entradas individuales:"+numEntradas);
            System.out.println("Precio por entrada individual:"+precioEntrada);
            System.out.println("Total:"+(numEntradas*precioEntrada));
            total = precioEntrada;
        } else {
            System.out.println("Entradas de pareja:"+numEntradasPareja);
            System.out.println("Entrada individuales:"+(numEntradas%2));
            System.out.println("Precio de entradas por pareja:"+(11*numEntradasPareja));
            System.out.println("Total:"+ ((11*numEntradasPareja)+(8*(numEntradas%2))));
            total = (double) (11*numEntradasPareja)+8*(numEntradas%2);
        }

        if (tarjeta.equals("s")) {
            descuento = total*0.1;
        }

        System.out.println("Descuento: "+descuento);
        System.out.println("A pagar: "+(total-descuento));

    }
}
