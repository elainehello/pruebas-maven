package com.elainevalles.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.elainevalles.test.util.Calculadora;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */

    @Test
    public void testSuma() {
        // Test case 1: Positive numbers
        assertEquals(5, Calculadora.suma(2, 3), "2 + 3 should equal 5");

        // Test case 2: Negative numbers
        assertEquals(-1, Calculadora.suma(-2, 1), "-2 + 1 should equal -1");

        // Test case 3: Zero as an operand
        assertEquals(0, Calculadora.suma(0, 0), "0 + 0 should equal 0");
    }

    @Test
    public void testResta() {
        // Test case 1: Positive numbers
        assertEquals(1, Calculadora.resta(3, 2), "3 - 2 should equal 1");

        // Test case 2: Negative numbers
        assertEquals(-3, Calculadora.resta(-1, 2), "-1 - 2 should equal -3");

        // Test case 3: Zero as an operand
        assertEquals(0, Calculadora.resta(0, 0), "0 - 0 should equal 0");
    }

    @Test
    public void testDividir() {
        // Test case 1: Positive numbers
        assertEquals(2, Calculadora.dividir(6, 3), "6 / 3 should equal 2");

        // Test case 2: Negative numbers
        assertEquals(-2, Calculadora.dividir(-6, 3), "-6 / 3 should equal -2");

        // Test case 3: Division by 1
        assertEquals(5, Calculadora.dividir(5, 1), "5 / 1 should equal 5");

        // Test case 4: Division by zero (this will cause ArithmeticException)
//        assertThrows(ArithmeticException.class, () -> {
//            Calculadora.dividir(5, 0);
//        }, "Division by zero should throw ArithmeticException");
    }

    @Test
    public void testMultiplicar() {
        // Test case 1: Positive numbers
        assertEquals(6, Calculadora.multiplicar(2, 3), "2 * 3 should equal 6");

        // Test case 2: Negative numbers
        assertEquals(-6, Calculadora.multiplicar(-2, 3), "-2 * 3 should equal -6");

        // Test case 3: Zero as an operand
        assertEquals(0, Calculadora.multiplicar(0, 5), "0 * 5 should equal 0");
    }
}
