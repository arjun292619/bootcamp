package com.javaBootCamp.exceptionHandling_section14;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;

public class TryResourcesDemo {
    private static final Logger logger = Logger.getLogger(TryResourcesDemo.class.getName());

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please enter an age: ");
            int age = scanner.nextInt();
            System.out.println(age);
        } catch (InputMismatchException ex) {
            logger.severe("Wrong Input please try again");
        }
    }
}
