package com.company.empresa;

public class Main {

    public static void main(String[] args) {
        Empleado e1 = new Empleado("Pepe Perez","2222222","626456789");
        Empleado e2 = new Empleado("Ana Lopez","33333","66677788", TipoEmpleado.DIREC);

        Departamento d1 = new Departamento("Ventas","333");
        Departamento d2 = new Departamento("Compras","Tomares","444");

        Empresa em1 = new Empresa("ALIXAR SA");

        d1.addEmpleado(e1);
        d2.addEmpleado(e2);

        em1.addDepartamento(d1);
        em1.addDepartamento(d2);

        System.out.println(em1);

        d1.deleteEmpleado(e1);

        System.out.println(em1);
    }

}
