package work.oscarramos.clase1;

public class Numeros {

    public static int max(int num1, int num2) {
        return (num1>num2) ? num1 : num2;
    }

    public static int min(int num1, int num2) {
        return (num1<num2) ? num1 : num2;
    }

    public static boolean esPar(int numero) {
        if(numero==0){
            return true;
        }
        return numero % 2 ==0;
    }

    public static boolean esImpar(int numero) {
        if(numero==0){
            return false;
        }
        return numero % 2 !=0;

    }

    public static double potencia(int base, int exponente) {
        if(exponente == 0 && exponente ==0) return  Double.NaN;
        if(exponente == 0) return 1;
        if(base==0) return 0;
        int exponenteAbsoluto = absoluto(exponente);
        double resultado = 1;
        for (int i = 0; i < exponenteAbsoluto ; i++) {
            resultado *= base;
        }

        return resultado;
    }
    private static int absoluto(int exponte){
        return (exponte<0) ? exponte * -1 : exponte;
    }
}


/*
    Implementar funcion minimo
    Implementar funcion par (boolean)
    Implementar funcion impar (boolean)
    Implementar funcion exponente base y exponente
 */