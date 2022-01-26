package com.company.empresa;

import java.util.Calendar;
import java.util.Objects;

public class Empleado {
    private String nombreCompleto;
    private String nss;
    private String tlf;
    private Calendar fechaEntrada;
    private TipoEmpleado tipoEmpleado;
    private static int numEmpleados = 0;

    public Empleado(String nombreCompleto, String nss, String tlf, TipoEmpleado tipoEmpleado) {
        this.nombreCompleto = nombreCompleto;
        this.nss = nss;
        this.tlf = tlf;
        this.tipoEmpleado = tipoEmpleado;
        this.fechaEntrada = Calendar.getInstance();
        Empleado.numEmpleados++;
    }

    public Empleado(String nombreCompleto, String nss, String tlf) {
        this(nombreCompleto,nss,tlf,TipoEmpleado.TECNIC);
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getNss() {
        return nss;
    }

    public void setNss(String nss) {
        this.nss = nss;
    }

    public String getTlf() {
        return tlf;
    }

    public void setTlf(String tlf) {
        this.tlf = tlf;
    }

    public Calendar getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Calendar fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public TipoEmpleado getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(TipoEmpleado tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombreCompleto='" + nombreCompleto + '\'' +
                ", nss='" + nss + '\'' +
                ", tlf='" + tlf + '\'' +
                ", fechaEntrada=" + fechaEntrada +
                ", tipoEmpleado=" + tipoEmpleado +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empleado empleado = (Empleado) o;
        return nss.equals(empleado.nss);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nss);
    }
}
