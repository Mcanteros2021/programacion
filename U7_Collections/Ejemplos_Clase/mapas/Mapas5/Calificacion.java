package com.jdperez;

public class Calificacion {
    private Integer aspiranteId;
    private Double nota;

    public Calificacion(Integer aspiranteId, Double nota) {
        this.aspiranteId = aspiranteId;
        this.nota = nota;
    }

    public Integer getAspiranteId() {
        return aspiranteId;
    }

    public void setAspiranteId(Integer aspiranteId) {
        this.aspiranteId = aspiranteId;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }
}
