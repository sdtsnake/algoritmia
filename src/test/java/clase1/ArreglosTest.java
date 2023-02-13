package clase1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ArreglosTest {

    //suma de elementos de un arreglo
    @Test
    public void sumarArregloVacioTest() {
        int[] arreglo = {};
        assertEquals(0, Arreglos.sumarArreglo(arreglo));
    }

    @Test
    public void pruebaArregloUnico() {
        int[] arreglo = {5};
        assertEquals(5, Arreglos.sumarArreglo(arreglo));
    }

    @Test
    public void pruebaArregloMultiple() {
        int[] arreglo = {1, 2, 3, 4, 5};
        assertEquals(15, Arreglos.sumarArreglo(arreglo));
    }

    //arreglo multiplicado por un valor de entrada
    @Test
    public void multiplicarValoresArregloArregloVacioTest() {
        int[] arreglo = {};
        int[] resultado = {};
        assertArrayEquals(resultado, Arreglos.multiplicarValoresArreglo(arreglo, 1));
    }

    @Test
    public void multiplicarValoresArregloMultiplicadorCeroTest() {
        int[] arreglo = {1, 2, 3, 4, 5};
        int[] resultado = {0, 0, 0, 0, 0};
        assertArrayEquals(resultado, Arreglos.multiplicarValoresArreglo(arreglo, 0));
    }

    @Test
    public void multiplicarValoresArreglopruebaValoresPositivosTest() {
        int[] arreglo = {1, 2, 3, 4, 5};
        int[] resultado = {2, 4, 6, 8, 10};
        assertArrayEquals(resultado, Arreglos.multiplicarValoresArreglo(arreglo, 2));
    }

    @Test
    public void multiplicarValoresArregloValoresNegativosTest() {
        int[] arreglo = {-1, -2, -3, -4, -5};
        int[] resultado = {-2, -4, -6, -8, -10};
        assertArrayEquals(resultado, Arreglos.multiplicarValoresArreglo(arreglo, 2));
    }

    @Test
    public void multiplicarValoresArregloValoresMixtosTest() {
        int[] arreglo = {-1, 2, -3, 4, -5};
        int[] resultado = {-2, 4, -6, 8, -10};
        assertArrayEquals(resultado, Arreglos.multiplicarValoresArreglo(arreglo, 2));
    }

    //contador de elemento pares de un arreglo
    @Test
    public void contarParesArregloVacioTest() {
        int[] arreglo = {};
        assertEquals(0, Arreglos.contarPares(arreglo));
    }

    @Test
    public void contarParesTodosLosValoresParesTest() {
        int[] arreglo = {2, 4, 6, 8, 10};
        assertEquals(5, Arreglos.contarPares(arreglo));
    }

    @Test
    public void contarParesTodosLosValoresImparesTest() {
        int[] arreglo = {1, 3, 5, 7, 9};
        assertEquals(0, Arreglos.contarPares(arreglo));
    }

    @Test
    public void contarParesValoresMixtosTest() {
        int[] arreglo = {1, 2, 3, 4, 5};
        assertEquals(2, Arreglos.contarPares(arreglo));
    }

    @Test
    public void contarParesConCeroTest() {
        int[] arreglo = {0, 1, 2, 3, 4, 5};
        assertEquals(3, Arreglos.contarPares(arreglo));
    }

    //contador de elementos impares
    @Test
    public void contarImparesArregloVacioTest() {
        int[] arreglo = {};
        int resultado = 0;
        assertEquals(resultado, Arreglos.contarImpares(arreglo));
    }

    @Test
    public void contarImparesArregloConUnParTest() {
        int[] arreglo = {2};
        int resultado = 0;
        assertEquals(resultado, Arreglos.contarImpares(arreglo));
    }

    @Test
    public void contarImparesArregloConUnImparTest() {
        int[] arreglo = {1};
        int resultado = 1;
        assertEquals(resultado, Arreglos.contarImpares(arreglo));
    }

    @Test
    public void contarImparesArregloConVariosImparesTest() {
        int[] arreglo = {1, 3, 5, 7, 9};
        int resultado = 5;
        assertEquals(resultado, Arreglos.contarImpares(arreglo));
    }

    @Test
    public void contarImparesArregloConVariosParesImparesTest() {
        int[] arreglo = {0, 2, 4, 6, 8, 1, 3, 5, 7, 9};
        int resultado = 5;
        assertEquals(resultado, Arreglos.contarImpares(arreglo));
    }

    //Separar elemenmtos
    @Test
    public void separarElementosValorCeroArrelgoPositivoTest() {
        int numero = 0;
        int[] arreglo = {4, 5, 6, 7, 1, 2, 3};
        int[][] resultado = {{}, {4, 5, 6, 7, 1, 2, 3}};
        assertArrayEquals(resultado, Arreglos.separarElementos(numero, arreglo));
    }

    @Test
    public void separarElementosValorCeroArrelgoNegativoTest() {
        int numero = 0;
        int[] arreglo = {-4, -5, -6, -8, -1, -2, -3};
        int[][] resultado = {{-4, -5, -6, -8, -1, -2, -3}, {}};
        assertArrayEquals(resultado, Arreglos.separarElementos(numero, arreglo));
    }

    @Test
    public void separarElementosValorCeroArrelgoNegativoConElmentoCeroTest() {
        int numero = 0;
        int[] arreglo = {-4, -5, -6, 0, -1, -2, -3};
        int[][] resultado = {{-4, -5, -6, 0, -1, -2, -3}, {}};
        assertArrayEquals(resultado, Arreglos.separarElementos(numero, arreglo));
    }

    @Test
    public void separarElementosValorCeroArrelgoNegativoConValoresMixtosTest() {
        int numero = 0;
        int[] arreglo = {4, 5, 6, 0, -1, -2, -3};
        int[][] resultado = {{0, -1, -2, -3}, {4, 5, 6}};
        assertArrayEquals(resultado, Arreglos.separarElementos(numero, arreglo));
    }

    @Test
    public void separarElementosValorNegativoConArregloNegativoTest() {
        int numero = -7;
        int[] arreglo = {-9, -8, -7, -6, -5};
        int[][] expected = {{-9, -8, -7}, {-6, -5}};
        assertArrayEquals(expected, Arreglos.separarElementos(numero, arreglo));
    }

    @Test
    public void separarElementosValorNegativoMayorConArregloNegativoTest() {
        int numero = -1;
        int[] arreglo = {-9, -8, -7, -6, -5};
        int[][] expected = {{-9, -8, -7, -6, -5}, {}};
        assertArrayEquals(expected, Arreglos.separarElementos(numero, arreglo));
    }

    @Test
    public void separarElementosValorNegativoMenorConArregloNegativoTest() {
        int numero = -10;
        int[] arreglo = {-9, -8, -7, -6, -5};
        int[][] expected = {{}, {-9, -8, -7, -6, -5}};
        assertArrayEquals(expected, Arreglos.separarElementos(numero, arreglo));
    }

    @Test
    public void separarElementosValorNegativoConArregloMixtoTest() {
        int numero = -7;
        int[] arreglo = {-9, -8, -7, -6, -5, 3, 2, 1};
        int[][] expected = {{-9, -8, -7}, {-6, -5, 3, 2, 1}};
        assertArrayEquals(expected, Arreglos.separarElementos(numero, arreglo));
    }

    @Test
    public void separarElementosValorPositivoConArregloNegativoTest() {
        int numero = 10;
        int[] arreglo = {-7, -8, -9, -10, -11};
        int[][] expected = {{-7, -8, -9, -10, -11}, {}};
        assertArrayEquals(expected, Arreglos.separarElementos(numero, arreglo));
    }
    @Test
    public void separarElementosValorPositivoConArregloNegativoYConteniendoElValorTest() {
        int numero = 10;
        int[] arreglo = {-7, -8, -9, -10, -11, 10};
        int[][] expected = {{-7, -8, -9, -10, -11, 10}, {}};
        assertArrayEquals(expected, Arreglos.separarElementos(numero, arreglo));
    }
    @Test
    public void separarElementosValorPositivoConArregloPositivoTest() {
        int numero = 9;
        int[] arreglo = {7, 8, 9, 10, 11, 12};
        int[][] expected = {{7, 8, 9}, {10, 11, 12}};
        assertArrayEquals(expected, Arreglos.separarElementos(numero, arreglo));
    }
    @Test
    public void separarElementosValorPositivoConArregloMixtoTest() {
        int numero = 9;
        int[] arreglo = {-6,-7, -8, -9, -10, 1, 3, 4 ,5 ,11, 12, 13, 14};
        int[][] expected = {{-6,-7, -8, -9, -10, 1, 3,4 ,5}, {11, 12, 13, 14}};
        assertArrayEquals(expected, Arreglos.separarElementos(numero, arreglo));
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