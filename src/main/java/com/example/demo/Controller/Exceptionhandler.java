package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


public class Exceptionhandler extends ResponseEntityExceptionHandler {

  // @ExceptionHandler(value = Exception.class)
    public String allexceptionhandler()
    {
        return "There was some exception ";
    }
}
