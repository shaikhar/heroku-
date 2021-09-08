package com.example.demo.Controller;

import javassist.NotFoundException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.persistence.EntityNotFoundException;

@ControllerAdvice
public class Exceptionhandler  extends  ResponseEntityExceptionHandler{

    @ExceptionHandler(MyCustomeException.class)
    public ResponseEntity<?> mycustomeexception(Exception e)
    {
        return ResponseEntity.badRequest().body(e.getLocalizedMessage());
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> JSOnException(Exception e)
    {
        return ResponseEntity.badRequest().body("The Entity is not avaialable with said id ");
    }
//    @Override
//    protected ResponseEntity<Object> handleExceptionInternal(Exception ex, Object body, HttpHeaders headers, HttpStatus status, WebRequest request) {
//        return ResponseEntity.badRequest().body("The request is bad please change the request ");
//    }
}
