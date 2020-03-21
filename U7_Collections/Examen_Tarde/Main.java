package com.jdperez;

import java.util.HashMap;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Medico m1 = new Medico("Tomás", "Toledano","Macarena","1234546");
        Medico m2 = new Medico("Álvaro", "Arcelado","Juan Ramón Jiménez","888888");
        Medico m3 = new Medico("Carmen", "Zamora", "Virgen del Rocío", "66666666");

        Paciente p1 = new Paciente("Jorge", 56, 67, true, m1, 'L');
        Paciente p2 = new Paciente("Alberto", 57, 45, true, m1, 'M');
        Paciente p3 = new Paciente("Andrés", 59, 66, true, m2, 'N');
        Paciente p4 = new Paciente("Desirée", 54, 37, false, m2, 'L');
        Paciente p5 = new Paciente("María", 23, 98, true, m2, 'M');
        Paciente p6 = new Paciente("Teresa", 12, 89, false, m3, 'N');
        Paciente p7 = new Paciente("Alejandro", 89, 76, true, m3, 'L');
        Paciente p8 = new Paciente("David", 99, 55, true, m1, 'M');
        Paciente p9 = new Paciente("Natalia", 11, 56, true, m1, 'N');
        Paciente p10 = new Paciente("Celestino", 24, 102, true, m1, 'L');

        CoronaVirus covid19 = new CoronaVirus();
        covid19.addPaciente('L', p1);
        covid19.addPaciente('M', p2);
        covid19.addPaciente('N', p3);
        covid19.addPaciente('L', p4);
        covid19.addPaciente('M', p5);
        covid19.addPaciente('N', p6);
        covid19.addPaciente('L', p7);
        covid19.addPaciente('M', p8);
        covid19.addPaciente('N', p9);
        covid19.addPaciente('L', p10);

        covid19.pacientesPorEdad('L');
        covid19.pacientesPorPeso('M');

        covid19.pacientesDeUnDoctor("1234546");
        covid19.darDeAltaPaciente(p3);
        covid19.guardarPacientes();
    }
}
