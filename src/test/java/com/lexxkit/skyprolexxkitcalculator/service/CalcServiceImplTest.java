package com.lexxkit.skyprolexxkitcalculator.service;

import com.lexxkit.skyprolexxkitcalculator.exception.DivisionByZeroException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalcServiceImplTest {
    private final CalcService out = new CalcServiceImpl();

    @Test
    void shouldReturnTwoWhenUseAdditionOfOneAndOne() {
        int num1 = 1;
        int num2 = 1;
        int expected = out.addition(num1, num2);
        int actual = 2;

        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnZeroWhenUseAdditionOfOneAndMinusOne() {
        int num1 = 1;
        int num2 = -1;
        int expected = out.addition(num1, num2);
        int actual = 0;

        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnZeroWhenUseSubtractionOfOneAndOne() {
        int num1 = 1;
        int num2 = 1;
        int expected = out.subtraction(num1, num2);
        int actual = 0;

        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnTwoWhenUseSubtractionOfOneAndMinusOne() {
        int num1 = 1;
        int num2 = -1;
        int expected = out.subtraction(num1, num2);
        int actual = 2;

        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnOneWhenUseMultiplicationOfOneAndOne() {
        int num1 = 1;
        int num2 = 1;
        int expected = out.multiplication(num1, num2);
        int actual = 1;

        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnMinusOneWhenUseMultiplicationOfOneAndMinusOne() {
        int num1 = 1;
        int num2 = -1;
        int expected = out.multiplication(num1, num2);
        int actual = -1;

        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnOneWhenUseDivisionOfOneAndOne() {
        int num1 = 1;
        int num2 = 1;
        int expected = out.division(num1, num2);
        int actual = 1;

        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnMinusOneWhenUseDivisionOfOneAndMinusOne() {
        int num1 = 1;
        int num2 = -1;
        int expected = out.division(num1, num2);
        int actual = -1;

        assertEquals(expected, actual);
    }

    @Test
    void shouldThrowDivisionByZeroExceptionWhenUseDivisionByZero() {
        int num1 = 1;
        int num2 = 0;

        assertThrows(DivisionByZeroException.class, () -> out.division(num1, num2));
    }
}