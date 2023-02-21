package work.oscarramos.clase1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
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
    public void convertirEnConjuntoTest(byte[] arr,byte[] respuesta) {
        assertArrayEquals(respuesta, ArreglosByte.convertirEnConjunto(arr));
    }
    private static Object[][] convertirEnConjuntoTest() {
        return new Object[][]{
                {new byte[]{},new byte[]{}},
                {null,null},
                {new byte[]{1, 2, 3, 3, 4, 5},new byte[]{1, 2, 3, 4, 5}},
                {new byte[]{1, 2, 3, 3, 4, 5, 5, 6, 7, 8},new byte[]{1, 2, 3, 4, 5, 6, 7, 8}},
                {new byte[]{1},new byte[]{1}},
                {new byte[]{1,2,3,1,2,3,4,5,1,2,3},new byte[]{1,2,3,4,5}}
        };
    }
    @ParameterizedTest
    @MethodSource
    public void comparaArreglosTrueTest(byte[] arr1,byte[] arr2) {
        assertEquals(true, ArreglosByte.comparaArreglos(arr1,arr2));
    }
    private static Object[][] comparaArreglosTrueTest() {
        return new Object[][]{
                {new byte[]{},new byte[]{}},
                {new byte[]{1, 2, 3, 3, 4, 5},new byte[]{1, 2, 3, 3, 4, 5}},
                {new byte[]{1, 2, 3, 3, 4, 5, 5, 6, 7, 8},new byte[]{1, 2, 3, 3, 4, 5, 5, 6, 7, 8}},
                {new byte[]{1},new byte[]{1}},
                {new byte[]{1,2,3,1,2,3,4,5,1,2,3},new byte[]{1,2,3,1,2,3,4,5,1,2,3}}
        };
    }
    @ParameterizedTest
    @MethodSource
    public void comparaArreglosFalseTest(byte[] arr1,byte[] arr2) {
        assertEquals(false, ArreglosByte.comparaArreglos(arr1,arr2));
    }
    private static Object[][] comparaArreglosFalseTest() {
        return new Object[][]{
                {null,null},
                {new byte[]{1, 2, 4, 5},new byte[]{1, 2, 3, 3, 4, 5}},
                {new byte[]{1, 2, 3, 4},new byte[]{4, 3, 2, 1}},
        };
    }

}