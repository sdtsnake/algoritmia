package work.oscarramos.clase1;

import java.util.Arrays;
import java.util.function.Predicate;

public class Arreglos {
    public static int sumarArreglo(int[] arreglo) {
        if (arreglo == null) return 0;
        int resultado = 0;
        for (int i = 0; i < arreglo.length; i++) {
            resultado += arreglo[i];
        }
        return resultado;
    }

    public static int[] multiplicarValoresArreglo(int[] arreglo, int multiplicador) {
        if (arreglo == null) return arreglo;
        int[] resultado = new int[arreglo.length];
        for (int i = 0; i < arreglo.length; i++) {
            resultado[i] = arreglo[i] * multiplicador;
        }
        return resultado;
    }

    public static int contarPares(int[] arreglo) {
        if (arreglo == null) return 0;

        int resultado = 0;
        for (int elemento : arreglo) {
            if (Numeros.esPar(elemento)) {
                resultado++;
            }
        }
        return resultado;
    }

    public static int contarImpares(int[] arreglo) {
        if (arreglo == null) return 0;
        int contador = 0;
        for (int elemento : arreglo) {
            if (Numeros.esImpar(elemento)) {
                contador++;
            }
        }
        return contador;
    }

    public static int[][] separarElementos(int numero, int[] arreglo) {
        if (arreglo == null) {
            return null;
        }
        int[] arregloMenores = menorMayorIgualQue(arreglo, numero, true);
        int[] arregloMayores = menorMayorIgualQue(arreglo, numero, false);

        int[][] resultado = new int[2][];

        resultado[0] = arregloMenores;
        resultado[1] = arregloMayores;
        return resultado;
    }

    private static int[] menorMayorIgualQue(int[] arreghlo, int numero, boolean menor) {
        int[] respuesta = new int[arreghlo.length];
        int idx = -1;
        for (int elemento : arreghlo) {
            if (menor && elemento < numero || !menor && elemento >= numero) {
                idx++;
                respuesta[idx] = elemento;
            }
        }
        if (idx < 0) return new int[0];

        //TODO no usar la libreria hacerlo a mano.
        return Arrays.copyOfRange(respuesta, 0, idx + 1);

    }


}
