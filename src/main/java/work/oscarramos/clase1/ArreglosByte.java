package work.oscarramos.clase1;

import java.util.Random;

public class ArreglosByte {
    public static boolean esConjuntoV1(byte[] arr) {
        if (arr == null) return false;
        if (arr.length == 0) return true;

        for (int i = 0; i < arr.length; i++) {
            for (int a = i + 1; a < arr.length; a++) {
                if (arr[i] == arr[a])
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Random r = new Random();
        for (int n = 0; n <= 8; n++) {
            int l = (int)(Math.pow(10,n));
            byte[] arr = new byte[l];
            for (int i = 0; i < l; i++) {
                arr[i]= (byte)(Integer.MIN_VALUE + i);
            }
            long ini = System.nanoTime();
            boolean resultado = esConjuntoV1(arr);
            long fin = System.nanoTime();
            System.out.println("n=%s r=%s t=%s".formatted(l,resultado,(fin-ini)));
            //System.out.println("%s, %s".formatted(l, (fin-ini)));
        }

        /*
            - Realizar un algoritmo que convierta un arreglo en un conjunto.
            - Realizar un algoritmo que diaga si dos arreglos son iguales.
            - Realizar un algoritmo que me diga si dos conjuntos son iguales.
         */

    }
}
