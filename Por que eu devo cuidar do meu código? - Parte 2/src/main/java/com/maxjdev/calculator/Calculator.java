package com.maxjdev.calculator;

/**
 * Classe Calculadora para realizar operações básicas de adição, subtração, multiplicação e divisão
 *
 * @author maxjdev
 * @version 1.0
 * @since 22/05/2024
 */
public class Calculator {
    /**
     * Função para realizar adição.
     * @param a primeiro argumento.
     * @param b segundo argumento.
     * @return adição entre os argumentos a e b.
     */
    int add(int a, int b) {return a + b;}
    /**
     * Função para realizar subtração.
     * @param a primeiro argumento.
     * @param b segundo argumento.
     * @return subtração entre os argumentos a e b.
     */
    int subtraction(int a, int b) {return a - b;}
    /**
     * Função para realizar multiplicação.
     * @param a primeiro argumento.
     * @param b segundo argumento.
     * @return multiplicação do argumento a vezes o argumento b.
     */
    int multiplication(int a, int b) {return a * b;}
    /**
     * Função para realizar divisão.
     * @param a primeiro argumento.
     * @param b segundo argumento.
     * @return divisão do argumento a pelo argumento b.
     * @exception ArithmeticException caso divisor seja igual a 0.
     */
    int division(int a, int b) {
        if (b == 0) throw new ArithmeticException();
        return a / b;
    }
}
