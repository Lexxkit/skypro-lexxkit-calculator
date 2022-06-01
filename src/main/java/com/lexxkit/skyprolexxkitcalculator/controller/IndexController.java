package com.lexxkit.skyprolexxkitcalculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping
    public String index() {
        return "Welcome to Lexxkit's projects. Click to check <a href='/calculator'>Calculator</a> App.";
    }
}
