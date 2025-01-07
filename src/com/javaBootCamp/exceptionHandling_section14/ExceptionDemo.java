package com.javaBootCamp.exceptionHandling_section14;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.logging.Logger;

public class ExceptionDemo {
    private static final Logger logger = Logger.getLogger(InvalidAgeException.class.getName());

    public static void main(String[] args) throws InvalidAgeException {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Please enter the age: ");
            int age1 = scanner.nextInt();
            System.out.println("the age of the recipient is:" + age1);
            if (age1 > 100) flag = false;
        }

        int[] numArray = new int[]{1, 2, 3, 4, 5};
        System.out.println(numArray[2]);
//        System.out.println(numArray[5]);

        System.out.print("Please enter the age of the person: ");
        int age2 = scanner.nextInt();
        if (age2 < 0 || age2 > 100) {
//            logger.severe("Age must be between 1-100");
            throw new InvalidAgeException("Age must be between 1-100");
        }

        System.out.println("the age of the recipient is:" + age2);

        System.out.println("Please enter the numerator: ");
        int num = scanner.nextInt();
        System.out.println("Please enter the denominator: ");
        int den = scanner.nextInt();
        if (den == 0) {
            throw new CustomMathException("The denominator cannot be zero. Please try with the correct input");
        }
        int result = num / den;
        System.out.println("the result is: " + result);


    }
}
