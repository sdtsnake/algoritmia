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
            int l = (int) (Math.pow(10, n));
            byte[] arr = new byte[l];
            for (int i = 0; i < l; i++) {
                arr[i] = (byte) (Integer.MIN_VALUE + i);
            }
            long ini = System.nanoTime();
            boolean resultado = esConjuntoV1(arr);
            long fin = System.nanoTime();
            System.out.println("n=%s r=%s t=%s".formatted(l, resultado, (fin - ini)));
            //System.out.println("%s, %s".formatted(l, (fin-ini)));
        }



        /*
           - Realizar un algoritmo que me diga si dos conjuntos son iguales.
         */

            /*
        y = mx + b
        y = 2x + 2 ,y x : 2 0

        Conjuntos -> arreglos byte -128 a 127
        - algoritmo de decision para saber si es un conjunto
        - algoritmo que convierta un arrelo de bytes sea uyn conjunto
     */

    }

    public static byte[] convertirEnConjunto(byte[] arr) {
        if (arr == null) return null;
        if (arr.length == 0) return arr;
        byte[] conjunto = new byte[arr.length];
        byte[] transito = new byte[arr.length];

        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            transito[i] = arr[i];
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]==transito[j]){
                    if(i==j){
                        conjunto[idx] = arr[j];
                        idx++;
                    }
                    else{
                        break;
                    }
                }
            }
        }
        byte[] resultado = new byte[idx];
        for (int i = 0; i < resultado.length; i++) {
            resultado[i] = conjunto[i];
        }
        return resultado;
    }

    public static boolean comparaArreglos(byte[] arr1, byte[] arr2) {
        if (arr1 == null && arr2 == null) return false;
        if (arr1.length == 0 && arr2.length ==0) return true;
        if (arr1.length != arr2.length) return false;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean conjuntosIguales(byte[] arreglo1, byte[] arreglo2) {
        // Verificar si los arreglos tienen la misma longitud
        if (arreglo1.length != arreglo2.length) {
            return false;
        }
        if(!esConjuntoV1(arreglo1)){
            return false;
        }
        if(!esConjuntoV1(arreglo2)){
            return false;
        }
        // Ordenar ambos arreglos
        ordenar(arreglo1);
        ordenar(arreglo2);

        // Comparar elemento por elemento
        for (int i = 0; i < arreglo1.length; i++) {
            if (arreglo1[i] != arreglo2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void ordenar(byte[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[i]) {
                    // Intercambiar elementos
                    byte temp = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temp;
                }
            }
        }
    }


}
