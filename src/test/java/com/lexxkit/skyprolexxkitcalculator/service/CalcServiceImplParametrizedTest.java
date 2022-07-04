package com.lexxkit.skyprolexxkitcalculator.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalcServiceImplParametrizedTest {

    private final CalcService out = new CalcServiceImpl();


    @ParameterizedTest
    @MethodSource("provideParamsForAddition")
    void shouldGenerateCorrectAnswerWhenUseAddition(int num1, int num2, int expectedAnswer) {
        int result = out.addition(num1, num2);
        assertEquals(expectedAnswer, result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForSubtraction")
    void shouldGenerateCorrectAnswerWhenUseSubtraction(int num1, int num2, int expectedAnswer) {
        int result = out.subtraction(num1, num2);
        assertEquals(expectedAnswer, result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForMultiplication")
    void shouldGenerateCorrectAnswerWhenUseMultiplication(int num1, int num2, int expectedAnswer) {
        int result = out.multiplication(num1, num2);
        assertEquals(expectedAnswer, result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForDivision")
    void shouldGenerateCorrectAnswerWhenUseDivision(int num1, int num2, int expectedAnswer) {
        int result = out.division(num1, num2);
        assertEquals(expectedAnswer, result);
    }

    public static Stream<Arguments> provideParamsForAddition() {
        return Stream.of(
                Arguments.of(1, 1, 2),
                Arguments.of(1, -1, 0)
        );
    }

    public static Stream<Arguments> provideParamsForSubtraction() {
        return Stream.of(
                Arguments.of(1, 1, 0),
                Arguments.of(1, -1, 2)
        );
    }

    public static Stream<Arguments> provideParamsForMultiplication() {
        return Stream.of(
                Arguments.of(1, 1, 1),
                Arguments.of(10, -1, -10)
        );
    }

    public static Stream<Arguments> provideParamsForDivision() {
        return Stream.of(
                Arguments.of(1, 1, 1),
                Arguments.of(10, -2, -5)
        );
    }
}