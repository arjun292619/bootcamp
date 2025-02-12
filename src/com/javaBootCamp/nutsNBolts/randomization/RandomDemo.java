package com.javaBootCamp.nutsNBolts.randomization;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneOffset;
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
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.printf("%1$d : %1$c%n", r.nextInt(65, 92));
        }

        System.out.println();
        System.out.println("-".repeat(30));
        System.out.println("Generating random character with range of 26 and low 65 & high 91 values");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%1$d : %1$c%n", r.nextInt((int) 'A', (int) 'z' + 1));
        }

        System.out.println();
        System.out.println("-".repeat(30));
        for (int i = 0; i < 5; i++) {
            System.out.printf("%d%n", r.nextInt());
        }
        System.out.println("-".repeat(30));
// creating a stream of random integers
        r.ints().limit(5).forEach(System.out::println);
        System.out.println("-".repeat(30));
        System.out.println("random integer stream between a range");
        r.ints(1, 21).limit(5).forEach(System.out::println);
        System.out.println("-".repeat(30));
        System.out.println("random double stream between a range with size method");
        r.doubles(6, 1, 10).forEach(System.out::println);

        System.out.println("-".repeat(30));
        System.out.println("random integer with seed values");

        long nano = System.nanoTime();
        var seed = LocalDate.now().toEpochSecond(LocalTime.now(), ZoneOffset.UTC);
        Random r2 = new Random(nano);
        Random r3 = new Random(nano);
        Random r4 = new Random(seed);

        r2.ints(5, 1, 25).forEach(n -> System.out.print(n + " "));
        System.out.println();
        System.out.println("-".repeat(30));
        r3.ints(5, 1, 25).forEach(n -> System.out.print(n + " "));System.out.println();
        System.out.println("-".repeat(30));
        r4.ints(5, 1, 25).forEach(n -> System.out.print(n + " "));
    }
}
