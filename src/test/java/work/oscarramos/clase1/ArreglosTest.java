package work.oscarramos.clase1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ArreglosTest {

    //suma de elementos de un arreglo
    @Test
    public void sumarArregloNuloTest() {
        int[] arreglo = null;
        assertEquals(0, Arreglos.sumarArreglo(arreglo));
    }

    @ParameterizedTest
    @MethodSource
    public void sumarArregloTest(int[] arreglo, int resultado) {
        assertEquals(resultado, Arreglos.sumarArreglo(arreglo));
    }

    private static Object[][] sumarArregloTest() {
        return new Object[][]{
                {new int[]{}, 0},
                {new int[]{5}, 5},
                {new int[]{1, 2, 3, 4, 5}, 15}
        };
    }

    //arreglo multiplicado por un valor de entrada
    @Test
    public void multiplicarValoresArregloArreglNuloTest() {
        int[] arreglo = null;
        int[] resultado = null;
        assertArrayEquals(resultado, Arreglos.multiplicarValoresArreglo(arreglo, 1));
    }

    @ParameterizedTest
    @MethodSource
    public void multiplicarValoresArregloTest(int[] arreglo, int numero, int[] resultado) {
        assertArrayEquals(resultado, Arreglos.multiplicarValoresArreglo(arreglo, numero));
    }

    private static Object[][] multiplicarValoresArregloTest() {
        return new Object[][]{
                {new int[]{}, 1, new int[]{}},
                {new int[]{1, 2, 3, 4, 5}, 0, new int[]{0, 0, 0, 0, 0}},
                {new int[]{1, 2, 3, 4, 5}, 2, new int[]{2, 4, 6, 8, 10}},
                {new int[]{-1, -2, -3, -4, -5}, 2, new int[]{-2, -4, -6, -8, -10}},
                {new int[]{-1, 2, -3, 4, -5}, 2, new int[]{-2, 4, -6, 8, -10}}

        };
    }

    //contador de elemento pares de un arreglo
    @Test
    public void contarParesArregloNuloTest() {
        int[] arreglo = null;
        assertEquals(0, Arreglos.contarPares(arreglo));
    }

    @ParameterizedTest
    @MethodSource
    public void contarParesArregloTest(int[] arreglo, int resultado) {
        assertEquals(resultado, Arreglos.contarPares(arreglo));
    }

    private static Object[][] contarParesArregloTest() {
        return new Object[][]{
                {new int[]{}, 0},
                {new int[]{2}, 1},
                {new int[]{3}, 0},
                {new int[]{2, 4, 6, 8, 10}, 5},
                {new int[]{1, 3, 5, 7, 9}, 0},
                {new int[]{1, 2, 3, 4, 5}, 2},
                {new int[]{0, 1, 2, 3, 4, 5}, 3},
        };
    }

    //contador de elementos impares
    @Test
    public void contarImparesArregloNuloTest() {
        int[] arreglo = null;
        assertEquals(0, Arreglos.contarImpares(arreglo));
    }

    @ParameterizedTest
    @MethodSource
    public void contarImparesArregloTest(int[] arreglo, int resultado) {
        assertEquals(resultado, Arreglos.contarImpares(arreglo));
    }

    private static Object[][] contarImparesArregloTest() {
        return new Object[][]{
                {new int[]{}, 0},
                {new int[]{2}, 0},
                {new int[]{1}, 1},
                {new int[]{1, 3, 5, 7, 9}, 5},
                {new int[]{0, 2, 4, 6, 8, 1, 3, 5, 7, 9}, 5},
        };
    }

    //Separar elemenmtos
    @Test
    public void separarElementosValorCeroArrelgoNuloTest() {
        int numero = 0;
        int[] arreglo = null;
        int[][] resultado = null;
        assertArrayEquals(resultado, Arreglos.separarElementos(numero, arreglo));
    }

    @ParameterizedTest
    @MethodSource
    public void separarElementosValorTest(int[] arreglo, int numero, int[][] resultado) {
        assertArrayEquals(resultado, Arreglos.separarElementos(numero, arreglo));
    }

    private static Stream<Object[]> separarElementosValorTest() {
        return Stream.of(
                new Object[]{new int[]{4, 5, 6, 7, 1, 2, 3}, 0, new int[][]{{}, {4, 5, 6, 7, 1, 2, 3}}},
                new Object[]{new int[]{-4, -5, -6, -8, -1, -2, -3}, 0, new int[][]{{-4, -5, -6, -8, -1, -2, -3}, {}}},
                new Object[]{new int[]{-4, -5, -6, 0, -1, -2, -3}, 0, new int[][]{{-4, -5, -6, -1, -2, -3}, {0}}},
                new Object[]{new int[]{4, 5, 6, 0, -1, -2, -3}, 0, new int[][]{{-1, -2, -3}, {4, 5, 6, 0}}},
                new Object[]{new int[]{-9, -8, -7, -6, -5}, -7, new int[][]{{-9, -8}, {-7, -6, -5}}},
                new Object[]{new int[]{-9, -8, -7, -6, -5}, -1, new int[][]{{-9, -8, -7, -6, -5}, {}}},
                new Object[]{new int[]{-9, -8, -7, -6, -5}, -10, new int[][]{{}, {-9, -8, -7, -6, -5}}},
                new Object[]{new int[]{-9, -8, -7, -6, -5, 3, 2, 1}, -7, new int[][]{{-9, -8}, {-7, -6, -5, 3, 2, 1}}},
                new Object[]{new int[]{-7, -8, -9, -10, -11}, 10, new int[][]{{-7, -8, -9, -10, -11}, {}}},
                new Object[]{new int[]{-7, -8, -9, -10, -11, 10}, 12, new int[][]{{-7, -8, -9, -10, -11, 10}, {}}},
                new Object[]{new int[]{6, 7, 8, 9, 10, 11, 12}, 9, new int[][]{{6, 7, 8}, {9, 10, 11, 12}}},
                new Object[]{new int[]{-6, -7, -8, -9, -10, 1, 3, 4, 5, 11, 12, 13, 14}, 9, new int[][]{{-6, -7, -8, -9, -10, 1, 3, 4, 5}, {11, 12, 13, 14}}}
        );
    }
    /*
        - Implementar una funcion que sume los valores de un arreglo
        - Implementar una funcion que multiplique los valores de un arreglo por otro valor
        - Implementar funcion que retorne cuantos pares hay asumiendo que el cero es par
        - Implementar funcion que retorne cuantos impares hay asumiendo que el cero es par

        - Implementar funcion que partiendo un numero N y un arrelo "A" me de como resultado 2 arreglos "B" y "C"
          donde "B" esta compuesto por los numero de "A" que sean menores que N y "C" esta compuesto por los numeros
          de "A" que sean mayores o iguales a N respues es un arreglo de arreglos
     */

    // pruebas unitarias tip :
    // 1. pensar en los casos extremos
    // 2. Pensar en casos representavivos teniendo en cuenta que son excluyentes


}