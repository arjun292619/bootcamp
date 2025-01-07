package com.javaBootCamp.exceptionHandling_section14;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;

public class ExceptionHandlingDemo {
    private static final Logger logger = Logger.getLogger(ExceptionHandlingDemo.class.getName());

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Please enter the age: ");
            try {
                int age1 = scanner.nextInt();
                System.out.println("the age of the recipient is:" + age1);
                if (age1 > 100) flag = false;
            } catch (InputMismatchException ex) {
                flag = false;
                System.out.println(ex.getCause());
                System.out.println("Please provide a numerical input");
                System.out.println(Arrays.toString(ex.getStackTrace()));
            }
        }
        scanner.close();
        int[] numArray = new int[]{1, 2, 3, 4, 5};

        try {
            System.out.println(numArray[2]);
            System.out.println(numArray[5]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            logger.severe("Array index out of bounds. Please enter a correct value");
            System.out.println(ex.getMessage());
        }


    }
}
