package com.jdperez;

import java.util.Comparator;

public class ComparaEdadClientes implements Comparator {

    @Override
    public int compare(Object o, Object t1) {
        Cliente c1 = (Cliente) o;
        Cliente c2 = (Cliente) t1;
        return (c1.edad - c2.edad);
    }
}
