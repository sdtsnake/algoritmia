package work.oscarramos.clase1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class NumerosTest {
    // pruebas de maximos

    @ParameterizedTest
    @MethodSource
    public void maxTest(int numero1, int numero2, int resultado) {

        assertEquals(resultado, Numeros.max(numero1, numero2));
    }

    private static Stream<Arguments> maxTest() {
        return Stream.of(
                Arguments.of(5, 6, 6),
                Arguments.of(6, 5, 6),
                Arguments.of(-6, 0, 0),
                Arguments.of(2, 2, 2),
                Arguments.of(-5, -2, -2)

        );
    }

    //pruebas de minimos
    @ParameterizedTest
    @MethodSource
    public void minTest(int numero1, int numero2, int resultado) {

        assertEquals(resultado, Numeros.min(numero1, numero2));
    }

    private static Stream<Arguments> minTest() {
        return Stream.of(
                Arguments.of(1, 2, 1),
                Arguments.of(2, 1, 1),
                Arguments.of(-8, 0, -8),
                Arguments.of(8, 8, 8),
                Arguments.of(-10, -12, -12)

        );
    }

    // pruebas de par
    @ParameterizedTest
    @ValueSource(ints = {4, 0, -10})
    public void esParVerdaderoTest(int number) {
        assertTrue(Numeros.esPar(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {3, -33, Integer.MAX_VALUE})
    public void esParFalsoTest(int number) {
        assertFalse(Numeros.esPar(number));
    }

    //pruebas de impar
    @ParameterizedTest
    @ValueSource(ints = {3, -33, Integer.MAX_VALUE})
    public void esImparVerdaderoTest(int numero) {
        assertTrue(Numeros.esImpar(numero));
    }

    @ParameterizedTest
    @ValueSource(ints = {2, -10, 0})
    public void noEsImparFalsoTest(int numero) {
        assertFalse(Numeros.esImpar(numero));
    }
    @ParameterizedTest
    @MethodSource
    public void potenciaTest(int base, int exponente, double resultado) {

        assertEquals(resultado, Numeros.potencia(base, exponente));
    }

    //pruebas de potencias
    private static Stream<Arguments> potenciaTest() {
        return Stream.of(
                Arguments.of(2, 3, 8.0),
                Arguments.of(-2, 3, -8.0),
                Arguments.of(2, -3, 0.125),
                Arguments.of(-2, -3, -0.125),
                Arguments.of(0, 3, 0),
                Arguments.of(3, 0, 1.0),
                Arguments.of(0, 0, Double.NaN)
        );
    }
}