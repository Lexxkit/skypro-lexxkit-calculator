package com.lexxkit.skyprolexxkitcalculator.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class DivisionByZeroException extends IllegalArgumentException {

    public DivisionByZeroException() {
        super();
    }

    public DivisionByZeroException(String s) {
        super(s);
    }
}
