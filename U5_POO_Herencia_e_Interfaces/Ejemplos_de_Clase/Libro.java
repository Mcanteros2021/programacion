package com.jdperez;

public class Libro extends Publicacion implements Prestable,Comparable {
    private boolean prestado;

    public Libro(String isbn, String titulo, int year) {
        super(isbn, titulo, year);
        this.prestado = false;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }


    @Override
    public String toString() {
        return super.toString()+
                "prestado=" + prestado;
    }

    @Override
    public boolean estaPrestado() {
        return prestado;
    }

    @Override
    public void presta() {
        prestado = true;
    }

    @Override
    public void devuelve() {
        prestado = false;
    }

    @Override
    public int compareTo(Object o) {
        Libro l = (Libro) o;
        return getTitulo().compareTo(l.getTitulo());
    }
}
