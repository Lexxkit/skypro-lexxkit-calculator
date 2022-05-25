package com.lexxkit.skyprolexxkitcalculator.service;

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
            throw new NullPointerException("Division by 0!!!");
        }

        return num1 / num2;
    }
}
