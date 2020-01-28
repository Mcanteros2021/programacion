package com.jdperez;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        Cliente[] clientes = new Cliente[5];

        clientes[0] = new Cliente("2222222X","Pepe",25,100) ;
        clientes[1] = new Cliente("3333333X","Manuel",18,50) ;
        clientes[2] = new Cliente("1111111X","Rafael",68,200) ;
        clientes[3] = new Cliente("6666666X","Ana",70) ;
        clientes[4] = new Cliente("4444444X","Rosa",21,15) ;

        Arrays.sort(clientes);

        System.out.println(Arrays.deepToString(clientes));

        Arrays.sort(clientes,new ComparaEdadClientes());

        System.out.println(Arrays.deepToString(clientes));

        Arrays.sort(clientes, new Comparator<Cliente>() {
            @Override
            public int compare(Cliente cliente, Cliente t1) {
                return (int)(cliente.saldo-t1.saldo);
            }
        });

        System.out.println(Arrays.deepToString(clientes));


    }
}
