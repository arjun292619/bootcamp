package com.javaBootCamp.input;

import java.io.IOException;

public class JavaBasicInputDemo {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter a value");
        int inputData = System.in.read();
        System.out.println("The data entered is: " + inputData);
    }
}
