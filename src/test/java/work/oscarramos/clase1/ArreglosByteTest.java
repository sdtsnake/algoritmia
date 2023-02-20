package work.oscarramos.clase1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

}