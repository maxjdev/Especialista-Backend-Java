package com.maxjdev.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void addTest() {
        assertEquals(10, calculator.add(5, 5));
    }

    @Test
    public void subtractionTest() {
        assertEquals(5, calculator.subtraction(10, 5));
    }

    @Test
    public void multiplicationTest() {
        assertEquals(15, calculator.multiplication(3, 5));
    }

    @Test
    public void divisionTest() {
        assertEquals(2, calculator.division(10, 5));
    }

    @Test
    public void divisionByZeroTest_ArithmeticException() {
        assertThrows(ArithmeticException.class,
                () -> calculator.division(1, 0));
    }
}
