package com.company;

import java.util.Scanner;

public class Ej95 {
    //Actividad 9-5: Los habitantes de Javalandia tienen un idioma algo extraño; cuando hablan siempre
    // comienzan sus frases con "Javalín, javalón", para después hacer una pausa más o menos larga
    // (la pausa se representa mediante espacios en blanco) y a continuación expresan el mensaje.
    // Existe un dialecto que no comienza sus frases con la muletilla anterior, pero siempre las
    // terminan con un silencio, más o menos prolongado y la coletilla "javalén, len, len".
    // Se pide diseñar un traductor que, en primer lugar, nos diga si la frase está escrita
    // en el idioma de Javalandia (en cualquiera de sus dialectos), y en caso afirmativo,
    // nos muestre el mensaje sin muletillas.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;
        String comienzo="Javalín,javalón";
        String terminaciones="javalen,len,len";


        System.out.println("Introduce la frase");
        frase = sc.nextLine();

        if (frase.length()>comienzo.length()) {
            //Si la frase empieza por lo "Javalín, javalón" o acaba como el dialecto
            String c = frase.substring(0,comienzo.length());
            String c2 = frase.substring(frase.length()-terminaciones.length(),frase.length());
            if (frase.substring(0,comienzo.length()).equals(comienzo)) {

                //Idioma oficial de Javalandia
                String resultado = frase.substring(comienzo.length(),frase.length()).trim();
                System.out.println("El mensaje real es:"+resultado);

            } else if (frase.substring(frase.length()-terminaciones.length(),frase.length()).equals(terminaciones)) {

                //Dialecto javalandia
                String result = frase.substring(0,frase.length()-1-terminaciones.length()).trim();
                System.out.println("El mensaje real es:"+result);
            } else {
                System.out.println("Esta frase no es del idioma correcto");
            }
        } else {
            System.out.println("Esta frase no es del idioma correcto");
        }

        
    }
}
