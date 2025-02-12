package com.javaBootCamp.nutsNBolts.bigdecimal.randomization;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        System.out.println("-".repeat(30));
        System.out.println("using Math.random statuc class");
        for (int i = 0; i < 5; i++) {
            System.out.println(i + ": " + Math.random());
        }
        System.out.println("-".repeat(30));
        System.out.println("Generating random number between range of 10");
        for (int i = 0; i < 5; i++) {
            System.out.println(i + ": " + (int) (Math.random() * 10 + 1));
        }
        System.out.println();
        System.out.println("-".repeat(30));
        System.out.println("Generating random number with range of 25 and low 25 & high 50 values");
        for (int i = 0; i < 8; i++) {
            System.out.println(i + ": " + (int) (25 * Math.random() + 26));
        }

        System.out.println();
        System.out.println("-".repeat(30));
        System.out.println("Generating random character with range of 26 and low 65 & high 91 values");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%1$d : %1$c%n", (int) (Math.random() * 26) + 65);
        }

        System.out.println();
        System.out.println("-".repeat(30));
        System.out.println("Generating random character with range of 26 and low 65 & high 91 values");
        for (int i = 0; i < 10; i++) {
            Random r = new Random();
            System.out.printf("%1$d : %1$c%n", r.nextInt(65, 92));
        }

        System.out.println();
        System.out.println("-".repeat(30));
        System.out.println("Generating random character with range of 26 and low 65 & high 91 values");
        for (int i = 0; i < 10; i++) {
            Random r = new Random();
            System.out.printf("%1$d : %1$c%n", r.nextInt((int)'A', (int)'z'));
        }
    }
}
