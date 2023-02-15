package work.oscarramos.clase1;

public class Arreglos {
    public static int sumarArreglo(int[] arreglo) {
        if(arreglo==null) return 0;
        int resultado = 0;
        for (int i = 0; i < arreglo.length; i++) {
            resultado += arreglo[i];
        }
        return resultado;
    }

    public static int[] multiplicarValoresArreglo(int[] arreglo, int multiplicador) {
        if(arreglo==null) return arreglo;
        int[] resultado = new int[arreglo.length];
        for (int i = 0; i < arreglo.length; i++) {
            resultado[i] = arreglo[i] * multiplicador;
        }
        return resultado;
    }

    public static int contarPares(int[] arreglo) {
        if(arreglo==null) return 0;

        int resultado = 0;
        for (int elemento : arreglo) {
            if (Numeros.esPar(elemento)) {
                resultado++;
            }
        }
        return resultado;
    }

    public static int contarImpares(int[] arreglo) {
        if(arreglo==null) return 0;
        int contador = 0;
        for (int elemento : arreglo) {
            if (Numeros.esImpar(elemento)) {
                contador++;
            }
        }
        return contador;
    }

    public static int[][] separarElementos(int numero, int[] arreglo) {
        if(arreglo==null) {
            return null;
        }
        int[] arregloMayores = new int[arreglo.length];
        int[] arregloMenores = new int[arreglo.length];
        int idxMenor = 0;
        int idxMayor = 0;
        //
        for (int elemento : arreglo){
            int res = (Numeros.min(elemento, numero) < numero) ? (arregloMenores[idxMenor++] = elemento):(arregloMayores[idxMayor++] = elemento);
        }
        int[][] resultado = new int[2][];
        resultado[0] = new int[idxMenor];
        resultado[1] = new int[idxMayor];
        System.arraycopy(arregloMenores, 0, resultado[0], 0, idxMenor);
        System.arraycopy(arregloMayores, 0, resultado[1], 0, idxMayor);
        return resultado;
    }
}
