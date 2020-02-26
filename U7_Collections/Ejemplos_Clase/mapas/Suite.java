package com.jdperez.mapas;

import java.io.*;
import java.util.*;

public class Suite {
    public static void main(String[] args) {

        Map<String,Empleado> empleados = new LinkedHashMap<>();
        String opcion;
        Scanner sc= new Scanner(System.in);

        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("empleados.bin"));

            while (true) {
                Empleado e = (Empleado) ois.readObject();
                empleados.put(e.getDni(),e);
            }

        } catch (Exception e) {
            System.out.println("Fichero cargado");
        }

        imprimirMenu();

        while ( !(opcion = sc.nextLine()).equals("6")) {
            switch (opcion) {

                case "1":
                    if (empleados.size()==0) {
                        System.out.println("Ningún empleado cargado");
                    } else {
                        System.out.println(empleados);
                    }
                    break;
                case "2":
                    String clave;
                    System.out.println("Introduce el dni del empleado a borrar");
                    clave = sc.nextLine();

                    if (empleados.containsKey(clave)) {
                        empleados.remove(clave);
                    } else {
                        System.out.println("El empleado no existe");
                    }
                    break;
                case "3":
                    String dni;
                    System.out.println("Introduce el dni del empleado a mostrar");
                    dni = sc.nextLine();

                    if (empleados.containsKey(dni)) {
                        Empleado e = empleados.get(dni);
                        System.out.println(e);
                    } else {
                        System.out.println("El empleado no existe");
                    }

                    break;
                case "4":
                    String nombre;
                    String d;
                    int edad;
                    int estatura;
                    float sueldo;
                    System.out.println("Introduce DNI");
                    d = sc.nextLine();

                    if (empleados.containsKey(d)) {
                        System.out.println("Introduce el nombre");
                        nombre = sc.next();
                        System.out.println("Introduce la edad");
                        edad = sc.nextInt();
                        System.out.println("Introduce la estatura");
                        estatura = sc.nextInt();
                        System.out.println("Introduce el sueldo");
                        sueldo = sc.nextFloat();

                        Empleado e = empleados.get(d);

                        e.setEdad(edad);
                        e.setEstatura(estatura);
                        e.setNombre(nombre);

                        //empleados.put(d,e);

                    } else {
                        System.out.println("Ese empleado no existe");
                    }

                    break;
                case "5":
                    String name;
                    String id;
                    int age;
                    int alt;
                    float income;
                    System.out.println("Introduce DNI");
                    id = sc.nextLine();
                    System.out.println("Introduce el nombre");
                    name = sc.next();
                    System.out.println("Introduce la edad");
                    age = sc.nextInt();
                    System.out.println("Introduce la estatura");
                    alt = sc.nextInt();
                    System.out.println("Introduce el sueldo");
                    income = sc.nextFloat();

                    sc.nextLine();

                    Empleado e = new Empleado(name,id,age,alt,income);

                    empleados.put(id,e);

                    break;
                default:
                    System.out.println("Opción incorrecta");

            }
        }

        Collection<Empleado> emp = empleados.values();

        try   {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("empleados.bin"));

            Iterator it = emp.iterator();
            while(it.hasNext()) {
                oos.writeObject(it.next());
            }

            oos.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }



    }

    public static void imprimirMenu() {
        System.out.println("1- Visualizar lista");
        System.out.println("2- Borrar objeto");
        System.out.println("3- Visualizar empleado");
        System.out.println("4- Modificar empleado");
        System.out.println("5- Insertar");
        System.out.println("6- Salir");
    }


}
