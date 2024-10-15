package com.javaBootCamp.input;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) throws FileNotFoundException {
        ScannerDemo scannerDemo = new ScannerDemo();
        System.out.println("Please enter a numeric value: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (scannerDemo.isPrime(number)) {
            System.out.println("The number " + number + " is a prime number");
        } else {
            System.out.println("The number " + number + " is not a prime number");
        }

        File illiad = new File("src/com/javaBootCamp/input/illiad.txt");
        Scanner scanner1 = new Scanner(illiad);
        while (scanner1.hasNextLine()){
            System.out.println(scanner1.nextLine());
        }
    }

    public boolean isPrime(int num) {
        if (num < 1) return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
