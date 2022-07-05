package com.lexxkit.skyprolexxkitcalculator.service;

import com.lexxkit.skyprolexxkitcalculator.exception.DivisionByZeroException;
import org.junit.jupiter.api.Test;

import static com.lexxkit.skyprolexxkitcalculator.service.CalcServiceTestConstants.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalcServiceImplTest {
    private final CalcService out = new CalcServiceImpl();

    @Test
    void shouldReturnTwoWhenUseAdditionOfOneAndOne() {
        int result = out.addition(ONE, ONE);

        assertEquals(ONE + ONE, result);
    }

    @Test
    void shouldReturnZeroWhenUseAdditionOfOneAndMinusOne() {
        int result = out.addition(ONE, NEGATIVE_ONE);

        assertEquals(ONE + NEGATIVE_ONE, result);
    }

    @Test
    void shouldReturnZeroWhenUseSubtractionOfOneAndOne() {
        int result = out.subtraction(ONE, ONE);

        assertEquals(ONE - ONE, result);
    }

    @Test
    void shouldReturnTwoWhenUseSubtractionOfOneAndMinusOne() {
        int result = out.subtraction(ONE, NEGATIVE_ONE);

        assertEquals(ONE - NEGATIVE_ONE, result);
    }

    @Test
    void shouldReturnOneWhenUseMultiplicationOfOneAndOne() {
        int result = out.multiplication(ONE, ONE);

        assertEquals(ONE * ONE, result);
    }

    @Test
    void shouldReturnMinusOneWhenUseMultiplicationOfOneAndMinusOne() {
        int result = out.multiplication(ONE, NEGATIVE_ONE);

        assertEquals(ONE * NEGATIVE_ONE, result);
    }

    @Test
    void shouldReturnOneWhenUseDivisionOfOneAndOne() {
        int result = out.division(ONE, ONE);

        assertEquals(ONE / ONE, result);
    }

    @Test
    void shouldReturnMinusOneWhenUseDivisionOfOneAndMinusOne() {
        int result = out.division(ONE, NEGATIVE_ONE);

        assertEquals(ONE / NEGATIVE_ONE, result);
    }

    @Test
    void shouldThrowDivisionByZeroExceptionWhenUseDivisionByZero() {
        assertThrows(DivisionByZeroException.class, () -> out.division(ONE, ZERO));
    }
}