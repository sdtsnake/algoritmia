package work.oscarramos.clase1;

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

        /*
            y = mx + b
            y = 2x + 2 ,y x : 2 0

            Conjuntos -> arreglos byte -128 a 127
            - algoritmo de decision para saber si es un conjunto
            - algoritmo que convierta un arrelo de bytes sea un conjunto
        */

    //}
    /*
        Un arreglo se convierte en conjunto elminando los elemento repetidos.
     */

    public static byte[] convertirEnConjunto(byte[] arr) {
        if (arr == null) return null;
        if (arr.length == 0) return arr;
        byte[] conjunto = new byte[arr.length];

        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    if (i == j) {
                        conjunto[idx] = arr[i];
                        idx++;
                    } else {
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
    /*
        Dos arreglos son iguales cuando tienen sus elementos consecutivos en su mismo orden
     */

    public static boolean comparaArreglos(byte[] arr1, byte[] arr2) {
        if (arr1 == null && arr2 == null) return true;
        if (arr1.length == 0 && arr2.length == 0) return true;
        if (arr1.length != arr2.length) return false;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
    /*
        Dos conjuntos son iguales cuando los elementos del conjunto A están en el conjunto B
        y los elementos del conjunto B están A
     */

    public static boolean conjuntosIguales(byte[] arreglo1, byte[] arreglo2) {
        if (arreglo1 == null && arreglo2 == null) return false;
        if (arreglo1.length == 0 && arreglo2.length == 0) return true;

        for (int i = 0; i < arreglo1.length; i++) {
            boolean existeElmentoConjuntos1 = false;
            for (int j = 0; j < arreglo2.length; j++) {
                if (arreglo1[i] == arreglo2[j]) {
                    existeElmentoConjuntos1 = true;
                    break;
                } else {
                    existeElmentoConjuntos1 = false;
                }
            }
            if (!existeElmentoConjuntos1) {
                return false;
            }
        }

        for (int i = 0; i < arreglo2.length; i++) {
            boolean existeElmentoConjunto2 = false;
            for (int j = 0; j < arreglo1.length; j++) {
                if (arreglo2[i] == arreglo1[j]) {
                    existeElmentoConjunto2 = true;
                    break;
                } else {
                    existeElmentoConjunto2 = false;
                }
            }
            if (!existeElmentoConjunto2) {
                return false;
            }
        }
        return true;
    }

    public static boolean elementoEnConjunto(byte numero, byte[] arr1) {
        if (arr1 == null) return false;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == numero) return true;
        }

        return false;
    }

    /*}
        algoritmo para determinar si A esta contenido en B o viceversa
     */

    public static boolean conjuntoDentroDeOtro(byte[] arreglo1, byte[] arreglo2) {
        if (arreglo1 == null && arreglo2 == null) return false;
        if (arreglo1.length == 0 && arreglo2.length == 0) return true;


        if (arreglo1.length > arreglo2.length) {
            if (!verificaContenido(arreglo2, arreglo1)) return false;
        } else {
            if (!verificaContenido(arreglo1, arreglo2)) return false;
        }

        return true;
    }

    private static boolean verificaContenido(byte[] arrMenor, byte[] arrMayor) {

        for (int i = 0; i < arrMenor.length; i++) {
            boolean elementoContenido = false;
            for (int j = 0; j < arrMayor.length; j++) {
                if (arrMenor[i] == arrMayor[j]) {
                    elementoContenido = true;
                    break;
                }
            }
            if (!elementoContenido) {
                return false;
            }
        }
        return true;
    }
    /*
        algoritmo que determina hay interseccion entre el conjunto A y B
     */

    public static boolean siTieneInterseccion(byte[] arr1, byte[] arr2) {
        if (arr1 == null && arr2 == null) return false;
        if (arr1.length == 0 && arr2.length == 0) return true;
        if (arr1.length == 0 || arr2.length == 0) return true;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) return true;
            }
        }
        return false;
    }

    /*
        Retorna los elementos que están contenidos en el conjunto A y B
     */
    public static byte[] interseccionConjuntos(byte[] arreglo1, byte[] arreglo2) {
        if (arreglo1 == null && arreglo2 == null) return null;
        if (arreglo1.length == 0 && arreglo2.length == 0) return new byte[]{};
        if (arreglo1.length == 0 || arreglo2.length == 0) return new byte[]{};

        if (arreglo1.length > arreglo2.length) {
            return (aramaInterseccion(arreglo2, arreglo1));
        } else {
            return (aramaInterseccion(arreglo1, arreglo2));
        }
    }

    private static byte[] aramaInterseccion(byte[] arrMenor, byte[] arrMayor) {
        int[] interseccion = new int[arrMayor.length + arrMenor.length];
        int idx = 0;

        for (int i = 0; i < arrMenor.length; i++) {
            for (int j = 0; j < arrMayor.length; j++) {
                if (arrMenor[i] == arrMayor[j]) {
                    interseccion[idx] = arrMayor[j];
                    idx++;
                }
            }
        }

        byte[] resultado = new byte[idx];
        for (int i = 0; i < idx; i++) {
            resultado[i] = (byte)interseccion[i];
        }

        return resultado;
    }
    /*
        retorna la union de los conjutnos A y B en el cojunto C
     */

    public static byte[] unionConjuntos(byte[] arreglo1, byte[] arreglo2) {
        if (arreglo1 == null && arreglo2 == null) return null;
        if (arreglo1.length == 0 && arreglo2.length == 0) return new byte[]{};

        int[] union = new int[arreglo1.length + arreglo2.length];

        for (int i = 0; i < arreglo1.length; i++) {
            union[i] = arreglo1[i];
        }

        int idx = arreglo1.length;
        for (int i = 0; i < arreglo2.length; i++) {
            boolean encontrado = false;
            for (int j = 0; j < arreglo1.length; j++) {
                if (arreglo2[i] == arreglo1[j]) {
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                union[idx] = arreglo2[i];
                idx++;
            }
        }

        byte[] resultado = new byte[idx];
        for (int i = 0; i < idx; i++) {
            resultado[i] = (byte) union[i];
        }

        return resultado;
    }

    public static byte[] diferenciaConjuntos(byte[] arreglo1, byte[] arreglo2) {
        if (arreglo1 == null && arreglo2 == null) return null;

        int[] diferencia = new int[arreglo1.length + arreglo2.length];
        int idx = 0;

        for (int i = 0; i < arreglo1.length; i++) {
            boolean encontrado = false;
            for (int j = 0; j < arreglo2.length; j++) {
                if (arreglo1[i] == arreglo2[j]) {
                    encontrado = true;
                    break;
                }
            }
            if(!encontrado){
                diferencia[idx] = arreglo1[i];
                idx++;
            }
        }

        byte[] resultado = new byte[idx];
        for (int i = 0; i < idx; i++) {
            resultado[i] = (byte)diferencia[i];
        }

        return resultado;
    }




}
