package com.jdperez;

import java.io.*;

public class CompararFicheros {
    public static void main(String[] args) {

        String linea1="";
        String linea2="";
        int numLinea = 0;
        int numChar = 0;

        try {
            BufferedReader br1 = new BufferedReader(new FileReader(new File("copia.txt")));
            BufferedReader br2 = new BufferedReader(new FileReader(new File("copia2.txt")));
            boolean iguales = true;
            while ((linea1 = br1.readLine())!=null && (linea2 = br2.readLine())!=null) {
                if (!linea1.equals(linea2)) {
                    iguales = false;

                    if (linea1.length()>=linea2.length()) {
                        numChar = linea2.length();
                        for (int i = 0; i < linea2.length() ; i++) {
                            if (linea1.charAt(i)!=linea2.charAt(i)) {
                                numChar=i;
                                break;
                            }
                        }

                    } else {
                        numChar = linea1.length();
                        for (int i = 0; i < linea1.length() ; i++) {
                            if (linea1.charAt(i)!=linea2.charAt(i)) {
                                numChar=i;
                                break;
                            }
                        }
                    }

                    break;
                }

                numLinea++;
            }

            if (iguales && linea1==null && linea2 == null) {
                System.out.println("Los ficheros son iguales");
            } else {
                System.out.println("Son diferentes");
                System.out.println("El número de línea es "+numLinea);
                System.out.println("El número de caracter es "+numChar);
            }
            br1.close();
            br2.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
