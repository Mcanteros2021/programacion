package curso1920;

import java.util.Arrays;

public class Ej3 {

    public static void main(String[] args) {
        int[] numeros = new int[(int)(Math.random()*30+1)];

        for (int i = 0; i <  numeros.length  ; i++) {
            numeros[i] = (int) (Math.random()*1001);
        }

        System.out.println(Arrays.toString(numeros));

        System.out.println(Arrays.toString(filtra7(numeros)));


    }

    public static int[] filtra7(int[] v) {
        int[] result = new int[0];

        for(int n : v) {
            if (tieneCifra(n,7)) {
                result = Arrays.copyOf(result, result.length+1);
                result[result.length-1] = n;
            }
        }

        return result;
    }

    public static boolean tieneCifra(int num, int cifra) {
        String numero = Integer.toString(num);

        if (cifra>=10 || cifra<0) {
            return false;
        }

        //return numero.contains(Integer.toString(cifra));


        for (int i = 0; i < numero.length(); i++) {
            if (numero.charAt(i) == Integer.toString(cifra).charAt(0)) {
              return true;
            }
        }

        return false;
    }

}
