package work.oscarramos.clase1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ArreglosByteTest {

    @ParameterizedTest
    @MethodSource
    public void esConjuntoTest(byte[] arr) {
        assertEquals(true, ArreglosByte.esConjuntoV1(arr));
    }

    private static Object[][] esConjuntoTest() {
        return new Object[][]{
                {new byte[]{}},
                {new byte[]{1, 2, 3, 4, 5}},
                {new byte[]{-1, -2, -3, -4, 0, 1, 2, 3}}
        };
    }

    @ParameterizedTest
    @MethodSource
    public void noEsConjuntoTest(byte[] arr) {
        assertEquals(false, ArreglosByte.esConjuntoV1(arr));
    }

    private static Object[][] noEsConjuntoTest() {
        return new Object[][]{
                {null},
                {new byte[]{1, 2, 3, 3, 4, 5}},
        };
    }

    @ParameterizedTest
    @MethodSource
    public void convertirEnConjuntoTest(byte[] arr, byte[] respuesta) {
        assertArrayEquals(respuesta, ArreglosByte.convertirEnConjunto(arr));
    }

    private static Object[][] convertirEnConjuntoTest() {
        return new Object[][]{
                {new byte[]{}, new byte[]{}},
                {null, null},
                {new byte[]{1, 2, 3, 3, 4, 5}, new byte[]{1, 2, 3, 4, 5}},
                {new byte[]{1, 1, 1, 1, 1, 1}, new byte[]{1}},
                {new byte[]{1, 2, 3, 3, 4, 5, 5, 6, 7, 8}, new byte[]{1, 2, 3, 4, 5, 6, 7, 8}},
                {new byte[]{1}, new byte[]{1}},
                {new byte[]{1, 2, 3, 1, 2, 3, 4, 5, 1, 2, 3}, new byte[]{1, 2, 3, 4, 5}}
        };
    }

    @ParameterizedTest
    @MethodSource
    public void comparaArreglosTrueTest(byte[] arr1, byte[] arr2) {
        assertEquals(true, ArreglosByte.comparaArreglos(arr1, arr2));
    }

    private static Object[][] comparaArreglosTrueTest() {
        return new Object[][]{
                {new byte[]{}, new byte[]{}},
                {null, null},
                {new byte[]{1, 2, 3, 3, 4, 5}, new byte[]{1, 2, 3, 3, 4, 5}},
                {new byte[]{1, 2, 3, 3, 4, 5, 5, 6, 7, 8}, new byte[]{1, 2, 3, 3, 4, 5, 5, 6, 7, 8}},
                {new byte[]{1}, new byte[]{1}},
                {new byte[]{1, 2, 3, 1, 2, 3, 4, 5, 1, 2, 3}, new byte[]{1, 2, 3, 1, 2, 3, 4, 5, 1, 2, 3}}
        };
    }

    @ParameterizedTest
    @MethodSource
    public void comparaArreglosFalseTest(byte[] arr1, byte[] arr2) {
        assertEquals(false, ArreglosByte.comparaArreglos(arr1, arr2));
    }

    private static Object[][] comparaArreglosFalseTest() {
        return new Object[][]{
                {new byte[]{1, 2, 4, 5}, new byte[]{1, 2, 3, 3, 4, 5}},
                {new byte[]{1, 2, 3, 4}, new byte[]{4, 3, 2, 1}},
        };
    }

    @ParameterizedTest
    @MethodSource
    public void conjuntosIgualesTrueTest(byte[] arr1, byte[] arr2) {
        assertEquals(true, ArreglosByte.conjuntosIguales(arr1, arr2));
    }

    private static Object[][] conjuntosIgualesTrueTest() {
        return new Object[][]{
                {new byte[]{1, 2, 4, 5}, new byte[]{1, 2, 4, 5}},
                {new byte[]{5, 4, 2, 1}, new byte[]{1, 2, 4, 5}},
                {new byte[]{1, 2, 4, 5, 5, 5}, new byte[]{1, 2, 4, 5}},
                {new byte[]{1, 2, 4, 5}, new byte[]{1, 2, 4, 5, 5, 5}},
                {new byte[]{1, 2, 3, 4, 5, 5, 5}, new byte[]{1, 2, 3, 4, 5}},
                {new byte[]{2}, new byte[]{2}},
                {new byte[]{}, new byte[]{}},
        };
    }

    @ParameterizedTest
    @MethodSource
    public void conjuntosIgualesFalseTest(byte[] arr1, byte[] arr2) {
        assertEquals(false, ArreglosByte.conjuntosIguales(arr1, arr2));
    }

    private static Object[][] conjuntosIgualesFalseTest() {
        return new Object[][]{
                {null, null},
                {new byte[]{1, 2, 4, 5}, new byte[]{1, 2, 4, 5, 6}},
                {new byte[]{1, 2, 4, 5, 5}, new byte[]{1, 2, 4, 5, 6}},
                {new byte[]{}, new byte[]{2}}
        };
    }

    @ParameterizedTest
    @MethodSource
    public void elementoEnConjuntoTrueTest(byte numero, byte[] arr1) {
        assertTrue(ArreglosByte.elementoEnConjunto(numero, arr1));
    }

    private static Object[][] elementoEnConjuntoTrueTest() {
        return new Object[][]{
                {new Byte((byte) 5), new byte[]{1, 2, 4, 5}},
                {new Byte((byte) 0), new byte[]{1, 2, 4, 5, 0}}
        };
    }

    @ParameterizedTest
    @MethodSource
    public void elementoEnConjuntoFalseTest(byte numero, byte[] arr1) {
        assertFalse(ArreglosByte.elementoEnConjunto(numero, arr1));
    }

    private static Object[][] elementoEnConjuntoFalseTest() {
        return new Object[][]{
                {new Byte((byte) 6), new byte[]{1, 2, 4, 5}},
                {new Byte((byte) 6), null},
                {new Byte((byte) 9), new byte[]{1, 2, 4, 5, 0}},
                {new Byte((byte) 2), new byte[]{}}
        };
    }

    @ParameterizedTest
    @MethodSource
    public void conjuntoDentroDeOtroTrueTest(byte[] arr1, byte[] arr2) {
        assertTrue(ArreglosByte.conjuntoDentroDeOtro(arr1, arr2));
    }

    private static Object[][] conjuntoDentroDeOtroTrueTest() {
        return new Object[][]{
                {new byte[]{1, 2, 4, 5}, new byte[]{0, 1, 2, 4, 5, 6, 7}},
                {new byte[]{4, 5, 6, 7, 8, 9, 10}, new byte[]{6, 7, 8, 9}},
                {new byte[]{4, 5, 6, 7, 8, 9, 10}, new byte[]{9, 8, 6, 4}},
                {new byte[]{-1, -2, 3, 4}, new byte[]{0, -1, -2, 3, 4, 5, 6}},
                {new byte[]{}, new byte[]{}}
        };
    }

    @ParameterizedTest
    @MethodSource
    public void conjuntoDentroDeOtroFalseTest(byte[] arr1, byte[] arr2) {
        assertFalse(ArreglosByte.conjuntoDentroDeOtro(arr1, arr2));
    }

    private static Object[][] conjuntoDentroDeOtroFalseTest() {
        return new Object[][]{
                {new byte[]{6, 7, 8, 9}, new byte[]{0, 1, 2, 4, 5, 6, 7}},
                {new byte[]{4, 5, 6, 7, 8, 9, 10}, new byte[]{16, 17, 18, 19}},
                {new byte[]{3, -5, -6, -7, 8, 9, 10}, new byte[]{9, 8, 6, 4}},
                {new byte[]{-1, -2, 3, 9}, new byte[]{0, -1, -2, 3, 4, 5, 6}},
                {null, null}
        };
    }

    /*
        funcion para saber si un conjunto esta dentro de otro de otro
        funcion que determiene si dos conjuntos se interseptan.

        funcion que retorne la interseccion de 2 conjuntos
        funcion que retorne la union de dos conjuntos
        funcion que retorne la diferencia de dos conjuntos.



     */
    @ParameterizedTest
    @MethodSource
    public void interseccionConjuntosTrueTest(byte[] arr1, byte[] arr2) {
        assertEquals(true, ArreglosByte.siTieneInterseccion(arr1, arr2));
    }

    private static Object[][] interseccionConjuntosTrueTest() {
        return new Object[][]{
                {new byte[]{0, 2, 4, 5, 7, 8}, new byte[]{1, 2, 4, 5, 6}},
                {new byte[]{10}, new byte[]{10}},
                {new byte[]{1, 2, 3, 4}, new byte[]{1, 2, 3, 4}},
                {new byte[]{9, 8, 7, 6, 5, 4, 3, 2, 1}, new byte[]{6, 7, 8, 9, 10, 11, 12}}
        };
    }

    @ParameterizedTest
    @MethodSource
    public void interseccionConjuntosFalseTest(byte[] arr1, byte[] arr2) {
        assertEquals(false, ArreglosByte.siTieneInterseccion(arr1, arr2));
    }

    private static Object[][] interseccionConjuntosFalseTest() {
        return new Object[][]{
                {new byte[]{2, 4, 5}, new byte[]{9, 8, 7, 6}},
                {new byte[]{}, new byte[]{6, 7, 8, 9, 10, 11, 12}},
                {new byte[]{6, 7, 8, 9, 10, 11, 12}, new byte[]{}},
                {new byte[]{}, new byte[]{}},
                {null, null}
        };
    }
}