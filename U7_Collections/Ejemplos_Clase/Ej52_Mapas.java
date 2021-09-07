package com.jdperez;

import java.util.*;

public class Ej51 {


    public static void main(String[] args) {
        Map<String,Integer> mapa_productos = new HashMap<String,Integer>();
        Map<String,Double> lista_precios = new HashMap<String, Double>();

        Scanner sc = new Scanner(System.in);
        String producto,cantidad;
        Set<LineaPedido> productos = new HashSet<>();
        Double total = 0.0;

        lista_precios.put("tomate",1.59);
        lista_precios.put("avena",2.21);
        lista_precios.put("quinoa",4.50);

        do {
            System.out.println("Producto");
            producto = sc.nextLine();
            if (!producto.equals("fin")) {
                System.out.println("Cantidad");
                 cantidad = sc.nextLine();

                 if (!mapa_productos.containsKey(producto)) {
                     mapa_productos.put(producto,Integer.parseInt(cantidad));
                 } else {
                     mapa_productos.put(producto, mapa_productos.get(producto)+Integer.parseInt(cantidad));
                 }


            }

        } while (!producto.equals("fin"));

        Set<Map.Entry<String,Integer>> elementos = mapa_productos.entrySet();
        Iterator it = elementos.iterator();
        System.out.println("-------------------------------");
        while(it.hasNext()) {
            Map.Entry<String,Integer> p = (Map.Entry<String,Integer>) it.next();
            Double precio_unitario = lista_precios.get(p.getKey());
            System.out.print(p.getKey()+"     ");
            System.out.print(precio_unitario+"   ");
            System.out.print(p.getValue()+"    ");
            System.out.println(p.getValue()*precio_unitario+"   ");

            total += p.getValue()*precio_unitario;
        }

        System.out.println("-------------------------------");
        System.out.println("TOTAL: "+total);

    }


}
