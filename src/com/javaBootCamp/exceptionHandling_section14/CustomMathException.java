package com.javaBootCamp.exceptionHandling_section14;

public class CustomMathException extends RuntimeException{
    public CustomMathException(String message) {
        super(message);
    }
}
