package com.lexxkit.skyprolexxkitcalculator.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.lexxkit.skyprolexxkitcalculator.service.CalcServiceTestConstants.NEGATIVE_ONE;
import static com.lexxkit.skyprolexxkitcalculator.service.CalcServiceTestConstants.ONE;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalcServiceImplParametrizedTest {

    private final CalcService out = new CalcServiceImpl();


    @ParameterizedTest
    @MethodSource("provideParamsForCalcService")
    void shouldGenerateCorrectAnswerWhenUseAddition(int num1, int num2) {
        int result = out.addition(num1, num2);
        assertEquals(num1 + num2, result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForCalcService")
    void shouldGenerateCorrectAnswerWhenUseSubtraction(int num1, int num2) {
        int result = out.subtraction(num1, num2);
        assertEquals(num1 - num2, result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForCalcService")
    void shouldGenerateCorrectAnswerWhenUseMultiplication(int num1, int num2) {
        int result = out.multiplication(num1, num2);
        assertEquals(num1 * num2, result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForCalcService")
    void shouldGenerateCorrectAnswerWhenUseDivision(int num1, int num2) {
        int result = out.division(num1, num2);
        assertEquals(num1 / num2, result);
    }

    public static Stream<Arguments> provideParamsForCalcService() {
        return Stream.of(
                Arguments.of(ONE, ONE),
                Arguments.of(ONE, NEGATIVE_ONE)
        );
    }
}