package com.javaBootCamp.exceptionHandling_section14;

import java.lang.reflect.Array;
import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
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
        System.out.println(numArray[5]);


    }
}
