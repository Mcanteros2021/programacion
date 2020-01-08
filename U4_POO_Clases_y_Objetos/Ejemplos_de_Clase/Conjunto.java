package com.jdperez;

import java.util.Arrays;

public class Conjunto {
    private int[] mElementos;
    private int mNumElementos;

    Conjunto() {
        this(10);
    }

    Conjunto(int capacidad) {
        this.mElementos = new int[capacidad];
        this.mNumElementos = 0;
    }

    public int getmNumElementos() {
        return this.mNumElementos;
    }

    public boolean estaElemento(int num) {
        for (int i = 0; i < this.mNumElementos ; i++) {
            if (num == this.mElementos[i]) {
                return true;
            }
        }

        return false;
    }

    public boolean insertarElemento(int num) {
        if (estaElemento(num)) {
            return false;
        } else {
            if (mNumElementos >= mElementos.length) {
                //No Cabe
                mElementos = Arrays.copyOf(mElementos, mElementos.length + 1);
            }
            mElementos[mNumElementos] = num;
            mNumElementos++;
            return true;
        }
    }


    public void insertarConjunto(Conjunto c) {
        for (int i = 0; i <c.mNumElementos; i++) {
            insertarElemento(c.mElementos[i]);
        }
    }

    public boolean eliminarElemento(int num) {
        if (!estaElemento(num)) {
            return false;
        } else {
            int pos = 0;
            for (int i = 0; i < mNumElementos; i++) {
                if (num == mElementos[i]) {
                    break;
                }
                pos++;
            }
            for (int i = pos; i < mNumElementos-1; i++) {
                mElementos[i] = mElementos[i+1];
            }
            mNumElementos--;

            return true;
        }

    }

    public void borrarConjunto(Conjunto c) {
        for (int i = 0; i <c.mNumElementos; i++) {
            eliminarElemento(c.mElementos[i]);
        }
    }

}
