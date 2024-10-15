package com.javaBootCamp.input;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedStreamDemo {
    public static void main(String[] args) throws IOException {
        BufferedStreamDemo bufferedStreamDemo = new BufferedStreamDemo();

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bfr = new BufferedReader(inputStreamReader);
/*        System.out.println("Enter a value");
        int inputData1 = bfr.read();
        System.out.println("The data entered is: " + inputData1);*/

        System.out.println("Enter a value");
        String inputData2 = bfr.readLine();
        if (bufferedStreamDemo.isPrime(Integer.parseInt(inputData2))) {
            System.out.println("The number " + inputData2 + " is a prime number");
        } else {
            System.out.println("The number " + inputData2 + " is not a prime number");
        }


        System.out.println("Enter a numeric value: ");
        String inputVal3 = bfr.readLine();
        System.out.println(bufferedStreamDemo.isEven(Integer.parseInt(inputVal3)));
        bfr.close();

        FileReader fileReader = new FileReader("src/com/javaBootCamp/input/illiad.txt");
        BufferedReader bFile = new BufferedReader(fileReader);
//        String line = bFile.readLine();
//        System.out.println(line);
        String line;
        while ((line = bFile.readLine()) != null) {
            System.out.println(line);
        }
        bFile.close();
    }

    public boolean isEven(int num) {
        return num % 2 == 0;
    }

    public boolean isPrime(int num) {
        if (num < 1) return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
