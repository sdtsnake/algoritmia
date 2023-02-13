package clase1;

public class Arreglos {
    public static int sumarArreglo(int[] arreglo) {
        int resultado = 0;
        for (int i = 0; i < arreglo.length; i++) {
            resultado += arreglo[i];
        }
        return resultado;
    }

    public static int[] multiplicarValoresArreglo(int[] arreglo, int multiplicador) {
        int[] resultado = new int[arreglo.length];
        for (int i = 0; i < arreglo.length; i++) {
            resultado[i] = arreglo[i] * multiplicador;
        }
        return resultado;
    }

    public static int contarPares(int[] arreglo) {
        int resultado = 0;
        for (int elemento : arreglo) {
            if (Numeros.esPar(elemento)) {
                resultado++;
            }
        }
        return resultado;
    }

    public static int contarImpares(int[] arreglo) {
        int contador = 0;
        for (int elemento : arreglo) {
            if (Numeros.esImpar(elemento)) {
                contador++;
            }
        }
        return contador;
    }

    public static int[][] separarElementos(int numero, int[] arreglo) {
        int[] arregloMayores = new int[arreglo.length];
        int[] arregloMenores = new int[arreglo.length];
        int idxMenor = 0;
        int idxMayor = 0;
        for (int elemento : arreglo) {
            if(Numeros.min(elemento, numero) < numero){
                arregloMenores[idxMenor++] = elemento;
            }else{
                arregloMayores[idxMayor++] = elemento;
            }


        }
        int[][] resultado = new int[2][];
        resultado[0] = new int[idxMenor];
        resultado[1] = new int[idxMayor];
        for (int i = 0; i < idxMenor; i++) {
            resultado[0][i] = arregloMenores[i];
        }
        for (int i = 0; i < idxMayor; i++) {
            resultado[1][i] = arregloMayores[i];
        }
        return resultado;
    }


}
