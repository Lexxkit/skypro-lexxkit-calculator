package com.lexxkit.skyprolexxkitcalculator.controller;

import com.lexxkit.skyprolexxkitcalculator.service.CalcService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalcService calcService;

    public CalculatorController(CalcService calcService) {
        this.calcService = calcService;
    }

    @GetMapping
    public String greeting() {
        return "Welcome to the Calc App!";
    }

    @GetMapping("/plus")
    public String plusAction(@RequestParam int num1, @RequestParam int num2) {
        return String.format("%d + %d = %d",num1, num2, calcService.addition(num1, num2));
    }

    @GetMapping("/minus")
    public String minusAction(@RequestParam int num1, @RequestParam int num2) {
        return String.format("%d - %d = %d",num1, num2, calcService.subtraction(num1, num2));
    }

    @GetMapping("/multiply")
    public String multiplyAction(@RequestParam int num1, @RequestParam int num2) {
        return String.format("%d * %d = %d",num1, num2, calcService.multiplication(num1, num2));
    }

    @GetMapping("/divide")
    public String divideAction(@RequestParam int num1, @RequestParam int num2) {
        return String.format("%d / %d = %d",num1, num2, calcService.division(num1, num2));
    }
}
