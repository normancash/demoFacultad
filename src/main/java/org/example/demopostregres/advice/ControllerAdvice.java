package org.example.demopostregres.advice;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ControllerAdvice {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Map<String,String> getValidacionException
            (MethodArgumentNotValidException ex){
        Map<String,String> errorValidation = new HashMap<>();
        ex.getBindingResult().getFieldErrors().
                forEach(error-> errorValidation
                        .put(error.getField()
                                ,error.getDefaultMessage()));
        return errorValidation;
    }
}
