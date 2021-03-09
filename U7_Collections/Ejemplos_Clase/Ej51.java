package com.jdperez;

import java.util.*;

public class Ej51 {


    public static void main(String[] args) {
        Map<String,Double> lista_precios = new HashMap<String, Double>();
        Scanner sc = new Scanner(System.in);
        String producto,cantidad;
        List productos = new ArrayList<LineaPedido>();
        Double total = 0.0;

        lista_precios.put("tomate",1.59);
        lista_precios.put("quinoa",4.50);
        lista_precios.put("avena",2.21);

        do {
            System.out.println("Producto");
            producto = sc.nextLine();
            if (!producto.equals("fin")) {
                System.out.println("Cantidad");
                 cantidad = sc.nextLine();

                LineaPedido lp = new LineaPedido(producto,Integer.parseInt(cantidad));

                productos.add(lp);

            }

        } while (!producto.equals("fin"));

        Iterator it = productos.iterator();
        System.out.println("-------------------------------");
        while(it.hasNext()) {
            LineaPedido p = (LineaPedido) it.next();
            Double precio_unitario = lista_precios.get(p.getNombre());
            System.out.print(p.getNombre()+"     ");
            System.out.print(precio_unitario+"   ");
            System.out.print(p.getCantidad()+"    ");
            System.out.println(p.getCantidad()*precio_unitario+"   ");

            total += p.getCantidad()*precio_unitario;
        }

        System.out.println("-------------------------------");
        System.out.println("TOTAL: "+total);

    }


}
