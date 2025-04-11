package com.javaBootCamp.streams_section26;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamSources {
    public static void main(String[] args) {
        System.out.println("-".repeat(35));
        String[] numbers = {"one", "two", "three", "four"};


//        Stream source from arrays as source
        var stream1 = Arrays.stream(numbers)
                .sorted(Comparator.reverseOrder());
//                .forEach(System.out::println);

//        Stream source from Streams.of as source
        var stream2 = Stream.of("five", "six", "seven")
                .map(String::toUpperCase);
//                .forEach(System.out::println);

//        Stream source from Stream.concat as source
        Stream.concat(stream2, stream1)
                .map(s -> s.charAt(0) + " - " + s)
                .forEach(System.out::println);

//        Creating a bingo map object
        Map<Character, int[]> bingoMap = new LinkedHashMap<>();
        int bingoIndex = 1;
        for (char c : "BINGO".toCharArray()) {
            int[] nums = new int[15];
            int counter = bingoIndex;
            Arrays.setAll(nums, i -> i + counter);
            bingoMap.put(c, nums);
            bingoIndex += 15;
        }

//        Using map entryset as a source for stream
        bingoMap.entrySet()
                .stream()
                .map(e -> e.getKey() + " has range: " + e.getValue()[0] +
                        " - " + e.getValue()[e.getValue().length - 1])
                .forEach(System.out::println);

//        Infinite stream source with generate
        Random random = new Random();
        Stream.generate(() -> random.nextInt(2))
                .limit(10)
                .forEach(s -> System.out.print(s + " "));
        System.out.println();

//        Infinite stream source with iterate
        IntStream.iterate(10, i -> i + 2)
                .limit(20)
                .forEach(s -> System.out.print(s + " "));
        System.out.println();

//        create first 20 prime numbers
        IntStream.iterate(1, i -> i + 1)
                .filter(StreamSources::isPrime)
                .limit(20)
                .forEach(s -> System.out.print(s + " "));
        System.out.println();

        //        create stream of prime numbers less than 100
        IntStream.iterate(1, i -> i + 1)
                .limit(100)
                .filter(StreamSources::isPrime)
                .forEach(s -> System.out.print(s + " "));
        System.out.println();

        IntStream.iterate(1, i -> i <= 100, i -> i + 1)
                .filter(StreamSources::isPrime)
                .forEach(s -> System.out.print(s + " "));
        System.out.println();

//        Stream source with range and range closed
        IntStream.range(1, 100)
                .filter(StreamSources::isPrime)
                .forEach(s -> System.out.print(s + " "));

        //        Stream source with range closed
        IntStream
//                .range(1, 100)
                .rangeClosed(1, 100)
                .filter(n -> n % 2 == 0)
                .forEach(s -> System.out.print(s + " "));

    }

    public static boolean isPrime(int n) {
        if (n <= 2) {
            return n == 2;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
