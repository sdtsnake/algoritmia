package work.oscarramos.clase1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class NumerosTest {
    // pruebas de maximos
    @Test
    public void maxNumerosPositivosSegundoParametroMayorTest() {

        assertEquals(6, Numeros.max(5, 6));
    }

    @Test
    public void maxNumerosPositivosPrimerParametroMayorTest() {

        assertEquals(6, Numeros.max(6, 5));
    }

    @Test
    public void maxCeroNegativoTest() {

        assertEquals(0, Numeros.max(-6, 0));
    }

    @Test
    public void maxNumerosIgualesTest() {

        assertEquals(2, Numeros.max(2, 2));
    }

    @Test
    public void maxNumerosNegativoTest() {

        assertEquals(-2, Numeros.max(-5, -2));
    }

    //pruebas de minimos
    @Test
    public void minNumerosPositivosSegundoParametroMenorTest() {

        assertEquals(1, Numeros.min(1, 2));
    }

    @Test
    public void minNumerosPositivosPrimerParametroMenorTest() {

        assertEquals(1, Numeros.min(2, 1));
    }

    @Test
    public void minCeroNegativoTest() {

        assertEquals(-8, Numeros.min(-8, 0));
    }

    @Test
    public void minNumerosIgualesTest() {

        assertEquals(8, Numeros.min(8, 8));
    }

    @Test
    public void minNumerosNegativoTest() {

        assertEquals(-12, Numeros.min(-10, -12));
    }

    // pruebas de par
    @Test
    public void esParTest() {
        assertTrue(Numeros.esPar(4));
    }

    @Test
    public void noEsParTest() {
        assertFalse(Numeros.esPar(3));
    }

    @Test
    public void CeroEsParTest() {
        assertTrue(Numeros.esPar(0));
    }

    //pruebas de impar
    @Test
    public void esImpart() {
        assertTrue(Numeros.esImpar(3));
    }

    @Test
    public void noEsImpart() {
        assertFalse(Numeros.esImpar(10));
    }

    @Test
    public void CeroNoEsImpart() {
        assertFalse(Numeros.esImpar(0));
    }

    //pruebas de potencias
    @Test
    public void potenciaPositivosTest() {
        assertEquals(8.0, Numeros.potencia(2, 3));

    }

    @Test
    public void potenciaBaseNegativaTest() {
        assertEquals(-8, Numeros.potencia(-2, 3));

    }

    @Test
    public void potenciaExponenteNegativoTest() {
        assertEquals(0.125, Numeros.potencia(2, -3));
    }

    @Test
    public void potenciaNumerosNegativosTest() {
        assertEquals(-0.125, Numeros.potencia(-2, -3));
    }

    @Test
    public void portenciaBaseCeroTest() {
        assertEquals(0, Numeros.potencia(0, 3));
    }

    @Test
    public void portenciaExponenteCeroTest() {
        assertEquals(1, Numeros.potencia(3, 0));
    }

    @Test
    public void portenciaBaseCeroExponenteCeroTest() {
        assertEquals(Double.NaN, Numeros.potencia(0, 0));
    }
}