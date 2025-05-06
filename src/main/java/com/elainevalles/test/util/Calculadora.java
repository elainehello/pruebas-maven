package com.elainevalles.test.util;

/**
 * Calculator which makes arithmetic operations as +, -, *, /
 */
public class Calculadora {
    /**
     * Operation between two integer values
     * @param a first parameter
     * @param b second parameter
     * @return result of operation 'a' and 'b'
     */

    public static int suma(int a, int b) {
        return a + b;
    }
    public static int resta(int a, int b) {
        return a - b;
    }
    public static int dividir(int a, int b) {
        return a / b;
    }
    public static int multiplicar(int a, int b) {
        return a * b;
    }
}
