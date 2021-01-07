package com.jdperez.Maquinaria;

import com.jdperez.Personal.Mecanico;

public class Locomotora {
    private String matricula;
    private int potencia;
    private int year;
    private Mecanico mecanico;

    public Locomotora(String matricula, int potencia, int year, Mecanico mecanico) {
        this.matricula = matricula;
        this.potencia = potencia;
        this.year = year;
        this.mecanico = mecanico;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Mecanico getMecanico() {
        return mecanico;
    }

    public void setMecanico(Mecanico mecanico) {
        this.mecanico = mecanico;
    }

    @Override
    public String toString() {
        return "Locomotora{" +
                "matricula='" + matricula + '\'' +
                ", potencia=" + potencia +
                ", year=" + year +
                ", mecanico=" + mecanico +
                '}';
    }
}
