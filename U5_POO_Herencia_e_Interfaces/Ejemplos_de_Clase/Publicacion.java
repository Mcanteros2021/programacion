package com.jdperez;

import java.util.Objects;

public abstract class Publicacion {
    private String isbn;
    private String titulo;
    private int year;

    public Publicacion(String isbn, String titulo, int year) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.year = year;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Publicacion that = (Publicacion) o;
        return getIsbn().equals(that.getIsbn());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIsbn());
    }

    @Override
    public String toString() {
        return "" +
                "isbn='" + isbn + '\'' +
                ", titulo='" + titulo + '\'' +
                ", year=" + year +
                " "+"\n";
    }
}
