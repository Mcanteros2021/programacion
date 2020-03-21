package com.jdperez;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class CoronaVirus {
    private final String localidad = "WUHAN";
    private final String nombre = "COVID-19";
    private Map<Character, Set<Paciente>> pacientes;

    public CoronaVirus() {
        pacientes = new HashMap<>();
    }

    public boolean addPaciente(Character cepa, Paciente paciente) {

        if (cepa.equals(paciente.getCepa())) {
            if (!pacientes.containsKey(cepa)) {
                pacientes.put(cepa, new TreeSet<>());
            }

            pacientes.get(cepa).add(paciente);

            return true;
        }

        System.out.printf("No coincide la cepa con la del paciente");
        return false;
    }

    public boolean darDeAltaPaciente(Paciente paciente ) {
        if (!pacientes.containsKey(paciente.getCepa())) {
            System.out.printf("No hay pacientes registrados con esa Cepa");
            return false;
        }

        if (pacientes.get(paciente.getCepa()).contains(paciente)) {
            return pacientes.get(paciente.getCepa()).remove(paciente);
        } else {
            System.out.println("El paciente no consta en la lista de su cepa");
            return false;
        }
    }

    public void pacientesDeUnDoctor(String numColegiado) {

        Collection<Set<Paciente>> conjunto = pacientes.values();
        int numPacientes = 0;


        Iterator it = conjunto.iterator();

        while (it.hasNext()) {
            Set<Paciente> dogs = (Set<Paciente>) it.next();

            for (Paciente p : dogs) {
                if (p.getMedico().getNumColegiado().equals(numColegiado)) {
                    System.out.println(p);
                    numPacientes++;
                }
            }
        }

        if (numPacientes == 0) {
            System.out.println("Este médico no lleva ningún paciente");
        }
    }

    public void pacientesPorPeso(Character cepa) {
        if (!pacientes.containsKey(cepa)) {
            System.out.println("No hay perros inscritos de esa raza");
        } else {
            System.out.println(pacientes.get(cepa));
        }
    }

    public void pacientesPorEdad(Character cepa) {
        if (!pacientes.containsKey(cepa)) {
            System.out.println("No hay perros inscritos de esa raza");
        } else {
            List<Paciente> lista = new ArrayList<>(pacientes.get(cepa));

            Collections.sort(lista, new Comparator<Paciente>() {
                @Override
                public int compare(Paciente paciente, Paciente t1) {
                    return t1.getEdad()-paciente.getEdad();
                }
            });

            System.out.println(lista);
        }

    }

    public void cargarPacientes() {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("pacientes.dat"));

            while (true) {
                Paciente p = (Paciente) ois.readObject();
                addPaciente(p.getCepa(),p);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void guardarPacientes() {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("pacientes.dat"));
            Collection<Set<Paciente>> conjunto = pacientes.values();

            Iterator it = conjunto.iterator();

            while (it.hasNext()) {
                Set<Paciente> dogs = (Set<Paciente>) it.next();

                for (Paciente p : dogs) {
                    oos.writeObject(p);
                }
            }

            oos.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }


}
