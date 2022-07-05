package com.lexxkit.skyprolexxkitcalculator.service;

import com.lexxkit.skyprolexxkitcalculator.exception.DivisionByZeroException;
import org.springframework.stereotype.Service;

@Service
public class CalcServiceImpl implements CalcService {
    @Override
    public int addition(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int division(int num1, int num2) {
        if (num2 == 0) {
            throw new DivisionByZeroException("Second number must not equals to zero!");
        }

        return num1 / num2;
    }
}
