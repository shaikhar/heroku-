package com.example.demo.Controller;

public class MyCustomeException extends Exception{

    public MyCustomeException(String message) {
        super("THis is My custome exception ");
    }
}
