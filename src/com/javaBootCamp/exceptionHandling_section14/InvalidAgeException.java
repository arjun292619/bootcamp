package com.javaBootCamp.exceptionHandling_section14;

public class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }

    public InvalidAgeException() {
        super();
    }
}
