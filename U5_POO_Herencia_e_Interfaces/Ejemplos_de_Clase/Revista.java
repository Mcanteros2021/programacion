package com.jdperez;

public class Revista extends Publicacion implements  Comparable{
    private int numero;

    public Revista(String isbn, String titulo, int year, int numero) {
        super(isbn, titulo, year);
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return super.toString()+
                "numero=" + numero +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Revista r = (Revista) o;
        return getIsbn().compareTo(r.getIsbn());
    }
}
